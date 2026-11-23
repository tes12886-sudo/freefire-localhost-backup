package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class b4 extends z8<b4, a4> implements ea {
    private static final b4 zzg;
    private int zza;
    private String zze = "";
    private String zzf = "";

    static {
        b4 b4Var = new b4();
        zzg = b4Var;
        z8.u(b4.class, b4Var);
    }

    private b4() {
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zza", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new b4();
        }
        u3 u3Var = null;
        if (i3 == 4) {
            return new a4(u3Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final String x() {
        return this.zze;
    }

    public final String y() {
        return this.zzf;
    }
}
