package m;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    private final a a;
    private final Proxy b;
    private final InetSocketAddress c;

    public f0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        l.y.c.i.e(aVar, "address");
        l.y.c.i.e(proxy, "proxy");
        l.y.c.i.e(inetSocketAddress, "socketAddress");
        this.a = aVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final a a() {
        return this.a;
    }

    public final Proxy b() {
        return this.b;
    }

    public final boolean c() {
        return this.a.k() != null && this.b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (l.y.c.i.a(f0Var.a, this.a) && l.y.c.i.a(f0Var.b, this.b) && l.y.c.i.a(f0Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Route{" + this.c + '}';
    }
}
