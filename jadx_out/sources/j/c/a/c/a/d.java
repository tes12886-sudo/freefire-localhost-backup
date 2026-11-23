package j.c.a.c.a;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailability;

/* JADX INFO: loaded from: classes.dex */
public class d {
    private static volatile boolean a;
    private static volatile boolean b;

    private static boolean a() {
        try {
            Class.forName("com.google.android.gms.common.GoogleApiAvailability");
            return true;
        } catch (ClassNotFoundException unused) {
            if (!c.c) {
                return false;
            }
            Log.e(c.a, "google play service not available");
            return false;
        }
    }

    public static boolean b(Context context) {
        if (!a) {
            synchronized (d.class) {
                if (!a) {
                    a = true;
                    b = a();
                }
            }
        }
        return b && GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }
}
