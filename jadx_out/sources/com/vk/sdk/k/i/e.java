package com.vk.sdk.k.i;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e extends c<JSONObject> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private JSONObject f1560i;

    public static abstract class a extends com.vk.sdk.k.i.a.c<e, JSONObject> {
    }

    public e(b.d dVar) {
        super(dVar);
    }

    @Override // com.vk.sdk.k.i.c
    protected boolean n() {
        if (!super.n()) {
            return false;
        }
        this.f1560i = p();
        return true;
    }

    public JSONObject p() {
        if (this.f1560i == null) {
            String strK = k();
            if (strK == null) {
                return null;
            }
            try {
                this.f1560i = new JSONObject(strK);
            } catch (Exception e) {
                this.f = e;
            }
        }
        return this.f1560i;
    }

    @Override // com.vk.sdk.k.i.c
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public JSONObject l() {
        return this.f1560i;
    }
}
