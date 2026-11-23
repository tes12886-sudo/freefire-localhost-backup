package j.d.a.d.a.f;

/* JADX INFO: loaded from: classes.dex */
final class j implements Runnable {
    final /* synthetic */ e a;
    final /* synthetic */ k b;

    j(k kVar, e eVar) {
        this.b = kVar;
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.onFailure(this.a.d());
            }
        }
    }
}
