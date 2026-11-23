package com.beetalk.sdk.networking.model;

import android.content.Context;
import android.text.TextUtils;
import com.beetalk.sdk.x.a;
import com.beetalk.sdk.x.g;
import com.garena.pay.android.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ChannelsReq extends BaseReq {
    public static Map<String, String> toParams(Context context, d dVar) {
        HashMap map = new HashMap();
        map.put("access_token", dVar.c().getToken());
        map.put("locale", g.f(dVar.c().getLocale() != null ? dVar.c().getLocale() : g.e(context)));
        map.put("app_id", dVar.c().getAppId());
        map.put("open_id", dVar.c().getBuyerId());
        map.put("source", com.beetalk.sdk.g.y().H().toString());
        map.put("platform", String.valueOf(dVar.c().getPlatform()));
        map.put("client_type", String.valueOf(2));
        map.put("app_server_id", String.valueOf(dVar.c().getAppServerId()));
        map.put("app_role_id", String.valueOf(dVar.c().getRoleId()));
        List<String> itemIds = dVar.c().getItemIds();
        if (itemIds != null && !itemIds.isEmpty()) {
            map.put("for_item_ids", TextUtils.join(",", itemIds));
        }
        List<String> rebateIds = dVar.c().getRebateIds();
        if (rebateIds != null && !rebateIds.isEmpty()) {
            map.put("for_rebate_ids", TextUtils.join(",", rebateIds));
        }
        List<String> appItemIds = dVar.c().getAppItemIds();
        if (appItemIds != null && !appItemIds.isEmpty()) {
            map.put("for_app_item_ids", TextUtils.join(",", appItemIds));
        }
        a.a("Channel Get Request Data %s", map.toString());
        return map;
    }
}
