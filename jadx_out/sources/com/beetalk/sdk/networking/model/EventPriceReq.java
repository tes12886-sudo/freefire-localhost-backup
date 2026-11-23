package com.beetalk.sdk.networking.model;

import android.content.Context;
import com.beetalk.sdk.g;
import com.beetalk.sdk.x.a;
import com.garena.pay.android.d;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class EventPriceReq extends BaseReq {
    public static Map<String, String> toParams(Context context, d dVar, String str) {
        HashMap map = new HashMap();
        map.put("access_token", dVar.c().getToken());
        map.put("open_id", dVar.c().getBuyerId());
        map.put("app_id", dVar.c().getAppId());
        map.put("client_type", String.valueOf(2));
        map.put("app_server_id", String.valueOf(dVar.c().getAppServerId()));
        map.put("app_role_id", String.valueOf(dVar.c().getRoleId()));
        map.put("platform", String.valueOf(dVar.c().getPlatform()));
        map.put("source", g.y().H().toString());
        map.put("locale", com.beetalk.sdk.x.g.f(dVar.c().getLocale() != null ? dVar.c().getLocale() : com.beetalk.sdk.x.g.e(context)));
        map.put("for_channel_id", String.valueOf(201069));
        map.put("region", str);
        a.a("EventPrice Get Request Data %s", map.toString());
        return map;
    }
}
