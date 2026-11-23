package h.l.a;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class g implements TextWatcher {
    private final EditText a;
    private final boolean b;
    private androidx.emoji2.text.g.e c;
    private int d = Integer.MAX_VALUE;
    private int e = 0;
    private boolean f = true;

    private static class a extends androidx.emoji2.text.g.e {
        private final Reference<EditText> a;

        a(EditText editText) {
            this.a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.g.e
        public void b() {
            super.b();
            g.b(this.a.get(), 1);
        }
    }

    g(EditText editText, boolean z) {
        this.a = editText;
        this.b = z;
    }

    private androidx.emoji2.text.g.e a() {
        if (this.c == null) {
            this.c = new a(this.a);
        }
        return this.c;
    }

    static void b(EditText editText, int i2) {
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.g.b().o(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return (this.f && (this.b || androidx.emoji2.text.g.h())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void c(boolean z) {
        if (this.f != z) {
            if (this.c != null) {
                androidx.emoji2.text.g.b().t(this.c);
            }
            this.f = z;
            if (z) {
                b(this.a, androidx.emoji2.text.g.b().d());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (this.a.isInEditMode() || d() || i3 > i4 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iD = androidx.emoji2.text.g.b().d();
        if (iD != 0) {
            if (iD == 1) {
                androidx.emoji2.text.g.b().r((Spannable) charSequence, i2, i2 + i4, this.d, this.e);
                return;
            } else if (iD != 3) {
                return;
            }
        }
        androidx.emoji2.text.g.b().s(a());
    }
}
