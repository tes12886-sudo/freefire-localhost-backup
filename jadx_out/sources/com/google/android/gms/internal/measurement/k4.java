package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k4 extends z8<k4, j4> implements ea {
    private static final k4 zzj;
    private int zza;
    private f9<o4> zze = z8.p();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        k4 k4Var = new k4();
        zzj = k4Var;
        z8.u(k4.class, k4Var);
    }

    private k4() {
    }

    public static j4 I() {
        return zzj.r();
    }

    static /* synthetic */ void K(k4 k4Var, int i2, o4 o4Var) {
        o4Var.getClass();
        k4Var.U();
        k4Var.zze.set(i2, o4Var);
    }

    static /* synthetic */ void L(k4 k4Var, o4 o4Var) {
        o4Var.getClass();
        k4Var.U();
        k4Var.zze.add(o4Var);
    }

    static /* synthetic */ void M(k4 k4Var, Iterable iterable) {
        k4Var.U();
        l7.j(iterable, k4Var.zze);
    }

    static /* synthetic */ void P(k4 k4Var, int i2) {
        k4Var.U();
        k4Var.zze.remove(i2);
    }

    static /* synthetic */ void Q(k4 k4Var, String str) {
        str.getClass();
        k4Var.zza |= 1;
        k4Var.zzf = str;
    }

    static /* synthetic */ void R(k4 k4Var, long j2) {
        k4Var.zza |= 2;
        k4Var.zzg = j2;
    }

    static /* synthetic */ void S(k4 k4Var, long j2) {
        k4Var.zza |= 4;
        k4Var.zzh = j2;
    }

    private final void U() {
        f9<o4> f9Var = this.zze;
        if (f9Var.zza()) {
            return;
        }
        this.zze = z8.q(f9Var);
    }

    public final String A() {
        return this.zzf;
    }

    public final boolean B() {
        return (this.zza & 2) != 0;
    }

    public final long C() {
        return this.zzg;
    }

    public final boolean D() {
        return (this.zza & 4) != 0;
    }

    public final long E() {
        return this.zzh;
    }

    public final boolean G() {
        return (this.zza & 8) != 0;
    }

    public final int H() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zza", "zze", o4.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new k4();
        }
        c4 c4Var = null;
        if (i3 == 4) {
            return new j4(c4Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzj;
    }

    public final List<o4> x() {
        return this.zze;
    }

    public final int y() {
        return this.zze.size();
    }

    public final o4 z(int i2) {
        return this.zze.get(i2);
    }
}
