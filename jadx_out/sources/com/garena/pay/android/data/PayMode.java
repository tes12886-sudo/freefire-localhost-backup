package com.garena.pay.android.data;

/* JADX INFO: loaded from: classes.dex */
public enum PayMode {
    WEB_VIEW(1),
    NATIVE(2);

    private int value;

    PayMode(int i2) {
        this.value = i2;
    }

    public int getValue() {
        return this.value;
    }
}
