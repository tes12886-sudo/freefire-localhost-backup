package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class le implements ke {
    public static final p6<Boolean> a;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        a = n6Var.b("measurement.validation.internal_limits_internal_event_params", false);
        n6Var.a("measurement.id.validation.internal_limits_internal_event_params", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final boolean zza() {
        return a.e().booleanValue();
    }
}
