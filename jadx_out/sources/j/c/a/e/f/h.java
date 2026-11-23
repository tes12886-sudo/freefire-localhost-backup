package j.c.a.e.f;

/* JADX INFO: loaded from: classes.dex */
public class h implements Runnable {
    private final e a;
    private final j b;
    private final int c;

    public h(int i2, j jVar, e eVar) {
        this.c = i2;
        this.b = jVar;
        this.a = eVar;
    }

    private void a() {
        while (!Thread.interrupted()) {
            try {
                this.a.e(this.b.c());
            } catch (j.c.a.e.f.k.c unused) {
                this.a.g(this.c);
                return;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (Exception e) {
            j.c.a.e.l.b.b(e);
        }
    }
}
