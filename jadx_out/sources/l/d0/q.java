package l.d0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class q extends p {

    static final class a extends l.y.c.j implements l.y.b.p<CharSequence, Integer, l.l<? extends Integer, ? extends Integer>> {
        final /* synthetic */ char[] a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z) {
            super(2);
            this.a = cArr;
            this.b = z;
        }

        @Override // l.y.b.p
        public /* bridge */ /* synthetic */ l.l<? extends Integer, ? extends Integer> b(CharSequence charSequence, Integer num) {
            return d(charSequence, num.intValue());
        }

        public final l.l<Integer, Integer> d(CharSequence charSequence, int i2) {
            l.y.c.i.e(charSequence, "$this$$receiver");
            int iO = q.O(charSequence, this.a, i2, this.b);
            if (iO < 0) {
                return null;
            }
            return l.p.a(Integer.valueOf(iO), 1);
        }
    }

    static final class b extends l.y.c.j implements l.y.b.p<CharSequence, Integer, l.l<? extends Integer, ? extends Integer>> {
        final /* synthetic */ List<String> a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z) {
            super(2);
            this.a = list;
            this.b = z;
        }

        @Override // l.y.b.p
        public /* bridge */ /* synthetic */ l.l<? extends Integer, ? extends Integer> b(CharSequence charSequence, Integer num) {
            return d(charSequence, num.intValue());
        }

        public final l.l<Integer, Integer> d(CharSequence charSequence, int i2) {
            l.y.c.i.e(charSequence, "$this$$receiver");
            l.l lVarF = q.F(charSequence, this.a, i2, this.b, false);
            if (lVarF != null) {
                return l.p.a(lVarF.c(), Integer.valueOf(((String) lVarF.d()).length()));
            }
            return null;
        }
    }

    static final class c extends l.y.c.j implements l.y.b.l<l.a0.f, String> {
        final /* synthetic */ CharSequence a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.a = charSequence;
        }

        @Override // l.y.b.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String c(l.a0.f fVar) {
            l.y.c.i.e(fVar, "it");
            return q.n0(this.a, fVar);
        }
    }

    public static final boolean A(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        l.y.c.i.e(charSequence, "<this>");
        l.y.c.i.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (N(charSequence, (String) charSequence2, 0, z, 2, null) >= 0) {
                return true;
            }
        } else if (L(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean B(CharSequence charSequence, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return z(charSequence, c2, z);
    }

    public static /* synthetic */ boolean C(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return A(charSequence, charSequence2, z);
    }

    public static final boolean D(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        l.y.c.i.e(charSequence, "<this>");
        l.y.c.i.e(charSequence2, "suffix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? p.k((String) charSequence, (String) charSequence2, false, 2, null) : a0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean E(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return D(charSequence, charSequence2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l.l<Integer, String> F(CharSequence charSequence, Collection<String> collection, int i2, boolean z, boolean z2) {
        int iB;
        Object next;
        String str;
        String str2;
        Object next2;
        String str3;
        if (!z && collection.size() == 1) {
            String str4 = (String) l.t.k.K(collection);
            int iN = !z2 ? N(charSequence, str4, i2, false, 4, null) : S(charSequence, str4, i2, false, 4, null);
            if (iN < 0) {
                return null;
            }
            return l.p.a(Integer.valueOf(iN), str4);
        }
        l.a0.d fVar = !z2 ? new l.a0.f(l.a0.i.b(i2, 0), charSequence.length()) : l.a0.i.f(l.a0.i.c(i2, H(charSequence)), 0);
        if (charSequence instanceof String) {
            iB = fVar.b();
            int iC = fVar.c();
            int iD = fVar.d();
            if ((iD > 0 && iB <= iC) || (iD < 0 && iC <= iB)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        str3 = (String) next2;
                    } while (!p.n(str3, 0, (String) charSequence, iB, str3.length(), z));
                    str = (String) next2;
                    if (str != null) {
                        break;
                    }
                    if (iB != iC) {
                        iB += iD;
                    }
                }
                return l.p.a(Integer.valueOf(iB), str);
            }
            return null;
        }
        iB = fVar.b();
        int iC2 = fVar.c();
        int iD2 = fVar.d();
        if ((iD2 > 0 && iB <= iC2) || (iD2 < 0 && iC2 <= iB)) {
            while (true) {
                Iterator<T> it2 = collection.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    str2 = (String) next;
                } while (!a0(str2, 0, charSequence, iB, str2.length(), z));
                str = (String) next;
                if (str != null) {
                    break;
                }
                if (iB != iC2) {
                    iB += iD2;
                }
            }
            return l.p.a(Integer.valueOf(iB), str);
        }
        return null;
    }

    public static final l.a0.f G(CharSequence charSequence) {
        l.y.c.i.e(charSequence, "<this>");
        return new l.a0.f(0, charSequence.length() - 1);
    }

    public static final int H(CharSequence charSequence) {
        l.y.c.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int I(CharSequence charSequence, char c2, int i2, boolean z) {
        l.y.c.i.e(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? O(charSequence, new char[]{c2}, i2, z) : ((String) charSequence).indexOf(c2, i2);
    }

    public static final int J(CharSequence charSequence, String str, int i2, boolean z) {
        l.y.c.i.e(charSequence, "<this>");
        l.y.c.i.e(str, "string");
        return (z || !(charSequence instanceof String)) ? L(charSequence, str, i2, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i2);
    }

    private static final int K(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2) {
        l.a0.d fVar = !z2 ? new l.a0.f(l.a0.i.b(i2, 0), l.a0.i.c(i3, charSequence.length())) : l.a0.i.f(l.a0.i.c(i2, H(charSequence)), l.a0.i.b(i3, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iB = fVar.b();
            int iC = fVar.c();
            int iD = fVar.d();
            if ((iD <= 0 || iB > iC) && (iD >= 0 || iC > iB)) {
                return -1;
            }
            while (!p.n((String) charSequence2, 0, (String) charSequence, iB, charSequence2.length(), z)) {
                if (iB == iC) {
                    return -1;
                }
                iB += iD;
            }
            return iB;
        }
        int iB2 = fVar.b();
        int iC2 = fVar.c();
        int iD2 = fVar.d();
        if ((iD2 <= 0 || iB2 > iC2) && (iD2 >= 0 || iC2 > iB2)) {
            return -1;
        }
        while (!a0(charSequence2, 0, charSequence, iB2, charSequence2.length(), z)) {
            if (iB2 == iC2) {
                return -1;
            }
            iB2 += iD2;
        }
        return iB2;
    }

    static /* synthetic */ int L(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        return K(charSequence, charSequence2, i2, i3, z, (i4 & 16) != 0 ? false : z2);
    }

    public static /* synthetic */ int M(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return I(charSequence, c2, i2, z);
    }

    public static /* synthetic */ int N(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return J(charSequence, str, i2, z);
    }

    public static final int O(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        boolean z2;
        l.y.c.i.e(charSequence, "<this>");
        l.y.c.i.e(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(l.t.h.p(cArr), i2);
        }
        int iB = l.a0.i.b(i2, 0);
        int iH = H(charSequence);
        if (iB > iH) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iB);
            int length = cArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z2 = false;
                    break;
                }
                if (l.d0.c.e(cArr[i3], cCharAt, z)) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (z2) {
                return iB;
            }
            if (iB == iH) {
                return -1;
            }
            iB++;
        }
    }

    public static final int P(CharSequence charSequence, char c2, int i2, boolean z) {
        l.y.c.i.e(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? T(charSequence, new char[]{c2}, i2, z) : ((String) charSequence).lastIndexOf(c2, i2);
    }

    public static final int Q(CharSequence charSequence, String str, int i2, boolean z) {
        l.y.c.i.e(charSequence, "<this>");
        l.y.c.i.e(str, "string");
        return (z || !(charSequence instanceof String)) ? K(charSequence, str, i2, 0, z, true) : ((String) charSequence).lastIndexOf(str, i2);
    }

    public static /* synthetic */ int R(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = H(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return P(charSequence, c2, i2, z);
    }

    public static /* synthetic */ int S(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = H(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return Q(charSequence, str, i2, z);
    }

    public static final int T(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        l.y.c.i.e(charSequence, "<this>");
        l.y.c.i.e(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(l.t.h.p(cArr), i2);
        }
        for (int iC = l.a0.i.c(i2, H(charSequence)); -1 < iC; iC--) {
            char cCharAt = charSequence.charAt(iC);
            boolean z2 = false;
            for (char c2 : cArr) {
                if (l.d0.c.e(c2, cCharAt, z)) {
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                return iC;
            }
        }
        return -1;
    }

    public static final l.c0.c<String> U(CharSequence charSequence) {
        l.y.c.i.e(charSequence, "<this>");
        return k0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> V(CharSequence charSequence) {
        l.y.c.i.e(charSequence, "<this>");
        return l.c0.i.h(U(charSequence));
    }

    private static final l.c0.c<l.a0.f> W(CharSequence charSequence, char[] cArr, int i2, boolean z, int i3) {
        d0(i3);
        return new e(charSequence, i2, i3, new a(cArr, z));
    }

    private static final l.c0.c<l.a0.f> X(CharSequence charSequence, String[] strArr, int i2, boolean z, int i3) {
        d0(i3);
        return new e(charSequence, i2, i3, new b(l.t.g.b(strArr), z));
    }

    static /* synthetic */ l.c0.c Y(CharSequence charSequence, char[] cArr, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return W(charSequence, cArr, i2, z, i3);
    }

    static /* synthetic */ l.c0.c Z(CharSequence charSequence, String[] strArr, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return X(charSequence, strArr, i2, z, i3);
    }

    public static final boolean a0(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z) {
        l.y.c.i.e(charSequence, "<this>");
        l.y.c.i.e(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!l.d0.c.e(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z)) {
                return false;
            }
        }
        return true;
    }

    public static String b0(String str, CharSequence charSequence) {
        l.y.c.i.e(str, "<this>");
        l.y.c.i.e(charSequence, "prefix");
        if (!m0(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        l.y.c.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static String c0(String str, CharSequence charSequence) {
        l.y.c.i.e(str, "<this>");
        l.y.c.i.e(charSequence, "suffix");
        if (!E(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final void d0(int i2) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2).toString());
    }

    public static final List<String> e0(CharSequence charSequence, char[] cArr, boolean z, int i2) {
        l.y.c.i.e(charSequence, "<this>");
        l.y.c.i.e(cArr, "delimiters");
        if (cArr.length == 1) {
            return g0(charSequence, String.valueOf(cArr[0]), z, i2);
        }
        Iterable iterableA = l.c0.i.a(Y(charSequence, cArr, 0, z, i2, 2, null));
        ArrayList arrayList = new ArrayList(l.t.n.o(iterableA, 10));
        Iterator it = iterableA.iterator();
        while (it.hasNext()) {
            arrayList.add(n0(charSequence, (l.a0.f) it.next()));
        }
        return arrayList;
    }

    public static final List<String> f0(CharSequence charSequence, String[] strArr, boolean z, int i2) {
        l.y.c.i.e(charSequence, "<this>");
        l.y.c.i.e(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return g0(charSequence, str, z, i2);
            }
        }
        Iterable iterableA = l.c0.i.a(Z(charSequence, strArr, 0, z, i2, 2, null));
        ArrayList arrayList = new ArrayList(l.t.n.o(iterableA, 10));
        Iterator it = iterableA.iterator();
        while (it.hasNext()) {
            arrayList.add(n0(charSequence, (l.a0.f) it.next()));
        }
        return arrayList;
    }

    private static final List<String> g0(CharSequence charSequence, String str, boolean z, int i2) {
        d0(i2);
        int length = 0;
        int iJ = J(charSequence, str, 0, z);
        if (iJ == -1 || i2 == 1) {
            return l.t.l.b(charSequence.toString());
        }
        boolean z2 = i2 > 0;
        ArrayList arrayList = new ArrayList(z2 ? l.a0.i.c(i2, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iJ).toString());
            length = str.length() + iJ;
            if (z2 && arrayList.size() == i2 - 1) {
                break;
            }
            iJ = J(charSequence, str, length, z);
        } while (iJ != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List h0(CharSequence charSequence, char[] cArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return e0(charSequence, cArr, z, i2);
    }

    public static /* synthetic */ List i0(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return f0(charSequence, strArr, z, i2);
    }

    public static final l.c0.c<String> j0(CharSequence charSequence, String[] strArr, boolean z, int i2) {
        l.y.c.i.e(charSequence, "<this>");
        l.y.c.i.e(strArr, "delimiters");
        return l.c0.i.f(Z(charSequence, strArr, 0, z, i2, 2, null), new c(charSequence));
    }

    public static /* synthetic */ l.c0.c k0(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return j0(charSequence, strArr, z, i2);
    }

    public static final boolean l0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        l.y.c.i.e(charSequence, "<this>");
        l.y.c.i.e(charSequence2, "prefix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? p.x((String) charSequence, (String) charSequence2, false, 2, null) : a0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean m0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return l0(charSequence, charSequence2, z);
    }

    public static final String n0(CharSequence charSequence, l.a0.f fVar) {
        l.y.c.i.e(charSequence, "<this>");
        l.y.c.i.e(fVar, "range");
        return charSequence.subSequence(fVar.l().intValue(), fVar.j().intValue() + 1).toString();
    }

    public static final String o0(String str, char c2, String str2) {
        l.y.c.i.e(str, "<this>");
        l.y.c.i.e(str2, "missingDelimiterValue");
        int iM = M(str, c2, 0, false, 6, null);
        if (iM == -1) {
            return str2;
        }
        String strSubstring = str.substring(iM + 1, str.length());
        l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final String p0(String str, String str2, String str3) {
        l.y.c.i.e(str, "<this>");
        l.y.c.i.e(str2, "delimiter");
        l.y.c.i.e(str3, "missingDelimiterValue");
        int iN = N(str, str2, 0, false, 6, null);
        if (iN == -1) {
            return str3;
        }
        String strSubstring = str.substring(iN + str2.length(), str.length());
        l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String q0(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return o0(str, c2, str2);
    }

    public static /* synthetic */ String r0(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return p0(str, str2, str3);
    }

    public static final String s0(String str, char c2, String str2) {
        l.y.c.i.e(str, "<this>");
        l.y.c.i.e(str2, "missingDelimiterValue");
        int iR = R(str, c2, 0, false, 6, null);
        if (iR == -1) {
            return str2;
        }
        String strSubstring = str.substring(iR + 1, str.length());
        l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String t0(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return s0(str, c2, str2);
    }

    public static CharSequence u0(CharSequence charSequence) {
        l.y.c.i.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean zC = l.d0.b.c(charSequence.charAt(!z ? i2 : length));
            if (z) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i2++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static final boolean z(CharSequence charSequence, char c2, boolean z) {
        l.y.c.i.e(charSequence, "<this>");
        return M(charSequence, c2, 0, z, 2, null) >= 0;
    }
}
