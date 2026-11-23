package com.facebook.j0.q;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import l.d0.q;
import l.y.c.f;
import l.y.c.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final List<String> a;
    private final String b;
    private final String c;
    public static final a e = new a(null);
    private static final Set<c> d = new CopyOnWriteArraySet();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        private final void a(JSONObject jSONObject) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("k");
                    String strOptString2 = jSONObjectOptJSONObject.optString("v");
                    i.d(strOptString, "k");
                    if (!(strOptString.length() == 0)) {
                        Set setA = c.a();
                        i.d(next, "key");
                        List listI0 = q.i0(strOptString, new String[]{","}, false, 0, 6, null);
                        i.d(strOptString2, "v");
                        setA.add(new c(next, listI0, strOptString2, null));
                    }
                }
            }
        }

        public final Set<String> b() {
            HashSet hashSet = new HashSet();
            Iterator it = c.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((c) it.next()).c());
            }
            return hashSet;
        }

        public final Set<c> c() {
            return new HashSet(c.a());
        }

        public final void d(String str) {
            i.e(str, "rulesFromServer");
            try {
                c.a().clear();
                a(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
    }

    private c(String str, List<String> list, String str2) {
        this.b = str;
        this.c = str2;
        this.a = list;
    }

    public /* synthetic */ c(String str, List list, String str2, f fVar) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set a() {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public final List<String> b() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.a);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public final String c() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            return this.b;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public final String d() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            return this.c;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }
}
