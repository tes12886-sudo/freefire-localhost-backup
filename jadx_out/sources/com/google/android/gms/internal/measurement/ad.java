package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class ad implements zc {
    public static final p6<Boolean> a = new n6(g6.a("com.google.android.gms.measurement")).b("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.zc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final boolean zzb() {
        return a.e().booleanValue();
    }
}
