package com.FF.voiceengine;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes.dex */
public class NetUtil {
    public static final int NETWORK_TYPE_MOBILE = 2;
    public static final int NETWORK_TYPE_NO = -1;
    public static final int NETWORK_TYPE_WIFI = 1;

    public static int getNetworkState(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                return 1;
            }
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
            return (networkInfo2 == null || networkInfo2.getState() != NetworkInfo.State.CONNECTED) ? -1 : 2;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }
}
