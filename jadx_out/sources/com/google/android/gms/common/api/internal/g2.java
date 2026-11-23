package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class g2 implements Runnable {
    final /* synthetic */ com.google.android.gms.common.api.j a;
    final /* synthetic */ j2 b;

    g2(j2 j2Var, com.google.android.gms.common.api.j jVar) {
        this.b = j2Var;
        this.a = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.e eVar;
        Boolean bool = Boolean.FALSE;
        try {
            try {
                ThreadLocal threadLocal = BasePendingResult.p;
                threadLocal.set(Boolean.TRUE);
                com.google.android.gms.common.api.m mVar = this.b.a;
                com.google.android.gms.common.internal.q.k(mVar);
                com.google.android.gms.common.api.f fVarB = mVar.b(this.a);
                j2 j2Var = this.b;
                j2Var.f969g.sendMessage(j2Var.f969g.obtainMessage(0, fVarB));
                threadLocal.set(bool);
                j2 j2Var2 = this.b;
                j2.j(this.a);
                eVar = (com.google.android.gms.common.api.e) this.b.f.get();
                if (eVar == null) {
                    return;
                }
            } catch (RuntimeException e) {
                j2 j2Var3 = this.b;
                j2Var3.f969g.sendMessage(j2Var3.f969g.obtainMessage(1, e));
                BasePendingResult.p.set(bool);
                j2 j2Var4 = this.b;
                j2.j(this.a);
                eVar = (com.google.android.gms.common.api.e) this.b.f.get();
                if (eVar == null) {
                    return;
                }
            }
            eVar.q(this.b);
        } catch (Throwable th) {
            BasePendingResult.p.set(bool);
            j2 j2Var5 = this.b;
            j2.j(this.a);
            com.google.android.gms.common.api.e eVar2 = (com.google.android.gms.common.api.e) this.b.f.get();
            if (eVar2 != null) {
                eVar2.q(this.b);
            }
            throw th;
        }
    }
}
