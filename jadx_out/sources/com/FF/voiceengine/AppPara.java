package com.FF.voiceengine;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale", "NewApi"})
public class AppPara {
    private static String mAppVersionString = "";
    private static String mDeviceIMEIString = null;
    private static String mDocumentPathString = null;
    private static int mNetWorkType = -1;
    private static String mPackageNameString = null;
    private static String mSysNameString = "Android";
    private static String mSysVersionString = "";
    private static String mUUIDString;

    private static String atest(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append((char) (str.charAt(i2) ^ 18));
        }
        return sb.toString();
    }

    public static String getAppVersion() {
        return mAppVersionString;
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getDeviceIMEI() {
        return mDeviceIMEIString;
    }

    public static String getDocumentPath() {
        return mDocumentPathString;
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static int getNetWorkType() {
        return mNetWorkType;
    }

    public static String getPackageName() {
        return mPackageNameString;
    }

    public static String getSysName() {
        return mSysNameString;
    }

    public static String getSysVersion() {
        return mSysVersionString;
    }

    public static String getUUID() {
        return mUUIDString;
    }

    public static void initPara(Context context) {
        try {
            String packageName = context.getPackageName();
            mPackageNameString = packageName;
            if (packageName != null) {
                NativeEngine.setPackageName(packageName);
            }
            NativeEngine.setModel(Build.MODEL);
            NativeEngine.setBrand(Build.BRAND);
            NativeEngine.setCPUArch(Build.CPU_ABI);
            NativeEngine.setCPUChip(Build.HARDWARE);
            if (mDeviceIMEIString == null) {
                mDeviceIMEIString = "";
            }
            NativeEngine.setDeviceIMEI(mDeviceIMEIString);
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("FFVoiceCommon", 0);
                String string = sharedPreferences.getString("uuid", "");
                if (string.length() == 0) {
                    String str = mDeviceIMEIString;
                    string = (str == null || str.length() == 0) ? UUID.randomUUID().toString() : mDeviceIMEIString;
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString("uuid", string);
                    editorEdit.commit();
                }
                mUUIDString = string;
                NativeEngine.setUUID(string);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            String str2 = mSysNameString;
            if (str2 != null) {
                NativeEngine.setSysName(str2);
            }
            String str3 = Build.VERSION.RELEASE;
            mSysVersionString = str3;
            if (str3 != null) {
                NativeEngine.setSysVersion(str3);
            }
            try {
                String str4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                mAppVersionString = str4;
                if (str4 != null) {
                    NativeEngine.setVersionName(str4);
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
            try {
                onNetWorkChange(NetUtil.getNetworkState(context));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            String string2 = context.getExternalFilesDir("").toString();
            mDocumentPathString = string2;
            if (string2 != null) {
                NativeEngine.setDocumentPath(string2);
            }
        } catch (Exception unused) {
        }
    }

    public static void onHeadSetPlugin(int i2) {
        NativeEngine.onHeadSetPlugin(i2);
    }

    public static void onNetWorkChange(int i2) {
        mNetWorkType = i2;
        NativeEngine.onNetWorkChanged(i2);
    }
}
