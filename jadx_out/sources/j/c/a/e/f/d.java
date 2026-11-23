package j.c.a.e.f;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class d extends HandlerThread implements b, j.c.a.e.f.l.c.b, e {
    private final ExecutorService a;
    private final c b;
    private j.c.a.e.f.l.a c;
    private a d;
    private g e;

    public d(c cVar) {
        super("NETWORK_THREAD");
        this.b = cVar;
        this.a = Executors.newSingleThreadExecutor();
    }

    private void h(int i2) {
        j.c.a.e.f.l.a aVarA = i.a(i2);
        this.c = aVarA;
        try {
            aVarA.d();
            k();
            this.b.c(i2);
        } catch (j.c.a.e.f.k.d unused) {
            this.b.b(i2);
        }
    }

    private void i() {
        j.c.a.e.f.l.a aVar = this.c;
        if (aVar != null) {
            aVar.e();
        }
    }

    private void k() {
        this.a.submit(new h(this.c.f(), i.c(this.c.g()), this.e));
    }

    @Override // j.c.a.e.f.b
    public void a() {
        i();
        h(1);
    }

    @Override // j.c.a.e.f.l.c.b
    public void b(j.c.a.e.f.l.b bVar) {
        j.c.a.e.l.b.c("TIMEOUT: " + j.c.a.e.l.e.a(bVar.b()));
        this.c.e();
        this.b.d(bVar);
    }

    @Override // j.c.a.e.f.b
    public void c(j.c.a.e.f.l.b bVar) {
        try {
            if (this.c.j()) {
                this.b.d(bVar);
            } else {
                this.c.k(bVar.h());
                if (bVar.e()) {
                    j.c.a.e.f.l.c cVar = new j.c.a.e.f.l.c(bVar);
                    cVar.d(this);
                    cVar.e();
                    this.c.o(cVar);
                }
            }
        } catch (j.c.a.e.f.k.b unused) {
            this.b.d(bVar);
        }
    }

    @Override // j.c.a.e.f.b
    public void d() {
        i();
        h(0);
    }

    @Override // j.c.a.e.f.e
    public void e(j.c.a.e.f.l.b bVar) {
        if (this.c.j()) {
            return;
        }
        if (!this.c.h()) {
            this.c.e();
        }
        j.c.a.e.f.l.c cVarI = this.c.i();
        if (cVarI != null && cVarI.c(bVar)) {
            cVarI.f();
        }
        this.b.e(bVar);
    }

    @Override // j.c.a.e.f.b
    public void f() {
        i();
        h(2);
    }

    @Override // j.c.a.e.f.e
    public void g(int i2) {
        if (this.c.j()) {
            return;
        }
        this.c.e();
        this.b.a(i2);
    }

    public b j() {
        Looper looper = getLooper();
        if (this.d == null && looper != null) {
            this.d = new a(looper, this);
        }
        return this.d;
    }

    public boolean l() {
        j.c.a.e.f.l.a aVar = this.c;
        return aVar != null && aVar.j();
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        this.e = new g(getLooper(), this);
    }

    @Override // android.os.HandlerThread
    public boolean quit() {
        this.c.e();
        this.a.shutdownNow();
        this.d = null;
        return super.quit();
    }
}
