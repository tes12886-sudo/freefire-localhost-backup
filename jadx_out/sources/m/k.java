package m;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    private final m.h0.h.g a;

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i2, long j2, TimeUnit timeUnit) {
        this(new m.h0.h.g(m.h0.g.e.f2197i, i2, j2, timeUnit));
        l.y.c.i.e(timeUnit, "timeUnit");
    }

    public k(m.h0.h.g gVar) {
        l.y.c.i.e(gVar, "delegate");
        this.a = gVar;
    }

    public final m.h0.h.g a() {
        return this.a;
    }
}
