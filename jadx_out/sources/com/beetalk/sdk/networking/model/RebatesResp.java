package com.beetalk.sdk.networking.model;

import com.garena.pay.android.b;
import com.garena.pay.android.ndk.RebateOptionItem;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RebatesResp extends BaseResp {
    private List<RebateOptionItem> rebates;

    public static RebatesResp parse(String str) {
        RebatesResp rebatesResp = new RebatesResp();
        if (str == null) {
            rebatesResp.errorCode = b.NETWORK_RESPONSE_PARSE_FAIL.c().intValue();
            return rebatesResp;
        }
        int errorCode = rebatesResp.parseErrorCode(str);
        rebatesResp.errorCode = errorCode;
        if (errorCode != b.SUCCESS.c().intValue()) {
            return rebatesResp;
        }
        rebatesResp.rebates = RebateOptionItem.parseList(str);
        return rebatesResp;
    }

    public List<RebateOptionItem> getRebates() {
        return this.rebates;
    }

    public void setRebates(List<RebateOptionItem> list) {
        this.rebates = list;
    }
}
