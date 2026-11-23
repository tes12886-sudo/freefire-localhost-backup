package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o5 extends z8<o5, l5> implements ea {
    private static final o5 zzk;
    private int zza;
    private int zze;
    private f9<o5> zzf = z8.p();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        o5 o5Var = new o5();
        zzk = o5Var;
        z8.u(o5.class, o5Var);
    }

    private o5() {
    }

    public final boolean A() {
        return (this.zza & 4) != 0;
    }

    public final String B() {
        return this.zzh;
    }

    public final boolean C() {
        return (this.zza & 8) != 0;
    }

    public final boolean D() {
        return this.zzi;
    }

    public final boolean E() {
        return (this.zza & 16) != 0;
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
            return z8.v(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zza", "zze", n5.c(), "zzf", o5.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new o5();
        }
        e5 e5Var = null;
        if (i3 == 4) {
            return new l5(e5Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzk;
    }

    public final n5 x() {
        n5 n5VarA = n5.a(this.zze);
        return n5VarA == null ? n5.UNKNOWN : n5VarA;
    }

    public final List<o5> y() {
        return this.zzf;
    }

    public final String z() {
        return this.zzg;
    }
}
