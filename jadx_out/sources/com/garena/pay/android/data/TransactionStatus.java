package com.garena.pay.android.data;

/* JADX INFO: loaded from: classes.dex */
public enum TransactionStatus {
    CREATED(6001),
    OPENING(6002),
    OPENED(6003),
    PROCESSED(6004),
    CLOSED(6005),
    CLOSED_WITH_ERROR(6006);

    private int value;

    TransactionStatus(Integer num) {
        this.value = num.intValue();
    }

    public Integer getValue() {
        return Integer.valueOf(this.value);
    }
}
