package m.h0.h;

import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import l.s;
import m.f0;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    private final int a;
    private final long b;
    private final m.h0.g.d c;
    private final a d;
    private final ConcurrentLinkedQueue<f> e;

    public static final class a extends m.h0.g.a {
        a(String str) {
            super(str, false, 2, null);
        }

        @Override // m.h0.g.a
        public long f() {
            return g.this.b(System.nanoTime());
        }
    }

    public g(m.h0.g.e eVar, int i2, long j2, TimeUnit timeUnit) {
        l.y.c.i.e(eVar, "taskRunner");
        l.y.c.i.e(timeUnit, "timeUnit");
        this.a = i2;
        this.b = timeUnit.toNanos(j2);
        this.c = eVar.i();
        this.d = new a(l.y.c.i.k(m.h0.d.f2189h, " ConnectionPool"));
        this.e = new ConcurrentLinkedQueue<>();
        if (!(j2 > 0)) {
            throw new IllegalArgumentException(l.y.c.i.k("keepAliveDuration <= 0: ", Long.valueOf(j2)).toString());
        }
    }

    private final int d(f fVar, long j2) {
        if (m.h0.d.f2188g && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + fVar);
        }
        List<Reference<e>> listO = fVar.o();
        int i2 = 0;
        while (i2 < listO.size()) {
            Reference<e> reference = listO.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                m.h0.l.h.a.g().l("A connection to " + fVar.A().a().l() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                listO.remove(i2);
                fVar.D(true);
                if (listO.isEmpty()) {
                    fVar.C(j2 - this.b);
                    return 0;
                }
            }
        }
        return listO.size();
    }

    public final boolean a(m.a aVar, e eVar, List<f0> list, boolean z) {
        l.y.c.i.e(aVar, "address");
        l.y.c.i.e(eVar, "call");
        for (f fVar : this.e) {
            l.y.c.i.d(fVar, "connection");
            synchronized (fVar) {
                if (z) {
                    if (!fVar.w()) {
                    }
                    s sVar = s.a;
                }
                if (fVar.u(aVar, list)) {
                    eVar.e(fVar);
                    return true;
                }
                s sVar2 = s.a;
            }
        }
        return false;
    }

    public final long b(long j2) {
        int i2 = 0;
        long j3 = Long.MIN_VALUE;
        f fVar = null;
        int i3 = 0;
        for (f fVar2 : this.e) {
            l.y.c.i.d(fVar2, "connection");
            synchronized (fVar2) {
                if (d(fVar2, j2) > 0) {
                    i3++;
                } else {
                    i2++;
                    long jP = j2 - fVar2.p();
                    if (jP > j3) {
                        fVar = fVar2;
                        j3 = jP;
                    }
                    s sVar = s.a;
                }
            }
        }
        long j4 = this.b;
        if (j3 < j4 && i2 <= this.a) {
            if (i2 > 0) {
                return j4 - j3;
            }
            if (i3 > 0) {
                return j4;
            }
            return -1L;
        }
        l.y.c.i.c(fVar);
        synchronized (fVar) {
            if (!fVar.o().isEmpty()) {
                return 0L;
            }
            if (fVar.p() + j3 != j2) {
                return 0L;
            }
            fVar.D(true);
            this.e.remove(fVar);
            m.h0.d.k(fVar.E());
            if (this.e.isEmpty()) {
                this.c.a();
            }
            return 0L;
        }
    }

    public final boolean c(f fVar) {
        l.y.c.i.e(fVar, "connection");
        if (m.h0.d.f2188g && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + fVar);
        }
        if (!fVar.q() && this.a != 0) {
            m.h0.g.d.j(this.c, this.d, 0L, 2, null);
            return false;
        }
        fVar.D(true);
        this.e.remove(fVar);
        if (!this.e.isEmpty()) {
            return true;
        }
        this.c.a();
        return true;
    }

    public final void e(f fVar) {
        l.y.c.i.e(fVar, "connection");
        if (!m.h0.d.f2188g || Thread.holdsLock(fVar)) {
            this.e.add(fVar);
            m.h0.g.d.j(this.c, this.d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + fVar);
    }
}
