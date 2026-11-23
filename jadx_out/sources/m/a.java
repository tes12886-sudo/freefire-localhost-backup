package m;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final q a;
    private final SocketFactory b;
    private final SSLSocketFactory c;
    private final HostnameVerifier d;
    private final g e;
    private final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Proxy f2153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ProxySelector f2154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v f2155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<a0> f2156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<l> f2157k;

    public a(String str, int i2, q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List<? extends a0> list, List<l> list2, ProxySelector proxySelector) {
        l.y.c.i.e(str, "uriHost");
        l.y.c.i.e(qVar, "dns");
        l.y.c.i.e(socketFactory, "socketFactory");
        l.y.c.i.e(bVar, "proxyAuthenticator");
        l.y.c.i.e(list, "protocols");
        l.y.c.i.e(list2, "connectionSpecs");
        l.y.c.i.e(proxySelector, "proxySelector");
        this.a = qVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = gVar;
        this.f = bVar;
        this.f2153g = proxy;
        this.f2154h = proxySelector;
        v.a aVar = new v.a();
        aVar.y(sSLSocketFactory != null ? "https" : "http");
        aVar.n(str);
        aVar.t(i2);
        this.f2155i = aVar.c();
        this.f2156j = m.h0.d.R(list);
        this.f2157k = m.h0.d.R(list2);
    }

    public final g a() {
        return this.e;
    }

    public final List<l> b() {
        return this.f2157k;
    }

    public final q c() {
        return this.a;
    }

    public final boolean d(a aVar) {
        l.y.c.i.e(aVar, "that");
        return l.y.c.i.a(this.a, aVar.a) && l.y.c.i.a(this.f, aVar.f) && l.y.c.i.a(this.f2156j, aVar.f2156j) && l.y.c.i.a(this.f2157k, aVar.f2157k) && l.y.c.i.a(this.f2154h, aVar.f2154h) && l.y.c.i.a(this.f2153g, aVar.f2153g) && l.y.c.i.a(this.c, aVar.c) && l.y.c.i.a(this.d, aVar.d) && l.y.c.i.a(this.e, aVar.e) && this.f2155i.n() == aVar.f2155i.n();
    }

    public final HostnameVerifier e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.y.c.i.a(this.f2155i, aVar.f2155i) && d(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final List<a0> f() {
        return this.f2156j;
    }

    public final Proxy g() {
        return this.f2153g;
    }

    public final b h() {
        return this.f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f2155i.hashCode()) * 31) + this.a.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f2156j.hashCode()) * 31) + this.f2157k.hashCode()) * 31) + this.f2154h.hashCode()) * 31) + defpackage.c.a(this.f2153g)) * 31) + defpackage.c.a(this.c)) * 31) + defpackage.c.a(this.d)) * 31) + defpackage.c.a(this.e);
    }

    public final ProxySelector i() {
        return this.f2154h;
    }

    public final SocketFactory j() {
        return this.b;
    }

    public final SSLSocketFactory k() {
        return this.c;
    }

    public final v l() {
        return this.f2155i;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f2155i.i());
        sb.append(':');
        sb.append(this.f2155i.n());
        sb.append(", ");
        Object obj = this.f2153g;
        if (obj != null) {
            str = "proxy=";
        } else {
            obj = this.f2154h;
            str = "proxySelector=";
        }
        sb.append(l.y.c.i.k(str, obj));
        sb.append('}');
        return sb.toString();
    }
}
