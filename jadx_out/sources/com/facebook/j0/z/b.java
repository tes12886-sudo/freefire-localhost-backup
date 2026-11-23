package com.facebook.j0.z;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.internal.h0;
import com.facebook.r;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import l.t.d0;
import l.y.c.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static SharedPreferences b;
    public static final b d = new b();
    private static final Map<String, String> a = new LinkedHashMap();
    private static final AtomicBoolean c = new AtomicBoolean(false);

    private b() {
    }

    public static final void a(String str, String str2) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return;
        }
        try {
            i.e(str, "pathID");
            i.e(str2, "predictedEvent");
            if (!c.get()) {
                d.c();
            }
            Map<String, String> map = a;
            map.put(str, str2);
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", h0.i0(d0.l(map))).apply();
            } else {
                i.q("shardPreferences");
                throw null;
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
        }
    }

    public static final String b(View view, String str) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return null;
        }
        try {
            i.e(view, "view");
            i.e(str, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = com.facebook.j0.r.g.f.j(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return h0.C0(jSONObject.toString());
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
            return null;
        }
    }

    private final void c() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = c;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = r.f().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            i.d(sharedPreferences, "FacebookSdk.getApplicati…RE, Context.MODE_PRIVATE)");
            b = sharedPreferences;
            Map<String, String> map = a;
            if (sharedPreferences == null) {
                i.q("shardPreferences");
                throw null;
            }
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
            String str = string != null ? string : "";
            i.d(str, "shardPreferences.getStri…EVENTS_HISTORY, \"\") ?: \"\"");
            map.putAll(h0.d0(str));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public static final String d(String str) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return null;
        }
        try {
            i.e(str, "pathID");
            Map<String, String> map = a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
            return null;
        }
    }
}
