package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class aj {
    private static aj AFInAppEventParameterName = null;
    private static String valueOf = "https://%smonitorsdk.%s/remote-debug?app_id=";
    private JSONObject AFInAppEventType;
    private int AFLogger$LogLevel;
    private boolean AppsFlyer2dXConversionCallback;
    private boolean init;
    boolean values;
    private boolean AFKeystoreWrapper = true;
    private final List<String> AFVersionDeclaration = new ArrayList();
    private String getLevel = "-1";

    private aj() {
        this.AFLogger$LogLevel = 0;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
        this.AppsFlyer2dXConversionCallback = z;
        this.values = true ^ z;
        this.AFLogger$LogLevel = 0;
        this.init = false;
    }

    public static aj AFInAppEventParameterName() {
        if (AFInAppEventParameterName == null) {
            AFInAppEventParameterName = new aj();
        }
        return AFInAppEventParameterName;
    }

    static void AFInAppEventParameterName(String str, PackageManager packageManager) {
        try {
            if (AFInAppEventParameterName == null) {
                AFInAppEventParameterName = new aj();
            }
            AFInAppEventParameterName.AFInAppEventType(str, packageManager);
            if (AFInAppEventParameterName == null) {
                AFInAppEventParameterName = new aj();
            }
            String strAFVersionDeclaration = AFInAppEventParameterName.AFVersionDeclaration();
            bz bzVar = new bz();
            bzVar.onInstallConversionDataLoadedNative = strAFVersionDeclaration;
            bzVar.onConversionDataSuccess = AppsFlyerLib.getInstance().isStopped();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()));
            sb.append(str);
            new Thread(new ah((bu) bzVar.valueOf(sb.toString()))).start();
        } catch (Throwable th) {
            AFLogger.valueOf(th);
        }
    }

    private synchronized void AFInAppEventType(String str, PackageManager packageManager) {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        ai aiVarValueOf = ai.valueOf();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        if (string != null) {
            try {
                this.AFInAppEventType = new JSONObject(string);
            } catch (Throwable unused) {
            }
        } else {
            this.AFInAppEventType = new JSONObject();
            values(Build.BRAND, Build.MODEL, Build.VERSION.RELEASE, appsFlyerProperties.getString("advertiserId"), aiVarValueOf.AFVersionDeclaration, aiVarValueOf.getLevel);
            StringBuilder sb = new StringBuilder("6.4.0.");
            sb.append(ai.AFInAppEventParameterName);
            AFKeystoreWrapper(sb.toString(), appsFlyerProperties.getString(AppsFlyerProperties.AF_KEY), appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
            try {
                int i2 = packageManager.getPackageInfo(str, 0).versionCode;
                AFInAppEventType(str, String.valueOf(i2), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", this.AFInAppEventType.toString());
        }
        try {
            this.AFInAppEventType.put("launch_counter", this.getLevel);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private synchronized void AFInAppEventType(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.AFInAppEventType.put("app_id", str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.AFInAppEventType.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.AFInAppEventType.put(AppsFlyerProperties.CHANNEL, str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.AFInAppEventType.put("preInstall", str4);
        }
    }

    public static String[] AFInAppEventType(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        for (int i2 = 1; i2 < stackTraceElementArr.length; i2++) {
            strArr[i2] = stackTraceElementArr[i2].toString();
        }
        return strArr;
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3, String str4) {
        try {
            this.AFInAppEventType.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.AFInAppEventType.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.AFInAppEventType.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.AFInAppEventType.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean AFLogger$LogLevel() {
        if (this.values) {
            return this.AFKeystoreWrapper || this.init;
        }
        return false;
    }

    private synchronized String AFVersionDeclaration() {
        String string;
        try {
            this.AFInAppEventType.put("data", new JSONArray((Collection) this.AFVersionDeclaration));
            string = this.AFInAppEventType.toString();
            try {
                init();
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            string = null;
        }
        return string;
    }

    private synchronized void init() {
        this.AFVersionDeclaration.clear();
        this.AFLogger$LogLevel = 0;
    }

    private synchronized void values(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.AFInAppEventType.put("brand", str);
            this.AFInAppEventType.put("model", str2);
            this.AFInAppEventType.put("platform", "Android");
            this.AFInAppEventType.put("platform_version", str3);
            if (str4 != null && str4.length() > 0) {
                this.AFInAppEventType.put("advertiserId", str4);
            }
            if (str5 != null && str5.length() > 0) {
                this.AFInAppEventType.put("imei", str5);
            }
            if (str6 != null && str6.length() > 0) {
                this.AFInAppEventType.put("android_id", str6);
            }
        } catch (Throwable unused) {
        }
    }

    final synchronized void AFInAppEventType() {
        this.init = true;
        AFInAppEventType("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
    }

    final synchronized void AFInAppEventType(String str) {
        this.getLevel = str;
    }

    public final synchronized void AFInAppEventType(String str, String str2, String... strArr) {
        String string;
        if (!AFLogger$LogLevel() || this.AFLogger$LogLevel >= 98304) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strJoin = TextUtils.join(", ", strArr);
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(jCurrentTimeMillis);
                sb.append(" ");
                sb.append(Thread.currentThread().getId());
                sb.append(" _/AppsFlyer_6.4.0 [");
                sb.append(str);
                sb.append("] ");
                sb.append(str2);
                sb.append(" ");
                sb.append(strJoin);
                string = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(jCurrentTimeMillis);
                sb2.append(" ");
                sb2.append(Thread.currentThread().getId());
                sb2.append(" ");
                sb2.append(str2);
                sb2.append("/AppsFlyer_6.4.0 ");
                sb2.append(strJoin);
                string = sb2.toString();
            }
            this.AFVersionDeclaration.add(string);
            this.AFLogger$LogLevel += string.length() << 1;
        } catch (Throwable unused) {
        }
    }

    final synchronized void AFKeystoreWrapper() {
        this.AFInAppEventType = null;
        AFInAppEventParameterName = null;
    }

    final boolean getLevel() {
        return this.init;
    }

    final synchronized void valueOf() {
        this.AFKeystoreWrapper = false;
        init();
    }

    final synchronized void values() {
        AFInAppEventType("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.init = false;
        this.AFKeystoreWrapper = false;
    }
}
