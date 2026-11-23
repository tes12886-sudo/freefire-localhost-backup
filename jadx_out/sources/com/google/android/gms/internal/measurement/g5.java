package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g5 extends z8<g5, f5> implements ea {
    private static final g5 zze;
    private f9<i5> zza = z8.p();

    static {
        g5 g5Var = new g5();
        zze = g5Var;
        z8.u(g5.class, g5Var);
    }

    private g5() {
    }

    public static g5 z() {
        return zze;
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", i5.class});
        }
        if (i3 == 3) {
            return new g5();
        }
        e5 e5Var = null;
        if (i3 == 4) {
            return new f5(e5Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zze;
    }

    public final List<i5> x() {
        return this.zza;
    }

    public final int y() {
        return this.zza.size();
    }
}
