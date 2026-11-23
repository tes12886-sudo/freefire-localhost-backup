package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class md implements ld {
    public static final p6<Boolean> a;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        a = n6Var.b("measurement.client.sessions.check_on_reset_and_enable2", true);
        n6Var.b("measurement.client.sessions.check_on_startup", true);
        n6Var.b("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final boolean zzb() {
        return a.e().booleanValue();
    }
}
