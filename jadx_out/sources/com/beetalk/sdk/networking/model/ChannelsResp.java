package com.beetalk.sdk.networking.model;

import com.beetalk.sdk.x.a;
import com.garena.pay.android.b;
import com.garena.pay.android.data.GGPayment;
import com.garena.pay.android.data.GGRebateItem;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ChannelsResp extends BaseResp {
    private List<GGPayment.PaymentChannel> channels;

    public static ChannelsResp parse(String str) {
        ChannelsResp channelsResp = new ChannelsResp();
        if (str == null) {
            channelsResp.errorCode = b.NETWORK_RESPONSE_PARSE_FAIL.c().intValue();
            return channelsResp;
        }
        int errorCode = channelsResp.parseErrorCode(str);
        channelsResp.errorCode = errorCode;
        if (errorCode != b.SUCCESS.c().intValue()) {
            return channelsResp;
        }
        channelsResp.channels = Pricing.toPaymentChannelList(str);
        return channelsResp;
    }

    public static ChannelsResp parseV1(String str, long j2) {
        ChannelsResp channelsResp = new ChannelsResp();
        if (str == null) {
            channelsResp.errorCode = b.NETWORK_RESPONSE_PARSE_FAIL.c().intValue();
            return channelsResp;
        }
        int errorCode = channelsResp.parseErrorCode(str);
        channelsResp.errorCode = errorCode;
        if (errorCode != b.SUCCESS.c().intValue()) {
            return channelsResp;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            channelsResp.channels = com.garena.pay.android.j.b.e(GGPayment.PaymentChannel.parseList(jSONObject.optJSONArray("channels")), GGRebateItem.parseList(jSONObject.optJSONArray("rebates")), Long.valueOf(j2));
            return channelsResp;
        } catch (JSONException e) {
            a.b(e);
            return channelsResp;
        }
    }

    public List<GGPayment.PaymentChannel> getChannels() {
        return this.channels;
    }

    public void setChannels(List<GGPayment.PaymentChannel> list) {
        this.channels = list;
    }
}
