package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends z8<n3, k3> implements ea {
    private static final n3 zzj;
    private int zza;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        n3 n3Var = new n3();
        zzj = n3Var;
        z8.u(n3.class, n3Var);
    }

    private n3() {
    }

    public static n3 I() {
        return zzj;
    }

    public final boolean A() {
        return this.zzf;
    }

    public final boolean B() {
        return (this.zza & 4) != 0;
    }

    public final String C() {
        return this.zzg;
    }

    public final boolean D() {
        return (this.zza & 8) != 0;
    }

    public final String E() {
        return this.zzh;
    }

    public final boolean G() {
        return (this.zza & 16) != 0;
    }

    public final String H() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zza", "zze", m3.c(), "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new n3();
        }
        d3 d3Var = null;
        if (i3 == 4) {
            return new k3(d3Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzj;
    }

    public final boolean x() {
        return (this.zza & 1) != 0;
    }

    public final m3 y() {
        m3 m3VarA = m3.a(this.zze);
        return m3VarA == null ? m3.UNKNOWN_COMPARISON_TYPE : m3VarA;
    }

    public final boolean z() {
        return (this.zza & 2) != 0;
    }
}
