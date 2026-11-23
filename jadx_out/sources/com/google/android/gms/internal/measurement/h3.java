package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h3 extends z8<h3, g3> implements ea {
    private static final h3 zzm;
    private int zza;
    private int zze;
    private String zzf = "";
    private f9<j3> zzg = z8.p();
    private boolean zzh;
    private n3 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        h3 h3Var = new h3();
        zzm = h3Var;
        z8.u(h3.class, h3Var);
    }

    private h3() {
    }

    public static g3 K() {
        return zzm.r();
    }

    static /* synthetic */ void M(h3 h3Var, String str) {
        h3Var.zza |= 2;
        h3Var.zzf = str;
    }

    static /* synthetic */ void N(h3 h3Var, int i2, j3 j3Var) {
        j3Var.getClass();
        f9<j3> f9Var = h3Var.zzg;
        if (!f9Var.zza()) {
            h3Var.zzg = z8.q(f9Var);
        }
        h3Var.zzg.set(i2, j3Var);
    }

    public final List<j3> A() {
        return this.zzg;
    }

    public final int B() {
        return this.zzg.size();
    }

    public final j3 C(int i2) {
        return this.zzg.get(i2);
    }

    public final boolean D() {
        return (this.zza & 8) != 0;
    }

    public final n3 E() {
        n3 n3Var = this.zzi;
        return n3Var == null ? n3.I() : n3Var;
    }

    public final boolean G() {
        return this.zzj;
    }

    public final boolean H() {
        return this.zzk;
    }

    public final boolean I() {
        return (this.zza & 64) != 0;
    }

    public final boolean J() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zza", "zze", "zzf", "zzg", j3.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i3 == 3) {
            return new h3();
        }
        d3 d3Var = null;
        if (i3 == 4) {
            return new g3(d3Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzm;
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
