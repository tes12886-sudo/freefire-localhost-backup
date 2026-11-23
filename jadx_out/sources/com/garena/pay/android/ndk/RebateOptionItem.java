package com.garena.pay.android.ndk;

import com.beetalk.sdk.x.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class RebateOptionItem {
    public long rebateId = 0;
    public int rebateAmount = 0;
    public int remainingDays = 0;
    public int rebateDays = 0;
    public boolean validToPurchase = false;
    public boolean validToRedeem = false;
    public boolean owned = false;
    public String name = "";
    public String description = "";

    public static List<RebateOptionItem> parseList(String str) {
        try {
            return parseList(new JSONObject(str).getJSONArray("rebates"));
        } catch (Exception e) {
            a.b(e);
            return null;
        }
    }

    public static List<RebateOptionItem> parseList(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                RebateOptionItem rebateOptionItem = new RebateOptionItem();
                rebateOptionItem.rebateId = jSONObject.optLong("id");
                JSONObject jSONObject2 = jSONObject.getJSONObject("info");
                rebateOptionItem.name = jSONObject2.optString("name");
                rebateOptionItem.description = jSONObject2.optString("description");
                rebateOptionItem.rebateDays = jSONObject2.optInt("rebate_days");
                rebateOptionItem.rebateAmount = jSONObject2.optInt("rebate_amount");
                JSONObject jSONObject3 = jSONObject.getJSONObject("user");
                rebateOptionItem.owned = jSONObject3.optBoolean("owned");
                rebateOptionItem.validToPurchase = jSONObject3.optBoolean("valid_to_purchase");
                rebateOptionItem.validToRedeem = jSONObject3.optBoolean("valid_to_redeem");
                rebateOptionItem.remainingDays = jSONObject3.optInt("remaining_days");
                arrayList.add(rebateOptionItem);
            } catch (JSONException e) {
                a.b(e);
                return null;
            }
        }
        return arrayList;
    }
}
