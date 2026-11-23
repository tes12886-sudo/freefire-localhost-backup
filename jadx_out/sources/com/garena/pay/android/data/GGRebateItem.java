package com.garena.pay.android.data;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GGRebateItem {
    private long id = 0;
    private int days = 0;
    private double amount = 0.0d;
    private String description = "";
    private String name = "";
    private boolean valid = false;

    public static GGRebateItem parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        GGRebateItem gGRebateItem = new GGRebateItem();
        gGRebateItem.setId(jSONObject.optLong("id"));
        gGRebateItem.setValid(jSONObject.optBoolean("valid"));
        gGRebateItem.setDays(jSONObject.optInt("rebate_days"));
        gGRebateItem.setAmount(jSONObject.optDouble("rebate_amount"));
        gGRebateItem.setName(jSONObject.optString("name"));
        gGRebateItem.setDescription(jSONObject.optString("description"));
        return gGRebateItem;
    }

    public static List<GGRebateItem> parseList(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            GGRebateItem gGRebateItem = parse(jSONArray.optJSONObject(i2));
            if (gGRebateItem != null) {
                arrayList.add(gGRebateItem);
            }
        }
        return arrayList;
    }

    public double getAmount() {
        return this.amount;
    }

    public int getDays() {
        return this.days;
    }

    public String getDescription() {
        return this.description;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isValid() {
        return this.valid;
    }

    public void setAmount(double d) {
        this.amount = d;
    }

    public void setDays(int i2) {
        this.days = i2;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setValid(boolean z) {
        this.valid = z;
    }
}
