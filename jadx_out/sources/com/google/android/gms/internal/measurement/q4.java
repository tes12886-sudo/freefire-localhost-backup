package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q4 extends z8<q4, p4> implements ea {
    private static final q4 zze;
    private f9<s4> zza = z8.p();

    static {
        q4 q4Var = new q4();
        zze = q4Var;
        z8.u(q4.class, q4Var);
    }

    private q4() {
    }

    static /* synthetic */ void B(q4 q4Var, s4 s4Var) {
        s4Var.getClass();
        f9<s4> f9Var = q4Var.zza;
        if (!f9Var.zza()) {
            q4Var.zza = z8.q(f9Var);
        }
        q4Var.zza.add(s4Var);
    }

    public static p4 z() {
        return zze.r();
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", s4.class});
        }
        if (i3 == 3) {
            return new q4();
        }
        c4 c4Var = null;
        if (i3 == 4) {
            return new p4(c4Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zze;
    }

    public final List<s4> x() {
        return this.zza;
    }

    public final s4 y(int i2) {
        return this.zza.get(0);
    }
}
