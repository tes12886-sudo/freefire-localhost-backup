package com.facebook;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    private final long a;
    private long b;
    private long c;
    private long d;
    private final Handler e;
    private final u f;

    static final class a implements Runnable {
        final /* synthetic */ u.b a;
        final /* synthetic */ long b;
        final /* synthetic */ long c;

        a(u.b bVar, long j2, long j3) {
            this.a = bVar;
            this.b = j2;
            this.c = j3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                ((u.f) this.a).a(this.b, this.c);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    public h0(Handler handler, u uVar) {
        l.y.c.i.e(uVar, "request");
        this.e = handler;
        this.f = uVar;
        this.a = r.t();
    }

    public final void a(long j2) {
        long j3 = this.b + j2;
        this.b = j3;
        if (j3 >= this.c + this.a || j3 >= this.d) {
            c();
        }
    }

    public final void b(long j2) {
        this.d += j2;
    }

    public final void c() {
        if (this.b > this.c) {
            u.b bVarM = this.f.m();
            long j2 = this.d;
            if (j2 <= 0 || !(bVarM instanceof u.f)) {
                return;
            }
            long j3 = this.b;
            Handler handler = this.e;
            if (handler != null) {
                handler.post(new a(bVarM, j3, j2));
            } else {
                ((u.f) bVarM).a(j3, j2);
            }
            this.c = this.b;
        }
    }
}
