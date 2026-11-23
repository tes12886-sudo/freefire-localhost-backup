package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class i4 implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.t0 a;
    final /* synthetic */ ServiceConnection b;
    final /* synthetic */ j4 c;

    i4(j4 j4Var, com.google.android.gms.internal.measurement.t0 t0Var, ServiceConnection serviceConnection) {
        this.c = j4Var;
        this.a = t0Var;
        this.b = serviceConnection;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010f  */
    /* JADX WARN: Code duplicated, block: B:42:0x011d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0125  */
    @Override // java.lang.Runnable
    public final void run() {
        p3 p3VarO;
        String str;
        j4 j4Var = this.c;
        k4 k4Var = j4Var.b;
        String str2 = j4Var.a;
        com.google.android.gms.internal.measurement.t0 t0Var = this.a;
        ServiceConnection serviceConnection = this.b;
        k4Var.a.f().h();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str2);
        Bundle bundle2 = null;
        try {
            Bundle bundleI0 = t0Var.I0(bundle);
            if (bundleI0 == null) {
                k4Var.a.d().o().a("Install Referrer Service returned a null response");
            } else {
                bundle2 = bundleI0;
            }
        } catch (Exception e) {
            k4Var.a.d().o().b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        k4Var.a.f().h();
        if (bundle2 != null) {
            long j2 = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j2 == 0) {
                p3VarO = k4Var.a.d().r();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    p3VarO = k4Var.a.d().o();
                    str = "No referrer defined in Install Referrer response";
                } else {
                    k4Var.a.d().w().b("InstallReferrer API result", string);
                    Bundle bundleK0 = k4Var.a.G().k0(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                    if (bundleK0 == null) {
                        p3VarO = k4Var.a.d().o();
                        str = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = bundleK0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j3 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j3 == 0) {
                                p3VarO = k4Var.a.d().o();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                bundleK0.putLong("click_timestamp", j3);
                                if (j2 == k4Var.a.A().f.a()) {
                                    p3VarO = k4Var.a.d().w();
                                    str = "Install Referrer campaign has already been logged";
                                } else if (k4Var.a.k()) {
                                    k4Var.a.A().f.b(j2);
                                    k4Var.a.d().w().b("Logging Install Referrer campaign from sdk with ", "referrer API");
                                    bundleK0.putString("_cis", "referrer API");
                                    k4Var.a.F().X("auto", "_cmp", bundleK0);
                                }
                            }
                        } else if (j2 == k4Var.a.A().f.a()) {
                            p3VarO = k4Var.a.d().w();
                            str = "Install Referrer campaign has already been logged";
                        } else if (k4Var.a.k()) {
                            k4Var.a.A().f.b(j2);
                            k4Var.a.d().w().b("Logging Install Referrer campaign from sdk with ", "referrer API");
                            bundleK0.putString("_cis", "referrer API");
                            k4Var.a.F().X("auto", "_cmp", bundleK0);
                        }
                    }
                }
            }
            p3VarO.a(str);
        }
        com.google.android.gms.common.n.a.b().c(k4Var.a.c(), serviceConnection);
    }
}
