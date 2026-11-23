package com.facebook;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends FilterOutputStream implements g0 {
    private final long a;
    private long b;
    private long c;
    private h0 d;
    private final w e;
    private final Map<u, h0> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f582g;

    static final class a implements Runnable {
        final /* synthetic */ w.a b;

        a(w.a aVar) {
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                ((w.b) this.b).b(f0.this.e, f0.this.j(), f0.this.l());
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(OutputStream outputStream, w wVar, Map<u, h0> map, long j2) {
        super(outputStream);
        l.y.c.i.e(outputStream, "out");
        l.y.c.i.e(wVar, "requests");
        l.y.c.i.e(map, "progressMap");
        this.e = wVar;
        this.f = map;
        this.f582g = j2;
        this.a = r.t();
    }

    private final void f(long j2) {
        h0 h0Var = this.d;
        if (h0Var != null) {
            h0Var.a(j2);
        }
        long j3 = this.b + j2;
        this.b = j3;
        if (j3 >= this.c + this.a || j3 >= this.f582g) {
            u();
        }
    }

    private final void u() {
        if (this.b > this.c) {
            for (w.a aVar : this.e.t()) {
                if (aVar instanceof w.b) {
                    Handler handlerS = this.e.s();
                    if (handlerS != null) {
                        handlerS.post(new a(aVar));
                    } else {
                        ((w.b) aVar).b(this.e, this.b, this.f582g);
                    }
                }
            }
            this.c = this.b;
        }
    }

    @Override // com.facebook.g0
    public void b(u uVar) {
        this.d = uVar != null ? this.f.get(uVar) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        Iterator<h0> it = this.f.values().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        u();
    }

    public final long j() {
        return this.b;
    }

    public final long l() {
        return this.f582g;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i2) throws IOException {
        ((FilterOutputStream) this).out.write(i2);
        f(1L);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        l.y.c.i.e(bArr, "buffer");
        ((FilterOutputStream) this).out.write(bArr);
        f(bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        l.y.c.i.e(bArr, "buffer");
        ((FilterOutputStream) this).out.write(bArr, i2, i3);
        f(i3);
    }
}
