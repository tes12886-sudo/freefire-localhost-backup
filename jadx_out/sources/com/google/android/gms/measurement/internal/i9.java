package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class i9 {
    private final com.google.android.gms.common.util.e a;
    private long b;

    public i9(com.google.android.gms.common.util.e eVar) {
        com.google.android.gms.common.internal.q.k(eVar);
        this.a = eVar;
    }

    public final void a() {
        this.b = this.a.c();
    }

    public final void b() {
        this.b = 0L;
    }

    public final boolean c(long j2) {
        return this.b == 0 || this.a.c() - this.b >= 3600000;
    }
}
