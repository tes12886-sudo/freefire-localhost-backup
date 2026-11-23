package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class g4 extends z8<g4, f4> implements ea {
    private static final g4 zzi;
    private int zza;
    private int zze;
    private z4 zzf;
    private z4 zzg;
    private boolean zzh;

    static {
        g4 g4Var = new g4();
        zzi = g4Var;
        z8.u(g4.class, g4Var);
    }

    private g4() {
    }

    public static f4 E() {
        return zzi.r();
    }

    static /* synthetic */ void H(g4 g4Var, int i2) {
        g4Var.zza |= 1;
        g4Var.zze = i2;
    }

    static /* synthetic */ void I(g4 g4Var, z4 z4Var) {
        z4Var.getClass();
        g4Var.zzf = z4Var;
        g4Var.zza |= 2;
    }

    static /* synthetic */ void J(g4 g4Var, z4 z4Var) {
        g4Var.zzg = z4Var;
        g4Var.zza |= 4;
    }

    static /* synthetic */ void K(g4 g4Var, boolean z) {
        g4Var.zza |= 8;
        g4Var.zzh = z;
    }

    public final boolean A() {
        return (this.zza & 4) != 0;
    }

    public final z4 B() {
        z4 z4Var = this.zzg;
        return z4Var == null ? z4.J() : z4Var;
    }

    public final boolean C() {
        return (this.zza & 8) != 0;
    }

    public final boolean D() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new g4();
        }
        c4 c4Var = null;
        if (i3 == 4) {
            return new f4(c4Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzi;
    }

    public final boolean x() {
        return (this.zza & 1) != 0;
    }

    public final int y() {
        return this.zze;
    }

    public final z4 z() {
        z4 z4Var = this.zzf;
        return z4Var == null ? z4.J() : z4Var;
    }
}
