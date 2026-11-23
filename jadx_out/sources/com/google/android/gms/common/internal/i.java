package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public i(String str) {
        this(str, null);
    }

    public i(String str, String str2) {
        q.l(str, "log tag cannot be null");
        q.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        if (str2 == null || str2.length() <= 0) {
        }
    }
}
