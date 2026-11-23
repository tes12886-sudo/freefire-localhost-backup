package i;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public class f implements Closeable {
    private final Object a = new Object();
    private final List<e> b = new ArrayList();
    private ScheduledFuture<?> c;
    private boolean d;
    private boolean e;

    public f() {
        c.d();
    }

    private void F() {
        if (this.e) {
            throw new IllegalStateException("Object already closed");
        }
    }

    private void c() {
        ScheduledFuture<?> scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.c = null;
        }
    }

    private void l(List<e> list) {
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    void O(e eVar) {
        synchronized (this.a) {
            F();
            this.b.remove(eVar);
        }
    }

    public void b() {
        synchronized (this.a) {
            F();
            if (this.d) {
                return;
            }
            c();
            this.d = true;
            l(new ArrayList(this.b));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            c();
            Iterator<e> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.b.clear();
            this.e = true;
        }
    }

    public d f() {
        d dVar;
        synchronized (this.a) {
            F();
            dVar = new d(this);
        }
        return dVar;
    }

    public boolean j() {
        boolean z;
        synchronized (this.a) {
            F();
            z = this.d;
        }
        return z;
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", f.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(j()));
    }

    e u(Runnable runnable) {
        e eVar;
        synchronized (this.a) {
            F();
            eVar = new e(this, runnable);
            if (this.d) {
                eVar.b();
            } else {
                this.b.add(eVar);
            }
        }
        return eVar;
    }
}
