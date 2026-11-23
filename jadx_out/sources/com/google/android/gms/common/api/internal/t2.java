package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
final class t2 {
    private final int a;
    private final ConnectionResult b;

    t2(ConnectionResult connectionResult, int i2) {
        com.google.android.gms.common.internal.q.k(connectionResult);
        this.b = connectionResult;
        this.a = i2;
    }

    final int a() {
        return this.a;
    }

    final ConnectionResult b() {
        return this.b;
    }
}
