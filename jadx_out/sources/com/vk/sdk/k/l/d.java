package com.vk.sdk.k.l;

import com.vk.sdk.k.f;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends c {
    public d(b[] bVarArr, long j2, int i2) {
        this.v = j2;
        this.u = i2;
        this.F = new File[bVarArr.length];
        for (int i3 = 0; i3 < bVarArr.length; i3++) {
            this.F[i3] = bVarArr[i3].d();
        }
    }

    @Override // com.vk.sdk.k.h
    protected f F(JSONObject jSONObject) {
        try {
            f fVarF = com.vk.sdk.k.a.a().f(new com.vk.sdk.k.d(com.vk.sdk.m.a.c(jSONObject)));
            long j2 = this.v;
            if (j2 != 0) {
                fVarF.l(com.vk.sdk.m.c.i("user_id", Long.valueOf(j2)));
            }
            long j3 = this.u;
            if (j3 != 0) {
                fVarF.l(com.vk.sdk.m.c.i("group_id", Long.valueOf(j3)));
            }
            return fVarF;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.vk.sdk.k.h
    protected f G() {
        long j2 = this.u;
        com.vk.sdk.k.j.b bVarA = com.vk.sdk.k.a.a();
        return j2 != 0 ? bVarA.e(this.u) : bVarA.d();
    }
}
