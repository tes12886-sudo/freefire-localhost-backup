package com.facebook.internal;

import com.appff.haptic.base.Utils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static l f616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f617h = new a(null);
    private final Map<Integer, Set<Integer>> a;
    private final Map<Integer, Set<Integer>> b;
    private final Map<Integer, Set<Integer>> c;
    private final String d;
    private final String e;
    private final String f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        private final l c() {
            return new l(null, l.t.d0.e(l.p.a(2, null), l.p.a(4, null), l.p.a(9, null), l.p.a(17, null), l.p.a(341, null)), l.t.d0.e(l.p.a(102, null), l.p.a(Integer.valueOf(j.d.a.e.a.a.i.g.STATUS_PENDING), null), l.p.a(412, null)), null, null, null);
        }

        private final Map<Integer, Set<Integer>> d(JSONObject jSONObject) {
            int iOptInt;
            HashSet hashSet;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
            if (jSONArrayOptJSONArray.length() == 0) {
                return null;
            }
            HashMap map = new HashMap();
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                    if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        int length2 = jSONArrayOptJSONArray2.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            int iOptInt2 = jSONArrayOptJSONArray2.optInt(i3);
                            if (iOptInt2 != 0) {
                                hashSet.add(Integer.valueOf(iOptInt2));
                            }
                        }
                    }
                    map.put(Integer.valueOf(iOptInt), hashSet);
                }
            }
            return map;
        }

        public final l a(JSONArray jSONArray) {
            String strOptString;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            Map<Integer, Set<Integer>> mapD = null;
            Map<Integer, Set<Integer>> mapD2 = null;
            Map<Integer, Set<Integer>> mapD3 = null;
            String strOptString2 = null;
            String strOptString3 = null;
            String strOptString4 = null;
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("name")) != null) {
                    if (l.d0.p.l(strOptString, "other", true)) {
                        strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapD = d(jSONObjectOptJSONObject);
                    } else if (l.d0.p.l(strOptString, Utils.EVENT_TYPE_HE_TRANSIENT_NAME, true)) {
                        strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapD2 = d(jSONObjectOptJSONObject);
                    } else if (l.d0.p.l(strOptString, "login_recoverable", true)) {
                        strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapD3 = d(jSONObjectOptJSONObject);
                    }
                }
            }
            return new l(mapD, mapD2, mapD3, strOptString2, strOptString3, strOptString4);
        }

        public final synchronized l b() {
            l lVar;
            if (l.f616g == null) {
                l.f616g = l.f617h.c();
            }
            lVar = l.f616g;
            if (lVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return lVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(Map<Integer, ? extends Set<Integer>> map, Map<Integer, ? extends Set<Integer>> map2, Map<Integer, ? extends Set<Integer>> map3, String str, String str2, String str3) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final com.facebook.q.a c(int i2, int i3, boolean z) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (z) {
            return com.facebook.q.a.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.a;
        if (map != null && map.containsKey(Integer.valueOf(i2)) && ((set3 = this.a.get(Integer.valueOf(i2))) == null || set3.contains(Integer.valueOf(i3)))) {
            return com.facebook.q.a.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i2)) && ((set2 = this.c.get(Integer.valueOf(i2))) == null || set2.contains(Integer.valueOf(i3)))) {
            return com.facebook.q.a.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.b;
        return (map3 != null && map3.containsKey(Integer.valueOf(i2)) && ((set = this.b.get(Integer.valueOf(i2))) == null || set.contains(Integer.valueOf(i3)))) ? com.facebook.q.a.TRANSIENT : com.facebook.q.a.OTHER;
    }

    public final String d(com.facebook.q.a aVar) {
        if (aVar != null) {
            int i2 = m.a[aVar.ordinal()];
            if (i2 == 1) {
                return this.d;
            }
            if (i2 == 2) {
                return this.f;
            }
            if (i2 == 3) {
                return this.e;
            }
        }
        return null;
    }
}
