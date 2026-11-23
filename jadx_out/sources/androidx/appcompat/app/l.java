package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
class l {
    private static l d;
    private final Context a;
    private final LocationManager b;
    private final a c = new a();

    private static class a {
        boolean a;
        long b;
        long c;
        long d;
        long e;
        long f;

        a() {
        }
    }

    l(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    static l a(Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location locationC = androidx.core.content.c.b(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = androidx.core.content.c.b(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    private boolean e() {
        return this.c.f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j2;
        long j3;
        a aVar = this.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        k kVarB = k.b();
        kVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j4 = kVarB.a;
        kVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = kVarB.c == 1;
        long j5 = kVarB.b;
        long j6 = kVarB.a;
        boolean z2 = z;
        kVarB.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = kVarB.b;
        if (j5 == -1 || j6 == -1) {
            j2 = 43200000 + jCurrentTimeMillis;
        } else {
            if (jCurrentTimeMillis > j6) {
                j3 = 0 + j7;
            } else {
                j3 = jCurrentTimeMillis > j5 ? 0 + j6 : 0 + j5;
            }
            j2 = j3 + 60000;
        }
        aVar.a = z2;
        aVar.b = j4;
        aVar.c = j5;
        aVar.d = j6;
        aVar.e = j7;
        aVar.f = j2;
    }

    boolean d() {
        a aVar = this.c;
        if (e()) {
            return aVar.a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i2 = Calendar.getInstance().get(11);
        return i2 < 6 || i2 >= 22;
    }
}
