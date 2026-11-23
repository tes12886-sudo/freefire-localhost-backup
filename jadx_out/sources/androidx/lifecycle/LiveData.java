package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Object f441k = new Object();
    final Object a = new Object();
    private h.c.a.b.b<q<? super T>, LiveData<T>.c> b = new h.c.a.b.b<>();
    int c = 0;
    private boolean d;
    private volatile Object e;
    volatile Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f445j;

    class LifecycleBoundObserver extends LiveData<T>.c implements i {
        final k e;

        LifecycleBoundObserver(k kVar, q<? super T> qVar) {
            super(qVar);
            this.e = kVar;
        }

        @Override // androidx.lifecycle.i
        public void d(k kVar, g.b bVar) {
            g.c cVarB = this.e.a().b();
            if (cVarB == g.c.DESTROYED) {
                LiveData.this.m(this.a);
                return;
            }
            g.c cVar = null;
            while (cVar != cVarB) {
                h(k());
                cVar = cVarB;
                cVarB = this.e.a().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        void i() {
            this.e.a().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean j(k kVar) {
            return this.e == kVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return this.e.a().b().a(g.c.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.f;
                LiveData.this.f = LiveData.f441k;
            }
            LiveData.this.n(obj);
        }
    }

    private class b extends LiveData<T>.c {
        b(LiveData liveData, q<? super T> qVar) {
            super(qVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return true;
        }
    }

    private abstract class c {
        final q<? super T> a;
        boolean b;
        int c = -1;

        c(q<? super T> qVar) {
            this.a = qVar;
        }

        void h(boolean z) {
            if (z == this.b) {
                return;
            }
            this.b = z;
            LiveData.this.c(z ? 1 : -1);
            if (this.b) {
                LiveData.this.e(this);
            }
        }

        void i() {
        }

        boolean j(k kVar) {
            return false;
        }

        abstract boolean k();
    }

    public LiveData() {
        Object obj = f441k;
        this.f = obj;
        this.f445j = new a();
        this.e = obj;
        this.f442g = -1;
    }

    static void b(String str) {
        if (h.c.a.a.a.c().a()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(LiveData<T>.c cVar) {
        if (cVar.b) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int i2 = cVar.c;
            int i3 = this.f442g;
            if (i2 >= i3) {
                return;
            }
            cVar.c = i3;
            cVar.a.a((Object) this.e);
        }
    }

    void c(int i2) {
        int i3 = this.c;
        this.c = i2 + i3;
        if (this.d) {
            return;
        }
        this.d = true;
        while (true) {
            try {
                int i4 = this.c;
                if (i3 == i4) {
                    this.d = false;
                    return;
                }
                boolean z = i3 == 0 && i4 > 0;
                boolean z2 = i3 > 0 && i4 == 0;
                if (z) {
                    j();
                } else if (z2) {
                    k();
                }
                i3 = i4;
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        }
    }

    void e(LiveData<T>.c cVar) {
        if (this.f443h) {
            this.f444i = true;
            return;
        }
        this.f443h = true;
        do {
            this.f444i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                h.c.a.b.b<q<? super T>, LiveData<T>.c>.d dVarF = this.b.f();
                while (dVarF.hasNext()) {
                    d((c) dVarF.next().getValue());
                    if (this.f444i) {
                        break;
                    }
                }
            }
        } while (this.f444i);
        this.f443h = false;
    }

    public T f() {
        T t = (T) this.e;
        if (t != f441k) {
            return t;
        }
        return null;
    }

    public boolean g() {
        return this.c > 0;
    }

    public void h(k kVar, q<? super T> qVar) {
        b("observe");
        if (kVar.a().b() == g.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(kVar, qVar);
        LiveData<T>.c cVarL = this.b.l(qVar, lifecycleBoundObserver);
        if (cVarL != null && !cVarL.j(kVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarL != null) {
            return;
        }
        kVar.a().a(lifecycleBoundObserver);
    }

    public void i(q<? super T> qVar) {
        b("observeForever");
        b bVar = new b(this, qVar);
        LiveData<T>.c cVarL = this.b.l(qVar, bVar);
        if (cVarL instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarL != null) {
            return;
        }
        bVar.h(true);
    }

    protected void j() {
    }

    protected void k() {
    }

    protected void l(T t) {
        boolean z;
        synchronized (this.a) {
            z = this.f == f441k;
            this.f = t;
        }
        if (z) {
            h.c.a.a.a.c().b(this.f445j);
        }
    }

    public void m(q<? super T> qVar) {
        b("removeObserver");
        LiveData<T>.c cVarN = this.b.n(qVar);
        if (cVarN == null) {
            return;
        }
        cVarN.i();
        cVarN.h(false);
    }

    protected void n(T t) {
        b("setValue");
        this.f442g++;
        this.e = t;
        e(null);
    }
}
