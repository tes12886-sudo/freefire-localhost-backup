package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k5 extends z8<k5, j5> implements ea {
    private static final k5 zzg;
    private int zza;
    private f9<o5> zze = z8.p();
    private g5 zzf;

    static {
        k5 k5Var = new k5();
        zzg = k5Var;
        z8.u(k5.class, k5Var);
    }

    private k5() {
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zze", o5.class, "zzf"});
        }
        if (i3 == 3) {
            return new k5();
        }
        e5 e5Var = null;
        if (i3 == 4) {
            return new j5(e5Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final List<o5> x() {
        return this.zze;
    }

    public final g5 y() {
        g5 g5Var = this.zzf;
        return g5Var == null ? g5.z() : g5Var;
    }
}
