package m;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f2161n = new b(null);
    private final boolean a;
    private final boolean b;
    private final int c;
    private final int d;
    private final boolean e;
    private final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f2162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f2163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f2164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f2165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f2166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f2167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f2168m;

    public static final class a {
        private boolean a;
        private boolean b;
        private int c = -1;
        private int d = -1;
        private int e = -1;
        private boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f2169g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f2170h;

        private final int b(long j2) {
            if (j2 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j2;
        }

        public final d a() {
            return new d(this.a, this.b, this.c, -1, false, false, false, this.d, this.e, this.f, this.f2169g, this.f2170h, null, null);
        }

        public final a c(int i2, TimeUnit timeUnit) {
            l.y.c.i.e(timeUnit, "timeUnit");
            if (!(i2 >= 0)) {
                throw new IllegalArgumentException(l.y.c.i.k("maxStale < 0: ", Integer.valueOf(i2)).toString());
            }
            this.d = b(timeUnit.toSeconds(i2));
            return this;
        }

        public final a d() {
            this.a = true;
            return this;
        }

        public final a e() {
            this.f = true;
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        private final int a(String str, String str2, int i2) {
            int length = str.length();
            while (i2 < length) {
                int i3 = i2 + 1;
                if (l.d0.q.B(str2, str.charAt(i2), false, 2, null)) {
                    return i2;
                }
                i2 = i3;
            }
            return str.length();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004c  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:39:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:42:0x0100  */
        /* JADX WARN: Code duplicated, block: B:54:0x013b  */
        /* JADX WARN: Code duplicated, block: B:57:0x0149  */
        /* JADX WARN: Code duplicated, block: B:75:0x00d2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x00e0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x00cc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:78:0x0170 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x00da A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x0108 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x0116 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x0124 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:83:0x0152 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x0161 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x00ed A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:0x00e8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x00fa A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x0133 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x0143 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x0168 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x0159 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x012b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x011c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:0x010e A[SYNTHETIC] */
        public final d b(u uVar) {
            int iA;
            int iA2;
            String string;
            String string2;
            u uVar2 = uVar;
            l.y.c.i.e(uVar2, "headers");
            int size = uVar.size();
            boolean z = true;
            int i2 = 0;
            boolean z2 = true;
            String str = null;
            boolean z3 = false;
            boolean z4 = false;
            int iU = -1;
            int iU2 = -1;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int iU3 = -1;
            int iU4 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            while (i2 < size) {
                int i3 = i2 + 1;
                String strC = uVar2.c(i2);
                String strH = uVar2.h(i2);
                if (l.d0.p.l(strC, "Cache-Control", z)) {
                    if (str == null) {
                        str = strH;
                    }
                    iA = 0;
                    while (iA < strH.length()) {
                        iA2 = a(strH, "=,;", iA);
                        String strSubstring = strH.substring(iA, iA2);
                        l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = l.d0.q.u0(strSubstring).toString();
                        if (iA2 != strH.length() || strH.charAt(iA2) == ',' || strH.charAt(iA2) == ';') {
                            iA = iA2 + 1;
                            string2 = null;
                        } else {
                            int iA3 = m.h0.d.A(strH, iA2 + 1);
                            if (iA3 >= strH.length() || strH.charAt(iA3) != '\"') {
                                iA = a(strH, ",;", iA3);
                                String strSubstring2 = strH.substring(iA3, iA);
                                l.y.c.i.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                string2 = l.d0.q.u0(strSubstring2).toString();
                            } else {
                                int i4 = iA3 + 1;
                                int iM = l.d0.q.M(strH, '\"', i4, false, 4, null);
                                string2 = strH.substring(i4, iM);
                                l.y.c.i.d(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                iA = iM + 1;
                            }
                        }
                        z = true;
                        if (l.d0.p.l("no-cache", string, true)) {
                            z3 = true;
                        } else if (l.d0.p.l("no-store", string, true)) {
                            z4 = true;
                        } else if (l.d0.p.l("max-age", string, true)) {
                            iU = m.h0.d.U(string2, -1);
                        } else if (l.d0.p.l("s-maxage", string, true)) {
                            iU2 = m.h0.d.U(string2, -1);
                        } else if (l.d0.p.l("private", string, true)) {
                            z5 = true;
                        } else if (l.d0.p.l("public", string, true)) {
                            z6 = true;
                        } else if (l.d0.p.l("must-revalidate", string, true)) {
                            z7 = true;
                        } else if (l.d0.p.l("max-stale", string, true)) {
                            iU3 = m.h0.d.U(string2, Integer.MAX_VALUE);
                        } else if (l.d0.p.l("min-fresh", string, true)) {
                            iU4 = m.h0.d.U(string2, -1);
                        } else if (l.d0.p.l("only-if-cached", string, true)) {
                            z8 = true;
                        } else if (l.d0.p.l("no-transform", string, true)) {
                            z9 = true;
                        } else if (l.d0.p.l("immutable", string, true)) {
                            z10 = true;
                        }
                    }
                    uVar2 = uVar;
                    i2 = i3;
                } else {
                    if (l.d0.p.l(strC, "Pragma", z)) {
                    }
                    uVar2 = uVar;
                    i2 = i3;
                }
                z2 = false;
                iA = 0;
                while (iA < strH.length()) {
                    iA2 = a(strH, "=,;", iA);
                    String strSubstring3 = strH.substring(iA, iA2);
                    l.y.c.i.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = l.d0.q.u0(strSubstring3).toString();
                    if (iA2 != strH.length()) {
                        iA = iA2 + 1;
                        string2 = null;
                    } else {
                        iA = iA2 + 1;
                        string2 = null;
                    }
                    z = true;
                    if (l.d0.p.l("no-cache", string, true)) {
                        z3 = true;
                    } else if (l.d0.p.l("no-store", string, true)) {
                        z4 = true;
                    } else if (l.d0.p.l("max-age", string, true)) {
                        iU = m.h0.d.U(string2, -1);
                    } else if (l.d0.p.l("s-maxage", string, true)) {
                        iU2 = m.h0.d.U(string2, -1);
                    } else if (l.d0.p.l("private", string, true)) {
                        z5 = true;
                    } else if (l.d0.p.l("public", string, true)) {
                        z6 = true;
                    } else if (l.d0.p.l("must-revalidate", string, true)) {
                        z7 = true;
                    } else if (l.d0.p.l("max-stale", string, true)) {
                        iU3 = m.h0.d.U(string2, Integer.MAX_VALUE);
                    } else if (l.d0.p.l("min-fresh", string, true)) {
                        iU4 = m.h0.d.U(string2, -1);
                    } else if (l.d0.p.l("only-if-cached", string, true)) {
                        z8 = true;
                    } else if (l.d0.p.l("no-transform", string, true)) {
                        z9 = true;
                    } else if (l.d0.p.l("immutable", string, true)) {
                        z10 = true;
                    }
                }
                uVar2 = uVar;
                i2 = i3;
            }
            return new d(z3, z4, iU, iU2, z5, z6, z7, iU3, iU4, z8, z9, z10, !z2 ? null : str, null);
        }
    }

    static {
        a aVar = new a();
        aVar.d();
        aVar.a();
        a aVar2 = new a();
        aVar2.e();
        aVar2.c(Integer.MAX_VALUE, TimeUnit.SECONDS);
        aVar2.a();
    }

    private d(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i2;
        this.d = i3;
        this.e = z3;
        this.f = z4;
        this.f2162g = z5;
        this.f2163h = i4;
        this.f2164i = i5;
        this.f2165j = z6;
        this.f2166k = z7;
        this.f2167l = z8;
        this.f2168m = str;
    }

    public /* synthetic */ d(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str, l.y.c.f fVar) {
        this(z, z2, i2, i3, z3, z4, z5, i4, i5, z6, z7, z8, str);
    }

    public final boolean a() {
        return this.f2167l;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean c() {
        return this.f;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.f2163h;
    }

    public final int f() {
        return this.f2164i;
    }

    public final boolean g() {
        return this.f2162g;
    }

    public final boolean h() {
        return this.a;
    }

    public final boolean i() {
        return this.b;
    }

    public final boolean j() {
        return this.f2166k;
    }

    public final boolean k() {
        return this.f2165j;
    }

    public final int l() {
        return this.d;
    }

    public String toString() {
        String str = this.f2168m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (h()) {
            sb.append("no-cache, ");
        }
        if (i()) {
            sb.append("no-store, ");
        }
        if (d() != -1) {
            sb.append("max-age=");
            sb.append(d());
            sb.append(", ");
        }
        if (l() != -1) {
            sb.append("s-maxage=");
            sb.append(l());
            sb.append(", ");
        }
        if (b()) {
            sb.append("private, ");
        }
        if (c()) {
            sb.append("public, ");
        }
        if (g()) {
            sb.append("must-revalidate, ");
        }
        if (e() != -1) {
            sb.append("max-stale=");
            sb.append(e());
            sb.append(", ");
        }
        if (f() != -1) {
            sb.append("min-fresh=");
            sb.append(f());
            sb.append(", ");
        }
        if (k()) {
            sb.append("only-if-cached, ");
        }
        if (j()) {
            sb.append("no-transform, ");
        }
        if (a()) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        l.y.c.i.d(string, "StringBuilder().apply(builderAction).toString()");
        this.f2168m = string;
        return string;
    }
}
