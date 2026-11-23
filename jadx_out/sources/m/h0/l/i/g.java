package m.h0.l.i;

import java.util.List;
import javax.net.ssl.SSLSocket;
import m.a0;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class g implements k {
    public static final b a = new b(null);
    private static final j.a b = new a();

    public static final class a implements j.a {
        a() {
        }

        @Override // m.h0.l.i.j.a
        public boolean a(SSLSocket sSLSocket) {
            l.y.c.i.e(sSLSocket, "sslSocket");
            return m.h0.l.c.e.b() && (sSLSocket instanceof BCSSLSocket);
        }

        @Override // m.h0.l.i.j.a
        public k b(SSLSocket sSLSocket) {
            l.y.c.i.e(sSLSocket, "sslSocket");
            return new g();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        public final j.a a() {
            return g.b;
        }
    }

    @Override // m.h0.l.i.k
    public boolean a(SSLSocket sSLSocket) {
        l.y.c.i.e(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // m.h0.l.i.k
    public String b(SSLSocket sSLSocket) {
        l.y.c.i.e(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : l.y.c.i.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // m.h0.l.i.k
    public boolean c() {
        return m.h0.l.c.e.b();
    }

    @Override // m.h0.l.i.k
    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        l.y.c.i.e(sSLSocket, "sslSocket");
        l.y.c.i.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = m.h0.l.h.a.b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
