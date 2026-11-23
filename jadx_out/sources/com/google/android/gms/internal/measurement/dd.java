package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class dd implements cd {
    public static final p6<Boolean> a = new n6(g6.a("com.google.android.gms.measurement")).b("measurement.client.consent.suppress_1p_in_ga4f_install", true);

    @Override // com.google.android.gms.internal.measurement.cd
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.cd
    public final boolean zzb() {
        return a.e().booleanValue();
    }
}
