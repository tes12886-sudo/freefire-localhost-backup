package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class m4 extends z8<m4, l4> implements ea {
    private static final m4 zzg;
    private int zza;
    private String zze = "";
    private long zzf;

    static {
        m4 m4Var = new m4();
        zzg = m4Var;
        z8.u(m4.class, m4Var);
    }

    private m4() {
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new m4();
        }
        c4 c4Var = null;
        if (i3 == 4) {
            return new l4(c4Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}
