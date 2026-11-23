package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class gd implements fd {
    public static final p6<Boolean> a;
    public static final p6<Boolean> b;
    public static final p6<Boolean> c;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        n6Var.b("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = n6Var.b("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = n6Var.b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = n6Var.b("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.fd
    public final boolean b() {
        return b.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.fd
    public final boolean c() {
        return c.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.fd
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.fd
    public final boolean zzb() {
        return a.e().booleanValue();
    }
}
