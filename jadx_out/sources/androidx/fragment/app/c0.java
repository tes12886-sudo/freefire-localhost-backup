package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class c0 {
    private final ViewGroup a;
    final ArrayList<e> b = new ArrayList<>();
    final ArrayList<e> c = new ArrayList<>();
    boolean d = false;
    boolean e = false;

    class a implements Runnable {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c0.this.b.contains(this.a)) {
                this.a.e().a(this.a.f().Q);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ d a;

        b(d dVar) {
            this.a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.b.remove(this.a);
            c0.this.c.remove(this.a);
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[e.b.values().length];
            b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static class d extends e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final u f392h;

        d(e.c cVar, e.b bVar, u uVar, h.h.h.b bVar2) {
            super(cVar, bVar, uVar.k(), bVar2);
            this.f392h = uVar;
        }

        @Override // androidx.fragment.app.c0.e
        public void c() {
            super.c();
            this.f392h.m();
        }

        @Override // androidx.fragment.app.c0.e
        void l() {
            if (g() == e.b.ADDING) {
                Fragment fragmentK = this.f392h.k();
                View viewFindFocus = fragmentK.Q.findFocus();
                if (viewFindFocus != null) {
                    fragmentK.z1(viewFindFocus);
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK);
                    }
                }
                View viewR1 = f().r1();
                if (viewR1.getParent() == null) {
                    this.f392h.b();
                    viewR1.setAlpha(0.0f);
                }
                if (viewR1.getAlpha() == 0.0f && viewR1.getVisibility() == 0) {
                    viewR1.setVisibility(4);
                }
                viewR1.setAlpha(fragmentK.K());
            }
        }
    }

    static class e {
        private c a;
        private b b;
        private final Fragment c;
        private final List<Runnable> d = new ArrayList();
        private final HashSet<h.h.h.b> e = new HashSet<>();
        private boolean f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f393g = false;

        class a implements h.h.h.b.a {
            a() {
            }

            @Override // h.h.h.b.a
            public void a() {
                e.this.b();
            }
        }

        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c c(int i2) {
                if (i2 == 0) {
                    return VISIBLE;
                }
                if (i2 == 4) {
                    return INVISIBLE;
                }
                if (i2 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i2);
            }

            static c d(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : c(view.getVisibility());
            }

            void a(View view) {
                int i2;
                int i3 = c.a[ordinal()];
                if (i3 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i3 == 2) {
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i2 = 0;
                } else {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return;
                        }
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
        }

        e(c cVar, b bVar, Fragment fragment, h.h.h.b bVar2) {
            this.a = cVar;
            this.b = bVar;
            this.c = fragment;
            bVar2.c(new a());
        }

        final void a(Runnable runnable) {
            this.d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f = true;
            if (this.e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.e).iterator();
            while (it.hasNext()) {
                ((h.h.h.b) it.next()).a();
            }
        }

        public void c() {
            if (this.f393g) {
                return;
            }
            if (n.F0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f393g = true;
            Iterator<Runnable> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        public final void d(h.h.h.b bVar) {
            if (this.e.remove(bVar) && this.e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.a;
        }

        public final Fragment f() {
            return this.c;
        }

        b g() {
            return this.b;
        }

        final boolean h() {
            return this.f;
        }

        final boolean i() {
            return this.f393g;
        }

        public final void j(h.h.h.b bVar) {
            l();
            this.e.add(bVar);
        }

        final void k(c cVar, b bVar) {
            b bVar2;
            int i2 = c.b[bVar.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3 && this.a != c.REMOVED) {
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> " + cVar + ". ");
                        }
                        this.a = cVar;
                        return;
                    }
                    return;
                }
                if (n.F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
                }
                this.a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else {
                if (this.a != c.REMOVED) {
                    return;
                }
                if (n.F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                }
                this.a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.b = bVar2;
        }

        void l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.a + "} {mLifecycleImpact = " + this.b + "} {mFragment = " + this.c + "}";
        }
    }

    c0(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, u uVar) {
        synchronized (this.b) {
            h.h.h.b bVar2 = new h.h.h.b();
            e eVarH = h(uVar.k());
            if (eVarH != null) {
                eVarH.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, uVar, bVar2);
            this.b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private e h(Fragment fragment) {
        for (e eVar : this.b) {
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        for (e eVar : this.c) {
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    static c0 n(ViewGroup viewGroup, n nVar) {
        return o(viewGroup, nVar.y0());
    }

    static c0 o(ViewGroup viewGroup, d0 d0Var) {
        int i2 = h.m.b.b;
        Object tag = viewGroup.getTag(i2);
        if (tag instanceof c0) {
            return (c0) tag;
        }
        c0 c0VarA = d0Var.a(viewGroup);
        viewGroup.setTag(i2, c0VarA);
        return c0VarA;
    }

    private void q() {
        for (e eVar : this.b) {
            if (eVar.g() == e.b.ADDING) {
                eVar.k(e.c.c(eVar.f().r1().getVisibility()), e.b.NONE);
            }
        }
    }

    void b(e.c cVar, u uVar) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + uVar.k());
        }
        a(cVar, e.b.ADDING, uVar);
    }

    void c(u uVar) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + uVar.k());
        }
        a(e.c.GONE, e.b.NONE, uVar);
    }

    void d(u uVar) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + uVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, uVar);
    }

    void e(u uVar) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + uVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, uVar);
    }

    abstract void f(List<e> list, boolean z);

    void g() {
        if (this.e) {
            return;
        }
        if (!h.h.l.y.z(this.a)) {
            j();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                ArrayList<e> arrayList = new ArrayList(this.c);
                this.c.clear();
                for (e eVar : arrayList) {
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.b);
                this.b.clear();
                this.c.addAll(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).l();
                }
                f(arrayList2, this.d);
                this.d = false;
            }
        }
    }

    void j() {
        boolean z = h.h.l.y.z(this.a);
        synchronized (this.b) {
            q();
            Iterator<e> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            for (e eVar : new ArrayList(this.c)) {
                if (n.F0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(z ? "" : "Container " + this.a + " is not attached to window. ");
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.b();
            }
            for (e eVar2 : new ArrayList(this.b)) {
                if (n.F0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(z ? "" : "Container " + this.a + " is not attached to window. ");
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.b();
            }
        }
    }

    void k() {
        if (this.e) {
            this.e = false;
            g();
        }
    }

    e.b l(u uVar) {
        e eVarH = h(uVar.k());
        e.b bVarG = eVarH != null ? eVarH.g() : null;
        e eVarI = i(uVar.k());
        return (eVarI == null || !(bVarG == null || bVarG == e.b.NONE)) ? bVarG : eVarI.g();
    }

    public ViewGroup m() {
        return this.a;
    }

    void p() {
        synchronized (this.b) {
            q();
            this.e = false;
            for (int size = this.b.size() - 1; size >= 0; size--) {
                e eVar = this.b.get(size);
                e.c cVarD = e.c.d(eVar.f().Q);
                e.c cVarE = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (cVarE == cVar && cVarD != cVar) {
                    this.e = eVar.f().e0();
                    break;
                }
            }
        }
    }

    void r(boolean z) {
        this.d = z;
    }
}
