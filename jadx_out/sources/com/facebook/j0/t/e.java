package com.facebook.j0.t;

import android.content.SharedPreferences;
import com.facebook.r;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import l.d0.q;
import l.t.d0;
import l.y.c.i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static SharedPreferences a;
    public static final e d = new e();
    private static final Set<String> b = new CopyOnWriteArraySet();
    private static final Map<String, Long> c = new ConcurrentHashMap();

    private e() {
    }

    public static final boolean d() {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return false;
        }
        try {
            d.g();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = a;
            if (sharedPreferences == null) {
                i.q("sharedPreferences");
                throw null;
            }
            long j2 = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
            if (j2 != 0 && jCurrentTimeMillis - j2 < 86400) {
                return false;
            }
            SharedPreferences sharedPreferences2 = a;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", jCurrentTimeMillis).apply();
                return true;
            }
            i.q("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
            return false;
        }
    }

    public static final void e(Map<String, JSONObject> map, Map<String, ? extends JSONObject> map2) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return;
        }
        try {
            i.e(map, "purchaseDetailsMap");
            i.e(map2, "skuDetailsMap");
            e eVar = d;
            eVar.g();
            eVar.f(eVar.c(eVar.a(map), map2));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
        }
    }

    private final void f(Map<String, String> map) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    com.facebook.j0.v.d.f(key, value, false);
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void g() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = r.f().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = r.f().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = r.f().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            i.d(sharedPreferences3, "getApplicationContext().…RE, Context.MODE_PRIVATE)");
            a = sharedPreferences3;
            Set<String> set = b;
            if (sharedPreferences3 == null) {
                i.q("sharedPreferences");
                throw null;
            }
            Set<String> stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
            if (stringSet == null) {
                stringSet = new HashSet<>();
            }
            set.addAll(stringSet);
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                List listI0 = q.i0(it.next(), new String[]{";"}, false, 2, 2, null);
                c.put((String) listI0.get(0), Long.valueOf(Long.parseLong((String) listI0.get(1))));
            }
            b();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final Map<String, JSONObject> a(Map<String, JSONObject> map) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            i.e(map, "purchaseDetailsMap");
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry entry : d0.l(map).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (c.containsKey(string)) {
                            map.remove(str);
                        } else {
                            b.add(string + ';' + jCurrentTimeMillis);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = a;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", b).apply();
                return new HashMap(map);
            }
            i.q("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public final void b() {
        SharedPreferences.Editor editorPutLong;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = a;
            if (sharedPreferences == null) {
                i.q("sharedPreferences");
                throw null;
            }
            long j2 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j2 == 0) {
                SharedPreferences sharedPreferences2 = a;
                if (sharedPreferences2 == null) {
                    i.q("sharedPreferences");
                    throw null;
                }
                editorPutLong = sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis);
            } else {
                if (jCurrentTimeMillis - j2 <= 604800) {
                    return;
                }
                for (Map.Entry entry : d0.l(c).entrySet()) {
                    String str = (String) entry.getKey();
                    long jLongValue = ((Number) entry.getValue()).longValue();
                    if (jCurrentTimeMillis - jLongValue > 86400) {
                        b.remove(str + ';' + jLongValue);
                        c.remove(str);
                    }
                }
                SharedPreferences sharedPreferences3 = a;
                if (sharedPreferences3 == null) {
                    i.q("sharedPreferences");
                    throw null;
                }
                editorPutLong = sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", b).putLong("LAST_CLEARED_TIME", jCurrentTimeMillis);
            }
            editorPutLong.apply();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final Map<String, String> c(Map<String, ? extends JSONObject> map, Map<String, ? extends JSONObject> map2) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            i.e(map, "purchaseDetailsMap");
            i.e(map2, "skuDetailsMap");
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends JSONObject> entry : map.entrySet()) {
                String key = entry.getKey();
                JSONObject value = entry.getValue();
                JSONObject jSONObject = map2.get(key);
                if (value != null && value.has("purchaseTime")) {
                    try {
                        if (jCurrentTimeMillis - (value.getLong("purchaseTime") / 1000) <= 86400 && jSONObject != null) {
                            String string = value.toString();
                            i.d(string, "purchaseDetail.toString()");
                            String string2 = jSONObject.toString();
                            i.d(string2, "skuDetail.toString()");
                            linkedHashMap.put(string, string2);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }
}
