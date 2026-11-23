package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.PointF;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public abstract class am implements Runnable {
    private static String AFKeystoreWrapper = null;
    private static long AFLogger$LogLevel = 0;
    private static char[] getLevel = null;
    private static int onDeepLinkingNative = 0;
    private static int onInstallConversionDataLoadedNative = 1;
    protected static String values;
    private final ai AFInAppEventParameterName;
    public String AFInAppEventType;
    private final Context init;
    public final String valueOf;
    public final String AppsFlyer2dXConversionCallback = UUID.randomUUID().toString();
    public final Map<String, Object> AFVersionDeclaration = AFKeystoreWrapper();

    static {
        AFInAppEventType();
        AFKeystoreWrapper = "v2";
        StringBuilder sb = new StringBuilder("https://%sonelink.%s/shortlink-sdk/");
        sb.append(AFKeystoreWrapper);
        values = sb.toString();
        int i2 = onInstallConversionDataLoadedNative + 121;
        onDeepLinkingNative = i2 % 128;
        int i3 = i2 % 2;
    }

    public am(ai aiVar, Context context, String str) {
        this.AFInAppEventParameterName = aiVar;
        this.init = context;
        this.valueOf = str;
    }

    static void AFInAppEventType() {
        getLevel = new char[]{1452, 43551, 23272, 2818, 48084, 26734, 6395, 51328, 31033, 10668, 56919, 36564};
        AFLogger$LogLevel = -2488149479668928620L;
    }

    private Map<String, Object> AFKeystoreWrapper() {
        HashMap map = new HashMap();
        map.put("build_number", "6.4.0");
        map.put("counter", Integer.valueOf(ai.AFInAppEventParameterName(ai.values(this.init), "appsFlyerCount", false)));
        map.put("model", Build.MODEL);
        map.put("brand", Build.BRAND);
        map.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        try {
            map.put("app_version_name", this.init.getPackageManager().getPackageInfo(this.init.getPackageName(), 0).versionName);
            int i2 = onDeepLinkingNative + 109;
            onInstallConversionDataLoadedNative = i2 % 128;
            int i3 = i2 % 2;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map.put("app_id", this.init.getPackageName());
        map.put("platformextension", new an().AFKeystoreWrapper());
        int i4 = onInstallConversionDataLoadedNative + 91;
        onDeepLinkingNative = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    private static String valueOf(int i2, int i3, char c) {
        char[] cArr = new char[i3];
        int i4 = onDeepLinkingNative + 103;
        onInstallConversionDataLoadedNative = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (true) {
            if ((i6 < i3 ? 'H' : (char) 5) != 'H') {
                break;
            }
            cArr[i6] = (char) ((((long) getLevel[i2 + i6]) ^ (((long) i6) * AFLogger$LogLevel)) ^ ((long) c));
            i6++;
        }
        String str = new String(cArr);
        int i7 = onDeepLinkingNative + 53;
        onInstallConversionDataLoadedNative = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        int i8 = 24 / 0;
        return str;
    }

    protected abstract void AFKeystoreWrapper(HttpsURLConnection httpsURLConnection);

    @Override // java.lang.Runnable
    public void run() {
        String strAFInAppEventParameterName;
        Throwable th;
        String string = "";
        String strValueOf = valueOf();
        AFLogger.AFInAppEventParameterName("oneLinkUrl: ".concat(String.valueOf(strValueOf)));
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(strValueOf).openConnection();
            httpsURLConnection.setRequestProperty("content-type", "application/json");
            httpsURLConnection.setReadTimeout(3000);
            httpsURLConnection.setConnectTimeout(3000);
            httpsURLConnection.setRequestMethod(this.valueOf);
            AFKeystoreWrapper(httpsURLConnection);
            int responseCode = httpsURLConnection.getResponseCode();
            strAFInAppEventParameterName = ai.AFInAppEventParameterName(httpsURLConnection);
            try {
                if ((responseCode == 200 ? 'Q' : 'U') != 'Q') {
                    StringBuilder sb = new StringBuilder("Response code = ");
                    sb.append(responseCode);
                    sb.append(" content = ");
                    sb.append(strAFInAppEventParameterName);
                    string = sb.toString();
                } else {
                    int i2 = onDeepLinkingNative + 19;
                    onInstallConversionDataLoadedNative = i2 % 128;
                    int i3 = i2 % 2;
                    AFLogger.valueOf("Status 200 ok");
                }
            } catch (Throwable th2) {
                th = th2;
                AFLogger.valueOf("Error while calling ".concat(String.valueOf(strValueOf)), th);
                StringBuilder sb2 = new StringBuilder("Error while calling ");
                sb2.append(strValueOf);
                sb2.append(" stacktrace: ");
                sb2.append(th.toString());
                string = sb2.toString();
            }
        } catch (Throwable th3) {
            strAFInAppEventParameterName = "";
            th = th3;
        }
        if (!TextUtils.isEmpty(string)) {
            AFLogger.values("Connection error: ".concat(String.valueOf(string)));
            values();
            return;
        }
        int i4 = onInstallConversionDataLoadedNative + 45;
        onDeepLinkingNative = i4 % 128;
        int i5 = i4 % 2;
        AFLogger.valueOf("Connection call succeeded: ".concat(String.valueOf(strAFInAppEventParameterName)));
        values(strAFInAppEventParameterName);
        int i6 = onInstallConversionDataLoadedNative + 87;
        onDeepLinkingNative = i6 % 128;
        if (!(i6 % 2 == 0)) {
            Object obj = null;
            super.hashCode();
        }
    }

    protected abstract String valueOf();

    protected abstract void values();

    protected abstract void values(String str);

    protected final void values(HttpsURLConnection httpsURLConnection, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, AFKeystoreWrapper);
        String strJoin = TextUtils.join("\u2063", arrayList.toArray());
        StringBuilder sb = new StringBuilder();
        sb.append(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY));
        sb.append(this.AppsFlyer2dXConversionCallback);
        sb.append(AFKeystoreWrapper);
        httpsURLConnection.setRequestProperty(valueOf((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, (char) (1516 - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), ah.valueOf(strJoin, sb.toString()));
        int i2 = onInstallConversionDataLoadedNative + 41;
        onDeepLinkingNative = i2 % 128;
        if (!(i2 % 2 != 0)) {
            return;
        }
        Object[] objArr = null;
        int length = objArr.length;
    }
}
