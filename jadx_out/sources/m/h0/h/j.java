package m.h0.h;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import l.t.l;
import l.t.m;
import m.f0;
import m.r;
import m.v;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f2224i = new a(null);
    private final m.a a;
    private final h b;
    private final m.e c;
    private final r d;
    private List<? extends Proxy> e;
    private int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<? extends InetSocketAddress> f2225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<f0> f2226h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            String hostAddress;
            String str;
            l.y.c.i.e(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                hostAddress = inetSocketAddress.getHostName();
                str = "hostName";
            } else {
                hostAddress = address.getHostAddress();
                str = "address.hostAddress";
            }
            l.y.c.i.d(hostAddress, str);
            return hostAddress;
        }
    }

    public static final class b {
        private final List<f0> a;
        private int b;

        public b(List<f0> list) {
            l.y.c.i.e(list, "routes");
            this.a = list;
        }

        public final List<f0> a() {
            return this.a;
        }

        public final boolean b() {
            return this.b < this.a.size();
        }

        public final f0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<f0> list = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            return list.get(i2);
        }
    }

    public j(m.a aVar, h hVar, m.e eVar, r rVar) {
        l.y.c.i.e(aVar, "address");
        l.y.c.i.e(hVar, "routeDatabase");
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(rVar, "eventListener");
        this.a = aVar;
        this.b = hVar;
        this.c = eVar;
        this.d = rVar;
        this.e = m.g();
        this.f2225g = m.g();
        this.f2226h = new ArrayList();
        f(aVar.l(), aVar.g());
    }

    private final boolean b() {
        return this.f < this.e.size();
    }

    private final Proxy d() throws SocketException, UnknownHostException {
        if (b()) {
            List<? extends Proxy> list = this.e;
            int i2 = this.f;
            this.f = i2 + 1;
            Proxy proxy = list.get(i2);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.a.l().i() + "; exhausted proxy configurations: " + this.e);
    }

    private final void e(Proxy proxy) throws SocketException, UnknownHostException {
        String strI;
        int iN;
        ArrayList arrayList = new ArrayList();
        this.f2225g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strI = this.a.l().i();
            iN = this.a.l().n();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(l.y.c.i.k("Proxy.address() is not an InetSocketAddress: ", socketAddressAddress.getClass()).toString());
            }
            a aVar = f2224i;
            l.y.c.i.d(socketAddressAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strI = aVar.a(inetSocketAddress);
            iN = inetSocketAddress.getPort();
        }
        boolean z = false;
        if (1 <= iN && iN < 65536) {
            z = true;
        }
        if (!z) {
            throw new SocketException("No route to " + strI + ':' + iN + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strI, iN));
            return;
        }
        this.d.n(this.c, strI);
        List<InetAddress> listA = this.a.c().a(strI);
        if (listA.isEmpty()) {
            throw new UnknownHostException(this.a.c() + " returned no addresses for " + strI);
        }
        this.d.m(this.c, strI, listA);
        Iterator<InetAddress> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), iN));
        }
    }

    private final void f(v vVar, Proxy proxy) {
        this.d.p(this.c, vVar);
        List<Proxy> listG = g(proxy, vVar, this);
        this.e = listG;
        this.f = 0;
        this.d.o(this.c, vVar, listG);
    }

    private static final List<Proxy> g(Proxy proxy, v vVar, j jVar) {
        if (proxy != null) {
            return l.b(proxy);
        }
        URI uriV = vVar.v();
        if (uriV.getHost() == null) {
            return m.h0.d.t(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = jVar.a.i().select(uriV);
        if (listSelect == null || listSelect.isEmpty()) {
            return m.h0.d.t(Proxy.NO_PROXY);
        }
        l.y.c.i.d(listSelect, "proxiesOrNull");
        return m.h0.d.R(listSelect);
    }

    public final boolean a() {
        return b() || (this.f2226h.isEmpty() ^ true);
    }

    public final b c() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            Iterator<? extends InetSocketAddress> it = this.f2225g.iterator();
            while (it.hasNext()) {
                f0 f0Var = new f0(this.a, proxyD, it.next());
                if (this.b.c(f0Var)) {
                    this.f2226h.add(f0Var);
                } else {
                    arrayList.add(f0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            l.t.r.r(arrayList, this.f2226h);
            this.f2226h.clear();
        }
        return new b(arrayList);
    }
}
