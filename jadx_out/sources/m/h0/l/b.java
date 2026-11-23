package m.h0.l;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import l.t.m;
import l.y.c.i;
import m.a0;
import m.h0.l.i.j;
import m.h0.l.i.k;
import m.h0.l.i.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {
    public static final a f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f2286g;
    private final List<k> d;
    private final m.h0.l.i.h e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final h a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f2286g;
        }
    }

    /* JADX INFO: renamed from: m.h0.l.b$b, reason: collision with other inner class name */
    public static final class C0269b implements m.h0.n.e {
        private final X509TrustManager a;
        private final Method b;

        public C0269b(X509TrustManager x509TrustManager, Method method) {
            i.e(x509TrustManager, "trustManager");
            i.e(method, "findByIssuerAndSignatureMethod");
            this.a = x509TrustManager;
            this.b = method;
        }

        @Override // m.h0.n.e
        public X509Certificate a(X509Certificate x509Certificate) {
            i.e(x509Certificate, "cert");
            try {
                Object objInvoke = this.b.invoke(this.a, x509Certificate);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("unable to get issues and signature");
                assertionError.initCause(e);
                throw assertionError;
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0269b)) {
                return false;
            }
            C0269b c0269b = (C0269b) obj;
            return i.a(this.a, c0269b.a) && i.a(this.b, c0269b.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
        }
    }

    static {
        int i2;
        boolean z = true;
        if (h.a.h() && (i2 = Build.VERSION.SDK_INT) < 30) {
            if (!(i2 >= 21)) {
                throw new IllegalStateException(i.k("Expected Android API level 21+ but was ", Integer.valueOf(i2)).toString());
            }
        } else {
            z = false;
        }
        f2286g = z;
    }

    public b() {
        List listJ = m.j(l.a.b(l.f2291h, null, 1, null), new j(m.h0.l.i.f.f.d()), new j(m.h0.l.i.i.a.a()), new j(m.h0.l.i.g.a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (((k) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
        this.e = m.h0.l.i.h.d.a();
    }

    @Override // m.h0.l.h
    public m.h0.n.c c(X509TrustManager x509TrustManager) {
        i.e(x509TrustManager, "trustManager");
        m.h0.l.i.b bVarA = m.h0.l.i.b.d.a(x509TrustManager);
        return bVarA == null ? super.c(x509TrustManager) : bVarA;
    }

    @Override // m.h0.l.h
    public m.h0.n.e d(X509TrustManager x509TrustManager) {
        i.e(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            i.d(declaredMethod, "method");
            return new C0269b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // m.h0.l.h
    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        Object next;
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        Iterator<T> it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((k) next).a(sSLSocket));
        k kVar = (k) next;
        if (kVar == null) {
            return;
        }
        kVar.d(sSLSocket, str, list);
    }

    @Override // m.h0.l.h
    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
        i.e(socket, "socket");
        i.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // m.h0.l.h
    public String g(SSLSocket sSLSocket) {
        Object next;
        i.e(sSLSocket, "sslSocket");
        Iterator<T> it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((k) next).a(sSLSocket));
        k kVar = (k) next;
        if (kVar == null) {
            return null;
        }
        return kVar.b(sSLSocket);
    }

    @Override // m.h0.l.h
    public Object h(String str) {
        i.e(str, "closer");
        return this.e.a(str);
    }

    @Override // m.h0.l.h
    public boolean i(String str) {
        i.e(str, "hostname");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i2 >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    @Override // m.h0.l.h
    public void l(String str, Object obj) {
        i.e(str, "message");
        if (this.e.b(obj)) {
            return;
        }
        h.k(this, str, 5, null, 4, null);
    }
}
