package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class t2 extends k1 {
    private final com.google.android.gms.measurement.internal.c6 a;

    t2(com.google.android.gms.measurement.internal.c6 c6Var) {
        this.a = c6Var;
    }

    @Override // com.google.android.gms.internal.measurement.l1
    public final void Z(String str, String str2, Bundle bundle, long j2) {
        this.a.a(str, str2, bundle, j2);
    }

    @Override // com.google.android.gms.internal.measurement.l1
    public final int d() {
        return System.identityHashCode(this.a);
    }
}
