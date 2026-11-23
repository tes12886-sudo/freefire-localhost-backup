package h.p.b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import h.h.h.i;
import h.h.k.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<D> extends b<D> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f1836i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    volatile a<D>.RunnableC0208a f1837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    volatile a<D>.RunnableC0208a f1838k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    long f1839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    long f1840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Handler f1841n;

    /* JADX INFO: renamed from: h.p.b.a$a, reason: collision with other inner class name */
    final class RunnableC0208a extends c<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final CountDownLatch f1842j = new CountDownLatch(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f1843k;

        RunnableC0208a() {
        }

        @Override // h.p.b.c
        protected void h(D d) {
            try {
                a.this.x(this, d);
            } finally {
                this.f1842j.countDown();
            }
        }

        @Override // h.p.b.c
        protected void i(D d) {
            try {
                a.this.y(this, d);
            } finally {
                this.f1842j.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h.p.b.c
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.C();
            } catch (i e) {
                if (f()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1843k = false;
            a.this.z();
        }
    }

    public a(Context context) {
        this(context, c.f1848h);
    }

    private a(Context context, Executor executor) {
        super(context);
        this.f1840m = -10000L;
        this.f1836i = executor;
    }

    public abstract D A();

    public void B(D d) {
    }

    protected D C() {
        return A();
    }

    @Override // h.p.b.b
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f1837j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f1837j);
            printWriter.print(" waiting=");
            printWriter.println(this.f1837j.f1843k);
        }
        if (this.f1838k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f1838k);
            printWriter.print(" waiting=");
            printWriter.println(this.f1838k.f1843k);
        }
        if (this.f1839l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            f.c(this.f1839l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            f.b(this.f1840m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // h.p.b.b
    protected boolean k() {
        if (this.f1837j == null) {
            return false;
        }
        if (!this.d) {
            this.f1845g = true;
        }
        if (this.f1838k != null) {
            if (this.f1837j.f1843k) {
                this.f1837j.f1843k = false;
                this.f1841n.removeCallbacks(this.f1837j);
            }
            this.f1837j = null;
            return false;
        }
        if (this.f1837j.f1843k) {
            this.f1837j.f1843k = false;
            this.f1841n.removeCallbacks(this.f1837j);
            this.f1837j = null;
            return false;
        }
        boolean zA = this.f1837j.a(false);
        if (zA) {
            this.f1838k = this.f1837j;
            w();
        }
        this.f1837j = null;
        return zA;
    }

    @Override // h.p.b.b
    protected void m() {
        super.m();
        b();
        this.f1837j = new RunnableC0208a();
        z();
    }

    public void w() {
    }

    void x(a<D>.RunnableC0208a runnableC0208a, D d) {
        B(d);
        if (this.f1838k == runnableC0208a) {
            s();
            this.f1840m = SystemClock.uptimeMillis();
            this.f1838k = null;
            e();
            z();
        }
    }

    void y(a<D>.RunnableC0208a runnableC0208a, D d) {
        if (this.f1837j != runnableC0208a) {
            x(runnableC0208a, d);
            return;
        }
        if (i()) {
            B(d);
            return;
        }
        c();
        this.f1840m = SystemClock.uptimeMillis();
        this.f1837j = null;
        f(d);
    }

    void z() {
        if (this.f1838k != null || this.f1837j == null) {
            return;
        }
        if (this.f1837j.f1843k) {
            this.f1837j.f1843k = false;
            this.f1841n.removeCallbacks(this.f1837j);
        }
        if (this.f1839l <= 0 || SystemClock.uptimeMillis() >= this.f1840m + this.f1839l) {
            this.f1837j.c(this.f1836i, null);
        } else {
            this.f1837j.f1843k = true;
            this.f1841n.postAtTime(this.f1837j, this.f1840m + this.f1839l);
        }
    }
}
