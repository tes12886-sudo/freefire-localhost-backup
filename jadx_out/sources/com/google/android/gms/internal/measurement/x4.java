package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class x4 extends z8<x4, t4> implements ea {
    private static final x4 zzg;
    private int zza;
    private int zze = 1;
    private f9<m4> zzf = z8.p();

    static {
        x4 x4Var = new x4();
        zzg = x4Var;
        z8.u(x4.class, x4Var);
    }

    private x4() {
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zza", "zze", w4.c(), "zzf", m4.class});
        }
        if (i3 == 3) {
            return new x4();
        }
        c4 c4Var = null;
        if (i3 == 4) {
            return new t4(c4Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}
