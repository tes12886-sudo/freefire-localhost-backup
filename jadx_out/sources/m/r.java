package m;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final r a = new a();

    public static final class a extends r {
        a() {
        }
    }

    public interface b {
        r a(e eVar);
    }

    public void A(e eVar, d0 d0Var) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(d0Var, "response");
    }

    public void B(e eVar, t tVar) {
        l.y.c.i.e(eVar, "call");
    }

    public void C(e eVar) {
        l.y.c.i.e(eVar, "call");
    }

    public void a(e eVar, d0 d0Var) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(d0Var, "cachedResponse");
    }

    public void b(e eVar, d0 d0Var) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(d0Var, "response");
    }

    public void c(e eVar) {
        l.y.c.i.e(eVar, "call");
    }

    public void d(e eVar) {
        l.y.c.i.e(eVar, "call");
    }

    public void e(e eVar, IOException iOException) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(iOException, "ioe");
    }

    public void f(e eVar) {
        l.y.c.i.e(eVar, "call");
    }

    public void g(e eVar) {
        l.y.c.i.e(eVar, "call");
    }

    public void h(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, a0 a0Var) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(inetSocketAddress, "inetSocketAddress");
        l.y.c.i.e(proxy, "proxy");
    }

    public void i(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, a0 a0Var, IOException iOException) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(inetSocketAddress, "inetSocketAddress");
        l.y.c.i.e(proxy, "proxy");
        l.y.c.i.e(iOException, "ioe");
    }

    public void j(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(inetSocketAddress, "inetSocketAddress");
        l.y.c.i.e(proxy, "proxy");
    }

    public void k(e eVar, j jVar) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(jVar, "connection");
    }

    public void l(e eVar, j jVar) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(jVar, "connection");
    }

    public void m(e eVar, String str, List<InetAddress> list) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(str, "domainName");
        l.y.c.i.e(list, "inetAddressList");
    }

    public void n(e eVar, String str) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(str, "domainName");
    }

    public void o(e eVar, v vVar, List<Proxy> list) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(vVar, "url");
        l.y.c.i.e(list, "proxies");
    }

    public void p(e eVar, v vVar) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(vVar, "url");
    }

    public void q(e eVar, long j2) {
        l.y.c.i.e(eVar, "call");
    }

    public void r(e eVar) {
        l.y.c.i.e(eVar, "call");
    }

    public void s(e eVar, IOException iOException) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(iOException, "ioe");
    }

    public void t(e eVar, b0 b0Var) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(b0Var, "request");
    }

    public void u(e eVar) {
        l.y.c.i.e(eVar, "call");
    }

    public void v(e eVar, long j2) {
        l.y.c.i.e(eVar, "call");
    }

    public void w(e eVar) {
        l.y.c.i.e(eVar, "call");
    }

    public void x(e eVar, IOException iOException) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(iOException, "ioe");
    }

    public void y(e eVar, d0 d0Var) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(d0Var, "response");
    }

    public void z(e eVar) {
        l.y.c.i.e(eVar, "call");
    }
}
