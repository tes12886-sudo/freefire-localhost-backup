package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.j> extends com.google.android.gms.common.api.f<R> {
    static final ThreadLocal p = new x2();
    public static final /* synthetic */ int q = 0;
    private final Object a;
    protected final a b;
    protected final WeakReference c;
    private final CountDownLatch d;
    private final ArrayList e;
    private com.google.android.gms.common.api.k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.common.api.j f934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Status f935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.android.gms.common.internal.k f939m;

    @KeepName
    private z2 mResultGuardian;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile j2 f940n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f941o;

    public static class a<R extends com.google.android.gms.common.api.j> extends j.d.a.c.f.d.n {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.j jVar) {
            int i2 = BasePendingResult.q;
            com.google.android.gms.common.internal.q.k(kVar);
            sendMessage(obtainMessage(1, new Pair(kVar, jVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                Pair pair = (Pair) message.obj;
                com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) pair.first;
                com.google.android.gms.common.api.j jVar = (com.google.android.gms.common.api.j) pair.second;
                try {
                    kVar.a(jVar);
                    return;
                } catch (RuntimeException e) {
                    BasePendingResult.o(jVar);
                    throw e;
                }
            }
            if (i2 == 2) {
                ((BasePendingResult) message.obj).g(Status.f922i);
                return;
            }
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + i2, new Exception());
        }
    }

    @Deprecated
    BasePendingResult() {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList();
        this.f933g = new AtomicReference();
        this.f941o = false;
        this.b = new a(Looper.getMainLooper());
        this.c = new WeakReference(null);
    }

    protected BasePendingResult(com.google.android.gms.common.api.e eVar) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList();
        this.f933g = new AtomicReference();
        this.f941o = false;
        this.b = new a(eVar != null ? eVar.l() : Looper.getMainLooper());
        this.c = new WeakReference(eVar);
    }

    private final com.google.android.gms.common.api.j k() {
        com.google.android.gms.common.api.j jVar;
        synchronized (this.a) {
            com.google.android.gms.common.internal.q.o(!this.f936j, "Result has already been consumed.");
            com.google.android.gms.common.internal.q.o(i(), "Result is not ready.");
            jVar = this.f934h;
            this.f934h = null;
            this.f = null;
            this.f936j = true;
        }
        k2 k2Var = (k2) this.f933g.getAndSet(null);
        if (k2Var != null) {
            k2Var.a.a.remove(this);
        }
        com.google.android.gms.common.internal.q.k(jVar);
        return jVar;
    }

    private final void l(com.google.android.gms.common.api.j jVar) {
        this.f934h = jVar;
        this.f935i = jVar.c();
        y2 y2Var = null;
        this.f939m = null;
        this.d.countDown();
        if (this.f937k) {
            this.f = null;
        } else {
            com.google.android.gms.common.api.k kVar = this.f;
            if (kVar != null) {
                this.b.removeMessages(2);
                this.b.a(kVar, k());
            } else if (this.f934h instanceof com.google.android.gms.common.api.h) {
                this.mResultGuardian = new z2(this, y2Var);
            }
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((com.google.android.gms.common.api.f.a) arrayList.get(i2)).a(this.f935i);
        }
        this.e.clear();
    }

    public static void o(com.google.android.gms.common.api.j jVar) {
        if (jVar instanceof com.google.android.gms.common.api.h) {
            try {
                ((com.google.android.gms.common.api.h) jVar).a();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(jVar))), e);
            }
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void b(com.google.android.gms.common.api.f.a aVar) {
        com.google.android.gms.common.internal.q.b(aVar != null, "Callback cannot be null.");
        synchronized (this.a) {
            if (i()) {
                aVar.a(this.f935i);
            } else {
                this.e.add(aVar);
            }
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final R c(long j2, TimeUnit timeUnit) {
        if (j2 > 0) {
            com.google.android.gms.common.internal.q.j("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.q.o(!this.f936j, "Result has already been consumed.");
        com.google.android.gms.common.internal.q.o(this.f940n == null, "Cannot await if then() has been called.");
        try {
            if (!this.d.await(j2, timeUnit)) {
                g(Status.f922i);
            }
        } catch (InterruptedException unused) {
            g(Status.f920g);
        }
        com.google.android.gms.common.internal.q.o(i(), "Result is not ready.");
        return (R) k();
    }

    @Override // com.google.android.gms.common.api.f
    public final void d(com.google.android.gms.common.api.k<? super R> kVar) {
        synchronized (this.a) {
            try {
                if (kVar == null) {
                    this.f = null;
                    return;
                }
                boolean z = true;
                com.google.android.gms.common.internal.q.o(!this.f936j, "Result has already been consumed.");
                if (this.f940n != null) {
                    z = false;
                }
                com.google.android.gms.common.internal.q.o(z, "Cannot set callbacks if then() has been called.");
                if (h()) {
                    return;
                }
                if (i()) {
                    this.b.a(kVar, k());
                } else {
                    this.f = kVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.a) {
            if (!this.f937k && !this.f936j) {
                com.google.android.gms.common.internal.k kVar = this.f939m;
                if (kVar != null) {
                    try {
                        kVar.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                o(this.f934h);
                this.f937k = true;
                l(f(Status.f923j));
            }
        }
    }

    protected abstract R f(Status status);

    @Deprecated
    public final void g(Status status) {
        synchronized (this.a) {
            if (!i()) {
                j(f(status));
                this.f938l = true;
            }
        }
    }

    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            z = this.f937k;
        }
        return z;
    }

    public final boolean i() {
        return this.d.getCount() == 0;
    }

    public final void j(R r) {
        synchronized (this.a) {
            if (this.f938l || this.f937k) {
                o(r);
                return;
            }
            i();
            com.google.android.gms.common.internal.q.o(!i(), "Results have already been set");
            com.google.android.gms.common.internal.q.o(!this.f936j, "Result has already been consumed");
            l(r);
        }
    }

    public final void n() {
        boolean z = true;
        if (!this.f941o && !((Boolean) p.get()).booleanValue()) {
            z = false;
        }
        this.f941o = z;
    }

    public final boolean p() {
        boolean zH;
        synchronized (this.a) {
            if (((com.google.android.gms.common.api.e) this.c.get()) == null || !this.f941o) {
                e();
            }
            zH = h();
        }
        return zH;
    }

    public final void q(k2 k2Var) {
        this.f933g.set(k2Var);
    }
}
