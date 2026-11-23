package com.google.firebase.crashlytics;

import android.os.Bundle;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class f implements com.google.firebase.analytics.a.a.b {
    private com.google.firebase.crashlytics.internal.analytics.a a;
    private com.google.firebase.crashlytics.internal.analytics.a b;

    f() {
    }

    private static void b(com.google.firebase.crashlytics.internal.analytics.a aVar, String str, Bundle bundle) {
        if (aVar == null) {
            return;
        }
        aVar.n(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.a : this.b, str, bundle);
    }

    @Override // com.google.firebase.analytics.a.a.b
    public void a(int i2, Bundle bundle) {
        String string;
        com.google.firebase.crashlytics.internal.a.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i2), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(com.google.firebase.crashlytics.internal.analytics.a aVar) {
        this.b = aVar;
    }

    public void e(com.google.firebase.crashlytics.internal.analytics.a aVar) {
        this.a = aVar;
    }
}
