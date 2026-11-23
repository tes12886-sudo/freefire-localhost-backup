package com.garena.pay.android.data;

import com.beetalk.sdk.x.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GGPaymentAppItem implements Serializable {
    private long id;
    private Info info;

    public static class Info implements Serializable {
        private String name = "";
        private String description = "";
        private String icon = "";

        /* JADX INFO: Access modifiers changed from: private */
        public static Info parse(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            Info info = new Info();
            info.name = jSONObject.optString("name", "");
            info.description = jSONObject.optString("description", "");
            info.icon = jSONObject.optString("icon", "");
            return info;
        }

        public String getDescription() {
            return this.description;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getName() {
            return this.name;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    private static GGPaymentAppItem parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        GGPaymentAppItem gGPaymentAppItem = new GGPaymentAppItem();
        long jOptLong = jSONObject.optLong("id", 0L);
        Info info = Info.parse(jSONObject.optJSONObject("info"));
        gGPaymentAppItem.setId(jOptLong);
        gGPaymentAppItem.setInfo(info);
        return gGPaymentAppItem;
    }

    public static List<GGPaymentAppItem> parseList(String str) {
        try {
            return parseList(new JSONObject(str).optJSONArray("app_items"));
        } catch (JSONException e) {
            a.b(e);
            return null;
        }
    }

    public static List<GGPaymentAppItem> parseList(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            GGPaymentAppItem gGPaymentAppItem = parse(jSONArray.optJSONObject(i2));
            if (gGPaymentAppItem != null) {
                arrayList.add(gGPaymentAppItem);
            }
        }
        return arrayList;
    }

    public long getId() {
        return this.id;
    }

    public Info getInfo() {
        return this.info;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
