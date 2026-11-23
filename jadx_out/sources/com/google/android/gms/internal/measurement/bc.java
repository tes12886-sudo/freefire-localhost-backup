package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class bc implements ac {
    public static final p6<Boolean> a;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        a = n6Var.b("measurement.androidId.delete_feature", true);
        n6Var.b("measurement.log_androidId_enabled", false);
    }

    @Override // com.google.android.gms.internal.measurement.ac
    public final boolean zza() {
        return a.e().booleanValue();
    }
}
