package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class pd implements od {
    public static final p6<Boolean> a;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        n6Var.b("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        a = n6Var.b("measurement.collection.redundant_engagement_removal_enabled", false);
        n6Var.a("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.od
    public final boolean zza() {
        return a.e().booleanValue();
    }
}
