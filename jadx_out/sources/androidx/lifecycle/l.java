package androidx.lifecycle;

import android.annotation.SuppressLint;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class l extends g {
    private h.c.a.b.a<j, a> a;
    private g.c b;
    private final WeakReference<k> c;
    private int d;
    private boolean e;
    private boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<g.c> f446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f447h;

    static class a {
        g.c a;
        i b;

        a(j jVar, g.c cVar) {
            this.b = n.f(jVar);
            this.a = cVar;
        }

        void a(k kVar, g.b bVar) {
            g.c cVarC = bVar.c();
            this.a = l.k(this.a, cVarC);
            this.b.d(kVar, bVar);
            this.a = cVarC;
        }
    }

    public l(k kVar) {
        this(kVar, true);
    }

    private l(k kVar, boolean z) {
        this.a = new h.c.a.b.a<>();
        this.d = 0;
        this.e = false;
        this.f = false;
        this.f446g = new ArrayList<>();
        this.c = new WeakReference<>(kVar);
        this.b = g.c.INITIALIZED;
        this.f447h = z;
    }

    private void d(k kVar) {
        Iterator<Map.Entry<j, a>> itB = this.a.b();
        while (itB.hasNext() && !this.f) {
            Map.Entry<j, a> next = itB.next();
            a value = next.getValue();
            while (value.a.compareTo(this.b) > 0 && !this.f && this.a.contains(next.getKey())) {
                g.b bVarA = g.b.a(value.a);
                if (bVarA == null) {
                    throw new IllegalStateException("no event down from " + value.a);
                }
                n(bVarA.c());
                value.a(kVar, bVarA);
                m();
            }
        }
    }

    private g.c e(j jVar) {
        Map.Entry<j, a> entryQ = this.a.q(jVar);
        g.c cVar = null;
        g.c cVar2 = entryQ != null ? entryQ.getValue().a : null;
        if (!this.f446g.isEmpty()) {
            ArrayList<g.c> arrayList = this.f446g;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return k(k(this.b, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    private void f(String str) {
        if (!this.f447h || h.c.a.a.a.c().a()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    private void g(k kVar) {
        h.c.a.b.b<j, a>.d dVarF = this.a.f();
        while (dVarF.hasNext() && !this.f) {
            Map.Entry next = dVarF.next();
            a aVar = (a) next.getValue();
            while (aVar.a.compareTo(this.b) < 0 && !this.f && this.a.contains((j) next.getKey())) {
                n(aVar.a);
                g.b bVarD = g.b.d(aVar.a);
                if (bVarD == null) {
                    throw new IllegalStateException("no event up from " + aVar.a);
                }
                aVar.a(kVar, bVarD);
                m();
            }
        }
    }

    private boolean i() {
        if (this.a.size() == 0) {
            return true;
        }
        g.c cVar = this.a.c().getValue().a;
        g.c cVar2 = this.a.h().getValue().a;
        return cVar == cVar2 && this.b == cVar2;
    }

    static g.c k(g.c cVar, g.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void l(g.c cVar) {
        if (this.b == cVar) {
            return;
        }
        this.b = cVar;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        p();
        this.e = false;
    }

    private void m() {
        ArrayList<g.c> arrayList = this.f446g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void n(g.c cVar) {
        this.f446g.add(cVar);
    }

    private void p() {
        k kVar = this.c.get();
        if (kVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean zI = i();
            this.f = false;
            if (zI) {
                return;
            }
            if (this.b.compareTo(this.a.c().getValue().a) < 0) {
                d(kVar);
            }
            Map.Entry<j, a> entryH = this.a.h();
            if (!this.f && entryH != null && this.b.compareTo(entryH.getValue().a) > 0) {
                g(kVar);
            }
        }
    }

    @Override // androidx.lifecycle.g
    public void a(j jVar) {
        k kVar;
        f("addObserver");
        g.c cVar = this.b;
        g.c cVar2 = g.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = g.c.INITIALIZED;
        }
        a aVar = new a(jVar, cVar2);
        if (this.a.l(jVar, aVar) == null && (kVar = this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            g.c cVarE = e(jVar);
            this.d++;
            while (aVar.a.compareTo(cVarE) < 0 && this.a.contains(jVar)) {
                n(aVar.a);
                g.b bVarD = g.b.d(aVar.a);
                if (bVarD == null) {
                    throw new IllegalStateException("no event up from " + aVar.a);
                }
                aVar.a(kVar, bVarD);
                m();
                cVarE = e(jVar);
            }
            if (!z) {
                p();
            }
            this.d--;
        }
    }

    @Override // androidx.lifecycle.g
    public g.c b() {
        return this.b;
    }

    @Override // androidx.lifecycle.g
    public void c(j jVar) {
        f("removeObserver");
        this.a.n(jVar);
    }

    public void h(g.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.c());
    }

    @Deprecated
    public void j(g.c cVar) {
        f("markState");
        o(cVar);
    }

    public void o(g.c cVar) {
        f("setCurrentState");
        l(cVar);
    }
}
