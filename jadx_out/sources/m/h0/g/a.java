package m.h0.g;

import l.y.c.f;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    private final String a;
    private final boolean b;
    private d c;
    private long d;

    public a(String str, boolean z) {
        i.e(str, "name");
        this.a = str;
        this.b = z;
        this.d = -1L;
    }

    public /* synthetic */ a(String str, boolean z, int i2, f fVar) {
        this(str, (i2 & 2) != 0 ? true : z);
    }

    public final boolean a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final long c() {
        return this.d;
    }

    public final d d() {
        return this.c;
    }

    public final void e(d dVar) {
        i.e(dVar, "queue");
        d dVar2 = this.c;
        if (dVar2 == dVar) {
            return;
        }
        if (!(dVar2 == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.c = dVar;
    }

    public abstract long f();

    public final void g(long j2) {
        this.d = j2;
    }

    public String toString() {
        return this.a;
    }
}
