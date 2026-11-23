package com.beetalk.sdk.x;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.beetalk.sdk.p;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d {
    private static Integer a;
    private static Boolean b;

    public static com.garena.pay.android.b a(String str) {
        if (TextUtils.isEmpty(str)) {
            return com.garena.pay.android.b.NETWORK_EXCEPTION;
        }
        if (!str.contains("error")) {
            return null;
        }
        if (str.contains("error_params")) {
            return com.garena.pay.android.b.ERROR_IN_PARAMS;
        }
        if (str.contains("error_scope")) {
            return com.garena.pay.android.b.GOP_ERROR_SCOPE;
        }
        if (str.contains("server_error")) {
            return com.garena.pay.android.b.GOP_ERROR_SERVER;
        }
        if (str.contains("error_token")) {
            com.beetalk.sdk.g.b0();
            return com.garena.pay.android.b.GOP_ERROR_TOKEN;
        }
        if (!str.contains("error_token_session")) {
            return com.garena.pay.android.b.UNKNOWN_ERROR;
        }
        com.beetalk.sdk.g.b0();
        return com.garena.pay.android.b.ERROR_TOKEN_SESSION;
    }

    public static com.garena.pay.android.b b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return com.garena.pay.android.b.NETWORK_EXCEPTION;
        }
        String strOptString = jSONObject.optString("error");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        if (strOptString.equals("error_params")) {
            return com.garena.pay.android.b.ERROR_IN_PARAMS;
        }
        if (strOptString.equals("error_scope")) {
            return com.garena.pay.android.b.GOP_ERROR_SCOPE;
        }
        if (strOptString.equals("server_error")) {
            return com.garena.pay.android.b.GOP_ERROR_SERVER;
        }
        if (strOptString.equals("error_token")) {
            com.beetalk.sdk.g.b0();
            return com.garena.pay.android.b.GOP_ERROR_TOKEN;
        }
        if (!strOptString.equals("error_token_session")) {
            return com.garena.pay.android.b.UNKNOWN_ERROR;
        }
        com.beetalk.sdk.g.b0();
        return com.garena.pay.android.b.ERROR_TOKEN_SESSION;
    }

    public static Integer c(Context context) {
        return Integer.valueOf(d(context).getInt("com.garena.sdk.applicationId", -1));
    }

    private static Bundle d(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle;
            }
        } catch (Exception e) {
            a.b(e);
        }
        return new Bundle();
    }

    public static String e(Context context) {
        Integer numC = c(context);
        if (numC.intValue() > 0) {
            return numC.toString();
        }
        a.c("App ID is less than or equal to 0.", new Object[0]);
        return null;
    }

    public static String f(Context context) {
        return d(context).getString("com.garena.sdk.applicationVariant", "");
    }

    public static Integer g(Context context) {
        Integer num = a;
        if (num != null) {
            return num;
        }
        Integer numValueOf = Integer.valueOf(d(context).getInt("com.garena.sdk.ApplicationSourceId", p.a.a.intValue()));
        a = numValueOf;
        return numValueOf;
    }

    public static Boolean h(Context context) {
        Boolean bool = b;
        if (bool != null) {
            return bool;
        }
        Boolean boolValueOf = Boolean.valueOf(d(context).getBoolean("com.garena.sdk.payment.ThirdPartyEnabled", true));
        b = boolValueOf;
        return boolValueOf;
    }

    public static int i(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            return packageManager.getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static String j(Context context) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0) {
                try {
                    byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
                    StringBuffer stringBuffer = new StringBuffer();
                    for (byte b2 : bArrDigest) {
                        String hexString = Integer.toHexString(b2 & 255);
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(":");
                        }
                        if (hexString.length() == 1) {
                            stringBuffer.append("0");
                        }
                        stringBuffer.append(hexString);
                    }
                    return stringBuffer.toString().toUpperCase();
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static int k() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static String l(Context context) {
        return d(context).getString("com.garena.sdk.twitter.key");
    }

    public static String m(Context context) {
        return d(context).getString("com.garena.sdk.twitter.secret");
    }

    public static boolean n(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static boolean o(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean p(String str, Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            return applicationInfo != null && applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean q(Activity activity) {
        return com.beetalk.sdk.i.f(activity, 1) >= 103;
    }

    public static boolean r(Activity activity) {
        return com.beetalk.sdk.i.f(activity, 1) >= 60;
    }
}
