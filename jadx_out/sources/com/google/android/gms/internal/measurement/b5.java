package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b5 extends z8<b5, a5> implements ea {
    private static final b5 zzg;
    private int zza;
    private int zze;
    private e9 zzf = z8.n();

    static {
        b5 b5Var = new b5();
        zzg = b5Var;
        z8.u(b5.class, b5Var);
    }

    private b5() {
    }

    public static a5 C() {
        return zzg.r();
    }

    static /* synthetic */ void E(b5 b5Var, int i2) {
        b5Var.zza |= 1;
        b5Var.zze = i2;
    }

    static /* synthetic */ void G(b5 b5Var, Iterable iterable) {
        e9 e9Var = b5Var.zzf;
        if (!e9Var.zza()) {
            b5Var.zzf = z8.o(e9Var);
        }
        l7.j(iterable, b5Var.zzf);
    }

    public final int A() {
        return this.zzf.size();
    }

    public final long B(int i2) {
        return this.zzf.p(i2);
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zza", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new b5();
        }
        c4 c4Var = null;
        if (i3 == 4) {
            return new a5(c4Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final boolean x() {
        return (this.zza & 1) != 0;
    }

    public final int y() {
        return this.zze;
    }

    public final List<Long> z() {
        return this.zzf;
    }
}
