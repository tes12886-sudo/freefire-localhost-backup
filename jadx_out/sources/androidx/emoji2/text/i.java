package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class i {
    private final g.i a;
    private final m b;
    private g.d c;
    private final boolean d;
    private final int[] e;

    private static final class a {
        static int a(CharSequence charSequence, int i2, int i3) {
            int length = charSequence.length();
            if (i2 < 0 || length < i2 || i3 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i3 != 0) {
                    i2--;
                    if (i2 < 0) {
                        return z ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i2);
                    if (z) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i3--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i3--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z = true;
                    }
                }
                return i2;
            }
        }

        static int b(CharSequence charSequence, int i2, int i3) {
            int length = charSequence.length();
            if (i2 < 0 || length < i2 || i3 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i3 != 0) {
                    if (i2 >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i2);
                    if (z) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i3--;
                        i2++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i3--;
                        i2++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2++;
                        z = true;
                    }
                }
                return i2;
            }
        }
    }

    public static class b implements g.d {
        private static final ThreadLocal<StringBuilder> b = new ThreadLocal<>();
        private final TextPaint a;

        b() {
            TextPaint textPaint = new TextPaint();
            this.a = textPaint;
            textPaint.setTextSize(10.0f);
        }

        private static StringBuilder b() {
            ThreadLocal<StringBuilder> threadLocal = b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            return threadLocal.get();
        }

        @Override // androidx.emoji2.text.g.d
        public boolean a(CharSequence charSequence, int i2, int i3, int i4) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 23 && i4 > i5) {
                return false;
            }
            StringBuilder sbB = b();
            sbB.setLength(0);
            while (i2 < i3) {
                sbB.append(charSequence.charAt(i2));
                i2++;
            }
            return h.h.e.c.a(this.a, sbB.toString());
        }
    }

    static final class c {
        private int a = 1;
        private final m.a b;
        private m.a c;
        private m.a d;
        private int e;
        private int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f358g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f359h;

        c(m.a aVar, boolean z, int[] iArr) {
            this.b = aVar;
            this.c = aVar;
            this.f358g = z;
            this.f359h = iArr;
        }

        private static boolean d(int i2) {
            return i2 == 65039;
        }

        private static boolean f(int i2) {
            return i2 == 65038;
        }

        private int g() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
            return 1;
        }

        private boolean h() {
            if (this.c.b().j() || d(this.e)) {
                return true;
            }
            if (this.f358g) {
                if (this.f359h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f359h, this.c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:5:0x000f  */
        int a(int i2) {
            m.a aVarA = this.c.a(i2);
            int iG = 3;
            if (this.a == 2) {
                if (aVarA != null) {
                    this.c = aVarA;
                    this.f++;
                } else if (f(i2)) {
                    iG = g();
                } else if (!d(i2)) {
                    if (this.c.b() == null || (this.f == 1 && !h())) {
                        iG = g();
                    } else {
                        this.d = this.c;
                        g();
                    }
                }
                iG = 2;
            } else if (aVarA == null) {
                iG = g();
            } else {
                this.a = 2;
                this.c = aVarA;
                this.f = 1;
                iG = 2;
            }
            this.e = i2;
            return iG;
        }

        h b() {
            return this.c.b();
        }

        h c() {
            return this.d.b();
        }

        boolean e() {
            return this.a == 2 && this.c.b() != null && (this.f > 1 || h());
        }
    }

    i(m mVar, g.i iVar, g.d dVar, boolean z, int[] iArr) {
        this.a = iVar;
        this.b = mVar;
        this.c = dVar;
        this.d = z;
        this.e = iArr;
    }

    private void a(Spannable spannable, h hVar, int i2, int i3) {
        spannable.setSpan(this.a.a(hVar), i2, i3, 33);
    }

    private static boolean b(Editable editable, KeyEvent keyEvent, boolean z) {
        j[] jVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (jVarArr = (j[]) editable.getSpans(selectionStart, selectionEnd, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = editable.getSpanStart(jVar);
                int spanEnd = editable.getSpanEnd(jVar);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean c(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i2 >= 0 && i3 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                iMax = a.a(editable, selectionStart, Math.max(i2, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i3, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i2, 0);
                iMin = Math.min(selectionEnd + i3, editable.length());
            }
            j[] jVarArr = (j[]) editable.getSpans(iMax, iMin, j.class);
            if (jVarArr != null && jVarArr.length > 0) {
                for (j jVar : jVarArr) {
                    int spanStart = editable.getSpanStart(jVar);
                    int spanEnd = editable.getSpanEnd(jVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean d(Editable editable, int i2, KeyEvent keyEvent) {
        boolean zB;
        if (i2 != 67) {
            zB = i2 != 112 ? false : b(editable, keyEvent, true);
        } else {
            zB = b(editable, keyEvent, false);
        }
        if (!zB) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean e(CharSequence charSequence, int i2, int i3, h hVar) {
        if (hVar.d() == 0) {
            hVar.k(this.c.a(charSequence, i2, i3, hVar.h()));
        }
        return hVar.d() == 2;
    }

    private static boolean f(int i2, int i3) {
        return i2 == -1 || i3 == -1 || i2 != i3;
    }

    private static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5 A[Catch: all -> 0x0116, TryCatch #0 {all -> 0x0116, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0031, B:20:0x003b, B:22:0x003e, B:24:0x0042, B:26:0x004e, B:27:0x0051, B:29:0x005e, B:35:0x006d, B:36:0x007b, B:40:0x0096, B:48:0x00a6, B:51:0x00b2, B:52:0x00b7, B:53:0x00c1, B:55:0x00c8, B:56:0x00cd, B:58:0x00d8, B:60:0x00df, B:64:0x00e9, B:67:0x00f5, B:68:0x00fb, B:15:0x002b), top: B:83:0x000d }] */
    CharSequence h(CharSequence charSequence, int i2, int i3, int i4, boolean z) {
        int iCharCount;
        j[] jVarArr;
        boolean z2 = charSequence instanceof n;
        if (z2) {
            ((n) charSequence).a();
        }
        Spannable spannableString = null;
        if (z2) {
            spannableString = (Spannable) charSequence;
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i2 - 1, i3 + 1, j.class) <= i3) {
                    spannableString = new SpannableString(charSequence);
                }
            } finally {
                if (z2) {
                    ((n) charSequence).d();
                }
            }
        }
        if (spannableString != null && (jVarArr = (j[]) spannableString.getSpans(i2, i3, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = spannableString.getSpanStart(jVar);
                int spanEnd = spannableString.getSpanEnd(jVar);
                if (spanStart != i3) {
                    spannableString.removeSpan(jVar);
                }
                i2 = Math.min(spanStart, i2);
                i3 = Math.max(spanEnd, i3);
            }
        }
        if (i2 != i3 && i2 < charSequence.length()) {
            if (i4 != Integer.MAX_VALUE && spannableString != null) {
                i4 -= ((j[]) spannableString.getSpans(0, spannableString.length(), j.class)).length;
            }
            c cVar = new c(this.b.f(), this.d, this.e);
            Spannable spannableString2 = spannableString;
            int iCodePointAt = Character.codePointAt(charSequence, i2);
            int i5 = 0;
            loop1: while (true) {
                iCharCount = i2;
                while (true) {
                    if (i2 >= i3 || i5 >= i4) {
                        break loop1;
                    }
                    int iA = cVar.a(iCodePointAt);
                    if (iA == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i3) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i2 = iCharCount;
                    } else if (iA == 2) {
                        i2 += Character.charCount(iCodePointAt);
                        if (i2 < i3) {
                            iCodePointAt = Character.codePointAt(charSequence, i2);
                        }
                    } else if (iA != 3) {
                    }
                }
                if (z || !e(charSequence, iCharCount, i2, cVar.c())) {
                    if (spannableString2 == null) {
                        spannableString2 = new SpannableString(charSequence);
                    }
                    a(spannableString2, cVar.c(), iCharCount, i2);
                    i5++;
                }
            }
            CharSequence charSequence2 = spannableString2;
            charSequence2 = spannableString2;
            if (cVar.e() && i5 < i4) {
                if (z) {
                    if (spannableString2 == null) {
                        spannableString2 = new SpannableString(charSequence);
                    }
                    a(spannableString2, cVar.b(), iCharCount, i2);
                    charSequence2 = spannableString2;
                } else {
                    charSequence2 = spannableString2;
                    if (!e(charSequence, iCharCount, i2, cVar.b())) {
                        if (spannableString2 == null) {
                            spannableString2 = new SpannableString(charSequence);
                        }
                        a(spannableString2, cVar.b(), iCharCount, i2);
                        charSequence2 = spannableString2;
                    }
                }
            }
            if (charSequence2 == null) {
                charSequence2 = charSequence;
            }
            return charSequence2;
        }
        return charSequence;
    }
}
