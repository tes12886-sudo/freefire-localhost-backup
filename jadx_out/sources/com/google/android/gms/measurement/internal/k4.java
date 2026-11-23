package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* JADX INFO: loaded from: classes.dex */
public final class k4 {
    final a5 a;

    k4(a5 a5Var) {
        this.a = a5Var;
    }

    final boolean a() {
        try {
            com.google.android.gms.common.o.b bVarA = com.google.android.gms.common.o.c.a(this.a.c());
            if (bVarA != null) {
                return bVarA.e(GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE, 128).versionCode >= 80837300;
            }
            this.a.d().w().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.a.d().w().b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
