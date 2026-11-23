package com.beetalk.sdk.networking.model;

import com.beetalk.sdk.x.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class LessIsMoreEvent {
    public List<LessIsMoreEventConfig> configs;
    public long id = 0;
    public long start_time = 0;
    public long end_time = 0;
    public String region = "";
    public String type = "";

    public static List<LessIsMoreEvent> parseList(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                LessIsMoreEvent lessIsMoreEvent = new LessIsMoreEvent();
                lessIsMoreEvent.type = jSONObject.optString("type");
                lessIsMoreEvent.start_time = jSONObject.optLong("start_time");
                lessIsMoreEvent.id = jSONObject.optLong("id");
                lessIsMoreEvent.end_time = jSONObject.optLong("end_time");
                lessIsMoreEvent.region = jSONObject.optString("region");
                lessIsMoreEvent.configs = LessIsMoreEventConfig.parseList(jSONObject.optJSONArray("configs"));
                arrayList.add(lessIsMoreEvent);
            } catch (JSONException e) {
                a.b(e);
                return null;
            }
        }
        return arrayList;
    }
}
