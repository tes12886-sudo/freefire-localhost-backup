package l.d0;

import java.util.Collection;
import java.util.Iterator;
import l.t.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class p extends o {
    public static String h(char[] cArr) {
        l.y.c.i.e(cArr, "<this>");
        return new String(cArr);
    }

    public static String i(char[] cArr, int i2, int i3) {
        l.y.c.i.e(cArr, "<this>");
        l.t.b.a.a(i2, i3, cArr.length);
        return new String(cArr, i2, i3 - i2);
    }

    public static final boolean j(String str, String str2, boolean z) {
        l.y.c.i.e(str, "<this>");
        l.y.c.i.e(str2, "suffix");
        return !z ? str.endsWith(str2) : n(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean k(String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return j(str, str2, z);
    }

    public static boolean l(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        return !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final boolean m(CharSequence charSequence) {
        boolean z;
        l.y.c.i.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable iterableG = q.G(charSequence);
            if ((iterableG instanceof Collection) && ((Collection) iterableG).isEmpty()) {
                z = true;
            } else {
                Iterator it = iterableG.iterator();
                while (it.hasNext()) {
                    if (!b.c(charSequence.charAt(((z) it).a()))) {
                        z = false;
                    }
                }
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static final boolean n(String str, int i2, String str2, int i3, int i4, boolean z) {
        l.y.c.i.e(str, "<this>");
        l.y.c.i.e(str2, "other");
        return !z ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z, i2, str2, i3, i4);
    }

    public static String p(CharSequence charSequence, int i2) {
        l.y.c.i.e(charSequence, "<this>");
        int i3 = 1;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i2 + '.').toString());
        }
        if (i2 == 0) {
            return "";
        }
        if (i2 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                cArr[i4] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i2);
        if (1 <= i2) {
            while (true) {
                sb.append(charSequence);
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        String string = sb.toString();
        l.y.c.i.d(string, "{\n                    va…tring()\n                }");
        return string;
    }

    public static final String q(String str, char c, char c2, boolean z) {
        String string;
        String str2;
        l.y.c.i.e(str, "<this>");
        if (z) {
            StringBuilder sb = new StringBuilder(str.length());
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (c.e(cCharAt, c, z)) {
                    cCharAt = c2;
                }
                sb.append(cCharAt);
            }
            string = sb.toString();
            str2 = "StringBuilder(capacity).…builderAction).toString()";
        } else {
            string = str.replace(c, c2);
            str2 = "this as java.lang.String…replace(oldChar, newChar)";
        }
        l.y.c.i.d(string, str2);
        return string;
    }

    public static final String r(String str, String str2, String str3, boolean z) {
        l.y.c.i.e(str, "<this>");
        l.y.c.i.e(str2, "oldValue");
        l.y.c.i.e(str3, "newValue");
        int i2 = 0;
        int iJ = q.J(str, str2, 0, z);
        if (iJ < 0) {
            return str;
        }
        int length = str2.length();
        int iB = l.a0.i.b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i2, iJ);
            sb.append(str3);
            i2 = iJ + length;
            if (iJ >= str.length()) {
                break;
            }
            iJ = q.J(str, str2, iJ + iB, z);
        } while (iJ > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        l.y.c.i.d(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    public static /* synthetic */ String s(String str, char c, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return q(str, c, c2, z);
    }

    public static /* synthetic */ String t(String str, String str2, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return r(str, str2, str3, z);
    }

    public static boolean u(String str, String str2, int i2, boolean z) {
        l.y.c.i.e(str, "<this>");
        l.y.c.i.e(str2, "prefix");
        return !z ? str.startsWith(str2, i2) : n(str, i2, str2, 0, str2.length(), z);
    }

    public static boolean v(String str, String str2, boolean z) {
        l.y.c.i.e(str, "<this>");
        l.y.c.i.e(str2, "prefix");
        return !z ? str.startsWith(str2) : n(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean w(String str, String str2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        return u(str, str2, i2, z);
    }

    public static /* synthetic */ boolean x(String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return v(str, str2, z);
    }
}
