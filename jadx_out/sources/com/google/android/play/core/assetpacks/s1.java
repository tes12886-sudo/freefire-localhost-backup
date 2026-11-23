package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class s1 {
    private final v a;
    private final j.d.a.d.a.b.e0<s2> b;
    private final a1 c;
    private final j.d.a.d.a.b.e0<Executor> d;
    private final o0 e;
    private final com.google.android.play.core.common.c f;

    s1(v vVar, j.d.a.d.a.b.e0<s2> e0Var, a1 a1Var, j.d.a.d.a.b.e0<Executor> e0Var2, o0 o0Var, com.google.android.play.core.common.c cVar) {
        this.a = vVar;
        this.b = e0Var;
        this.c = a1Var;
        this.d = e0Var2;
        this.e = o0Var;
        this.f = cVar;
    }

    public final void a(final p1 p1Var) {
        Executor executorA;
        Runnable runnableA;
        File fileX = this.a.x(p1Var.b, p1Var.c, p1Var.d);
        File fileD = this.a.D(p1Var.b, p1Var.c, p1Var.d);
        if (!fileX.exists() || !fileD.exists()) {
            throw new k0(String.format("Cannot find pack files to move for pack %s.", p1Var.b), p1Var.a);
        }
        File fileT = this.a.t(p1Var.b, p1Var.c, p1Var.d);
        fileT.mkdirs();
        if (!fileX.renameTo(fileT)) {
            throw new k0("Cannot move merged pack files to final location.", p1Var.a);
        }
        new File(this.a.t(p1Var.b, p1Var.c, p1Var.d), "merge.tmp").delete();
        File fileU = this.a.u(p1Var.b, p1Var.c, p1Var.d);
        fileU.mkdirs();
        if (!fileD.renameTo(fileU)) {
            throw new k0("Cannot move metadata files to final location.", p1Var.a);
        }
        if (this.f.a()) {
            executorA = this.d.a();
            runnableA = new Runnable(this, p1Var) { // from class: com.google.android.play.core.assetpacks.q1
                private final s1 a;
                private final p1 b;

                {
                    this.a = this;
                    this.b = p1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(this.b);
                }
            };
        } else {
            executorA = this.d.a();
            v vVar = this.a;
            vVar.getClass();
            runnableA = r1.a(vVar);
        }
        executorA.execute(runnableA);
        this.c.f(p1Var.b, p1Var.c, p1Var.d);
        this.e.a(p1Var.b);
        this.b.a().a(p1Var.a, p1Var.b);
    }

    final /* synthetic */ void b(p1 p1Var) {
        this.a.E(p1Var.b, p1Var.c, p1Var.d);
    }
}
