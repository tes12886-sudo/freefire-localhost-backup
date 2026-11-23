package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes.dex */
final class u {

    static final class a {
        final String AFInAppEventParameterName;
        final String AFKeystoreWrapper;
        final String values;

        a(String str, String str2, String str3) {
            this.AFInAppEventParameterName = str;
            this.AFKeystoreWrapper = str2;
            this.values = str3;
        }
    }

    static final class b {
        static final u valueOf = new u();
    }

    u() {
    }

    private static boolean AFInAppEventType(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    static a valueOf(Context context) {
        String str;
        String simOperatorName;
        TelephonyManager telephonyManager;
        String str2 = "unknown";
        String networkOperatorName = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            try {
                if (connectivityManager != null) {
                    if (21 > Build.VERSION.SDK_INT) {
                        if (AFInAppEventType(connectivityManager.getNetworkInfo(1))) {
                            str2 = "WIFI";
                            break;
                        }
                        if (AFInAppEventType(connectivityManager.getNetworkInfo(0))) {
                            str2 = "MOBILE";
                            break;
                        }
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (AFInAppEventType(activeNetworkInfo)) {
                            if (1 == activeNetworkInfo.getType()) {
                                str2 = "WIFI";
                                break;
                            }
                            if (activeNetworkInfo.getType() == 0) {
                                str2 = "MOBILE";
                                break;
                            }
                            return new a(str2, networkOperatorName, simOperatorName);
                        }
                    } else {
                        for (Network network : connectivityManager.getAllNetworks()) {
                            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                            if (AFInAppEventType(networkInfo)) {
                                if (1 == networkInfo.getType()) {
                                    str2 = "WIFI";
                                    break;
                                }
                                if (networkInfo.getType() == 0) {
                                    str2 = "MOBILE";
                                    break;
                                }
                                return new a(str2, networkOperatorName, simOperatorName);
                            }
                        }
                    }
                }
                networkOperatorName = telephonyManager.getNetworkOperatorName();
                if ((networkOperatorName == null || networkOperatorName.isEmpty()) && 2 == telephonyManager.getPhoneType()) {
                    networkOperatorName = "CDMA";
                }
            } catch (Throwable th) {
                th = th;
                str = networkOperatorName;
                networkOperatorName = simOperatorName;
                AFLogger.valueOf("Exception while collecting network info. ", th);
                String str3 = str;
                simOperatorName = networkOperatorName;
                networkOperatorName = str3;
            }
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            simOperatorName = telephonyManager.getSimOperatorName();
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
        return new a(str2, networkOperatorName, simOperatorName);
    }
}
