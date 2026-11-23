package m.h0.l.i;

import java.util.List;
import javax.net.ssl.SSLSocket;
import m.a0;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class i implements k {
    public static final b a = new b(null);
    private static final j.a b = new a();

    public static final class a implements j.a {
        a() {
        }

        @Override // m.h0.l.i.j.a
        public boolean a(SSLSocket sSLSocket) {
            l.y.c.i.e(sSLSocket, "sslSocket");
            return m.h0.l.d.e.c() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // m.h0.l.i.j.a
        public k b(SSLSocket sSLSocket) {
            l.y.c.i.e(sSLSocket, "sslSocket");
            return new i();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        public final j.a a() {
            return i.b;
        }
    }

    @Override // m.h0.l.i.k
    public boolean a(SSLSocket sSLSocket) {
        l.y.c.i.e(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // m.h0.l.i.k
    public String b(SSLSocket sSLSocket) {
        l.y.c.i.e(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // m.h0.l.i.k
    public boolean c() {
        return m.h0.l.d.e.c();
    }

    @Override // m.h0.l.i.k
    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        l.y.c.i.e(sSLSocket, "sslSocket");
        l.y.c.i.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = m.h0.l.h.a.b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
