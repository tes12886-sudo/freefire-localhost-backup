package com.vk.sdk.k;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b extends e {
    private final Class<? extends com.vk.sdk.k.k.g> a;

    public b(Class<? extends com.vk.sdk.k.k.g> cls) {
        this.a = cls;
    }

    @Override // com.vk.sdk.k.e
    public Object a(JSONObject jSONObject) {
        try {
            com.vk.sdk.k.k.g gVarNewInstance = this.a.newInstance();
            gVarNewInstance.c(jSONObject);
            return gVarNewInstance;
        } catch (Exception unused) {
            return null;
        }
    }
}
