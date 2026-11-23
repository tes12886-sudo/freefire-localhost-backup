package com.beetalk.sdk.networking.model;

import com.beetalk.sdk.g;
import com.beetalk.sdk.x.a;
import com.garena.pay.android.d;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class EventCancelReq extends BaseReq {
    public static Map<String, String> toParams(d dVar, String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("access_token", dVar.c().getToken());
        map.put("app_id", dVar.c().getAppId());
        map.put("client_type", String.valueOf(2));
        map.put("app_server_id", String.valueOf(dVar.c().getAppServerId()));
        map.put("app_role_id", String.valueOf(dVar.c().getRoleId()));
        map.put("source", g.y().H().toString());
        map.put("open_id", dVar.c().getBuyerId());
        map.put("item_id", str);
        map.put("event_id", str2);
        map.put("for_channel_id", String.valueOf(201069));
        map.put("event_txn_id", str3);
        a.a("EventInit Post Request Data %s", map.toString());
        return map;
    }
}
