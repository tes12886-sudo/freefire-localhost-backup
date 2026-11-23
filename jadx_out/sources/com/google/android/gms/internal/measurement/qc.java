package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class qc implements pc {
    public static final p6<Long> a;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        n6Var.b("measurement.client.consent_state_v1", true);
        n6Var.b("measurement.client.3p_consent_state_v1", true);
        n6Var.b("measurement.service.consent_state_v1_W36", true);
        n6Var.a("measurement.id.service.consent_state_v1_W36", 0L);
        a = n6Var.a("measurement.service.storage_consent_support_version", 203590L);
    }

    @Override // com.google.android.gms.internal.measurement.pc
    public final long zza() {
        return a.e().longValue();
    }
}
