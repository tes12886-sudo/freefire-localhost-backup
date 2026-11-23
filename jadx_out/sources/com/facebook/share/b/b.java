package com.facebook.share.b;

import java.util.HashMap;
import l.t.d0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final HashMap<Class<?>, d> a = d0.e(l.p.a(String.class, new a()), l.p.a(String[].class, new C0100b()), l.p.a(JSONArray.class, new c()));

    public static final class a implements d {
        a() {
        }

        @Override // com.facebook.share.b.b.d
        public void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            l.y.c.i.e(jSONObject, "json");
            l.y.c.i.e(str, "key");
            jSONObject.put(str, obj);
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.b.b$b, reason: collision with other inner class name */
    public static final class C0100b implements d {
        C0100b() {
        }

        @Override // com.facebook.share.b.b.d
        public void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            l.y.c.i.e(jSONObject, "json");
            l.y.c.i.e(str, "key");
            JSONArray jSONArray = new JSONArray();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String?>");
            }
            for (String str2 : (String[]) obj) {
                jSONArray.put(str2);
            }
            jSONObject.put(str, jSONArray);
        }
    }

    public static final class c implements d {
        c() {
        }

        @Override // com.facebook.share.b.b.d
        public void a(JSONObject jSONObject, String str, Object obj) {
            l.y.c.i.e(jSONObject, "json");
            l.y.c.i.e(str, "key");
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }

    private interface d {
        void a(JSONObject jSONObject, String str, Object obj);
    }

    public static final JSONObject a(com.facebook.share.c.a aVar) {
        if (aVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : aVar.c()) {
            Object objB = aVar.b(str);
            if (objB != null) {
                l.y.c.i.d(objB, "arguments[key] ?: // Nul…orted.\n          continue");
                d dVar = a.get(objB.getClass());
                if (dVar == null) {
                    throw new IllegalArgumentException("Unsupported type: " + objB.getClass());
                }
                l.y.c.i.d(dVar, "SETTERS[value.javaClass]…ype: \" + value.javaClass)");
                l.y.c.i.d(str, "key");
                dVar.a(jSONObject, str, objB);
            }
        }
        return jSONObject;
    }
}
