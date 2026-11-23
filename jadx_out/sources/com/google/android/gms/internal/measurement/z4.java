package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z4 extends z8<z4, y4> implements ea {
    private static final z4 zzh;
    private e9 zza = z8.n();
    private e9 zze = z8.n();
    private f9<i4> zzf = z8.p();
    private f9<b5> zzg = z8.p();

    static {
        z4 z4Var = new z4();
        zzh = z4Var;
        z8.u(z4.class, z4Var);
    }

    private z4() {
    }

    public static y4 I() {
        return zzh.r();
    }

    public static z4 J() {
        return zzh;
    }

    static /* synthetic */ void L(z4 z4Var, Iterable iterable) {
        e9 e9Var = z4Var.zza;
        if (!e9Var.zza()) {
            z4Var.zza = z8.o(e9Var);
        }
        l7.j(iterable, z4Var.zza);
    }

    static /* synthetic */ void N(z4 z4Var, Iterable iterable) {
        e9 e9Var = z4Var.zze;
        if (!e9Var.zza()) {
            z4Var.zze = z8.o(e9Var);
        }
        l7.j(iterable, z4Var.zze);
    }

    static /* synthetic */ void Q(z4 z4Var, Iterable iterable) {
        z4Var.V();
        l7.j(iterable, z4Var.zzf);
    }

    static /* synthetic */ void R(z4 z4Var, int i2) {
        z4Var.V();
        z4Var.zzf.remove(i2);
    }

    static /* synthetic */ void S(z4 z4Var, Iterable iterable) {
        z4Var.W();
        l7.j(iterable, z4Var.zzg);
    }

    static /* synthetic */ void U(z4 z4Var, int i2) {
        z4Var.W();
        z4Var.zzg.remove(i2);
    }

    private final void V() {
        f9<i4> f9Var = this.zzf;
        if (f9Var.zza()) {
            return;
        }
        this.zzf = z8.q(f9Var);
    }

    private final void W() {
        f9<b5> f9Var = this.zzg;
        if (f9Var.zza()) {
            return;
        }
        this.zzg = z8.q(f9Var);
    }

    public final int A() {
        return this.zze.size();
    }

    public final List<i4> B() {
        return this.zzf;
    }

    public final int C() {
        return this.zzf.size();
    }

    public final i4 D(int i2) {
        return this.zzf.get(i2);
    }

    public final List<b5> E() {
        return this.zzg;
    }

    public final int G() {
        return this.zzg.size();
    }

    public final b5 H(int i2) {
        return this.zzg.get(i2);
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzh, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zza", "zze", "zzf", i4.class, "zzg", b5.class});
        }
        if (i3 == 3) {
            return new z4();
        }
        c4 c4Var = null;
        if (i3 == 4) {
            return new y4(c4Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }

    public final List<Long> x() {
        return this.zza;
    }

    public final int y() {
        return this.zza.size();
    }

    public final List<Long> z() {
        return this.zze;
    }
}
