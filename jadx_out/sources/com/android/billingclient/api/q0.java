package com.android.billingclient.api;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    private String a;

    /* synthetic */ q0(p0 p0Var) {
    }

    public final q0 a(String str) {
        this.a = str;
        return this;
    }

    public final s0 b() {
        if (TextUtils.isEmpty(this.a)) {
            throw new IllegalArgumentException("SKU must be set.");
        }
        return new s0(this.a, null, null, 0, null);
    }
}
