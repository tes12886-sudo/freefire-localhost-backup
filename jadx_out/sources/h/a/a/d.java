package h.a.a;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import com.appff.haptic.base.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static List<ServiceInfo> a(PackageManager packageManager) {
        int i2 = Build.VERSION.SDK_INT;
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("androidx.ads.identifier.provider.GET_AD_ID"), i2 >= 24 ? 1048576 : 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (i2 >= 24 || d(serviceInfo.packageName, packageManager)) {
                arrayList.add(serviceInfo);
            }
        }
        return arrayList;
    }

    private static boolean b(PackageInfo packageInfo, PackageInfo packageInfo2) {
        boolean zC = c(packageInfo);
        if (zC != c(packageInfo2)) {
            return zC;
        }
        long j2 = packageInfo.firstInstallTime;
        long j3 = packageInfo2.firstInstallTime;
        if (j2 != j3) {
            return j2 < j3;
        }
        return packageInfo.packageName.compareTo(packageInfo2.packageName) < 0;
    }

    private static boolean c(PackageInfo packageInfo) {
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            if ("androidx.ads.identifier.provider.HIGH_PRIORITY".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(String str, PackageManager packageManager) {
        try {
            return (packageManager.getApplicationInfo(str, 0).flags & 1) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static ServiceInfo e(List<ServiceInfo> list, PackageManager packageManager) {
        ServiceInfo serviceInfo = null;
        if (list.isEmpty()) {
            return null;
        }
        PackageInfo packageInfo = null;
        for (ServiceInfo serviceInfo2 : list) {
            try {
                PackageInfo packageInfo2 = packageManager.getPackageInfo(serviceInfo2.packageName, Utils.CONTINUOUS_EVENT);
                if (packageInfo == null || b(packageInfo2, packageInfo)) {
                    serviceInfo = serviceInfo2;
                    packageInfo = packageInfo2;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return serviceInfo;
    }
}
