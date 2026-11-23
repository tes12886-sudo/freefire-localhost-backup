package com.facebook.j0.s;

import com.facebook.internal.h0;
import com.facebook.internal.t;
import com.facebook.internal.u;
import com.facebook.j0.c;
import com.facebook.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l.y.c.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static boolean a;
    public static final a d = new a();
    private static final List<C0079a> b = new ArrayList();
    private static final Set<String> c = new HashSet();

    /* JADX INFO: renamed from: com.facebook.j0.s.a$a, reason: collision with other inner class name */
    public static final class C0079a {
        private String a;
        private List<String> b;

        public C0079a(String str, List<String> list) {
            i.e(str, "eventName");
            i.e(list, "deprecateParams");
            this.a = str;
            this.b = list;
        }

        public final List<String> a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final void c(List<String> list) {
            i.e(list, "<set-?>");
            this.b = list;
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
            d.b();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }

    private final synchronized void b() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            t tVarO = u.o(r.g(), false);
            if (tVarO == null) {
                return;
            }
            String strH = tVarO.h();
            if (strH != null) {
                if (strH.length() > 0) {
                    JSONObject jSONObject = new JSONObject(strH);
                    b.clear();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        if (jSONObject2 != null) {
                            if (jSONObject2.optBoolean("is_deprecated_event")) {
                                Set<String> set = c;
                                i.d(next, "key");
                                set.add(next);
                            } else {
                                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                i.d(next, "key");
                                C0079a c0079a = new C0079a(next, new ArrayList());
                                if (jSONArrayOptJSONArray != null) {
                                    c0079a.c(h0.l(jSONArrayOptJSONArray));
                                }
                                b.add(c0079a);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public static final void c(Map<String, String> map, String str) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            i.e(map, "parameters");
            i.e(str, "eventName");
            if (a) {
                ArrayList<String> arrayList = new ArrayList(map.keySet());
                for (C0079a c0079a : new ArrayList(b)) {
                    if (!(!i.a(c0079a.b(), str))) {
                        for (String str2 : arrayList) {
                            if (c0079a.a().contains(str2)) {
                                map.remove(str2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }

    public static final void d(List<c> list) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            i.e(list, "events");
            if (a) {
                Iterator<c> it = list.iterator();
                while (it.hasNext()) {
                    if (c.contains(it.next().f())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }
}
