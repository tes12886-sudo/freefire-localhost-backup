package m.h0.l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import l.t.m;
import m.a0;
import m.h0.l.i.i;
import m.h0.l.i.j;
import m.h0.l.i.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h {
    public static final C0268a e = new C0268a(null);
    private static final boolean f;
    private final List<k> d;

    /* JADX INFO: renamed from: m.h0.l.a$a, reason: collision with other inner class name */
    public static final class C0268a {
        private C0268a() {
        }

        public /* synthetic */ C0268a(l.y.c.f fVar) {
            this();
        }

        public final h a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f;
        }
    }

    static {
        f = h.a.h() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List listJ = m.j(m.h0.l.i.a.a.a(), new j(m.h0.l.i.f.f.d()), new j(i.a.a()), new j(m.h0.l.i.g.a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (((k) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // m.h0.l.h
    public m.h0.n.c c(X509TrustManager x509TrustManager) {
        l.y.c.i.e(x509TrustManager, "trustManager");
        m.h0.l.i.b bVarA = m.h0.l.i.b.d.a(x509TrustManager);
        return bVarA == null ? super.c(x509TrustManager) : bVarA;
    }

    @Override // m.h0.l.h
    public void e(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        Object next;
        l.y.c.i.e(sSLSocket, "sslSocket");
        l.y.c.i.e(list, "protocols");
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
    public String g(SSLSocket sSLSocket) {
        Object next;
        l.y.c.i.e(sSLSocket, "sslSocket");
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
    @SuppressLint({"NewApi"})
    public boolean i(String str) {
        l.y.c.i.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
