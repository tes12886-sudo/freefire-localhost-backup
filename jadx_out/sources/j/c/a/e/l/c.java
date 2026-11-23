package j.c.a.e.l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static long a(Context context) {
        String string;
        String deviceId = "";
        String strF = j.c.a.e.i.a.f(context);
        if (!TextUtils.isEmpty(strF)) {
            try {
                return Long.parseLong(strF);
            } catch (NumberFormatException e) {
                b.b(e);
            }
        }
        try {
            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e2) {
            b.b(e2);
            string = "";
        }
        if (e(context)) {
            try {
                deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            } catch (Exception e3) {
                b.b(e3);
            }
        }
        long jAbs = Math.abs(((TextUtils.isEmpty(string) ? UUID.randomUUID().hashCode() : c(string)) * 31) + (TextUtils.isEmpty(deviceId) ? UUID.randomUUID().hashCode() : c(deviceId)));
        j.c.a.e.i.a.l(context, jAbs);
        return jAbs;
    }

    public static long b(Context context) {
        try {
            return j.c.a.e.i.a.e(context);
        } catch (NumberFormatException e) {
            b.b(e);
            return -1L;
        }
    }

    private static long c(String str) {
        int length = str.length();
        long jCharAt = 1125899906842573L;
        for (int i2 = 0; i2 < length; i2++) {
            jCharAt = (jCharAt * 31) + ((long) str.charAt(i2));
        }
        return jCharAt;
    }

    public static boolean d(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        boolean z = false;
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
        if ((networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) || (networkInfo2 != null && networkInfo2.getState() == NetworkInfo.State.CONNECTED)) {
            z = true;
        }
        b.a("Connected To Network: " + z);
        return z;
    }

    private static boolean e(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0;
    }
}
