package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class tc implements sc {
    public static final p6<Boolean> a;
    public static final p6<Boolean> b;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        a = n6Var.b("measurement.euid.client.dev", false);
        b = n6Var.b("measurement.euid.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final boolean zza() {
        return a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final boolean zzb() {
        return b.e().booleanValue();
    }
}
