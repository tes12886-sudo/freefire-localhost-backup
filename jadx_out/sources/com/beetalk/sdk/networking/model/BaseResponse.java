package com.beetalk.sdk.networking.model;

import android.text.TextUtils;
import j.d.d.y.c;

/* JADX INFO: loaded from: classes.dex */
public class BaseResponse {

    @c("error")
    public String error = "";

    public String getError() {
        return this.error;
    }

    public boolean hasError() {
        return !TextUtils.isEmpty(this.error);
    }

    public void setError(String str) {
        this.error = str;
    }
}
