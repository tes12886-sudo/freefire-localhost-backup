package m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    private static final i[] e;
    private static final i[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f2301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f2302h;
    private final boolean a;
    private final boolean b;
    private final String[] c;
    private final String[] d;

    public static final class a {
        private boolean a;
        private String[] b;
        private String[] c;
        private boolean d;

        public a(l lVar) {
            l.y.c.i.e(lVar, "connectionSpec");
            this.a = lVar.f();
            this.b = lVar.c;
            this.c = lVar.d;
            this.d = lVar.h();
        }

        public a(boolean z) {
            this.a = z;
        }

        public final l a() {
            return new l(this.a, this.d, this.b, this.c);
        }

        public final a b(String... strArr) {
            l.y.c.i.e(strArr, "cipherSuites");
            if (!d()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            e((String[]) strArr.clone());
            return this;
        }

        public final a c(i... iVarArr) {
            l.y.c.i.e(iVarArr, "cipherSuites");
            if (!d()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(iVarArr.length);
            for (i iVar : iVarArr) {
                arrayList.add(iVar.c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            b((String[]) Arrays.copyOf(strArr, strArr.length));
            return this;
        }

        public final boolean d() {
            return this.a;
        }

        public final void e(String[] strArr) {
            this.b = strArr;
        }

        public final void f(boolean z) {
            this.d = z;
        }

        public final void g(String[] strArr) {
            this.c = strArr;
        }

        public final a h(boolean z) {
            if (!d()) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            f(z);
            return this;
        }

        public final a i(String... strArr) {
            l.y.c.i.e(strArr, "tlsVersions");
            if (!d()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            g((String[]) strArr.clone());
            return this;
        }

        public final a j(g0... g0VarArr) {
            l.y.c.i.e(g0VarArr, "tlsVersions");
            if (!d()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(g0VarArr.length);
            for (g0 g0Var : g0VarArr) {
                arrayList.add(g0Var.c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            i((String[]) Arrays.copyOf(strArr, strArr.length));
            return this;
        }
    }

    static {
        i iVar = i.r;
        i iVar2 = i.s;
        i iVar3 = i.t;
        i iVar4 = i.f2297l;
        i iVar5 = i.f2299n;
        i iVar6 = i.f2298m;
        i iVar7 = i.f2300o;
        i iVar8 = i.q;
        i iVar9 = i.p;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        e = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.f2295j, i.f2296k, i.f2293h, i.f2294i, i.f, i.f2292g, i.e};
        f = iVarArr2;
        a aVar = new a(true);
        aVar.c((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        g0 g0Var = g0.TLS_1_3;
        g0 g0Var2 = g0.TLS_1_2;
        aVar.j(g0Var, g0Var2);
        aVar.h(true);
        aVar.a();
        a aVar2 = new a(true);
        aVar2.c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length));
        aVar2.j(g0Var, g0Var2);
        aVar2.h(true);
        f2301g = aVar2.a();
        a aVar3 = new a(true);
        aVar3.c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length));
        aVar3.j(g0Var, g0Var2, g0.TLS_1_1, g0.TLS_1_0);
        aVar3.h(true);
        aVar3.a();
        f2302h = new a(false).a();
    }

    public l(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    private final l g(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.c != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            l.y.c.i.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = m.h0.d.B(enabledCipherSuites2, this.c, i.b.c());
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            l.y.c.i.d(enabledProtocols2, "sslSocket.enabledProtocols");
            enabledProtocols = m.h0.d.B(enabledProtocols2, this.d, l.u.b.b());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        l.y.c.i.d(supportedCipherSuites, "supportedCipherSuites");
        int iU = m.h0.d.u(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.b.c());
        if (z && iU != -1) {
            l.y.c.i.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iU];
            l.y.c.i.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            enabledCipherSuites = m.h0.d.l(enabledCipherSuites, str);
        }
        a aVar = new a(this);
        l.y.c.i.d(enabledCipherSuites, "cipherSuitesIntersection");
        aVar.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        l.y.c.i.d(enabledProtocols, "tlsVersionsIntersection");
        aVar.i((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        return aVar.a();
    }

    public final void c(SSLSocket sSLSocket, boolean z) {
        l.y.c.i.e(sSLSocket, "sslSocket");
        l lVarG = g(sSLSocket, z);
        if (lVarG.i() != null) {
            sSLSocket.setEnabledProtocols(lVarG.d);
        }
        if (lVarG.d() != null) {
            sSLSocket.setEnabledCipherSuites(lVarG.c);
        }
    }

    public final List<i> d() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i.b.b(str));
        }
        return l.t.u.P(arrayList);
    }

    public final boolean e(SSLSocket sSLSocket) {
        l.y.c.i.e(sSLSocket, "socket");
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !m.h0.d.r(strArr, sSLSocket.getEnabledProtocols(), l.u.b.b())) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || m.h0.d.r(strArr2, sSLSocket.getEnabledCipherSuites(), i.b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.a;
        l lVar = (l) obj;
        if (z != lVar.a) {
            return false;
        }
        return !z || (Arrays.equals(this.c, lVar.c) && Arrays.equals(this.d, lVar.d) && this.b == lVar.b);
    }

    public final boolean f() {
        return this.a;
    }

    public final boolean h() {
        return this.b;
    }

    public int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final List<g0> i() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(g0.b.a(str));
        }
        return l.t.u.P(arrayList);
    }

    public String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) defpackage.f.a(d(), "[all enabled]")) + ", tlsVersions=" + ((Object) defpackage.f.a(i(), "[all enabled]")) + ", supportsTlsExtensions=" + this.b + ')';
    }
}
