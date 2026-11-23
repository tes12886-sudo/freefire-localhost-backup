package com.beetalk.sdk.z.i;

import com.beetalk.sdk.g;
import com.beetalk.sdk.p;
import com.beetalk.sdk.z.h;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static JSONObject a() {
        HashMap map = new HashMap();
        map.put("access_token", g.y().I().b());
        return h.c().h(p.M(), map, true);
    }
}
