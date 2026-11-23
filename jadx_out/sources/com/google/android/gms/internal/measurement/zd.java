package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zd implements xd {
    public static final p6<Boolean> a;
    public static final p6<Boolean> b;
    public static final p6<Boolean> c;
    public static final p6<Boolean> d;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        a = n6Var.b("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = n6Var.b("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = n6Var.b("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = n6Var.b("measurement.sdk.collection.last_gclid_from_referrer2", false);
        n6Var.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.xd
    public final boolean b() {
        return c.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.xd
    public final boolean c() {
        return d.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.xd
    public final boolean zza() {
        return a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.xd
    public final boolean zzb() {
        return b.e().booleanValue();
    }
}
