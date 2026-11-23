package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class d5 extends z8<d5, c5> implements ea {
    private static final d5 zzk;
    private int zza;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        d5 d5Var = new d5();
        zzk = d5Var;
        z8.u(d5.class, d5Var);
    }

    private d5() {
    }

    public static c5 H() {
        return zzk.r();
    }

    static /* synthetic */ void J(d5 d5Var, long j2) {
        d5Var.zza |= 1;
        d5Var.zze = j2;
    }

    static /* synthetic */ void K(d5 d5Var, String str) {
        str.getClass();
        d5Var.zza |= 2;
        d5Var.zzf = str;
    }

    static /* synthetic */ void L(d5 d5Var, String str) {
        str.getClass();
        d5Var.zza |= 4;
        d5Var.zzg = str;
    }

    static /* synthetic */ void M(d5 d5Var) {
        d5Var.zza &= -5;
        d5Var.zzg = zzk.zzg;
    }

    static /* synthetic */ void N(d5 d5Var, long j2) {
        d5Var.zza |= 8;
        d5Var.zzh = j2;
    }

    static /* synthetic */ void P(d5 d5Var) {
        d5Var.zza &= -9;
        d5Var.zzh = 0L;
    }

    static /* synthetic */ void Q(d5 d5Var, double d) {
        d5Var.zza |= 32;
        d5Var.zzj = d;
    }

    static /* synthetic */ void R(d5 d5Var) {
        d5Var.zza &= -33;
        d5Var.zzj = 0.0d;
    }

    public final boolean A() {
        return (this.zza & 4) != 0;
    }

    public final String B() {
        return this.zzg;
    }

    public final boolean C() {
        return (this.zza & 8) != 0;
    }

    public final long D() {
        return this.zzh;
    }

    public final boolean E() {
        return (this.zza & 32) != 0;
    }

    public final double G() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new d5();
        }
        c4 c4Var = null;
        if (i3 == 4) {
            return new c5(c4Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzk;
    }

    public final boolean x() {
        return (this.zza & 1) != 0;
    }

    public final long y() {
        return this.zze;
    }

    public final String z() {
        return this.zzf;
    }
}
