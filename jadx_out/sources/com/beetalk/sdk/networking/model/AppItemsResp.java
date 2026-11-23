package com.beetalk.sdk.networking.model;

import com.garena.pay.android.b;
import com.garena.pay.android.data.GGPaymentAppItem;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AppItemsResp extends BaseResp {
    private List<GGPaymentAppItem> appItems;

    public static AppItemsResp parse(String str) {
        AppItemsResp appItemsResp = new AppItemsResp();
        if (str == null) {
            appItemsResp.errorCode = b.NETWORK_RESPONSE_PARSE_FAIL.c().intValue();
            return appItemsResp;
        }
        int errorCode = appItemsResp.parseErrorCode(str);
        appItemsResp.errorCode = errorCode;
        if (errorCode != b.SUCCESS.c().intValue()) {
            return appItemsResp;
        }
        appItemsResp.appItems = GGPaymentAppItem.parseList(str);
        return appItemsResp;
    }

    public List<GGPaymentAppItem> getAppItems() {
        return this.appItems;
    }

    public void setAppItems(List<GGPaymentAppItem> list) {
        this.appItems = list;
    }
}
