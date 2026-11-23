package com.garena.unity.webview;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.unity3d.player.UnityPlayer;
import h.d.b.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CustomTabsManager {
    public static void openCustomTabs(String str) {
        try {
            new d.a().a().a(UnityPlayer.currentActivity, Uri.parse(str));
        } catch (Error | Exception unused) {
        }
    }

    public static boolean supportCustomTabs() {
        try {
            PackageManager packageManager = UnityPlayer.currentActivity.getPackageManager();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null)), 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent = new Intent();
                intent.setAction("android.support.customtabs.action.CustomTabsService");
                intent.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent, 0) != null) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList.size() > 0;
        } catch (Error | Exception unused) {
            return false;
        }
    }
}
