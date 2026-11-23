package i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class i<TResult> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile m f1904l;
    private boolean b;
    private boolean c;
    private TResult d;
    private Exception e;
    private boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i.k f1908g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ExecutorService f1901i = i.c.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Executor f1902j = i.c.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Executor f1903k = i.b.c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static i<?> f1905m = new i<>((Object) null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static i<Boolean> f1906n = new i<>(Boolean.TRUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static i<Boolean> f1907o = new i<>(Boolean.FALSE);
    private static i<?> p = new i<>(true);
    private final Object a = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<i.g<TResult, Void>> f1909h = new ArrayList();

    class a implements i.g<TResult, Void> {
        final /* synthetic */ i.j a;
        final /* synthetic */ i.g b;
        final /* synthetic */ Executor c;
        final /* synthetic */ i.d d;

        a(i iVar, i.j jVar, i.g gVar, Executor executor, i.d dVar) {
            this.a = jVar;
            this.b = gVar;
            this.c = executor;
            this.d = dVar;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i<TResult> iVar) {
            i.h(this.a, this.b, iVar, this.c, this.d);
            return null;
        }
    }

    class b implements i.g<TResult, Void> {
        final /* synthetic */ i.j a;
        final /* synthetic */ i.g b;
        final /* synthetic */ Executor c;
        final /* synthetic */ i.d d;

        b(i iVar, i.j jVar, i.g gVar, Executor executor, i.d dVar) {
            this.a = jVar;
            this.b = gVar;
            this.c = executor;
            this.d = dVar;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i<TResult> iVar) {
            i.g(this.a, this.b, iVar, this.c, this.d);
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
    class c<TContinuationResult> implements i.g<TResult, i<TContinuationResult>> {
        final /* synthetic */ i.d a;
        final /* synthetic */ i.g b;

        c(i iVar, i.d dVar, i.g gVar) {
            this.a = dVar;
            this.b = gVar;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i<TContinuationResult> a(i<TResult> iVar) {
            i.d dVar = this.a;
            if (dVar != null && dVar.a()) {
                return i.f();
            }
            if (iVar.x()) {
                return i.q(iVar.s());
            }
            return iVar.v() ? i.f() : iVar.i(this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
    class d<TContinuationResult> implements i.g<TResult, i<TContinuationResult>> {
        final /* synthetic */ i.d a;
        final /* synthetic */ i.g b;

        d(i iVar, i.d dVar, i.g gVar) {
            this.a = dVar;
            this.b = gVar;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i<TContinuationResult> a(i<TResult> iVar) {
            i.d dVar = this.a;
            if (dVar != null && dVar.a()) {
                return i.f();
            }
            if (iVar.x()) {
                return i.q(iVar.s());
            }
            return iVar.v() ? i.f() : iVar.l(this.b);
        }
    }

    static class e implements Runnable {
        final /* synthetic */ i.d a;
        final /* synthetic */ i.j b;
        final /* synthetic */ i.g c;
        final /* synthetic */ i d;

        e(i.d dVar, i.j jVar, i.g gVar, i iVar) {
            this.a = dVar;
            this.b = jVar;
            this.c = gVar;
            this.d = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            i.d dVar = this.a;
            if (dVar != null && dVar.a()) {
                this.b.b();
                return;
            }
            try {
                this.b.d(this.c.a(this.d));
            } catch (CancellationException unused) {
                this.b.b();
            } catch (Exception e) {
                this.b.c(e);
            }
        }
    }

    static class f implements Runnable {
        final /* synthetic */ i.d a;
        final /* synthetic */ i.j b;
        final /* synthetic */ i.g c;
        final /* synthetic */ i d;

        /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
        class a<TContinuationResult> implements i.g<TContinuationResult, Void> {
            a() {
            }

            @Override // i.g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void a(i<TContinuationResult> iVar) {
                i.d dVar = f.this.a;
                if (dVar != null && dVar.a()) {
                    f.this.b.b();
                    return null;
                }
                if (iVar.v()) {
                    f.this.b.b();
                } else if (iVar.x()) {
                    f.this.b.c(iVar.s());
                } else {
                    f.this.b.d(iVar.t());
                }
                return null;
            }
        }

        f(i.d dVar, i.j jVar, i.g gVar, i iVar) {
            this.a = dVar;
            this.b = jVar;
            this.c = gVar;
            this.d = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.d dVar = this.a;
            if (dVar != null && dVar.a()) {
                this.b.b();
                return;
            }
            try {
                i iVar = (i) this.c.a(this.d);
                if (iVar == null) {
                    this.b.d(null);
                } else {
                    iVar.i(new a());
                }
            } catch (CancellationException unused) {
                this.b.b();
            } catch (Exception e) {
                this.b.c(e);
            }
        }
    }

    static class g implements Runnable {
        final /* synthetic */ i.j a;

        g(i.j jVar) {
            this.a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.g(null);
        }
    }

    static class h implements Runnable {
        final /* synthetic */ ScheduledFuture a;
        final /* synthetic */ i.j b;

        h(ScheduledFuture scheduledFuture, i.j jVar) {
            this.a = scheduledFuture;
            this.b = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.cancel(true);
            this.b.e();
        }
    }

    /* JADX INFO: renamed from: i.i$i, reason: collision with other inner class name */
    static class RunnableC0218i implements Runnable {
        final /* synthetic */ i.d a;
        final /* synthetic */ i.j b;
        final /* synthetic */ Callable c;

        RunnableC0218i(i.d dVar, i.j jVar, Callable callable) {
            this.a = dVar;
            this.b = jVar;
            this.c = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            i.d dVar = this.a;
            if (dVar != null && dVar.a()) {
                this.b.b();
                return;
            }
            try {
                this.b.d(this.c.call());
            } catch (CancellationException unused) {
                this.b.b();
            } catch (Exception e) {
                this.b.c(e);
            }
        }
    }

    static class j implements i.g<TResult, Void> {
        final /* synthetic */ AtomicBoolean a;
        final /* synthetic */ i.j b;

        j(AtomicBoolean atomicBoolean, i.j jVar) {
            this.a = atomicBoolean;
            this.b = jVar;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i<TResult> iVar) {
            if (this.a.compareAndSet(false, true)) {
                this.b.d(iVar);
                return null;
            }
            iVar.s();
            return null;
        }
    }

    static class k implements i.g<Void, List<TResult>> {
        final /* synthetic */ Collection a;

        k(Collection collection) {
            this.a = collection;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<TResult> a(i<Void> iVar) {
            if (this.a.size() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                arrayList.add(((i) it.next()).t());
            }
            return arrayList;
        }
    }

    static class l implements i.g<Object, Void> {
        final /* synthetic */ Object a;
        final /* synthetic */ ArrayList b;
        final /* synthetic */ AtomicBoolean c;
        final /* synthetic */ AtomicInteger d;
        final /* synthetic */ i.j e;

        l(Object obj, ArrayList arrayList, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, i.j jVar) {
            this.a = obj;
            this.b = arrayList;
            this.c = atomicBoolean;
            this.d = atomicInteger;
            this.e = jVar;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i<Object> iVar) {
            if (iVar.x()) {
                synchronized (this.a) {
                    this.b.add(iVar.s());
                }
            }
            if (iVar.v()) {
                this.c.set(true);
            }
            if (this.d.decrementAndGet() == 0) {
                if (this.b.size() != 0) {
                    if (this.b.size() == 1) {
                        this.e.c((Exception) this.b.get(0));
                    } else {
                        this.e.c(new i.a(String.format("There were %d exceptions.", Integer.valueOf(this.b.size())), this.b));
                    }
                } else if (this.c.get()) {
                    this.e.b();
                } else {
                    this.e.d(null);
                }
            }
            return null;
        }
    }

    public interface m {
        void a(i<?> iVar, i.l lVar);
    }

    i() {
    }

    private i(TResult tresult) {
        G(tresult);
    }

    private i(boolean z) {
        if (z) {
            E();
        } else {
            G(null);
        }
    }

    private void D() {
        synchronized (this.a) {
            Iterator<i.g<TResult, Void>> it = this.f1909h.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(this);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            }
            this.f1909h = null;
        }
    }

    public static i<Void> H(Collection<? extends i<?>> collection) {
        if (collection.size() == 0) {
            return r(null);
        }
        i.j jVar = new i.j();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends i<?>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().i(new l(obj, arrayList, atomicBoolean, atomicInteger, jVar));
        }
        return jVar.a();
    }

    public static <TResult> i<List<TResult>> I(Collection<? extends i<TResult>> collection) {
        return (i<List<TResult>>) H(collection).y(new k(collection));
    }

    public static <TResult> i<i<TResult>> J(Collection<? extends i<TResult>> collection) {
        if (collection.size() == 0) {
            return r(null);
        }
        i.j jVar = new i.j();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends i<TResult>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().i(new j(atomicBoolean, jVar));
        }
        return jVar.a();
    }

    public static <TResult> i<TResult> c(Callable<TResult> callable, Executor executor) {
        return d(callable, executor, null);
    }

    public static <TResult> i<TResult> d(Callable<TResult> callable, Executor executor, i.d dVar) {
        i.j jVar = new i.j();
        try {
            executor.execute(new RunnableC0218i(dVar, jVar, callable));
        } catch (Exception e2) {
            jVar.c(new i.h(e2));
        }
        return jVar.a();
    }

    public static <TResult> i<TResult> e(Callable<TResult> callable) {
        return d(callable, f1901i, null);
    }

    public static <TResult> i<TResult> f() {
        return (i<TResult>) p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void g(i.j<TContinuationResult> jVar, i.g<TResult, i<TContinuationResult>> gVar, i<TResult> iVar, Executor executor, i.d dVar) {
        try {
            executor.execute(new f(dVar, jVar, gVar, iVar));
        } catch (Exception e2) {
            jVar.c(new i.h(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void h(i.j<TContinuationResult> jVar, i.g<TResult, TContinuationResult> gVar, i<TResult> iVar, Executor executor, i.d dVar) {
        try {
            executor.execute(new e(dVar, jVar, gVar, iVar));
        } catch (Exception e2) {
            jVar.c(new i.h(e2));
        }
    }

    public static i<Void> o(long j2, i.d dVar) {
        return p(j2, i.c.d(), dVar);
    }

    static i<Void> p(long j2, ScheduledExecutorService scheduledExecutorService, i.d dVar) {
        if (dVar != null && dVar.a()) {
            return f();
        }
        if (j2 <= 0) {
            return r(null);
        }
        i.j jVar = new i.j();
        ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new g(jVar), j2, TimeUnit.MILLISECONDS);
        if (dVar != null) {
            dVar.b(new h(scheduledFutureSchedule, jVar));
        }
        return jVar.a();
    }

    public static <TResult> i<TResult> q(Exception exc) {
        i.j jVar = new i.j();
        jVar.c(exc);
        return jVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TResult> i<TResult> r(TResult tresult) {
        if (tresult == 0) {
            return (i<TResult>) f1905m;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (i<TResult>) f1906n : (i<TResult>) f1907o;
        }
        i.j jVar = new i.j();
        jVar.d(tresult);
        return jVar.a();
    }

    public static m u() {
        return f1904l;
    }

    public <TContinuationResult> i<TContinuationResult> A(i.g<TResult, i<TContinuationResult>> gVar) {
        return B(gVar, f1902j);
    }

    public <TContinuationResult> i<TContinuationResult> B(i.g<TResult, i<TContinuationResult>> gVar, Executor executor) {
        return C(gVar, executor, null);
    }

    public <TContinuationResult> i<TContinuationResult> C(i.g<TResult, i<TContinuationResult>> gVar, Executor executor, i.d dVar) {
        return m(new d(this, dVar, gVar), executor);
    }

    boolean E() {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.c = true;
            this.a.notifyAll();
            D();
            return true;
        }
    }

    boolean F(Exception exc) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.e = exc;
            this.f = false;
            this.a.notifyAll();
            D();
            if (!this.f && u() != null) {
                this.f1908g = new i.k(this);
            }
            return true;
        }
    }

    boolean G(TResult tresult) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.d = tresult;
            this.a.notifyAll();
            D();
            return true;
        }
    }

    public <TContinuationResult> i<TContinuationResult> i(i.g<TResult, TContinuationResult> gVar) {
        return k(gVar, f1902j, null);
    }

    public <TContinuationResult> i<TContinuationResult> j(i.g<TResult, TContinuationResult> gVar, Executor executor) {
        return k(gVar, executor, null);
    }

    public <TContinuationResult> i<TContinuationResult> k(i.g<TResult, TContinuationResult> gVar, Executor executor, i.d dVar) {
        boolean zW;
        i.j jVar = new i.j();
        synchronized (this.a) {
            zW = w();
            if (!zW) {
                this.f1909h.add(new a(this, jVar, gVar, executor, dVar));
            }
        }
        if (zW) {
            h(jVar, gVar, this, executor, dVar);
        }
        return jVar.a();
    }

    public <TContinuationResult> i<TContinuationResult> l(i.g<TResult, i<TContinuationResult>> gVar) {
        return n(gVar, f1902j, null);
    }

    public <TContinuationResult> i<TContinuationResult> m(i.g<TResult, i<TContinuationResult>> gVar, Executor executor) {
        return n(gVar, executor, null);
    }

    public <TContinuationResult> i<TContinuationResult> n(i.g<TResult, i<TContinuationResult>> gVar, Executor executor, i.d dVar) {
        boolean zW;
        i.j jVar = new i.j();
        synchronized (this.a) {
            zW = w();
            if (!zW) {
                this.f1909h.add(new b(this, jVar, gVar, executor, dVar));
            }
        }
        if (zW) {
            g(jVar, gVar, this, executor, dVar);
        }
        return jVar.a();
    }

    public Exception s() {
        Exception exc;
        synchronized (this.a) {
            if (this.e != null) {
                this.f = true;
                i.k kVar = this.f1908g;
                if (kVar != null) {
                    kVar.a();
                    this.f1908g = null;
                }
            }
            exc = this.e;
        }
        return exc;
    }

    public TResult t() {
        TResult tresult;
        synchronized (this.a) {
            tresult = this.d;
        }
        return tresult;
    }

    public boolean v() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public boolean w() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    public boolean x() {
        boolean z;
        synchronized (this.a) {
            z = s() != null;
        }
        return z;
    }

    public <TContinuationResult> i<TContinuationResult> y(i.g<TResult, TContinuationResult> gVar) {
        return z(gVar, f1902j, null);
    }

    public <TContinuationResult> i<TContinuationResult> z(i.g<TResult, TContinuationResult> gVar, Executor executor, i.d dVar) {
        return m(new c(this, dVar, gVar), executor);
    }
}
