package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class ce implements be {
    public static final p6<Boolean> a;
    public static final p6<Boolean> b;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        n6Var.a("measurement.id.lifecycle.app_in_background_parameter", 0L);
        a = n6Var.b("measurement.lifecycle.app_backgrounded_engagement", false);
        n6Var.b("measurement.lifecycle.app_backgrounded_tracking", true);
        b = n6Var.b("measurement.lifecycle.app_in_background_parameter", false);
        n6Var.a("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.be
    public final boolean zza() {
        return a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.be
    public final boolean zzb() {
        return b.e().booleanValue();
    }
}
