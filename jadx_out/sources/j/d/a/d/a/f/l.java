package j.d.a.d.a.f;

/* JADX INFO: loaded from: classes.dex */
final class l implements Runnable {
    final /* synthetic */ e a;
    final /* synthetic */ m b;

    l(m mVar, e eVar) {
        this.b = mVar;
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.onSuccess(this.a.e());
            }
        }
    }
}
