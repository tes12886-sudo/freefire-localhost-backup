package com.beetalk.sdk.networking.model;

import android.text.TextUtils;
import com.facebook.a;
import com.garena.pay.android.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ExchangeTwitterTokenResp extends BaseResp {
    private long expireTime;
    private int platform;
    private String openId = "";
    private String accessToken = "";

    public static ExchangeTwitterTokenResp parse(String str) {
        b bVar;
        ExchangeTwitterTokenResp exchangeTwitterTokenResp = new ExchangeTwitterTokenResp();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("error");
            if (TextUtils.isEmpty(strOptString)) {
                exchangeTwitterTokenResp.errorCode = b.SUCCESS.c().intValue();
                exchangeTwitterTokenResp.openId = jSONObject.optString("open_id");
                exchangeTwitterTokenResp.accessToken = jSONObject.optString("access_token");
                exchangeTwitterTokenResp.expireTime = jSONObject.optLong("expiry_time");
                exchangeTwitterTokenResp.platform = jSONObject.optInt("platform");
                return exchangeTwitterTokenResp;
            }
            if ("error_user_ban".equals(strOptString)) {
                bVar = b.ERROR_USER_BANNED;
            } else if ("invalid_grant".equals(strOptString)) {
                a.r(null);
                bVar = b.ACCESS_TOKEN_INVALID_GRANT;
            } else {
                bVar = b.ACCESS_TOKEN_EXCHANGE_FAILED;
            }
            exchangeTwitterTokenResp.errorCode = bVar.c().intValue();
            return exchangeTwitterTokenResp;
        } catch (JSONException e) {
            com.beetalk.sdk.x.a.b(e);
            exchangeTwitterTokenResp.errorCode = b.NETWORK_RESPONSE_PARSE_FAIL.c().intValue();
            return exchangeTwitterTokenResp;
        }
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public int getExpireTime() {
        return (int) this.expireTime;
    }

    public String getOpenId() {
        return this.openId;
    }

    public int getPlatform() {
        return this.platform;
    }
}
