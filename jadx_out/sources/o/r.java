package o;

import java.util.regex.Pattern;
import javax.annotation.Nullable;
import m.b0;
import m.c0;

/* JADX INFO: loaded from: classes.dex */
final class r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char[] f2354l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f2355m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    private final String a;
    private final m.v b;

    @Nullable
    private String c;

    @Nullable
    private m.v.a d;
    private final b0.a e = new b0.a();
    private final m.u.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private m.x f2356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f2357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private m.y.a f2358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private m.s.a f2359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private c0 f2360k;

    private static class a extends c0 {
        private final c0 b;
        private final m.x c;

        a(c0 c0Var, m.x xVar) {
            this.b = c0Var;
            this.c = xVar;
        }

        @Override // m.c0
        public long a() {
            return this.b.a();
        }

        @Override // m.c0
        public m.x b() {
            return this.c;
        }

        @Override // m.c0
        public void h(n.c cVar) {
            this.b.h(cVar);
        }
    }

    r(String str, m.v vVar, @Nullable String str2, @Nullable m.u uVar, @Nullable m.x xVar, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = vVar;
        this.c = str2;
        this.f2356g = xVar;
        this.f2357h = z;
        this.f = uVar != null ? uVar.d() : new m.u.a();
        if (z2) {
            this.f2359j = new m.s.a();
        } else if (z3) {
            m.y.a aVar = new m.y.a();
            this.f2358i = aVar;
            aVar.d(m.y.f2322h);
        }
    }

    private static String i(String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                n.b bVar = new n.b();
                bVar.J0(str, 0, iCharCount);
                j(bVar, str, iCharCount, length, z);
                return bVar.o0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    private static void j(n.b bVar, String str, int i2, int i3, boolean z) {
        n.b bVar2 = null;
        while (i2 < i3) {
            int iCodePointAt = str.codePointAt(i2);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (bVar2 == null) {
                        bVar2 = new n.b();
                    }
                    bVar2.K0(iCodePointAt);
                    while (!bVar2.z()) {
                        int i4 = bVar2.readByte() & 255;
                        bVar.z0(37);
                        char[] cArr = f2354l;
                        bVar.z0(cArr[(i4 >> 4) & 15]);
                        bVar.z0(cArr[i4 & 15]);
                    }
                } else {
                    bVar.K0(iCodePointAt);
                }
            }
            i2 += Character.charCount(iCodePointAt);
        }
    }

    void a(String str, String str2, boolean z) {
        if (z) {
            this.f2359j.b(str, str2);
        } else {
            this.f2359j.a(str, str2);
        }
    }

    void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f.a(str, str2);
            return;
        }
        try {
            this.f2356g = m.x.e(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e);
        }
    }

    void c(m.u uVar) {
        this.f.b(uVar);
    }

    void d(m.u uVar, c0 c0Var) {
        this.f2358i.a(uVar, c0Var);
    }

    void e(m.y.b bVar) {
        this.f2358i.b(bVar);
    }

    void f(String str, String str2, boolean z) {
        if (this.c == null) {
            throw new AssertionError();
        }
        String strI = i(str2, z);
        String strReplace = this.c.replace("{" + str + "}", strI);
        if (!f2355m.matcher(strReplace).matches()) {
            this.c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    void g(String str, @Nullable String str2, boolean z) {
        String str3 = this.c;
        if (str3 != null) {
            m.v.a aVarL = this.b.l(str3);
            this.d = aVarL;
            if (aVarL == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.c);
            }
            this.c = null;
        }
        if (z) {
            this.d.a(str, str2);
        } else {
            this.d.b(str, str2);
        }
    }

    <T> void h(Class<T> cls, @Nullable T t) {
        this.e.n(cls, t);
    }

    b0.a k() {
        m.v vVarT;
        m.v.a aVar = this.d;
        if (aVar != null) {
            vVarT = aVar.c();
        } else {
            vVarT = this.b.t(this.c);
            if (vVarT == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.c);
            }
        }
        c0 aVar2 = this.f2360k;
        if (aVar2 == null) {
            m.s.a aVar3 = this.f2359j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                m.y.a aVar4 = this.f2358i;
                if (aVar4 != null) {
                    aVar2 = aVar4.c();
                } else if (this.f2357h) {
                    aVar2 = c0.e(null, new byte[0]);
                }
            }
        }
        m.x xVar = this.f2356g;
        if (xVar != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, xVar);
            } else {
                this.f.a("Content-Type", xVar.toString());
            }
        }
        b0.a aVar5 = this.e;
        aVar5.p(vVarT);
        aVar5.e(this.f.e());
        aVar5.f(this.a, aVar2);
        return aVar5;
    }

    void l(c0 c0Var) {
        this.f2360k = c0Var;
    }

    void m(Object obj) {
        this.c = obj.toString();
    }
}
