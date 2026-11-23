package com.garena.pay.android.data;

/* JADX INFO: loaded from: classes.dex */
public class GoogleIapItemInfo {
    private final int mAppPointAmount;
    private final boolean mIsPromotion;
    private final String mItemIconUrl;
    private final String mItemName;
    private final String mItemSku;

    public static class Builder {
        private int appPointAmount;
        private boolean isPromotion;
        private String itemIconUrl;
        private String itemName;
        private String itemSku;

        public Builder appPointAmount(int i2) {
            this.appPointAmount = i2;
            return this;
        }

        public GoogleIapItemInfo build() {
            return new GoogleIapItemInfo(this);
        }

        public Builder isPromotion(boolean z) {
            this.isPromotion = z;
            return this;
        }

        public Builder itemIconUrl(String str) {
            this.itemIconUrl = str;
            return this;
        }

        public Builder itemName(String str) {
            this.itemName = str;
            return this;
        }

        public Builder itemSku(String str) {
            this.itemSku = str;
            return this;
        }
    }

    private GoogleIapItemInfo(Builder builder) {
        this.mItemSku = builder.itemSku;
        this.mItemName = builder.itemName;
        this.mItemIconUrl = builder.itemIconUrl;
        this.mAppPointAmount = builder.appPointAmount;
        this.mIsPromotion = builder.isPromotion;
    }

    public int getAmount() {
        return this.mAppPointAmount;
    }

    public String getItemIcon() {
        return this.mItemIconUrl;
    }

    public String getItemName() {
        return this.mItemName;
    }

    public String getItemSku() {
        return this.mItemSku;
    }

    public boolean isPromotion() {
        return this.mIsPromotion;
    }
}
