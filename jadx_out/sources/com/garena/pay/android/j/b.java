package com.garena.pay.android.j;

import com.garena.pay.android.data.GGPayment;
import com.garena.pay.android.data.GGRebateItem;
import com.garena.pay.android.data.GGRedeemResponse;
import com.garena.pay.android.data.GGRedeemResultItem;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static List<GGPayment.PaymentChannel> a(List<GGPayment.PaymentChannel> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (GGPayment.PaymentChannel paymentChannel : list) {
            if (c(paymentChannel)) {
                arrayList.add(paymentChannel);
            }
        }
        return arrayList;
    }

    public static List<GGPayment.PaymentChannel> b(List<GGPayment.PaymentChannel> list) {
        List<GGPayment.PaymentChannel> listA = a(list);
        ArrayList arrayList = new ArrayList();
        for (GGPayment.PaymentChannel paymentChannel : listA) {
            if (c(paymentChannel)) {
                List<GGPayment.Denomination> items = paymentChannel.getItems();
                ArrayList arrayList2 = new ArrayList();
                for (GGPayment.Denomination denomination : items) {
                    if (denomination.getRebateId() == 0) {
                        arrayList2.add(denomination);
                    }
                }
                paymentChannel.setItems(arrayList2);
                arrayList.add(paymentChannel);
            }
        }
        return arrayList;
    }

    private static boolean c(GGPayment.PaymentChannel paymentChannel) {
        return paymentChannel != null && paymentChannel.isGooglePlay();
    }

    private static boolean d(long j2, List<GGRebateItem> list) {
        if (list == null) {
            return false;
        }
        for (GGRebateItem gGRebateItem : list) {
            if (gGRebateItem.getId() == j2 && gGRebateItem.isValid()) {
                return true;
            }
        }
        return false;
    }

    public static List<GGPayment.PaymentChannel> e(List<GGPayment.PaymentChannel> list, List<GGRebateItem> list2, Long l2) {
        if (l2 == null || l2.longValue() == 0) {
            return b(list);
        }
        long jLongValue = l2.longValue();
        List<GGPayment.PaymentChannel> listA = a(list);
        if (jLongValue == -1) {
            return listA;
        }
        ArrayList arrayList = new ArrayList();
        for (GGPayment.PaymentChannel paymentChannel : listA) {
            List<GGPayment.Denomination> items = paymentChannel.getItems();
            ArrayList arrayList2 = new ArrayList();
            if (items != null) {
                for (GGPayment.Denomination denomination : items) {
                    if (denomination.getRebateId() > 0 && denomination.getRebateId() == l2.longValue() && d(denomination.getRebateId(), list2)) {
                        arrayList2.add(denomination);
                    }
                }
            }
            if (arrayList2.size() > 0) {
                paymentChannel.setItems(arrayList2);
                arrayList.add(paymentChannel);
            }
        }
        return arrayList;
    }

    public static GGRedeemResponse f(String str) {
        try {
            GGRedeemResponse gGRedeemResponse = new GGRedeemResponse();
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt("result");
            gGRedeemResponse.result = i2;
            if (i2 != 0) {
                return null;
            }
            gGRedeemResponse.redeemList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("redeemed");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                gGRedeemResponse.redeemList.add(new GGRedeemResultItem(jSONObject2.getLong("rebate_card_id"), jSONObject2.getInt("app_point_amount"), jSONObject2.getInt("remaining_days")));
            }
            gGRedeemResponse.totalRedeemed = jSONObject.getInt("total_redeemed");
            return gGRedeemResponse;
        } catch (JSONException e) {
            com.beetalk.sdk.x.a.b(e);
            return null;
        }
    }
}
