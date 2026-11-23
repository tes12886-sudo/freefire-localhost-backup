package com.garena.pay.android.data;

/* JADX INFO: loaded from: classes.dex */
public class GGRedeemResultItem {
    private int appPoint;
    private long rebateId;
    private int remainingDays;

    public GGRedeemResultItem(long j2, int i2, int i3) {
        this.rebateId = j2;
        this.appPoint = i2;
        this.remainingDays = i3;
    }

    public int getAppPoint() {
        return this.appPoint;
    }

    public long getRebateId() {
        return this.rebateId;
    }

    public int getRemainingDays() {
        return this.remainingDays;
    }
}
