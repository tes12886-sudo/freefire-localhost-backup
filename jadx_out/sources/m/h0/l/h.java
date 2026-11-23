package m.h0.l;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import l.t.n;
import l.y.c.i;
import m.a0;
import m.z;

/* JADX INFO: loaded from: classes.dex */
public class h {
    public static final a a;
    private static volatile h b;
    private static final Logger c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        private final h d() {
            m.h0.l.i.c.a.b();
            h hVarA = m.h0.l.a.e.a();
            if (hVarA != null) {
                return hVarA;
            }
            h hVarA2 = b.f.a();
            i.c(hVarA2);
            return hVarA2;
        }

        private final h e() {
            g gVarA;
            c cVarA;
            d dVarB;
            if (j() && (dVarB = d.e.b()) != null) {
                return dVarB;
            }
            if (i() && (cVarA = c.e.a()) != null) {
                return cVarA;
            }
            if (k() && (gVarA = g.e.a()) != null) {
                return gVarA;
            }
            f fVarA = f.d.a();
            if (fVarA != null) {
                return fVarA;
            }
            h hVarA = e.f2287i.a();
            return hVarA != null ? hVarA : new h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            return i.a("BC", Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return i.a("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return i.a("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final List<String> b(List<? extends a0> list) {
            i.e(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((a0) obj) != a0.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(n.o(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((a0) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] c(List<? extends a0> list) {
            i.e(list, "protocols");
            n.b bVar = new n.b();
            for (String str : b(list)) {
                bVar.z0(str.length());
                bVar.I0(str);
            }
            return bVar.i0();
        }

        public final h g() {
            return h.b;
        }

        public final boolean h() {
            return i.a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    static {
        a aVar = new a(null);
        a = aVar;
        b = aVar.f();
        c = Logger.getLogger(z.class.getName());
    }

    public static /* synthetic */ void k(h hVar, String str, int i2, Throwable th, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i3 & 2) != 0) {
            i2 = 4;
        }
        if ((i3 & 4) != 0) {
            th = null;
        }
        hVar.j(str, i2, th);
    }

    public void b(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
    }

    public m.h0.n.c c(X509TrustManager x509TrustManager) {
        i.e(x509TrustManager, "trustManager");
        return new m.h0.n.a(d(x509TrustManager));
    }

    public m.h0.n.e d(X509TrustManager x509TrustManager) {
        i.e(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        i.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new m.h0.n.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
        i.e(socket, "socket");
        i.e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i2);
    }

    public String g(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        return null;
    }

    public Object h(String str) {
        i.e(str, "closer");
        if (c.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean i(String str) {
        i.e(str, "hostname");
        return true;
    }

    public void j(String str, int i2, Throwable th) {
        i.e(str, "message");
        c.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void l(String str, Object obj) {
        i.e(str, "message");
        if (obj == null) {
            str = i.k(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(str, 5, (Throwable) obj);
    }

    public SSLContext m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        i.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory n(X509TrustManager x509TrustManager) {
        i.e(x509TrustManager, "trustManager");
        try {
            SSLContext sSLContextM = m();
            sSLContextM.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextM.getSocketFactory();
            i.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            AssertionError assertionError = new AssertionError(i.k("No System TLS: ", e));
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public X509TrustManager o() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        i.c(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            String string = Arrays.toString(trustManagers);
            i.d(string, "toString(this)");
            throw new IllegalStateException(i.k("Unexpected default trust managers: ", string).toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager != null) {
            return (X509TrustManager) trustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        i.d(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
