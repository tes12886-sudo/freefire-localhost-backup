package com.beetalk.sdk.networking.model;

import com.beetalk.sdk.x.a;
import j.d.d.y.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class RecallTokenResponse extends BaseResponse {

    @c("tokens")
    private List<RecallToken> tokens = Collections.emptyList();

    public static RecallTokenResponse parse(JSONObject jSONObject) {
        RecallTokenResponse recallTokenResponse = new RecallTokenResponse();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tokens");
        if (jSONArrayOptJSONArray == null) {
            return recallTokenResponse;
        }
        try {
            ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                arrayList.add(RecallToken.parse(jSONArrayOptJSONArray.getJSONObject(i2)));
            }
            recallTokenResponse.setTokens(arrayList);
        } catch (JSONException e) {
            a.b(e);
        }
        return recallTokenResponse;
    }

    public List<RecallToken> getTokens() {
        return this.tokens;
    }

    public void setTokens(List<RecallToken> list) {
        this.tokens = list;
    }
}
