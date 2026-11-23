package m;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f2312k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char[] f2313l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final List<String> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<String> f2314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f2315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f2316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f2317j;

    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C0278a f2318i = new C0278a(null);
        private String a;
        private String d;
        private final List<String> f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<String> f2319g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f2320h;
        private String b = "";
        private String c = "";
        private int e = -1;

        /* JADX INFO: renamed from: m.v$a$a, reason: collision with other inner class name */
        public static final class C0278a {
            private C0278a() {
            }

            public /* synthetic */ C0278a(l.y.c.f fVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String str, int i2, int i3) {
                try {
                    int i4 = Integer.parseInt(b.b(v.f2312k, str, i2, i3, "", false, false, false, false, null, 248, null));
                    boolean z = false;
                    if (1 <= i4 && i4 < 65536) {
                        z = true;
                    }
                    if (z) {
                        return i4;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String str, int i2, int i3) {
                while (i2 < i3) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt == '[') {
                        do {
                            i2++;
                            if (i2 >= i3) {
                                break;
                            }
                        } while (str.charAt(i2) != ']');
                    } else if (cCharAt == ':') {
                        return i2;
                    }
                    i2++;
                }
                return i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String str, int i2, int i3) {
                if (i3 - i2 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i2);
                if ((l.y.c.i.g(cCharAt, 97) < 0 || l.y.c.i.g(cCharAt, 122) > 0) && (l.y.c.i.g(cCharAt, 65) < 0 || l.y.c.i.g(cCharAt, 90) > 0)) {
                    return -1;
                }
                int i4 = i2 + 1;
                while (i4 < i3) {
                    int i5 = i4 + 1;
                    char cCharAt2 = str.charAt(i4);
                    if (!(((((('a' <= cCharAt2 && cCharAt2 < '{') || ('A' <= cCharAt2 && cCharAt2 < '[')) || ('0' <= cCharAt2 && cCharAt2 < ':')) || cCharAt2 == '+') || cCharAt2 == '-') || cCharAt2 == '.')) {
                        if (cCharAt2 == ':') {
                            return i4;
                        }
                        return -1;
                    }
                    i4 = i5;
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i2, int i3) {
                int i4 = 0;
                while (i2 < i3) {
                    int i5 = i2 + 1;
                    char cCharAt = str.charAt(i2);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i4++;
                    i2 = i5;
                }
                return i4;
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        private final int d() {
            int i2 = this.e;
            if (i2 != -1) {
                return i2;
            }
            b bVar = v.f2312k;
            String str = this.a;
            l.y.c.i.c(str);
            return bVar.c(str);
        }

        private final boolean o(String str) {
            return l.y.c.i.a(str, ".") || l.d0.p.l(str, "%2e", true);
        }

        private final boolean p(String str) {
            return l.y.c.i.a(str, "..") || l.d0.p.l(str, "%2e.", true) || l.d0.p.l(str, ".%2e", true) || l.d0.p.l(str, "%2e%2e", true);
        }

        private final void s() {
            List<String> list = this.f;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.f.isEmpty())) {
                this.f.add("");
            } else {
                List<String> list2 = this.f;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void u(String str, int i2, int i3, boolean z, boolean z2) {
            String strB = b.b(v.f2312k, str, i2, i3, " \"<>^`{}|/\\?#", z2, false, false, false, null, 240, null);
            if (o(strB)) {
                return;
            }
            if (p(strB)) {
                s();
                return;
            }
            List<String> list = this.f;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.f;
                list2.set(list2.size() - 1, strB);
            } else {
                this.f.add(strB);
            }
            if (z) {
                this.f.add("");
            }
        }

        private final void x(String str, int i2, int i3) {
            if (i2 == i3) {
                return;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f.clear();
                this.f.add("");
                i2++;
            } else {
                List<String> list = this.f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i4 = i2;
                while (i4 < i3) {
                    i2 = m.h0.d.n(str, "/\\", i4, i3);
                    boolean z = i2 < i3;
                    u(str, i4, i2, z, true);
                    if (z) {
                        i4 = i2 + 1;
                    }
                }
                return;
            }
        }

        public final void A(String str) {
            l.y.c.i.e(str, "<set-?>");
            this.c = str;
        }

        public final void B(List<String> list) {
            this.f2319g = list;
        }

        public final void C(String str) {
            l.y.c.i.e(str, "<set-?>");
            this.b = str;
        }

        public final void D(String str) {
            this.d = str;
        }

        public final void E(int i2) {
            this.e = i2;
        }

        public final void F(String str) {
            this.a = str;
        }

        public final a G(String str) {
            l.y.c.i.e(str, "username");
            C(b.b(v.f2312k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final a a(String str, String str2) {
            l.y.c.i.e(str, "encodedName");
            if (i() == null) {
                B(new ArrayList());
            }
            List<String> listI = i();
            l.y.c.i.c(listI);
            b bVar = v.f2312k;
            listI.add(b.b(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            List<String> listI2 = i();
            l.y.c.i.c(listI2);
            listI2.add(str2 == null ? null : b.b(bVar, str2, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            return this;
        }

        public final a b(String str, String str2) {
            l.y.c.i.e(str, "name");
            if (i() == null) {
                B(new ArrayList());
            }
            List<String> listI = i();
            l.y.c.i.c(listI);
            b bVar = v.f2312k;
            listI.add(b.b(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List<String> listI2 = i();
            l.y.c.i.c(listI2);
            listI2.add(str2 == null ? null : b.b(bVar, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            return this;
        }

        public final v c() {
            ArrayList arrayList;
            String str = this.a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = v.f2312k;
            String strG = b.g(bVar, this.b, 0, 0, false, 7, null);
            String strG2 = b.g(bVar, this.c, 0, 0, false, 7, null);
            String str2 = this.d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iD = d();
            List<String> list = this.f;
            ArrayList arrayList2 = new ArrayList(l.t.n.o(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.g(v.f2312k, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f2319g;
            if (list2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(l.t.n.o(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 == null ? null : b.g(v.f2312k, str3, 0, 0, true, 3, null));
                }
            }
            String str4 = this.f2320h;
            return new v(str, strG, strG2, str2, iD, arrayList2, arrayList, str4 == null ? null : b.g(v.f2312k, str4, 0, 0, false, 7, null), toString());
        }

        public final a e(String str) {
            List<String> listI = null;
            if (str != null) {
                b bVar = v.f2312k;
                String strB = b.b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (strB != null) {
                    listI = bVar.i(strB);
                }
            }
            B(listI);
            return this;
        }

        public final String f() {
            return this.f2320h;
        }

        public final String g() {
            return this.c;
        }

        public final List<String> h() {
            return this.f;
        }

        public final List<String> i() {
            return this.f2319g;
        }

        public final String j() {
            return this.b;
        }

        public final String k() {
            return this.d;
        }

        public final int l() {
            return this.e;
        }

        public final String m() {
            return this.a;
        }

        public final a n(String str) {
            l.y.c.i.e(str, "host");
            String strE = m.h0.c.e(b.g(v.f2312k, str, 0, 0, false, 7, null));
            if (strE == null) {
                throw new IllegalArgumentException(l.y.c.i.k("unexpected host: ", str));
            }
            D(strE);
            return this;
        }

        public final a q(v vVar, String str) {
            int iN;
            int i2;
            int i3;
            String str2;
            int i4;
            boolean z;
            String strK = str;
            l.y.c.i.e(strK, "input");
            int iX = m.h0.d.x(strK, 0, 0, 3, null);
            int iZ = m.h0.d.z(strK, iX, 0, 2, null);
            C0278a c0278a = f2318i;
            int iG = c0278a.g(strK, iX, iZ);
            String str3 = "this as java.lang.String…ing(startIndex, endIndex)";
            byte b = -1;
            if (iG != -1) {
                if (l.d0.p.u(strK, "https:", iX, true)) {
                    this.a = "https";
                    iX += 6;
                } else {
                    if (!l.d0.p.u(strK, "http:", iX, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = strK.substring(0, iG);
                        l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.a = "http";
                    iX += 5;
                }
            } else {
                if (vVar == null) {
                    if (str.length() > 6) {
                        strK = l.y.c.i.k(l.d0.s.v0(strK, 6), "...");
                    }
                    throw new IllegalArgumentException(l.y.c.i.k("Expected URL scheme 'http' or 'https' but no scheme was found for ", strK));
                }
                this.a = vVar.u();
            }
            int iH = c0278a.h(strK, iX, iZ);
            byte b2 = 63;
            byte b3 = 35;
            if (iH >= 2 || vVar == null || !l.y.c.i.a(vVar.u(), this.a)) {
                int i5 = iX + iH;
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    iN = m.h0.d.n(strK, "@/\\?#", i5, iZ);
                    byte bCharAt = iN != iZ ? strK.charAt(iN) : (byte) -1;
                    if (bCharAt == b || bCharAt == b3 || bCharAt == 47 || bCharAt == 92 || bCharAt == b2) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z2) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.c);
                            sb2.append("%40");
                            str2 = str3;
                            i4 = iN;
                            sb2.append(b.b(v.f2312k, str, i5, iN, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.c = sb2.toString();
                        } else {
                            int iM = m.h0.d.m(strK, ':', i5, iN);
                            b bVar = v.f2312k;
                            String str4 = str3;
                            String strB = b.b(bVar, str, i5, iM, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z3) {
                                strB = this.b + "%40" + strB;
                            }
                            this.b = strB;
                            if (iM != iN) {
                                this.c = b.b(bVar, str, iM + 1, iN, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z = true;
                            } else {
                                z = z2;
                            }
                            z2 = z;
                            str2 = str4;
                            z3 = true;
                            i4 = iN;
                        }
                        i5 = i4 + 1;
                        str3 = str2;
                        iZ = iZ;
                        b3 = 35;
                        b2 = 63;
                        b = -1;
                    }
                }
                String str5 = str3;
                i2 = iZ;
                C0278a c0278a2 = f2318i;
                int iF = c0278a2.f(strK, i5, iN);
                int i6 = iF + 1;
                if (i6 < iN) {
                    i3 = i5;
                    this.d = m.h0.c.e(b.g(v.f2312k, str, i5, iF, false, 4, null));
                    int iE = c0278a2.e(strK, i6, iN);
                    this.e = iE;
                    if (!(iE != -1)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = strK.substring(i6, iN);
                        l.y.c.i.d(strSubstring2, str5);
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    i3 = i5;
                    b bVar2 = v.f2312k;
                    this.d = m.h0.c.e(b.g(bVar2, str, i3, iF, false, 4, null));
                    String str6 = this.a;
                    l.y.c.i.c(str6);
                    this.e = bVar2.c(str6);
                }
                if (!(this.d != null)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = strK.substring(i3, iF);
                    l.y.c.i.d(strSubstring3, str5);
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iX = iN;
            } else {
                this.b = vVar.g();
                this.c = vVar.c();
                this.d = vVar.i();
                this.e = vVar.n();
                this.f.clear();
                this.f.addAll(vVar.e());
                if (iX == iZ || strK.charAt(iX) == '#') {
                    e(vVar.f());
                }
                i2 = iZ;
            }
            int i7 = i2;
            int iN2 = m.h0.d.n(strK, "?#", iX, i7);
            x(strK, iX, iN2);
            if (iN2 < i7 && strK.charAt(iN2) == '?') {
                int iM2 = m.h0.d.m(strK, '#', iN2, i7);
                b bVar3 = v.f2312k;
                this.f2319g = bVar3.i(b.b(bVar3, str, iN2 + 1, iM2, " \"'<>#", true, false, true, false, null, 208, null));
                iN2 = iM2;
            }
            if (iN2 < i7 && strK.charAt(iN2) == '#') {
                this.f2320h = b.b(v.f2312k, str, iN2 + 1, i7, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a r(String str) {
            l.y.c.i.e(str, "password");
            A(b.b(v.f2312k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final a t(int i2) {
            boolean z = false;
            if (1 <= i2 && i2 < 65536) {
                z = true;
            }
            if (!z) {
                throw new IllegalArgumentException(l.y.c.i.k("unexpected port: ", Integer.valueOf(i2)).toString());
            }
            E(i2);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x003c  */
        /* JADX WARN: Code duplicated, block: B:20:0x004e  */
        /* JADX WARN: Code duplicated, block: B:22:0x0051  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            if (m() != null) {
                sb.append(m());
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (j().length() > 0) {
                sb.append(j());
                if (g().length() > 0) {
                    sb.append(':');
                    sb.append(g());
                }
                sb.append('@');
            } else {
                if (g().length() > 0) {
                    sb.append(j());
                    if (g().length() > 0) {
                        sb.append(':');
                        sb.append(g());
                    }
                    sb.append('@');
                }
            }
            if (k() != null) {
                String strK = k();
                l.y.c.i.c(strK);
                if (l.d0.q.B(strK, ':', false, 2, null)) {
                    sb.append('[');
                    sb.append(k());
                    sb.append(']');
                } else {
                    sb.append(k());
                }
            }
            if (l() != -1 || m() != null) {
                int iD = d();
                if (m() != null) {
                    b bVar = v.f2312k;
                    String strM = m();
                    l.y.c.i.c(strM);
                    if (iD != bVar.c(strM)) {
                        sb.append(':');
                        sb.append(iD);
                    }
                } else {
                    sb.append(':');
                    sb.append(iD);
                }
            }
            b bVar2 = v.f2312k;
            bVar2.h(h(), sb);
            if (i() != null) {
                sb.append('?');
                List<String> listI = i();
                l.y.c.i.c(listI);
                bVar2.j(listI, sb);
            }
            if (f() != null) {
                sb.append('#');
                sb.append(f());
            }
            String string = sb.toString();
            l.y.c.i.d(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final a v(String str) {
            List<String> listI = null;
            if (str != null) {
                b bVar = v.f2312k;
                String strB = b.b(bVar, str, 0, 0, " \"'<>#", false, false, true, false, null, 219, null);
                if (strB != null) {
                    listI = bVar.i(strB);
                }
            }
            B(listI);
            return this;
        }

        public final a w() {
            String strK = k();
            D(strK == null ? null : new l.d0.f("[\"<>^`{|}]").b(strK, ""));
            int size = h().size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                h().set(i3, b.b(v.f2312k, h().get(i3), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> listI = i();
            if (listI != null) {
                int size2 = listI.size();
                while (i2 < size2) {
                    int i4 = i2 + 1;
                    String str = listI.get(i2);
                    listI.set(i2, str == null ? null : b.b(v.f2312k, str, 0, 0, "\\^`{|}", true, true, true, false, null, j.d.a.e.a.a.i.g.STATUS_WAITING_FOR_NETWORK, null));
                    i2 = i4;
                }
            }
            String strF = f();
            z(strF != null ? b.b(v.f2312k, strF, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null);
            return this;
        }

        public final a y(String str) {
            l.y.c.i.e(str, "scheme");
            String str2 = "http";
            if (!l.d0.p.l(str, "http", true)) {
                str2 = "https";
                if (!l.d0.p.l(str, "https", true)) {
                    throw new IllegalArgumentException(l.y.c.i.k("unexpected scheme: ", str));
                }
            }
            F(str2);
            return this;
        }

        public final void z(String str) {
            this.f2320h = str;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        public static /* synthetic */ String b(b bVar, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i4, Object obj) {
            return bVar.a(str, (i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? str.length() : i3, str2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? null : charset);
        }

        private final boolean e(String str, int i2, int i3) {
            int i4 = i2 + 2;
            return i4 < i3 && str.charAt(i2) == '%' && m.h0.d.G(str.charAt(i2 + 1)) != -1 && m.h0.d.G(str.charAt(i4)) != -1;
        }

        public static /* synthetic */ String g(b bVar, String str, int i2, int i3, boolean z, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = str.length();
            }
            if ((i4 & 4) != 0) {
                z = false;
            }
            return bVar.f(str, i2, i3, z);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0062  */
        /* JADX WARN: Code duplicated, block: B:39:0x0067  */
        /* JADX WARN: Code duplicated, block: B:42:0x006e  */
        /* JADX WARN: Code duplicated, block: B:48:0x0087  */
        /* JADX WARN: Code duplicated, block: B:51:0x0090 A[LOOP:1: B:49:0x008a->B:51:0x0090, LOOP_END] */
        private final void k(n.b bVar, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            int iCharCount = i2;
            n.b bVar2 = null;
            while (iCharCount < i3) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z3) {
                        bVar.I0(z ? "+" : "%2B");
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || l.d0.q.B(str2, (char) iCodePointAt, false, 2, null))) {
                        if (bVar2 == null) {
                            bVar2 = new n.b();
                        }
                        if (charset != null || l.y.c.i.a(charset, StandardCharsets.UTF_8)) {
                            bVar2.K0(iCodePointAt);
                        } else {
                            bVar2.H0(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!bVar2.z()) {
                            int i4 = bVar2.readByte() & 255;
                            bVar.z0(37);
                            bVar.z0(v.f2313l[(i4 >> 4) & 15]);
                            bVar.z0(v.f2313l[i4 & 15]);
                        }
                    } else {
                        if (iCodePointAt == 37) {
                            if (z) {
                                if (z2) {
                                    if (!e(str, iCharCount, i3)) {
                                    }
                                }
                            }
                            if (bVar2 == null) {
                                bVar2 = new n.b();
                            }
                            if (charset != null) {
                                bVar2.K0(iCodePointAt);
                            } else {
                                bVar2.K0(iCodePointAt);
                            }
                            while (!bVar2.z()) {
                                int i5 = bVar2.readByte() & 255;
                                bVar.z0(37);
                                bVar.z0(v.f2313l[(i5 >> 4) & 15]);
                                bVar.z0(v.f2313l[i5 & 15]);
                            }
                        }
                        bVar.K0(iCodePointAt);
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        private final void l(n.b bVar, String str, int i2, int i3, boolean z) {
            int i4;
            while (i2 < i3) {
                int iCodePointAt = str.codePointAt(i2);
                if (iCodePointAt == 37 && (i4 = i2 + 2) < i3) {
                    int iG = m.h0.d.G(str.charAt(i2 + 1));
                    int iG2 = m.h0.d.G(str.charAt(i4));
                    if (iG == -1 || iG2 == -1) {
                        bVar.K0(iCodePointAt);
                        i2 += Character.charCount(iCodePointAt);
                    } else {
                        bVar.z0((iG << 4) + iG2);
                        i2 = Character.charCount(iCodePointAt) + i4;
                    }
                } else if (iCodePointAt == 43 && z) {
                    bVar.z0(32);
                    i2++;
                } else {
                    bVar.K0(iCodePointAt);
                    i2 += Character.charCount(iCodePointAt);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x003e  */
        public final String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            l.y.c.i.e(str, "<this>");
            l.y.c.i.e(str2, "encodeSet");
            int iCharCount = i2;
            while (true) {
                if (iCharCount >= i3) {
                    String strSubstring = str.substring(i2, i3);
                    l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return strSubstring;
                }
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || l.d0.q.B(str2, (char) iCodePointAt, false, 2, null))) {
                    break;
                }
                if (iCodePointAt == 37) {
                    if (!z) {
                        break;
                    }
                    if (z2) {
                        if (e(str, iCharCount, i3)) {
                        }
                    }
                    if (iCodePointAt == 43) {
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                } else if (iCodePointAt == 43 || !z3) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
                n.b bVar = new n.b();
                bVar.J0(str, i2, iCharCount);
                k(bVar, str, iCharCount, i3, str2, z, z2, z3, z4, charset);
                return bVar.o0();
            }
            n.b bVar2 = new n.b();
            bVar2.J0(str, i2, iCharCount);
            k(bVar2, str, iCharCount, i3, str2, z, z2, z3, z4, charset);
            return bVar2.o0();
        }

        public final int c(String str) {
            l.y.c.i.e(str, "scheme");
            if (l.y.c.i.a(str, "http")) {
                return 80;
            }
            return l.y.c.i.a(str, "https") ? 443 : -1;
        }

        public final v d(String str) {
            l.y.c.i.e(str, "<this>");
            a aVar = new a();
            aVar.q(null, str);
            return aVar.c();
        }

        public final String f(String str, int i2, int i3, boolean z) {
            l.y.c.i.e(str, "<this>");
            int i4 = i2;
            while (i4 < i3) {
                int i5 = i4 + 1;
                char cCharAt = str.charAt(i4);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    n.b bVar = new n.b();
                    bVar.J0(str, i2, i4);
                    l(bVar, str, i4, i3, z);
                    return bVar.o0();
                }
                i4 = i5;
            }
            String strSubstring = str.substring(i2, i3);
            l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void h(List<String> list, StringBuilder sb) {
            l.y.c.i.e(list, "<this>");
            l.y.c.i.e(sb, "out");
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append(list.get(i2));
            }
        }

        public final List<String> i(String str) {
            String strSubstring;
            l.y.c.i.e(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 <= str.length()) {
                int iM = l.d0.q.M(str, '&', i2, false, 4, null);
                if (iM == -1) {
                    iM = str.length();
                }
                int i3 = iM;
                int iM2 = l.d0.q.M(str, '=', i2, false, 4, null);
                if (iM2 == -1 || iM2 > i3) {
                    String strSubstring2 = str.substring(i2, i3);
                    l.y.c.i.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    strSubstring = null;
                } else {
                    String strSubstring3 = str.substring(i2, iM2);
                    l.y.c.i.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                    strSubstring = str.substring(iM2 + 1, i3);
                    l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strSubstring);
                i2 = i3 + 1;
            }
            return arrayList;
        }

        public final void j(List<String> list, StringBuilder sb) {
            l.y.c.i.e(list, "<this>");
            l.y.c.i.e(sb, "out");
            l.a0.d dVarH = l.a0.i.h(l.a0.i.i(0, list.size()), 2);
            int iB = dVarH.b();
            int iC = dVarH.c();
            int iD = dVarH.d();
            if ((iD <= 0 || iB > iC) && (iD >= 0 || iC > iB)) {
                return;
            }
            while (true) {
                int i2 = iB + iD;
                String str = list.get(iB);
                String str2 = list.get(iB + 1);
                if (iB > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (iB == iC) {
                    return;
                } else {
                    iB = i2;
                }
            }
        }
    }

    public v(String str, String str2, String str3, String str4, int i2, List<String> list, List<String> list2, String str5, String str6) {
        l.y.c.i.e(str, "scheme");
        l.y.c.i.e(str2, "username");
        l.y.c.i.e(str3, "password");
        l.y.c.i.e(str4, "host");
        l.y.c.i.e(list, "pathSegments");
        l.y.c.i.e(str6, "url");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i2;
        this.f = list;
        this.f2314g = list2;
        this.f2315h = str5;
        this.f2316i = str6;
        this.f2317j = l.y.c.i.a(str, "https");
    }

    public static final v h(String str) {
        return f2312k.d(str);
    }

    public final String b() {
        if (this.f2315h == null) {
            return null;
        }
        String strSubstring = this.f2316i.substring(l.d0.q.M(this.f2316i, '#', 0, false, 6, null) + 1);
        l.y.c.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String c() {
        if (this.c.length() == 0) {
            return "";
        }
        String strSubstring = this.f2316i.substring(l.d0.q.M(this.f2316i, ':', this.a.length() + 3, false, 4, null) + 1, l.d0.q.M(this.f2316i, '@', 0, false, 6, null));
        l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String d() {
        int iM = l.d0.q.M(this.f2316i, '/', this.a.length() + 3, false, 4, null);
        String str = this.f2316i;
        String strSubstring = this.f2316i.substring(iM, m.h0.d.n(str, "?#", iM, str.length()));
        l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List<String> e() {
        int iM = l.d0.q.M(this.f2316i, '/', this.a.length() + 3, false, 4, null);
        String str = this.f2316i;
        int iN = m.h0.d.n(str, "?#", iM, str.length());
        ArrayList arrayList = new ArrayList();
        while (iM < iN) {
            int i2 = iM + 1;
            int iM2 = m.h0.d.m(this.f2316i, '/', i2, iN);
            String strSubstring = this.f2316i.substring(i2, iM2);
            l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iM = iM2;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof v) && l.y.c.i.a(((v) obj).f2316i, this.f2316i);
    }

    public final String f() {
        if (this.f2314g == null) {
            return null;
        }
        int iM = l.d0.q.M(this.f2316i, '?', 0, false, 6, null) + 1;
        String str = this.f2316i;
        String strSubstring = this.f2316i.substring(iM, m.h0.d.m(str, '#', iM, str.length()));
        l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String g() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.f2316i;
        String strSubstring = this.f2316i.substring(length, m.h0.d.n(str, ":@", length, str.length()));
        l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public int hashCode() {
        return this.f2316i.hashCode();
    }

    public final String i() {
        return this.d;
    }

    public final boolean j() {
        return this.f2317j;
    }

    public final a k() {
        a aVar = new a();
        aVar.F(this.a);
        aVar.C(g());
        aVar.A(c());
        aVar.D(this.d);
        aVar.E(this.e != f2312k.c(this.a) ? this.e : -1);
        aVar.h().clear();
        aVar.h().addAll(e());
        aVar.e(f());
        aVar.z(b());
        return aVar;
    }

    public final a l(String str) {
        l.y.c.i.e(str, "link");
        try {
            a aVar = new a();
            aVar.q(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final List<String> m() {
        return this.f;
    }

    public final int n() {
        return this.e;
    }

    public final String o() {
        if (this.f2314g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f2312k.j(this.f2314g, sb);
        return sb.toString();
    }

    public final String p(int i2) {
        List<String> list = this.f2314g;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i2 * 2);
        l.y.c.i.c(str);
        return str;
    }

    public final String q(int i2) {
        List<String> list = this.f2314g;
        if (list != null) {
            return list.get((i2 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int r() {
        List<String> list = this.f2314g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String s() {
        a aVarL = l("/...");
        l.y.c.i.c(aVarL);
        aVarL.G("");
        aVarL.r("");
        return aVarL.c().toString();
    }

    public final v t(String str) {
        l.y.c.i.e(str, "link");
        a aVarL = l(str);
        if (aVarL == null) {
            return null;
        }
        return aVarL.c();
    }

    public String toString() {
        return this.f2316i;
    }

    public final String u() {
        return this.a;
    }

    public final URI v() {
        a aVarK = k();
        aVarK.w();
        String string = aVarK.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new l.d0.f("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(string, ""));
                l.y.c.i.d(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL w() {
        try {
            return new URL(this.f2316i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
