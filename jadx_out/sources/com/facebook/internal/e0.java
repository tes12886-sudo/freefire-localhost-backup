package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    private static final ConcurrentHashMap<String, JSONObject> a = new ConcurrentHashMap<>();

    public static final JSONObject a(String str) {
        l.y.c.i.e(str, "accessToken");
        return a.get(str);
    }

    public static final void b(String str, JSONObject jSONObject) {
        l.y.c.i.e(str, "key");
        l.y.c.i.e(jSONObject, "value");
        a.put(str, jSONObject);
    }
}
