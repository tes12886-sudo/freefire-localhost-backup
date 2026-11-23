package m;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    private Runnable c;
    private ExecutorService d;
    private int a = 64;
    private int b = 5;
    private final ArrayDeque<m.h0.h.e.a> e = new ArrayDeque<>();
    private final ArrayDeque<m.h0.h.e.a> f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<m.h0.h.e> f2311g = new ArrayDeque<>();

    private final m.h0.h.e.a d(String str) {
        for (m.h0.h.e.a aVar : this.f) {
            if (l.y.c.i.a(aVar.d(), str)) {
                return aVar;
            }
        }
        for (m.h0.h.e.a aVar2 : this.e) {
            if (l.y.c.i.a(aVar2.d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    private final <T> void e(Deque<T> deque, T t) {
        Runnable runnableH;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnableH = h();
            l.s sVar = l.s.a;
        }
        if (k() || runnableH == null) {
            return;
        }
        runnableH.run();
    }

    private final boolean k() {
        int i2;
        boolean z;
        if (m.h0.d.f2188g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<m.h0.h.e.a> it = this.e.iterator();
            l.y.c.i.d(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                m.h0.h.e.a next = it.next();
                if (this.f.size() >= i()) {
                    break;
                }
                if (next.c().get() < j()) {
                    it.remove();
                    next.c().incrementAndGet();
                    l.y.c.i.d(next, "asyncCall");
                    arrayList.add(next);
                    this.f.add(next);
                }
            }
            z = l() > 0;
            l.s sVar = l.s.a;
        }
        int size = arrayList.size();
        for (i2 = 0; i2 < size; i2++) {
            ((m.h0.h.e.a) arrayList.get(i2)).a(c());
        }
        return z;
    }

    public final void a(m.h0.h.e.a aVar) {
        m.h0.h.e.a aVarD;
        l.y.c.i.e(aVar, "call");
        synchronized (this) {
            this.e.add(aVar);
            if (!aVar.b().r() && (aVarD = d(aVar.d())) != null) {
                aVar.e(aVarD);
            }
            l.s sVar = l.s.a;
        }
        k();
    }

    public final synchronized void b(m.h0.h.e eVar) {
        l.y.c.i.e(eVar, "call");
        this.f2311g.add(eVar);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        if (this.d == null) {
            this.d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), m.h0.d.L(l.y.c.i.k(m.h0.d.f2189h, " Dispatcher"), false));
        }
        executorService = this.d;
        l.y.c.i.c(executorService);
        return executorService;
    }

    public final void f(m.h0.h.e.a aVar) {
        l.y.c.i.e(aVar, "call");
        aVar.c().decrementAndGet();
        e(this.f, aVar);
    }

    public final void g(m.h0.h.e eVar) {
        l.y.c.i.e(eVar, "call");
        e(this.f2311g, eVar);
    }

    public final synchronized Runnable h() {
        return this.c;
    }

    public final synchronized int i() {
        return this.a;
    }

    public final synchronized int j() {
        return this.b;
    }

    public final synchronized int l() {
        return this.f.size() + this.f2311g.size();
    }
}
