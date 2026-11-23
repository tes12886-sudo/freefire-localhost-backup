package com.beetalk.sdk.plugin.e.c;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<S, T> extends com.beetalk.sdk.plugin.a<S, T> {
    @Override // com.beetalk.sdk.plugin.a
    public boolean a() {
        return false;
    }

    protected com.garena.pay.android.b i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return com.garena.pay.android.b.NETWORK_RESPONSE_PARSE_FAIL;
        }
        com.garena.pay.android.b bVarB = com.beetalk.sdk.x.d.b(jSONObject);
        return bVarB == null ? com.garena.pay.android.b.SUCCESS : bVarB;
    }
}
