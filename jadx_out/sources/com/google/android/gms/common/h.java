package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class h {

    @Nullable
    private static h c;
    private final Context a;
    private volatile String b;

    public h(Context context) {
        this.a = context.getApplicationContext();
    }

    public static h a(Context context) {
        com.google.android.gms.common.internal.q.k(context);
        synchronized (h.class) {
            if (c == null) {
                e0.d(context);
                c = new h(context);
            }
        }
        return c;
    }

    @Nullable
    static final a0 d(PackageInfo packageInfo, a0... a0VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        b0 b0Var = new b0(packageInfo.signatures[0].toByteArray());
        for (int i2 = 0; i2 < a0VarArr.length; i2++) {
            if (a0VarArr[i2].equals(b0Var)) {
                return a0VarArr[i2];
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z) {
        if (z && packageInfo != null && (GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE.equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? d(packageInfo, d0.a) : d(packageInfo, d0.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final o0 f(String str, boolean z, boolean z2) {
        o0 o0VarC;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return o0.c("null pkg");
        }
        if (str.equals(this.b)) {
            return o0.b();
        }
        if (e0.e()) {
            o0VarC = e0.b(str, g.h(this.a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 64);
                boolean zH = g.h(this.a);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        b0 b0Var = new b0(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        o0 o0VarA = e0.a(str3, b0Var, zH, false);
                        if (!o0VarA.a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !e0.a(str3, b0Var, false, true).a) {
                            o0VarC = o0VarA;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                    o0VarC = o0.c(str2);
                } else {
                    o0VarC = o0.c(str2);
                }
            } catch (PackageManager.NameNotFoundException e) {
                return o0.d("no pkg ".concat(str), e);
            }
        }
        if (o0VarC.a) {
            this.b = str;
        }
        return o0VarC;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (g.h(this.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i2) {
        o0 o0VarC;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i2);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            o0VarC = o0.c("no pkgs");
        } else {
            o0VarC = null;
            for (String str : packagesForUid) {
                o0VarC = f(str, false, false);
                if (!o0VarC.a) {
                }
            }
            com.google.android.gms.common.internal.q.k(o0VarC);
        }
        o0VarC.e();
        return o0VarC.a;
    }
}
