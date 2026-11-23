package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class e implements com.google.android.gms.measurement.a.a.InterfaceC0126a {
    final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // com.google.android.gms.measurement.internal.c6
    public final void a(String str, String str2, Bundle bundle, long j2) {
        if (str == null || str.equals("crash") || !b.c(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j2);
        bundle2.putBundle("params", bundle);
        this.a.a.a(3, bundle2);
    }
}
