package com.beetalk.sdk.z;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public enum f {
    ERR_PARSE(-1, "Failed to parse response"),
    SUCCESS(0, "Success"),
    UNKNOWN(1, "Unknown error"),
    PENDING_TRANSACTION(3, "Pending transaction"),
    ERR_PARAMS(1001, "Error params"),
    ERR_TOKEN(1002, "Error token"),
    ERR_SCOPE(1003, "Error scope"),
    ERR_PLATFORM(1101, "Error user platform"),
    ERR_DISPLAY_RESULT(2000, "Error display result (task error)"),
    ERR_SUBS_BINDING(3001, "Error subscription binding"),
    ERR_SUBS_GET_DETAILS(3002, "Error subscription get details failed");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final SparseArray<f> f552n = new SparseArray<>();
    private final int a;
    private final String b;

    static {
        for (f fVar : values()) {
            f552n.put(fVar.c(), fVar);
        }
    }

    f(int i2, String str) {
        this.a = i2;
        this.b = str;
    }

    public static String e(int i2) {
        return f552n.get(i2, ERR_PARSE).d();
    }

    public int c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }
}
