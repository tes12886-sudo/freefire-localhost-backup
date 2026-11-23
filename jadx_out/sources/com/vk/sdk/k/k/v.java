package com.vk.sdk.k.k;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class v {
    public static int a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        String strOptString = jSONObject.optString("type");
        if ("all".equals(strOptString)) {
            return 0;
        }
        if ("friends".equals(strOptString)) {
            return 1;
        }
        if ("friends_of_friends".equals(strOptString)) {
            return 2;
        }
        return "nobody".equals(strOptString) ? 3 : 4;
    }
}
