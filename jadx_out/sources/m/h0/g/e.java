package m.h0.g;

import com.FF.voiceengine.FFVoiceConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import l.s;
import l.y.c.f;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f2196h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f2197i = new e(new c(m.h0.d.L(i.k(m.h0.d.f2189h, " TaskRunner"), true)));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Logger f2198j;
    private final a a;
    private int b;
    private boolean c;
    private long d;
    private final List<m.h0.g.d> e;
    private final List<m.h0.g.d> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f2199g;

    public interface a {
        void a(e eVar);

        long b();

        void c(e eVar, long j2);

        void execute(Runnable runnable);
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final Logger a() {
            return e.f2198j;
        }
    }

    public static final class c implements a {
        private final ThreadPoolExecutor a;

        public c(ThreadFactory threadFactory) {
            i.e(threadFactory, "threadFactory");
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // m.h0.g.e.a
        public void a(e eVar) {
            i.e(eVar, "taskRunner");
            eVar.notify();
        }

        @Override // m.h0.g.e.a
        public long b() {
            return System.nanoTime();
        }

        @Override // m.h0.g.e.a
        public void c(e eVar, long j2) throws InterruptedException {
            i.e(eVar, "taskRunner");
            long j3 = j2 / 1000000;
            long j4 = j2 - (1000000 * j3);
            if (j3 > 0 || j2 > 0) {
                eVar.wait(j3, (int) j4);
            }
        }

        @Override // m.h0.g.e.a
        public void execute(Runnable runnable) {
            i.e(runnable, "runnable");
            this.a.execute(runnable);
        }
    }

    public static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.h0.g.a aVarD;
            while (true) {
                e eVar = e.this;
                synchronized (eVar) {
                    aVarD = eVar.d();
                }
                if (aVarD == null) {
                    return;
                }
                m.h0.g.d dVarD = aVarD.d();
                i.c(dVarD);
                e eVar2 = e.this;
                long jB = -1;
                boolean zIsLoggable = e.f2196h.a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jB = dVarD.h().g().b();
                    m.h0.g.b.c(aVarD, dVarD, "starting");
                }
                try {
                    eVar2.j(aVarD);
                    try {
                        s sVar = s.a;
                        if (zIsLoggable) {
                            m.h0.g.b.c(aVarD, dVarD, i.k("finished run in ", m.h0.g.b.b(dVarD.h().g().b() - jB)));
                        }
                    } catch (Throwable th) {
                        if (zIsLoggable) {
                            m.h0.g.b.c(aVarD, dVarD, i.k("failed a run in ", m.h0.g.b.b(dVarD.h().g().b() - jB)));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    eVar2.g().execute(this);
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        i.d(logger, "getLogger(TaskRunner::class.java.name)");
        f2198j = logger;
    }

    public e(a aVar) {
        i.e(aVar, "backend");
        this.a = aVar;
        this.b = FFVoiceConst.FFVoice_RTC_SERVER_REGION.RTC_EXT_SERVER;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.f2199g = new d();
    }

    private final void c(m.h0.g.a aVar, long j2) {
        if (m.h0.d.f2188g && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        m.h0.g.d dVarD = aVar.d();
        i.c(dVarD);
        if (!(dVarD.c() == aVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean zD = dVarD.d();
        dVarD.m(false);
        dVarD.l(null);
        this.e.remove(dVarD);
        if (j2 != -1 && !zD && !dVarD.g()) {
            dVarD.k(aVar, j2, true);
        }
        if (!dVarD.e().isEmpty()) {
            this.f.add(dVarD);
        }
    }

    private final void e(m.h0.g.a aVar) {
        if (m.h0.d.f2188g && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        aVar.g(-1L);
        m.h0.g.d dVarD = aVar.d();
        i.c(dVarD);
        dVarD.e().remove(aVar);
        this.f.remove(dVarD);
        dVarD.l(aVar);
        this.e.add(dVarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(m.h0.g.a aVar) {
        if (m.h0.d.f2188g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.b());
        try {
            long jF = aVar.f();
            synchronized (this) {
                c(aVar, jF);
                s sVar = s.a;
            }
        } finally {
            synchronized (this) {
                c(aVar, -1L);
                s sVar2 = s.a;
                threadCurrentThread.setName(name);
            }
        }
    }

    public final m.h0.g.a d() {
        boolean z;
        if (m.h0.d.f2188g && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        while (!this.f.isEmpty()) {
            long jB = this.a.b();
            long jMin = Long.MAX_VALUE;
            Iterator<m.h0.g.d> it = this.f.iterator();
            m.h0.g.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                m.h0.g.a aVar2 = it.next().e().get(0);
                long jMax = Math.max(0L, aVar2.c() - jB);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                e(aVar);
                if (z || (!this.c && (!this.f.isEmpty()))) {
                    this.a.execute(this.f2199g);
                }
                return aVar;
            }
            if (this.c) {
                if (jMin < this.d - jB) {
                    this.a.a(this);
                }
                return null;
            }
            this.c = true;
            this.d = jB + jMin;
            try {
                try {
                    this.a.c(this, jMin);
                } catch (InterruptedException unused) {
                    f();
                }
                this.c = false;
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
        return null;
    }

    public final void f() {
        int size = this.e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                this.e.get(size).b();
                if (i2 < 0) {
                    break;
                } else {
                    size = i2;
                }
            }
        }
        int size2 = this.f.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i3 = size2 - 1;
            m.h0.g.d dVar = this.f.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f.remove(size2);
            }
            if (i3 < 0) {
                return;
            } else {
                size2 = i3;
            }
        }
    }

    public final a g() {
        return this.a;
    }

    public final void h(m.h0.g.d dVar) {
        i.e(dVar, "taskQueue");
        if (m.h0.d.f2188g && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (dVar.c() == null) {
            if (!dVar.e().isEmpty()) {
                m.h0.d.a(this.f, dVar);
            } else {
                this.f.remove(dVar);
            }
        }
        if (this.c) {
            this.a.a(this);
        } else {
            this.a.execute(this.f2199g);
        }
    }

    public final m.h0.g.d i() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new m.h0.g.d(this, i.k("Q", Integer.valueOf(i2)));
    }
}
