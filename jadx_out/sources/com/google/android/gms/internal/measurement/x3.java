package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class x3 extends z8<x3, v3> implements ea {
    private static final x3 zzi;
    private int zza;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        x3 x3Var = new x3();
        zzi = x3Var;
        z8.u(x3.class, x3Var);
    }

    private x3() {
    }

    static /* synthetic */ void D(x3 x3Var, String str) {
        str.getClass();
        x3Var.zza |= 1;
        x3Var.zze = str;
    }

    public final boolean A() {
        return (this.zza & 8) != 0;
    }

    public final int B() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new x3();
        }
        u3 u3Var = null;
        if (i3 == 4) {
            return new v3(u3Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzi;
    }

    public final String x() {
        return this.zze;
    }

    public final boolean y() {
        return this.zzf;
    }

    public final boolean z() {
        return this.zzg;
    }
}
