package com.beetalk.sdk.networking.model;

import com.beetalk.sdk.x.a;
import com.garena.pay.android.b;
import com.garena.pay.android.data.GGPayment;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class EventPricingResp extends BaseResp {
    private List<GGPayment.PaymentChannel> channels;
    private List<PricingEvent> events;

    public static EventPricingResp parse(String str) {
        EventPricingResp eventPricingResp = new EventPricingResp();
        if (str == null) {
            eventPricingResp.errorCode = b.NETWORK_RESPONSE_PARSE_FAIL.c().intValue();
            return eventPricingResp;
        }
        eventPricingResp.errorCode = eventPricingResp.parseErrorCode(str);
        try {
            eventPricingResp.resultCode = eventPricingResp.parseResultCode(new JSONObject(str));
        } catch (JSONException e) {
            a.b(e);
        }
        if (eventPricingResp.errorCode != b.SUCCESS.c().intValue()) {
            return eventPricingResp;
        }
        eventPricingResp.channels = Pricing.toPaymentChannelList(str);
        eventPricingResp.events = parseEvents(str);
        return eventPricingResp;
    }

    private static List<PricingEvent> parseEvents(String str) {
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("events");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                PricingEvent pricingEvent = new PricingEvent();
                pricingEvent.id = jSONObject.optInt("id");
                pricingEvent.type = jSONObject.optString("type");
                pricingEvent.start_time = jSONObject.optLong("start_time");
                pricingEvent.end_time = jSONObject.optLong("end_time");
                pricingEvent.available_times = jSONObject.optInt("available_times");
                pricingEvent.total_times = jSONObject.optInt("total_times");
                pricingEvent.status = jSONObject.optInt("status");
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("items");
                if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                    if (pricingEvent.items == null) {
                        pricingEvent.items = new int[jSONArrayOptJSONArray2.length()];
                    }
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                        pricingEvent.items[i3] = jSONArrayOptJSONArray2.optInt(i3);
                    }
                }
                arrayList.add(pricingEvent);
            }
            return arrayList;
        } catch (JSONException e) {
            a.b(e);
            return null;
        }
    }

    public List<GGPayment.PaymentChannel> getChannels() {
        return this.channels;
    }

    public List<PricingEvent> getEvents() {
        return this.events;
    }
}
