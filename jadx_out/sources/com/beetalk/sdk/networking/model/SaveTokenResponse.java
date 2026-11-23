package com.beetalk.sdk.networking.model;

import com.beetalk.sdk.z.f;
import com.beetalk.sdk.z.g;
import j.d.d.y.b;
import j.d.d.y.c;

/* JADX INFO: loaded from: classes.dex */
public class SaveTokenResponse extends BaseResponse {

    @b(g.class)
    @c("result")
    private f result;

    public f getResult() {
        return this.result;
    }

    public boolean isFailure() {
        return this.result != f.SUCCESS;
    }

    public boolean isSuccess() {
        return this.result == f.SUCCESS;
    }

    public void setResult(f fVar) {
        this.result = fVar;
    }
}
