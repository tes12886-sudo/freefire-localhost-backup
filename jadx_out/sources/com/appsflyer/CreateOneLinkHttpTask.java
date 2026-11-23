package com.appsflyer;

import android.content.Context;
import com.appsflyer.internal.ai;
import com.appsflyer.internal.am;
import com.appsflyer.internal.o;
import com.appsflyer.share.LinkGenerator;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class CreateOneLinkHttpTask extends am {
    public ResponseListener AFInAppEventParameterName;
    public String AFKeystoreWrapper;
    private final Map<String, String> AFLogger$LogLevel;
    private final String getLevel;
    private String init;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask(String str, Map<String, String> map, ai aiVar, Context context) {
        super(aiVar, context, "POST");
        this.init = "";
        if (context != null) {
            this.init = context.getPackageName();
        } else {
            AFLogger.values("CreateOneLinkHttpTask: context can't be null");
        }
        this.AFInAppEventType = str;
        this.getLevel = "-1";
        this.AFLogger$LogLevel = map;
    }

    @Override // com.appsflyer.internal.am
    public final void AFKeystoreWrapper(HttpsURLConnection httpsURLConnection) throws IOException {
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setUseCaches(false);
        HashMap map = new HashMap();
        map.put("ttl", this.getLevel);
        map.put("uuid", this.AppsFlyer2dXConversionCallback);
        map.put("data", this.AFLogger$LogLevel);
        map.put("meta", this.AFVersionDeclaration);
        String str = this.AFKeystoreWrapper;
        if (str != null) {
            map.put("brand_domain", str);
        }
        String string = o.AFInAppEventParameterName(map).toString();
        values(httpsURLConnection, this.valueOf, string);
        httpsURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(string);
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    @Override // com.appsflyer.internal.am
    public final String valueOf() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(am.values, AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()));
        sb.append("/");
        sb.append(this.AFInAppEventType);
        return sb.toString();
    }

    @Override // com.appsflyer.internal.am
    public final void values() {
        LinkGenerator linkGeneratorAddParameters = new LinkGenerator("af_app_invites").setBaseURL(this.AFInAppEventType, AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN), this.init).addParameter("af_siteid", this.init).addParameters(this.AFLogger$LogLevel);
        ai.valueOf();
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            linkGeneratorAddParameters.setReferrerCustomerId(string);
        }
        this.AFInAppEventParameterName.onResponse(linkGeneratorAddParameters.generateLink());
    }

    @Override // com.appsflyer.internal.am
    public final void values(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                this.AFInAppEventParameterName.onResponse(jSONObject.optString(itKeys.next()));
            }
        } catch (JSONException e) {
            this.AFInAppEventParameterName.onResponseError("Can't parse one link data");
            AFLogger.valueOf("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }
}
