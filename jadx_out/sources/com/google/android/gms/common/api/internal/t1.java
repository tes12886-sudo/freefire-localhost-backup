package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
final class t1 implements OnCompleteListener {
    private final g a;
    private final int b;
    private final b c;
    private final long d;
    private final long e;

    t1(g gVar, int i2, b bVar, long j2, long j3, String str, String str2) {
        this.a = gVar;
        this.b = i2;
        this.c = bVar;
        this.d = j2;
        this.e = j3;
    }

    static t1 b(g gVar, int i2, b bVar) {
        boolean zL;
        if (!gVar.g()) {
            return null;
        }
        com.google.android.gms.common.internal.s sVarA = com.google.android.gms.common.internal.r.b().a();
        if (sVarA == null) {
            zL = true;
        } else {
            if (!sVarA.j()) {
                return null;
            }
            zL = sVarA.l();
            j1 j1VarX = gVar.x(bVar);
            if (j1VarX != null) {
                if (!(j1VarX.v() instanceof com.google.android.gms.common.internal.c)) {
                    return null;
                }
                com.google.android.gms.common.internal.c cVar = (com.google.android.gms.common.internal.c) j1VarX.v();
                if (cVar.O() && !cVar.l()) {
                    com.google.android.gms.common.internal.e eVarC = c(j1VarX, cVar, i2);
                    if (eVarC == null) {
                        return null;
                    }
                    j1VarX.G();
                    zL = eVarC.n();
                }
            }
        }
        return new t1(gVar, i2, bVar, zL ? System.currentTimeMillis() : 0L, zL ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static com.google.android.gms.common.internal.e c(j1 j1Var, com.google.android.gms.common.internal.c cVar, int i2) {
        int[] iArrH;
        int[] iArrJ;
        com.google.android.gms.common.internal.e eVarM = cVar.M();
        if (eVarM == null || !eVarM.l() || ((iArrH = eVarM.h()) != null ? !com.google.android.gms.common.util.b.b(iArrH, i2) : !((iArrJ = eVarM.j()) == null || !com.google.android.gms.common.util.b.b(iArrJ, i2))) || j1Var.s() >= eVarM.f()) {
            return null;
        }
        return eVarM;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void a(Task task) {
        j1 j1VarX;
        int iN;
        int i2;
        int i3;
        int i4;
        int iF;
        long j2;
        long jCurrentTimeMillis;
        int iElapsedRealtime;
        if (this.a.g()) {
            com.google.android.gms.common.internal.s sVarA = com.google.android.gms.common.internal.r.b().a();
            if ((sVarA == null || sVarA.j()) && (j1VarX = this.a.x(this.c)) != null && (j1VarX.v() instanceof com.google.android.gms.common.internal.c)) {
                com.google.android.gms.common.internal.c cVar = (com.google.android.gms.common.internal.c) j1VarX.v();
                boolean zL = this.d > 0;
                int iE = cVar.E();
                if (sVarA != null) {
                    zL &= sVarA.l();
                    int iF2 = sVarA.f();
                    int iH = sVarA.h();
                    iN = sVarA.n();
                    if (cVar.O() && !cVar.l()) {
                        com.google.android.gms.common.internal.e eVarC = c(j1VarX, cVar, this.b);
                        if (eVarC == null) {
                            return;
                        }
                        boolean z = eVarC.n() && this.d > 0;
                        iH = eVarC.f();
                        zL = z;
                    }
                    i2 = iF2;
                    i3 = iH;
                } else {
                    iN = 0;
                    i2 = 5000;
                    i3 = 100;
                }
                g gVar = this.a;
                if (task.isSuccessful()) {
                    i4 = 0;
                    iF = 0;
                } else {
                    if (task.isCanceled()) {
                        i4 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof com.google.android.gms.common.api.b) {
                            Status statusA = ((com.google.android.gms.common.api.b) exception).a();
                            int iH2 = statusA.h();
                            ConnectionResult connectionResultF = statusA.f();
                            iF = connectionResultF == null ? -1 : connectionResultF.f();
                            i4 = iH2;
                        } else {
                            i4 = 101;
                        }
                    }
                    iF = -1;
                }
                if (zL) {
                    long j3 = this.d;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    j2 = j3;
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.e);
                } else {
                    j2 = 0;
                    jCurrentTimeMillis = 0;
                    iElapsedRealtime = -1;
                }
                gVar.I(new com.google.android.gms.common.internal.n(this.b, i4, iF, j2, jCurrentTimeMillis, null, null, iE, iElapsedRealtime), iN, i2, i3);
            }
        }
    }
}
