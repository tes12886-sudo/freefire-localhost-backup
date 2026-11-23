package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class i4 extends z8<i4, h4> implements ea {
    private static final i4 zzg;
    private int zza;
    private int zze;
    private long zzf;

    static {
        i4 i4Var = new i4();
        zzg = i4Var;
        z8.u(i4.class, i4Var);
    }

    private i4() {
    }

    public static h4 B() {
        return zzg.r();
    }

    static /* synthetic */ void D(i4 i4Var, int i2) {
        i4Var.zza |= 1;
        i4Var.zze = i2;
    }

    static /* synthetic */ void E(i4 i4Var, long j2) {
        i4Var.zza |= 2;
        i4Var.zzf = j2;
    }

    public final long A() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new i4();
        }
        c4 c4Var = null;
        if (i3 == 4) {
            return new h4(c4Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final boolean x() {
        return (this.zza & 1) != 0;
    }

    public final int y() {
        return this.zze;
    }

    public final boolean z() {
        return (this.zza & 2) != 0;
    }
}
