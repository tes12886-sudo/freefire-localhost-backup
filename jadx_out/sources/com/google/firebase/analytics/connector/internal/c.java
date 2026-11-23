package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class c implements com.google.android.gms.measurement.a.a.InterfaceC0126a {
    final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // com.google.android.gms.measurement.internal.c6
    public final void a(String str, String str2, Bundle bundle, long j2) {
        if (this.a.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", b.f(str2));
            this.a.b.a(2, bundle2);
        }
    }
}
