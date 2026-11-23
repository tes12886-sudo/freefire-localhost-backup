package com.beetalk.sdk.z.i;

import com.beetalk.sdk.g;
import com.beetalk.sdk.p;
import com.beetalk.sdk.x.j;
import com.beetalk.sdk.z.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static JSONObject a() {
        HashMap map = new HashMap();
        map.put("access_token", g.y().I().b());
        map.put("show_uid", "1");
        return h.c().h(p.z(), map, true);
    }

    public static JSONObject b() {
        HashMap map = new HashMap();
        map.put("access_token", g.y().I().b());
        map.put("show_uid", "1");
        return h.c().h(p.x(), map, true);
    }

    public static JSONObject c(List<String> list) {
        HashMap map = new HashMap();
        map.put("access_token", g.y().I().b());
        map.put("friends", j.c(list, ","));
        map.put("platform", String.valueOf(g.y().F().c()));
        return h.c().h(p.y(), map, true);
    }

    public static JSONObject d(com.beetalk.sdk.plugin.e.c.b.c cVar) {
        HashMap map = new HashMap();
        map.put("access_token", cVar.e);
        map.put("app_key", cVar.f);
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = cVar.f528h.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        map.put("to_friends", sb.toString());
        map.put("title", cVar.a);
        map.put("message", cVar.b);
        map.put("image", cVar.c);
        map.put("object_id", cVar.f527g);
        map.put("data", cVar.d);
        return h.c().n(p.J(), map);
    }
}
