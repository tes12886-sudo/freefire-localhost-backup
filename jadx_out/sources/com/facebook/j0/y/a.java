package com.facebook.j0.y;

import android.util.Log;
import com.facebook.internal.h0;
import com.facebook.internal.t;
import com.facebook.internal.u;
import com.facebook.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import l.y.c.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static boolean a = false;
    private static final String b = "com.facebook.j0.y.a";
    public static final a e = new a();
    private static final List<C0093a> c = new ArrayList();
    private static final Set<String> d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: com.facebook.j0.y.a$a, reason: collision with other inner class name */
    public static final class C0093a {
        private String a;
        private Map<String, String> b;

        public C0093a(String str, Map<String, String> map) {
            i.e(str, "eventName");
            i.e(map, "restrictiveParams");
            this.a = str;
            this.b = map;
        }

        public final String a() {
            return this.a;
        }

        public final Map<String, String> b() {
            return this.b;
        }

        public final void c(Map<String, String> map) {
            i.e(map, "<set-?>");
            this.b = map;
        }
    }

    private a() {
    }

    public static final void a() {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            a = true;
            e.c();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }

    private final String b(String str, String str2) {
        try {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return null;
            }
            try {
                for (C0093a c0093a : new ArrayList(c)) {
                    if (c0093a != null && i.a(str, c0093a.a())) {
                        for (String str3 : c0093a.b().keySet()) {
                            if (i.a(str2, str3)) {
                                return c0093a.b().get(str3);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                Log.w(b, "getMatchedRuleType failed", e2);
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final void c() {
        String strH;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            t tVarO = u.o(r.g(), false);
            if (tVarO == null || (strH = tVarO.h()) == null) {
                return;
            }
            if (strH.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strH);
            c.clear();
            d.clear();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                    i.d(next, "key");
                    C0093a c0093a = new C0093a(next, new HashMap());
                    if (jSONObjectOptJSONObject != null) {
                        c0093a.c(h0.n(jSONObjectOptJSONObject));
                        c.add(c0093a);
                    }
                    if (jSONObject2.has("process_event_name")) {
                        d.add(c0093a.a());
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final boolean d(String str) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            return d.contains(str);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    public static final String e(String str) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return null;
        }
        try {
            i.e(str, "eventName");
            return (a && e.d(str)) ? "_removed_" : str;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
            return null;
        }
    }

    public static final void f(Map<String, String> map, String str) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            i.e(map, "parameters");
            i.e(str, "eventName");
            if (a) {
                HashMap map2 = new HashMap();
                for (String str2 : new ArrayList(map.keySet())) {
                    String strB = e.b(str, str2);
                    if (strB != null) {
                        map2.put(str2, strB);
                        map.remove(str2);
                    }
                }
                if (!map2.isEmpty()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        map.put("_restrictedParams", jSONObject.toString());
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }
}
