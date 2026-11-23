package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class b7 implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ Uri b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ c7 e;

    b7(c7 c7Var, boolean z, Uri uri, String str, String str2) {
        this.e = c7Var;
        this.a = z;
        this.b = uri;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005c  */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleK0;
        Bundle bundleK1;
        c7 c7Var = this.e;
        boolean z = this.a;
        Uri uri = this.b;
        String str = this.c;
        String str2 = this.d;
        c7Var.a.h();
        try {
            f fVarZ = c7Var.a.a.z();
            d3<Boolean> d3Var = f3.c0;
            if (fVarZ.w(null, d3Var) || c7Var.a.a.z().w(null, f3.e0) || c7Var.a.a.z().w(null, f3.d0)) {
                ca caVarG = c7Var.a.a.G();
                if (TextUtils.isEmpty(str2)) {
                    bundleK0 = null;
                } else if (str2.contains("gclid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium")) {
                    String strValueOf = String.valueOf(str2);
                    bundleK0 = caVarG.k0(Uri.parse(strValueOf.length() != 0 ? "https://google.com/search?".concat(strValueOf) : new String("https://google.com/search?")));
                    if (bundleK0 != null) {
                        bundleK0.putString("_cis", "referrer");
                    }
                } else {
                    caVarG.a.d().v().a("Activity created with data 'referrer' without required params");
                    bundleK0 = null;
                }
            } else {
                bundleK0 = null;
            }
            if (z) {
                bundleK1 = c7Var.a.a.G().k0(uri);
                if (bundleK1 != null) {
                    bundleK1.putString("_cis", "intent");
                    if (c7Var.a.a.z().w(null, d3Var) && !bundleK1.containsKey("gclid") && bundleK0 != null && bundleK0.containsKey("gclid")) {
                        bundleK1.putString("_cer", String.format("gclid=%s", bundleK0.getString("gclid")));
                    }
                    c7Var.a.X(str, "_cmp", bundleK1);
                    c7Var.a.f1190n.b(str, bundleK1);
                }
            } else {
                bundleK1 = null;
            }
            if (c7Var.a.a.z().w(null, f3.e0) && !c7Var.a.a.z().w(null, f3.d0) && bundleK0 != null && bundleK0.containsKey("gclid") && (bundleK1 == null || !bundleK1.containsKey("gclid"))) {
                c7Var.a.c0("auto", "_lgclid", bundleK0.getString("gclid"), true);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            c7Var.a.a.d().v().b("Activity created with referrer", str2);
            if (c7Var.a.a.z().w(null, f3.d0)) {
                if (bundleK0 != null) {
                    c7Var.a.X(str, "_cmp", bundleK0);
                    c7Var.a.f1190n.b(str, bundleK0);
                } else {
                    c7Var.a.a.d().v().b("Referrer does not contain valid parameters", str2);
                }
                c7Var.a.c0("auto", "_ldl", null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                c7Var.a.a.d().v().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                c7Var.a.c0("auto", "_ldl", str2, true);
            }
        } catch (RuntimeException e) {
            c7Var.a.a.d().o().b("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }
}
