package i;

/* JADX INFO: loaded from: classes.dex */
public class j<TResult> {
    private final i<TResult> a = new i<>();

    public i<TResult> a() {
        return this.a;
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public void d(TResult tresult) {
        if (!g(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public boolean e() {
        return this.a.E();
    }

    public boolean f(Exception exc) {
        return this.a.F(exc);
    }

    public boolean g(TResult tresult) {
        return this.a.G(tresult);
    }
}
