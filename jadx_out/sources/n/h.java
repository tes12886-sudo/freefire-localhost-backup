package n;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class h extends y {
    private y e;

    public h(y yVar) {
        l.y.c.i.e(yVar, "delegate");
        this.e = yVar;
    }

    @Override // n.y
    public y a() {
        return this.e.a();
    }

    @Override // n.y
    public y b() {
        return this.e.b();
    }

    @Override // n.y
    public long c() {
        return this.e.c();
    }

    @Override // n.y
    public y d(long j2) {
        return this.e.d(j2);
    }

    @Override // n.y
    public boolean e() {
        return this.e.e();
    }

    @Override // n.y
    public void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // n.y
    public y g(long j2, TimeUnit timeUnit) {
        l.y.c.i.e(timeUnit, "unit");
        return this.e.g(j2, timeUnit);
    }

    public final y i() {
        return this.e;
    }

    public final h j(y yVar) {
        l.y.c.i.e(yVar, "delegate");
        this.e = yVar;
        return this;
    }
}
