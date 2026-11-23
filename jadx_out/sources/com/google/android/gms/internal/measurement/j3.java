package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class j3 extends z8<j3, i3> implements ea {
    private static final j3 zzi;
    private int zza;
    private t3 zze;
    private n3 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        j3 j3Var = new j3();
        zzi = j3Var;
        z8.u(j3.class, j3Var);
    }

    private j3() {
    }

    public static j3 G() {
        return zzi;
    }

    static /* synthetic */ void I(j3 j3Var, String str) {
        j3Var.zza |= 8;
        j3Var.zzh = str;
    }

    public final n3 A() {
        n3 n3Var = this.zzf;
        return n3Var == null ? n3.I() : n3Var;
    }

    public final boolean B() {
        return (this.zza & 4) != 0;
    }

    public final boolean C() {
        return this.zzg;
    }

    public final boolean D() {
        return (this.zza & 8) != 0;
    }

    public final String E() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new j3();
        }
        d3 d3Var = null;
        if (i3 == 4) {
            return new i3(d3Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzi;
    }

    public final boolean x() {
        return (this.zza & 1) != 0;
    }

    public final t3 y() {
        t3 t3Var = this.zze;
        return t3Var == null ? t3.G() : t3Var;
    }

    public final boolean z() {
        return (this.zza & 2) != 0;
    }
}
