package com.vk.sdk.m;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.vk.sdk.k.d;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static Map<String, String> a(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("&");
        HashMap map = new HashMap(strArrSplit.length);
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split("=");
            map.put(strArrSplit2[0], strArrSplit2[1]);
        }
        return map;
    }

    public static String b(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "(unknown)");
        } catch (Exception unused) {
            return null;
        }
    }

    public static String[] c(Context context, String str) {
        if (context != null) {
            try {
                if (context.getPackageManager() != null) {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
                    String[] strArr = new String[signatureArr.length];
                    int length = signatureArr.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        Signature signature = signatureArr[i2];
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                        messageDigest.update(signature.toByteArray());
                        int i4 = i3 + 1;
                        strArr[i3] = j(messageDigest.digest());
                        i2++;
                        i3 = i4;
                    }
                    return strArr;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String d(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int iIndexOf = str.indexOf("//");
        int i2 = iIndexOf == -1 ? 0 : iIndexOf + 2;
        int iIndexOf2 = str.indexOf(47, i2);
        if (iIndexOf2 < 0) {
            iIndexOf2 = str.length();
        }
        int iIndexOf3 = str.indexOf(58, i2);
        if (iIndexOf3 > 0 && iIndexOf3 < iIndexOf2) {
            iIndexOf2 = iIndexOf3;
        }
        return str.substring(i2, iIndexOf2);
    }

    public static boolean e(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean f(Context context, String str) {
        return context.getPackageManager().queryIntentActivities(new Intent(str), 65536).size() > 0;
    }

    public static Map<String, Object> g(Object... objArr) {
        int length = objArr.length % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(objArr.length / 2);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= objArr.length) {
                return linkedHashMap;
            }
            if (objArr[i2] != null && objArr[i3] != null && (objArr[i2] instanceof String)) {
                linkedHashMap.put((String) objArr[i2], objArr[i3]);
            }
            i2 += 2;
        }
    }

    public static String h(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static d i(Object... objArr) {
        return new d(g(objArr));
    }

    private static String j(byte[] bArr) {
        return String.format("%0" + (bArr.length << 1) + "X", new BigInteger(1, bArr));
    }
}
