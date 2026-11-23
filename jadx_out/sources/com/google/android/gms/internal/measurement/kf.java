package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class kf implements jf {
    public static final p6<Boolean> a = new n6(g6.a("com.google.android.gms.measurement")).b("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.jf
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final boolean zzb() {
        return a.e().booleanValue();
    }
}
