package j.d.a.d.a.f;

/* JADX INFO: loaded from: classes.dex */
final class h implements Runnable {
    final /* synthetic */ e a;
    final /* synthetic */ i b;

    h(i iVar, e eVar) {
        this.b = iVar;
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.onComplete(this.a);
            }
        }
    }
}
