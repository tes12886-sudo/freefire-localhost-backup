package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class fe implements ee {
    public static final p6<Boolean> a;
    public static final p6<Boolean> b;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        a = n6Var.b("measurement.sdk.screen.manual_screen_view_logging", true);
        b = n6Var.b("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    @Override // com.google.android.gms.internal.measurement.ee
    public final boolean b() {
        return b.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ee
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ee
    public final boolean zzb() {
        return a.e().booleanValue();
    }
}
