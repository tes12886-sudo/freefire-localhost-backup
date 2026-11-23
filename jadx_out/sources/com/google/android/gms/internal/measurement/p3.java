package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class p3 extends z8<p3, o3> implements ea {
    private static final p3 zzk;
    private int zza;
    private int zze;
    private String zzf = "";
    private j3 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        p3 p3Var = new p3();
        zzk = p3Var;
        z8.u(p3.class, p3Var);
    }

    private p3() {
    }

    public static o3 G() {
        return zzk.r();
    }

    static /* synthetic */ void I(p3 p3Var, String str) {
        p3Var.zza |= 2;
        p3Var.zzf = str;
    }

    public final j3 A() {
        j3 j3Var = this.zzg;
        return j3Var == null ? j3.G() : j3Var;
    }

    public final boolean B() {
        return this.zzh;
    }

    public final boolean C() {
        return this.zzi;
    }

    public final boolean D() {
        return (this.zza & 32) != 0;
    }

    public final boolean E() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new p3();
        }
        d3 d3Var = null;
        if (i3 == 4) {
            return new o3(d3Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzk;
    }

    public final boolean x() {
        return (this.zza & 1) != 0;
    }

    public final int y() {
        return this.zze;
    }

    public final String z() {
        return this.zzf;
    }
}
