package com.beetalk.sdk.networking.model;

import com.beetalk.sdk.x.a;
import com.garena.pay.android.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class EventInitResp extends BaseResp {
    public String event_txn_id = "";

    public static EventInitResp parse(String str) {
        EventInitResp eventInitResp = new EventInitResp();
        if (str == null) {
            eventInitResp.errorCode = b.NETWORK_RESPONSE_PARSE_FAIL.c().intValue();
            return eventInitResp;
        }
        eventInitResp.errorCode = eventInitResp.parseErrorCode(str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            eventInitResp.resultCode = eventInitResp.parseResultCode(jSONObject);
            eventInitResp.event_txn_id = jSONObject.optString("event_txn_id");
        } catch (JSONException e) {
            a.b(e);
        }
        return eventInitResp;
    }
}
