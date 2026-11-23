package com.beetalk.sdk.networking.model;

import com.beetalk.sdk.x.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class LessIsMoreEventConfig {
    public long rebate_id = 0;
    public long item_id = 0;
    public double price = 0.0d;
    public String extra_info = "";

    public static List<LessIsMoreEventConfig> parseList(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                LessIsMoreEventConfig lessIsMoreEventConfig = new LessIsMoreEventConfig();
                lessIsMoreEventConfig.rebate_id = jSONObject.optLong("rebate_id");
                lessIsMoreEventConfig.item_id = jSONObject.optLong("item_id");
                lessIsMoreEventConfig.price = jSONObject.optDouble("price");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extra_info");
                if (jSONObjectOptJSONObject != null) {
                    lessIsMoreEventConfig.extra_info = jSONObjectOptJSONObject.toString();
                }
                arrayList.add(lessIsMoreEventConfig);
            } catch (JSONException e) {
                a.b(e);
                return null;
            }
        }
        return arrayList;
    }

    public String toString() {
        return "rebate_id = " + this.rebate_id + ", item_id = " + this.item_id + ", price = " + this.price + "\nextra_info = " + this.extra_info;
    }
}
