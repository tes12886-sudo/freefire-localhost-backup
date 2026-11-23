package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i5 extends z8<i5, h5> implements ea {
    private static final i5 zzg;
    private int zza;
    private String zze = "";
    private f9<o5> zzf = z8.p();

    static {
        i5 i5Var = new i5();
        zzg = i5Var;
        z8.u(i5.class, i5Var);
    }

    private i5() {
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zza", "zze", "zzf", o5.class});
        }
        if (i3 == 3) {
            return new i5();
        }
        e5 e5Var = null;
        if (i3 == 4) {
            return new h5(e5Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final String x() {
        return this.zze;
    }

    public final List<o5> y() {
        return this.zzf;
    }
}
