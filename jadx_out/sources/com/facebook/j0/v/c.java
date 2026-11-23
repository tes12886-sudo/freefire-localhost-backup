package com.facebook.j0.v;

import android.content.Context;
import com.facebook.internal.a0;
import com.facebook.internal.h0;
import java.util.Iterator;
import java.util.Map;
import l.p;
import l.t.d0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final Map<a, String> a = d0.e(p.a(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), p.a(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    public static final JSONObject a(a aVar, com.facebook.internal.b bVar, String str, boolean z, Context context) throws JSONException {
        l.y.c.i.e(aVar, "activityType");
        l.y.c.i.e(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", a.get(aVar));
        String strD = com.facebook.j0.g.b.d();
        if (strD != null) {
            jSONObject.put("app_user_id", strD);
        }
        h0.z0(jSONObject, bVar, str, z, context);
        try {
            h0.A0(jSONObject, context);
        } catch (Exception e) {
            a0.f.d(com.facebook.a0.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        JSONObject jSONObjectA = h0.A();
        if (jSONObjectA != null) {
            Iterator<String> itKeys = jSONObjectA.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectA.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
