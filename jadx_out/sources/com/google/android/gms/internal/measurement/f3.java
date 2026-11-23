package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f3 extends z8<f3, e3> implements ea {
    private static final f3 zzj;
    private int zza;
    private int zze;
    private f9<p3> zzf = z8.p();
    private f9<h3> zzg = z8.p();
    private boolean zzh;
    private boolean zzi;

    static {
        f3 f3Var = new f3();
        zzj = f3Var;
        z8.u(f3.class, f3Var);
    }

    private f3() {
    }

    static /* synthetic */ void H(f3 f3Var, int i2, p3 p3Var) {
        p3Var.getClass();
        f9<p3> f9Var = f3Var.zzf;
        if (!f9Var.zza()) {
            f3Var.zzf = z8.q(f9Var);
        }
        f3Var.zzf.set(i2, p3Var);
    }

    static /* synthetic */ void I(f3 f3Var, int i2, h3 h3Var) {
        h3Var.getClass();
        f9<h3> f9Var = f3Var.zzg;
        if (!f9Var.zza()) {
            f3Var.zzg = z8.q(f9Var);
        }
        f3Var.zzg.set(i2, h3Var);
    }

    public final int A() {
        return this.zzf.size();
    }

    public final p3 B(int i2) {
        return this.zzf.get(i2);
    }

    public final List<h3> C() {
        return this.zzg;
    }

    public final int D() {
        return this.zzg.size();
    }

    public final h3 E(int i2) {
        return this.zzg.get(i2);
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zza", "zze", "zzf", p3.class, "zzg", h3.class, "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new f3();
        }
        d3 d3Var = null;
        if (i3 == 4) {
            return new e3(d3Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzj;
    }

    public final boolean x() {
        return (this.zza & 1) != 0;
    }

    public final int y() {
        return this.zze;
    }

    public final List<p3> z() {
        return this.zzf;
    }
}
