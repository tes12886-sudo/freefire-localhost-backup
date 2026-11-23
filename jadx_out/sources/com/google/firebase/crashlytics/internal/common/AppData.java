package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public class AppData {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.j.b f1366g;

    public AppData(String str, String str2, String str3, String str4, String str5, String str6, com.google.firebase.crashlytics.internal.j.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f1366g = bVar;
    }

    public static AppData a(Context context, IdManager idManager, String str, String str2, com.google.firebase.crashlytics.internal.j.b bVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strG = idManager.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new AppData(str, str2, strG, packageName, string, str3, bVar);
    }
}
