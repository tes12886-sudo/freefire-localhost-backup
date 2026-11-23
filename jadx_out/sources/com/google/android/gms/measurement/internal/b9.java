package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class b9 implements Runnable {
    final long a;
    final long b;
    final /* synthetic */ c9 c;

    b9(c9 c9Var, long j2, long j3) {
        this.c = c9Var;
        this.a = j2;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.a.f().r(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.a9
            private final b9 a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b9 b9Var = this.a;
                c9 c9Var = b9Var.c;
                long j2 = b9Var.a;
                long j3 = b9Var.b;
                c9Var.b.h();
                c9Var.b.a.d().v().a("Application going to the background");
                boolean z = true;
                if (c9Var.b.a.z().w(null, f3.s0)) {
                    c9Var.b.a.A().q.b(true);
                }
                Bundle bundle = new Bundle();
                if (!c9Var.b.a.z().C()) {
                    c9Var.b.e.b(j3);
                    if (c9Var.b.a.z().w(null, f3.k0)) {
                        e9 e9Var = c9Var.b.e;
                        long j4 = e9Var.b;
                        e9Var.b = j3;
                        bundle.putLong("_et", j3 - j4);
                        r7.x(c9Var.b.a.Q().s(true), bundle, true);
                    } else {
                        z = false;
                    }
                    c9Var.b.e.d(false, z, j3);
                }
                c9Var.b.a.F().Y("auto", "_ab", j2, bundle);
            }
        });
    }
}
