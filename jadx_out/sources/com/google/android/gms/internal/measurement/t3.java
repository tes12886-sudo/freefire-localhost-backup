package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t3 extends z8<t3, q3> implements ea {
    private static final t3 zzi;
    private int zza;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private f9<String> zzh = z8.p();

    static {
        t3 t3Var = new t3();
        zzi = t3Var;
        z8.u(t3.class, t3Var);
    }

    private t3() {
    }

    public static t3 G() {
        return zzi;
    }

    public final String A() {
        return this.zzf;
    }

    public final boolean B() {
        return (this.zza & 4) != 0;
    }

    public final boolean C() {
        return this.zzg;
    }

    public final List<String> D() {
        return this.zzh;
    }

    public final int E() {
        return this.zzh.size();
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zza", "zze", s3.c(), "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new t3();
        }
        d3 d3Var = null;
        if (i3 == 4) {
            return new q3(d3Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzi;
    }

    public final boolean x() {
        return (this.zza & 1) != 0;
    }

    public final s3 y() {
        s3 s3VarA = s3.a(this.zze);
        return s3VarA == null ? s3.UNKNOWN_MATCH_TYPE : s3VarA;
    }

    public final boolean z() {
        return (this.zza & 2) != 0;
    }
}
