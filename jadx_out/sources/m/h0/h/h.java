package m.h0.h;

import java.util.LinkedHashSet;
import java.util.Set;
import m.f0;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private final Set<f0> a = new LinkedHashSet();

    public final synchronized void a(f0 f0Var) {
        l.y.c.i.e(f0Var, "route");
        this.a.remove(f0Var);
    }

    public final synchronized void b(f0 f0Var) {
        l.y.c.i.e(f0Var, "failedRoute");
        this.a.add(f0Var);
    }

    public final synchronized boolean c(f0 f0Var) {
        l.y.c.i.e(f0Var, "route");
        return this.a.contains(f0Var);
    }
}
