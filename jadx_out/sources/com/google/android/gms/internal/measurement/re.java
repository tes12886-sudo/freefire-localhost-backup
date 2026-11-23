package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class re implements qe {
    public static final p6<Boolean> a;
    public static final p6<Double> b;
    public static final p6<Long> c;
    public static final p6<Long> d;
    public static final p6<String> e;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        a = n6Var.b("measurement.test.boolean_flag", false);
        b = n6Var.c("measurement.test.double_flag", -3.0d);
        c = n6Var.a("measurement.test.int_flag", -2L);
        d = n6Var.a("measurement.test.long_flag", -1L);
        e = n6Var.d("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.qe
    public final long b() {
        return c.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.qe
    public final long c() {
        return d.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.qe
    public final String d() {
        return e.e();
    }

    @Override // com.google.android.gms.internal.measurement.qe
    public final boolean zza() {
        return a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.qe
    public final double zzb() {
        return b.e().doubleValue();
    }
}
