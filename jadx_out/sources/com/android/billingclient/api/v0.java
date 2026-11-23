package com.android.billingclient.api;

import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {
    private final String a;
    private final String b;

    /* synthetic */ v0(JSONObject jSONObject, u0 u0Var) {
        this.a = jSONObject.optString("productId");
        this.b = jSONObject.optString("productType");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.a.equals(v0Var.a) && this.b.equals(v0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return String.format("{id: %s, type: %s}", this.a, this.b);
    }
}
