package m.h0.g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import l.s;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private final e a;
    private final String b;
    private boolean c;
    private a d;
    private final List<a> e;
    private boolean f;

    public d(e eVar, String str) {
        i.e(eVar, "taskRunner");
        i.e(str, "name");
        this.a = eVar;
        this.b = str;
        this.e = new ArrayList();
    }

    public static /* synthetic */ void j(d dVar, a aVar, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        dVar.i(aVar, j2);
    }

    public final void a() {
        if (m.h0.d.f2188g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.a) {
            if (b()) {
                h().h(this);
            }
            s sVar = s.a;
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null) {
            i.c(aVar);
            if (aVar.a()) {
                this.f = true;
            }
        }
        boolean z = false;
        int size = this.e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                if (this.e.get(size).a()) {
                    a aVar2 = this.e.get(size);
                    if (e.f2196h.a().isLoggable(Level.FINE)) {
                        b.c(aVar2, this, "canceled");
                    }
                    this.e.remove(size);
                    z = true;
                }
                if (i2 < 0) {
                    break;
                }
                size = i2;
            }
        }
        return z;
    }

    public final a c() {
        return this.d;
    }

    public final boolean d() {
        return this.f;
    }

    public final List<a> e() {
        return this.e;
    }

    public final String f() {
        return this.b;
    }

    public final boolean g() {
        return this.c;
    }

    public final e h() {
        return this.a;
    }

    public final void i(a aVar, long j2) {
        i.e(aVar, "task");
        synchronized (this.a) {
            if (!g()) {
                if (k(aVar, j2, false)) {
                    h().h(this);
                }
                s sVar = s.a;
            } else if (aVar.a()) {
                if (e.f2196h.a().isLoggable(Level.FINE)) {
                    b.c(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.f2196h.a().isLoggable(Level.FINE)) {
                    b.c(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(a aVar, long j2, boolean z) {
        String strB;
        String str;
        i.e(aVar, "task");
        aVar.e(this);
        long jB = this.a.g().b();
        long j3 = jB + j2;
        int iIndexOf = this.e.indexOf(aVar);
        if (iIndexOf != -1) {
            if (aVar.c() <= j3) {
                if (e.f2196h.a().isLoggable(Level.FINE)) {
                    b.c(aVar, this, "already scheduled");
                }
                return false;
            }
            this.e.remove(iIndexOf);
        }
        aVar.g(j3);
        if (e.f2196h.a().isLoggable(Level.FINE)) {
            long j4 = j3 - jB;
            if (z) {
                strB = b.b(j4);
                str = "run again after ";
            } else {
                strB = b.b(j4);
                str = "scheduled after ";
            }
            b.c(aVar, this, i.k(str, strB));
        }
        Iterator<a> it = this.e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().c() - jB > j2) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.e.size();
        }
        this.e.add(size, aVar);
        return size == 0;
    }

    public final void l(a aVar) {
        this.d = aVar;
    }

    public final void m(boolean z) {
        this.f = z;
    }

    public final void n(boolean z) {
        this.c = z;
    }

    public final void o() {
        if (m.h0.d.f2188g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.a) {
            n(true);
            if (b()) {
                h().h(this);
            }
            s sVar = s.a;
        }
    }

    public String toString() {
        return this.b;
    }
}
