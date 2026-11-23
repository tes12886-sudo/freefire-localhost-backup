package com.beetalk.sdk.account;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT < 30) {
            com.beetalk.sdk.x.a.c("Your device is below Android 11!", new Object[0]);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(activity, MigrateGuestActivity.class);
        intent.putExtra("RequestCode", 3001);
        activity.startActivityForResult(intent, 3001);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT < 30) {
            com.beetalk.sdk.x.a.c("Your device is below Android 11!", new Object[0]);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(activity, MigrateGuestActivity.class);
        intent.putExtra("RequestCode", 2001);
        activity.startActivityForResult(intent, 2001);
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT < 30) {
            com.beetalk.sdk.x.a.c("Your device is below Android 11!", new Object[0]);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(activity, MigrateGuestActivity.class);
        intent.putExtra("RequestCode", 1001);
        activity.startActivityForResult(intent, 1001);
    }

    public static void d(Activity activity) {
        if (Build.VERSION.SDK_INT < 30) {
            com.beetalk.sdk.x.a.c("Your device is below Android 11!", new Object[0]);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(activity, MigrateGuestActivity.class);
        intent.putExtra("RequestCode", 4001);
        activity.startActivityForResult(intent, 4001);
    }
}
