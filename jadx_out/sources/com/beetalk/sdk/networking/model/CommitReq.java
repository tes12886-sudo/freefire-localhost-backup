package com.beetalk.sdk.networking.model;

import com.android.billingclient.api.Purchase;
import com.beetalk.sdk.g;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CommitReq extends BaseReq {
    public static Map<String, String> toParams(Purchase purchase, int i2, int i3) {
        HashMap map = new HashMap();
        g gVarY = g.y();
        if (gVarY != null) {
            if (gVarY.I() != null) {
                map.put("access_token", gVarY.I().b());
            }
            map.put("open_id", gVarY.C());
        }
        map.put("client_type", String.valueOf(2));
        map.put("app_server_id", String.valueOf(i2));
        map.put("app_role_id", String.valueOf(i3));
        map.put("purchase_data", purchase.c());
        map.put("quantity", String.valueOf(purchase.f()));
        map.put("data_signature", purchase.g());
        map.put("flag", "1");
        return map;
    }
}
