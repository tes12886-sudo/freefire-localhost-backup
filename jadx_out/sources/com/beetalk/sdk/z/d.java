package com.beetalk.sdk.z;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public final String a;
    public final String b;

    public d(String str, String str2) {
        this.a = TextUtils.isEmpty(str) ? "" : str;
        this.b = TextUtils.isEmpty(str2) ? "" : str2;
    }

    public String toString() {
        return "[" + this.a + " -> " + this.b + "]";
    }
}
