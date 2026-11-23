package m.h0.l.i;

import java.util.List;
import javax.net.ssl.SSLSocket;
import m.a0;

/* JADX INFO: loaded from: classes.dex */
public final class j implements k {
    private final a a;
    private k b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a aVar) {
        l.y.c.i.e(aVar, "socketAdapterFactory");
        this.a = aVar;
    }

    private final synchronized k e(SSLSocket sSLSocket) {
        if (this.b == null && this.a.a(sSLSocket)) {
            this.b = this.a.b(sSLSocket);
        }
        return this.b;
    }

    @Override // m.h0.l.i.k
    public boolean a(SSLSocket sSLSocket) {
        l.y.c.i.e(sSLSocket, "sslSocket");
        return this.a.a(sSLSocket);
    }

    @Override // m.h0.l.i.k
    public String b(SSLSocket sSLSocket) {
        l.y.c.i.e(sSLSocket, "sslSocket");
        k kVarE = e(sSLSocket);
        if (kVarE == null) {
            return null;
        }
        return kVarE.b(sSLSocket);
    }

    @Override // m.h0.l.i.k
    public boolean c() {
        return true;
    }

    @Override // m.h0.l.i.k
    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        l.y.c.i.e(sSLSocket, "sslSocket");
        l.y.c.i.e(list, "protocols");
        k kVarE = e(sSLSocket);
        if (kVarE == null) {
            return;
        }
        kVarE.d(sSLSocket, str, list);
    }
}
