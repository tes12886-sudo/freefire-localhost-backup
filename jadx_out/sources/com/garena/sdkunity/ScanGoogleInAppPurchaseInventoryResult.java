package com.garena.sdkunity;

import com.garena.pay.android.h;

/* JADX INFO: loaded from: classes.dex */
public class ScanGoogleInAppPurchaseInventoryResult {
    public Result[] results;

    public class Result {
        public String error;
        public ItemInfo item;
        public boolean success;

        public class ItemInfo {
            public int amount;
            public boolean isPromotion;
            public String itemName;
            public String itemSku;

            public ItemInfo() {
            }
        }

        public Result() {
        }

        public void Copy(h.a aVar) {
            this.error = aVar.b;
            this.success = aVar.a;
            if (aVar.c != null) {
                ItemInfo itemInfo = new ItemInfo();
                this.item = itemInfo;
                itemInfo.isPromotion = aVar.c.isPromotion();
                this.item.itemName = aVar.c.getItemName();
                this.item.amount = aVar.c.getAmount();
                this.item.itemSku = aVar.c.getItemSku();
            }
        }
    }

    public void Copy(h.a[] aVarArr) {
        if (aVarArr == null) {
            this.results = null;
        }
        this.results = new Result[aVarArr.length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            this.results[i2] = new Result();
            this.results[i2].Copy(aVarArr[i2]);
        }
    }
}
