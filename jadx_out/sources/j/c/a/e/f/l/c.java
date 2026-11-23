package j.c.a.e.f.l;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private final j.c.a.e.f.l.b a;
    private b c;
    private Runnable d = new a();
    private final Handler b = new Handler();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.c != null) {
                c.this.c.b(c.this.a);
            }
        }
    }

    public interface b {
        void b(j.c.a.e.f.l.b bVar);
    }

    public c(j.c.a.e.f.l.b bVar) {
        this.a = bVar;
    }

    public boolean c(j.c.a.e.f.l.b bVar) {
        return true;
    }

    public void d(b bVar) {
        this.c = bVar;
    }

    public synchronized void e() {
        if (this.c != null) {
            this.b.postDelayed(this.d, this.a.d());
        }
    }

    public synchronized void f() {
        if (this.c != null) {
            this.b.removeCallbacks(this.d);
        }
    }
}
