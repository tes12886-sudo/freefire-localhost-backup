package com.beetalk.sdk.networking.model;

import com.beetalk.sdk.x.a;
import com.garena.pay.android.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class EventCancelResp extends BaseResp {
    public static EventCancelResp parse(String str) {
        EventCancelResp eventCancelResp = new EventCancelResp();
        if (str == null) {
            eventCancelResp.errorCode = b.NETWORK_RESPONSE_PARSE_FAIL.c().intValue();
            return eventCancelResp;
        }
        eventCancelResp.errorCode = eventCancelResp.parseErrorCode(str);
        try {
            eventCancelResp.resultCode = eventCancelResp.parseResultCode(new JSONObject(str));
        } catch (JSONException e) {
            a.b(e);
        }
        return eventCancelResp;
    }
}
