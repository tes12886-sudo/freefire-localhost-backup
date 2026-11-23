package com.beetalk.sdk.networking.model;

import com.beetalk.sdk.x.a;
import com.garena.pay.android.b;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class LessIsMoreEventsResp extends BaseResp {
    public List<LessIsMoreEvent> events;
    public String response = "";
    public String version = "";

    public static LessIsMoreEventsResp parse(String str) {
        LessIsMoreEventsResp lessIsMoreEventsResp = new LessIsMoreEventsResp();
        if (str == null) {
            lessIsMoreEventsResp.errorCode = b.NETWORK_RESPONSE_PARSE_FAIL.c().intValue();
            return lessIsMoreEventsResp;
        }
        lessIsMoreEventsResp.errorCode = lessIsMoreEventsResp.parseErrorCode(str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            lessIsMoreEventsResp.resultCode = lessIsMoreEventsResp.parseResultCode(jSONObject);
            lessIsMoreEventsResp.events = LessIsMoreEvent.parseList(jSONObject.optJSONArray("events"));
            lessIsMoreEventsResp.version = jSONObject.optString("version");
            lessIsMoreEventsResp.response = str;
            return lessIsMoreEventsResp;
        } catch (JSONException e) {
            a.b(e);
            return lessIsMoreEventsResp;
        }
    }
}
