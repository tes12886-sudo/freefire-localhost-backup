package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
class t {
    private String a;

    t() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String a(Context context) {
        if (this.a == null) {
            this.a = b(context);
        }
        return "".equals(this.a) ? null : this.a;
    }
}
