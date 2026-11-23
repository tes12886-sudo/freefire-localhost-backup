package j.g.a.a.a.y;

import android.app.Activity;
import j.g.a.a.a.k;
import j.g.a.a.a.l;
import java.util.Calendar;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class d<T extends k> {
    protected final c a;
    private final f b;
    private final l<T> c;
    private final ExecutorService d;
    private final e e;

    class a extends j.g.a.a.a.y.a.b {
        a() {
        }

        @Override // j.g.a.a.a.y.a.b
        public void f(Activity activity) {
            d.this.b();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.c();
        }
    }

    protected static class c {
        public boolean a;
        public long b;
        private final Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

        private boolean c(long j2, long j3) {
            this.c.setTimeInMillis(j2);
            int i2 = this.c.get(6);
            int i3 = this.c.get(1);
            this.c.setTimeInMillis(j3);
            return i2 == this.c.get(6) && i3 == this.c.get(1);
        }

        public synchronized boolean a(long j2) {
            long j3 = this.b;
            boolean z = j2 - j3 > 21600000;
            boolean z2 = !c(j2, j3);
            if (this.a || !(z || z2)) {
                return false;
            }
            this.a = true;
            return true;
        }

        public synchronized void b(long j2) {
            this.a = false;
            this.b = j2;
        }
    }

    d(l<T> lVar, f fVar, ExecutorService executorService, c cVar, e eVar) {
        this.b = fVar;
        this.c = lVar;
        this.d = executorService;
        this.a = cVar;
        this.e = eVar;
    }

    public d(l<T> lVar, ExecutorService executorService, e<T> eVar) {
        this(lVar, new f(), executorService, new c(), eVar);
    }

    public void a(j.g.a.a.a.y.a aVar) {
        aVar.a(new a());
    }

    public void b() {
        if (this.c.c() != null && this.a.a(this.b.a())) {
            this.d.submit(new b());
        }
    }

    protected void c() {
        Iterator<T> it = this.c.b().values().iterator();
        while (it.hasNext()) {
            this.e.a(it.next());
        }
        this.a.b(this.b.a());
    }
}
