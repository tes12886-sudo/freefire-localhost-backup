package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class ao extends am {
    c AFInAppEventParameterName;
    boolean AFKeystoreWrapper;
    private String AFLogger$LogLevel;
    private String getLevel;

    interface c {
        void AFKeystoreWrapper(String str);

        void valueOf(Map<String, String> map);
    }

    ao(Uri uri, ai aiVar, Context context) {
        super(aiVar, context, "GET");
        this.AFKeystoreWrapper = false;
        if (TextUtils.isEmpty(uri.getHost()) || TextUtils.isEmpty(uri.getPath())) {
            return;
        }
        String[] strArr = {"onelink.me", "onelnk.com", "app.aflink.com"};
        boolean z = false;
        for (int i2 = 0; i2 < 3; i2++) {
            if (uri.getHost().contains(strArr[i2])) {
                z = true;
            }
        }
        if (i.AppsFlyer2dXConversionCallback != null) {
            StringBuilder sb = new StringBuilder("Validate if link ");
            sb.append(uri);
            sb.append(" belongs to custom domains: ");
            sb.append(Arrays.asList(i.AppsFlyer2dXConversionCallback));
            AFLogger.AFInAppEventParameterName(sb.toString());
            for (String str : i.AppsFlyer2dXConversionCallback) {
                if (uri.getHost().contains(str) && !TextUtils.isEmpty(str)) {
                    AFLogger.AFInAppEventType("Link matches custom domain: ".concat(String.valueOf(str)));
                    this.AFKeystoreWrapper = true;
                    z = true;
                }
            }
        }
        String[] strArrSplit = uri.getPath().split("/");
        if (z && strArrSplit.length == 3) {
            this.AFInAppEventType = strArrSplit[1];
            this.getLevel = strArrSplit[2];
            this.AFLogger$LogLevel = uri.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.appsflyer.internal.am
    protected final void AFKeystoreWrapper(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestProperty("Af-UUID", this.AppsFlyer2dXConversionCallback);
        String strValueOf = String.valueOf(this.AFVersionDeclaration.get("build_number"));
        httpsURLConnection.setRequestProperty("Af-Meta-Sdk-Ver", strValueOf);
        httpsURLConnection.setRequestProperty("Af-Meta-Counter", String.valueOf(this.AFVersionDeclaration.get("counter")));
        httpsURLConnection.setRequestProperty("Af-Meta-Model", String.valueOf(this.AFVersionDeclaration.get("model")));
        httpsURLConnection.setRequestProperty("Af-Meta-Platform", String.valueOf(this.AFVersionDeclaration.get("platformextension")));
        httpsURLConnection.setRequestProperty("Af-Meta-System-Version", String.valueOf(this.AFVersionDeclaration.get("sdk")));
        values(httpsURLConnection, this.valueOf, this.AppsFlyer2dXConversionCallback, this.AFInAppEventType, this.getLevel, strValueOf);
    }

    final boolean AFKeystoreWrapper() {
        return (TextUtils.isEmpty(this.AFInAppEventType) || TextUtils.isEmpty(this.getLevel) || this.AFInAppEventType.equals("app")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.appsflyer.internal.am
    protected final String valueOf() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(am.values, AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()));
        sb.append("/");
        sb.append(this.AFInAppEventType);
        sb.append("?id=");
        sb.append(this.getLevel);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.appsflyer.internal.am
    protected final void values() {
        String str = this.AFLogger$LogLevel;
        if (str == null) {
            str = "Can't get OneLink data";
        }
        this.AFInAppEventParameterName.AFKeystoreWrapper(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.appsflyer.internal.am
    protected final void values(String str) {
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            this.AFInAppEventParameterName.valueOf(map);
        } catch (JSONException e) {
            this.AFInAppEventParameterName.AFKeystoreWrapper("Can't parse OneLink data");
            AFLogger.valueOf("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }
}
