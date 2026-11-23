package j.c.a.e.d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static String a(int i2, Context context) {
        j.c.a.e.l.b.a("Receive Package App ID " + i2);
        for (ApplicationInfo applicationInfo : context.getPackageManager().getInstalledApplications(128)) {
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && Integer.valueOf(bundle.getInt("com.garena.sdk.push.applicationId", -1)).intValue() == i2) {
                j.c.a.e.l.b.a("Found a match for push notification " + applicationInfo.packageName);
                return applicationInfo.packageName;
            }
        }
        return "";
    }
}
