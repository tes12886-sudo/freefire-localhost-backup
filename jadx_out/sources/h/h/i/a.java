package h.h.i;

import android.graphics.Typeface;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
class a {
    private final f.c a;
    private final Handler b;

    /* JADX INFO: renamed from: h.h.i.a$a, reason: collision with other inner class name */
    class RunnableC0193a implements Runnable {
        final /* synthetic */ f.c a;
        final /* synthetic */ Typeface b;

        RunnableC0193a(a aVar, f.c cVar, Typeface typeface) {
            this.a = cVar;
            this.b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b(this.b);
        }
    }

    class b implements Runnable {
        final /* synthetic */ f.c a;
        final /* synthetic */ int b;

        b(a aVar, f.c cVar, int i2) {
            this.a = cVar;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b);
        }
    }

    a(f.c cVar, Handler handler) {
        this.a = cVar;
        this.b = handler;
    }

    private void a(int i2) {
        this.b.post(new b(this, this.a, i2));
    }

    private void c(Typeface typeface) {
        this.b.post(new RunnableC0193a(this, this.a, typeface));
    }

    void b(e.C0194e c0194e) {
        if (c0194e.a()) {
            c(c0194e.a);
        } else {
            a(c0194e.b);
        }
    }
}
