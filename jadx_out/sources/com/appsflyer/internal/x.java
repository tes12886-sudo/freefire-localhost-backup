package com.appsflyer.internal;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

/* JADX INFO: loaded from: classes.dex */
final class x {

    static final class d {
        static final x AFInAppEventType = new x();
    }

    x() {
    }

    private static boolean AFKeystoreWrapper(Context context, String[] strArr) {
        for (String str : strArr) {
            if (ac.AFKeystoreWrapper(context, str)) {
                return true;
            }
        }
        return false;
    }

    final Location AFInAppEventType(Context context) {
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            Location lastKnownLocation = AFKeystoreWrapper(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}) ? locationManager.getLastKnownLocation("network") : null;
            Location lastKnownLocation2 = AFKeystoreWrapper(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"}) ? locationManager.getLastKnownLocation("gps") : null;
            if (lastKnownLocation2 == null && lastKnownLocation == null) {
                lastKnownLocation = null;
            } else if ((lastKnownLocation2 != null || lastKnownLocation == null) && ((lastKnownLocation == null && lastKnownLocation2 != null) || 60000 >= lastKnownLocation.getTime() - lastKnownLocation2.getTime())) {
                lastKnownLocation = lastKnownLocation2;
            }
            if (lastKnownLocation != null) {
                return lastKnownLocation;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
