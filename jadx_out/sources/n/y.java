package n;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public static final y d = new a();
    private boolean a;
    private long b;
    private long c;

    public static final class a extends y {
        a() {
        }

        @Override // n.y
        public y d(long j2) {
            return this;
        }

        @Override // n.y
        public void f() {
        }

        @Override // n.y
        public y g(long j2, TimeUnit timeUnit) {
            l.y.c.i.e(timeUnit, "unit");
            return this;
        }
    }

    public y a() {
        this.a = false;
        return this;
    }

    public y b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public y d(long j2) {
        this.a = true;
        this.b = j2;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public y g(long j2, TimeUnit timeUnit) {
        l.y.c.i.e(timeUnit, "unit");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(l.y.c.i.k("timeout < 0: ", Long.valueOf(j2)).toString());
        }
        this.c = timeUnit.toNanos(j2);
        return this;
    }

    public long h() {
        return this.c;
    }
}
