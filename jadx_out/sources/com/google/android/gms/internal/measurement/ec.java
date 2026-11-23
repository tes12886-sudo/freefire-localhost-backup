package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class ec implements dc {
    public static final p6<Boolean> a;
    public static final p6<Boolean> b;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        a = n6Var.b("measurement.frontend.directly_maybe_log_error_events", false);
        b = n6Var.b("measurement.upload.directly_maybe_log_error_events", true);
        n6Var.a("measurement.id.frontend.directly_maybe_log_error_events", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.dc
    public final boolean zza() {
        return a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.dc
    public final boolean zzb() {
        return b.e().booleanValue();
    }
}
