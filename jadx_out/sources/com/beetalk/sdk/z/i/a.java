package com.beetalk.sdk.z.i;

import com.beetalk.sdk.p;
import com.beetalk.sdk.z.h;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: com.beetalk.sdk.z.i.a$a, reason: collision with other inner class name */
    class C0050a extends HashMap<String, String> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        C0050a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            put("app_id", str);
            put("open_id", str2);
            put("feedback", str3);
        }
    }

    public static JSONObject a(String str, int i2, int i3) {
        int i4;
        if (i2 == p.a.a.intValue()) {
            i4 = 4352;
        } else {
            i4 = p.p() == p.c.PRODUCTION ? 4353 : 4354;
        }
        HashMap map = new HashMap();
        map.put("app_id", str);
        map.put("client_type", String.valueOf(i4));
        map.put("client_version", String.valueOf(i3));
        return h.c().g(p.b(), map);
    }

    public static JSONObject b(String str) {
        return h.c().g(str, new HashMap());
    }

    public static JSONObject c(String str, String str2, String str3) {
        return h.c().n(p.s(), new C0050a(str, str2, str3));
    }
}
