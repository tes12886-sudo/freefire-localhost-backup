package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class h2 {
    private static final j.d.a.d.a.b.f e = new j.d.a.d.a.b.f("AssetPackManager");
    private final v a;
    private final j.d.a.d.a.b.e0<s2> b;
    private final s c;
    private final j.d.a.d.a.b.e0<Executor> d;

    h2(v vVar, j.d.a.d.a.b.e0<s2> e0Var, s sVar, j.d.a.d.a.e.a aVar, a1 a1Var, o0 o0Var, e0 e0Var2, j.d.a.d.a.b.e0<Executor> e0Var3, com.google.android.play.core.common.c cVar) {
        new Handler(Looper.getMainLooper());
        this.a = vVar;
        this.b = e0Var;
        this.c = sVar;
        this.d = e0Var3;
    }

    private final void e() {
        final byte[] bArr = null;
        this.d.a().execute(new Runnable(this, bArr) { // from class: com.google.android.play.core.assetpacks.e2
            private final h2 a;
            private final /* synthetic */ int b = 1;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (this.b != 0) {
                    this.a.c();
                } else {
                    this.a.b();
                }
            }
        });
    }

    final void a(boolean z) {
        boolean zE = this.c.e();
        this.c.c(z);
        if (!z || zE) {
            return;
        }
        e();
    }

    final /* synthetic */ void b() {
        this.a.I();
        this.a.F();
        this.a.J();
    }

    final /* synthetic */ void c() {
        j.d.a.d.a.f.e<List<String>> eVarE = this.b.a().e(this.a.q());
        Executor executorA = this.d.a();
        v vVar = this.a;
        vVar.getClass();
        eVarE.c(executorA, f2.a(vVar));
        eVarE.b(this.d.a(), g2.a);
    }
}
