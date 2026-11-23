package j.d.d.z.n;

import j.d.d.p;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends j.d.d.b0.c {
    private static final Writer p = new a();
    private static final p q = new p("closed");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<j.d.d.k> f2075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f2076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private j.d.d.k f2077o;

    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public g() {
        super(p);
        this.f2075m = new ArrayList();
        this.f2077o = j.d.d.m.a;
    }

    private j.d.d.k s0() {
        List<j.d.d.k> list = this.f2075m;
        return list.get(list.size() - 1);
    }

    private void t0(j.d.d.k kVar) {
        if (this.f2076n != null) {
            if (!kVar.j() || O()) {
                ((j.d.d.n) s0()).q(this.f2076n, kVar);
            }
            this.f2076n = null;
            return;
        }
        if (this.f2075m.isEmpty()) {
            this.f2077o = kVar;
            return;
        }
        j.d.d.k kVarS0 = s0();
        if (!(kVarS0 instanceof j.d.d.h)) {
            throw new IllegalStateException();
        }
        ((j.d.d.h) kVarS0).q(kVar);
    }

    @Override // j.d.d.b0.c
    public j.d.d.b0.c F() {
        if (this.f2075m.isEmpty() || this.f2076n != null) {
            throw new IllegalStateException();
        }
        if (!(s0() instanceof j.d.d.n)) {
            throw new IllegalStateException();
        }
        List<j.d.d.k> list = this.f2075m;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // j.d.d.b0.c
    public j.d.d.b0.c Z(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f2075m.isEmpty() || this.f2076n != null) {
            throw new IllegalStateException();
        }
        if (!(s0() instanceof j.d.d.n)) {
            throw new IllegalStateException();
        }
        this.f2076n = str;
        return this;
    }

    @Override // j.d.d.b0.c
    public j.d.d.b0.c b0() {
        t0(j.d.d.m.a);
        return this;
    }

    @Override // j.d.d.b0.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f2075m.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f2075m.add(q);
    }

    @Override // j.d.d.b0.c
    public j.d.d.b0.c f() {
        j.d.d.h hVar = new j.d.d.h();
        t0(hVar);
        this.f2075m.add(hVar);
        return this;
    }

    @Override // j.d.d.b0.c, java.io.Flushable
    public void flush() {
    }

    @Override // j.d.d.b0.c
    public j.d.d.b0.c j() {
        j.d.d.n nVar = new j.d.d.n();
        t0(nVar);
        this.f2075m.add(nVar);
        return this;
    }

    @Override // j.d.d.b0.c
    public j.d.d.b0.c l0(long j2) {
        t0(new p(Long.valueOf(j2)));
        return this;
    }

    @Override // j.d.d.b0.c
    public j.d.d.b0.c m0(Boolean bool) {
        if (bool == null) {
            b0();
            return this;
        }
        t0(new p(bool));
        return this;
    }

    @Override // j.d.d.b0.c
    public j.d.d.b0.c n0(Number number) {
        if (number == null) {
            b0();
            return this;
        }
        if (!T()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        t0(new p(number));
        return this;
    }

    @Override // j.d.d.b0.c
    public j.d.d.b0.c o0(String str) {
        if (str == null) {
            b0();
            return this;
        }
        t0(new p(str));
        return this;
    }

    @Override // j.d.d.b0.c
    public j.d.d.b0.c p0(boolean z) {
        t0(new p(Boolean.valueOf(z)));
        return this;
    }

    public j.d.d.k r0() {
        if (this.f2075m.isEmpty()) {
            return this.f2077o;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f2075m);
    }

    @Override // j.d.d.b0.c
    public j.d.d.b0.c u() {
        if (this.f2075m.isEmpty() || this.f2076n != null) {
            throw new IllegalStateException();
        }
        if (!(s0() instanceof j.d.d.h)) {
            throw new IllegalStateException();
        }
        List<j.d.d.k> list = this.f2075m;
        list.remove(list.size() - 1);
        return this;
    }
}
