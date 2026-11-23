package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o4 extends z8<o4, n4> implements ea {
    private static final o4 zzk;
    private int zza;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private f9<o4> zzj = z8.p();

    static {
        o4 o4Var = new o4();
        zzk = o4Var;
        z8.u(o4.class, o4Var);
    }

    private o4() {
    }

    public static n4 K() {
        return zzk.r();
    }

    static /* synthetic */ void M(o4 o4Var, String str) {
        str.getClass();
        o4Var.zza |= 1;
        o4Var.zze = str;
    }

    static /* synthetic */ void N(o4 o4Var, String str) {
        str.getClass();
        o4Var.zza |= 2;
        o4Var.zzf = str;
    }

    static /* synthetic */ void P(o4 o4Var) {
        o4Var.zza &= -3;
        o4Var.zzf = zzk.zzf;
    }

    static /* synthetic */ void Q(o4 o4Var, long j2) {
        o4Var.zza |= 4;
        o4Var.zzg = j2;
    }

    static /* synthetic */ void R(o4 o4Var) {
        o4Var.zza &= -5;
        o4Var.zzg = 0L;
    }

    static /* synthetic */ void S(o4 o4Var, double d) {
        o4Var.zza |= 16;
        o4Var.zzi = d;
    }

    static /* synthetic */ void U(o4 o4Var) {
        o4Var.zza &= -17;
        o4Var.zzi = 0.0d;
    }

    static /* synthetic */ void V(o4 o4Var, o4 o4Var2) {
        o4Var2.getClass();
        o4Var.Y();
        o4Var.zzj.add(o4Var2);
    }

    static /* synthetic */ void W(o4 o4Var, Iterable iterable) {
        o4Var.Y();
        l7.j(iterable, o4Var.zzj);
    }

    private final void Y() {
        f9<o4> f9Var = this.zzj;
        if (f9Var.zza()) {
            return;
        }
        this.zzj = z8.q(f9Var);
    }

    public final String A() {
        return this.zzf;
    }

    public final boolean B() {
        return (this.zza & 4) != 0;
    }

    public final long C() {
        return this.zzg;
    }

    public final boolean D() {
        return (this.zza & 8) != 0;
    }

    public final float E() {
        return this.zzh;
    }

    public final boolean G() {
        return (this.zza & 16) != 0;
    }

    public final double H() {
        return this.zzi;
    }

    public final List<o4> I() {
        return this.zzj;
    }

    public final int J() {
        return this.zzj.size();
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", o4.class});
        }
        if (i3 == 3) {
            return new o4();
        }
        c4 c4Var = null;
        if (i3 == 4) {
            return new n4(c4Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzk;
    }

    public final boolean x() {
        return (this.zza & 1) != 0;
    }

    public final String y() {
        return this.zze;
    }

    public final boolean z() {
        return (this.zza & 2) != 0;
    }
}
