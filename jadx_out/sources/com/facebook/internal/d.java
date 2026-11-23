package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final Map<Class<?>, h> a;

    public static final class a implements h {
        a() {
        }

        @Override // com.facebook.internal.d.h
        public void a(Bundle bundle, String str, Object obj) {
            l.y.c.i.e(bundle, "bundle");
            l.y.c.i.e(str, "key");
            l.y.c.i.e(obj, "value");
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    public static final class b implements h {
        b() {
        }

        @Override // com.facebook.internal.d.h
        public void a(Bundle bundle, String str, Object obj) {
            l.y.c.i.e(bundle, "bundle");
            l.y.c.i.e(str, "key");
            l.y.c.i.e(obj, "value");
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    public static final class c implements h {
        c() {
        }

        @Override // com.facebook.internal.d.h
        public void a(Bundle bundle, String str, Object obj) {
            l.y.c.i.e(bundle, "bundle");
            l.y.c.i.e(str, "key");
            l.y.c.i.e(obj, "value");
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.d$d, reason: collision with other inner class name */
    public static final class C0057d implements h {
        C0057d() {
        }

        @Override // com.facebook.internal.d.h
        public void a(Bundle bundle, String str, Object obj) {
            l.y.c.i.e(bundle, "bundle");
            l.y.c.i.e(str, "key");
            l.y.c.i.e(obj, "value");
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    public static final class e implements h {
        e() {
        }

        @Override // com.facebook.internal.d.h
        public void a(Bundle bundle, String str, Object obj) {
            l.y.c.i.e(bundle, "bundle");
            l.y.c.i.e(str, "key");
            l.y.c.i.e(obj, "value");
            bundle.putString(str, (String) obj);
        }
    }

    public static final class f implements h {
        f() {
        }

        @Override // com.facebook.internal.d.h
        public void a(Bundle bundle, String str, Object obj) {
            l.y.c.i.e(bundle, "bundle");
            l.y.c.i.e(str, "key");
            l.y.c.i.e(obj, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    public static final class g implements h {
        g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.internal.d.h
        public void a(Bundle bundle, String str, Object obj) throws JSONException {
            l.y.c.i.e(bundle, "bundle");
            l.y.c.i.e(str, "key");
            l.y.c.i.e(obj, "value");
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = jSONArray.get(i2);
                if (!(obj2 instanceof String)) {
                    throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                }
                arrayList.add(obj2);
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    public interface h {
        void a(Bundle bundle, String str, Object obj);
    }

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(Boolean.class, new a());
        map.put(Integer.class, new b());
        map.put(Long.class, new c());
        map.put(Double.class, new C0057d());
        map.put(String.class, new e());
        map.put(String[].class, new f());
        map.put(JSONArray.class, new g());
    }

    public static final Bundle a(JSONObject jSONObject) throws JSONException {
        l.y.c.i.e(jSONObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) obj));
                } else {
                    h hVar = a.get(obj.getClass());
                    if (hVar == null) {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                    l.y.c.i.d(next, "key");
                    l.y.c.i.d(obj, "value");
                    hVar.a(bundle, next, obj);
                }
            }
        }
        return bundle;
    }
}
