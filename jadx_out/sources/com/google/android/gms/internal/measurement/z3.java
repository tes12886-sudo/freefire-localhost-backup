package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z3 extends z8<z3, y3> implements ea {
    private static final z3 zzn;
    private int zza;
    private long zze;
    private int zzg;
    private boolean zzl;
    private String zzf = "";
    private f9<b4> zzh = z8.p();
    private f9<x3> zzi = z8.p();
    private f9<f3> zzj = z8.p();
    private String zzk = "";
    private f9<k5> zzm = z8.p();

    static {
        z3 z3Var = new z3();
        zzn = z3Var;
        z8.u(z3.class, z3Var);
    }

    private z3() {
    }

    public static y3 J() {
        return zzn.r();
    }

    public static z3 K() {
        return zzn;
    }

    static /* synthetic */ void M(z3 z3Var, int i2, x3 x3Var) {
        x3Var.getClass();
        f9<x3> f9Var = z3Var.zzi;
        if (!f9Var.zza()) {
            z3Var.zzi = z8.q(f9Var);
        }
        z3Var.zzi.set(i2, x3Var);
    }

    public final String A() {
        return this.zzf;
    }

    public final List<b4> B() {
        return this.zzh;
    }

    public final int C() {
        return this.zzi.size();
    }

    public final x3 D(int i2) {
        return this.zzi.get(i2);
    }

    public final List<f3> E() {
        return this.zzj;
    }

    public final boolean G() {
        return this.zzl;
    }

    public final List<k5> H() {
        return this.zzm;
    }

    public final int I() {
        return this.zzm.size();
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", b4.class, "zzi", x3.class, "zzj", f3.class, "zzk", "zzl", "zzm", k5.class});
        }
        if (i3 == 3) {
            return new z3();
        }
        u3 u3Var = null;
        if (i3 == 4) {
            return new y3(u3Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzn;
    }

    public final boolean x() {
        return (this.zza & 1) != 0;
    }

    public final long y() {
        return this.zze;
    }

    public final boolean z() {
        return (this.zza & 2) != 0;
    }
}
