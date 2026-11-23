package j.d.a.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Runnable {
    private final j.d.a.d.a.f.p<?> a;

    g() {
        this.a = null;
    }

    public g(j.d.a.d.a.f.p<?> pVar) {
        this.a = pVar;
    }

    protected abstract void a();

    final j.d.a.d.a.f.p<?> b() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            j.d.a.d.a.f.p<?> pVar = this.a;
            if (pVar != null) {
                pVar.d(e);
            }
        }
    }
}
