package com.facebook.j0.r.g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import l.y.c.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final b e = new b(null);
    private final String a;
    private final List<com.facebook.j0.r.g.c> b;
    private final List<com.facebook.j0.r.g.b> c;
    private final String d;

    /* JADX INFO: renamed from: com.facebook.j0.r.g.a$a, reason: collision with other inner class name */
    public enum EnumC0078a {
        /* JADX INFO: Fake field, exist only in values array */
        CLICK,
        /* JADX INFO: Fake field, exist only in values array */
        SELECTED,
        /* JADX INFO: Fake field, exist only in values array */
        TEXT_CHANGED
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        public final a a(JSONObject jSONObject) throws JSONException {
            i.e(jSONObject, "mapping");
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString("method");
            i.d(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            i.d(locale, "Locale.ENGLISH");
            if (string2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String upperCase = string2.toUpperCase(locale);
            i.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            c cVarValueOf = c.valueOf(upperCase);
            String string3 = jSONObject.getString("event_type");
            i.d(string3, "mapping.getString(\"event_type\")");
            i.d(locale, "Locale.ENGLISH");
            if (string3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String upperCase2 = string3.toUpperCase(locale);
            i.d(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            EnumC0078a enumC0078aValueOf = EnumC0078a.valueOf(upperCase2);
            String string4 = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                i.d(jSONObject2, "jsonPath");
                arrayList.add(new com.facebook.j0.r.g.c(jSONObject2));
            }
            String strOptString = jSONObject.optString("path_type", "absolute");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i3);
                    i.d(jSONObject3, "jsonParameter");
                    arrayList2.add(new com.facebook.j0.r.g.b(jSONObject3));
                }
            }
            String strOptString2 = jSONObject.optString("component_id");
            String strOptString3 = jSONObject.optString("activity_name");
            i.d(string, "eventName");
            i.d(string4, "appVersion");
            i.d(strOptString2, "componentId");
            i.d(strOptString, "pathType");
            i.d(strOptString3, "activityName");
            return new a(string, cVarValueOf, enumC0078aValueOf, string4, arrayList, arrayList2, strOptString2, strOptString, strOptString3);
        }

        public final List<a> b(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        i.d(jSONObject, "array.getJSONObject(i)");
                        arrayList.add(a(jSONObject));
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }
    }

    public enum c {
        /* JADX INFO: Fake field, exist only in values array */
        MANUAL,
        /* JADX INFO: Fake field, exist only in values array */
        INFERENCE
    }

    public a(String str, c cVar, EnumC0078a enumC0078a, String str2, List<com.facebook.j0.r.g.c> list, List<com.facebook.j0.r.g.b> list2, String str3, String str4, String str5) {
        i.e(str, "eventName");
        i.e(cVar, "method");
        i.e(enumC0078a, "type");
        i.e(str2, "appVersion");
        i.e(list, "path");
        i.e(list2, "parameters");
        i.e(str3, "componentId");
        i.e(str4, "pathType");
        i.e(str5, "activityName");
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = str5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final List<com.facebook.j0.r.g.b> c() {
        List<com.facebook.j0.r.g.b> listUnmodifiableList = Collections.unmodifiableList(this.c);
        i.d(listUnmodifiableList, "Collections.unmodifiableList(parameters)");
        return listUnmodifiableList;
    }

    public final List<com.facebook.j0.r.g.c> d() {
        List<com.facebook.j0.r.g.c> listUnmodifiableList = Collections.unmodifiableList(this.b);
        i.d(listUnmodifiableList, "Collections.unmodifiableList(path)");
        return listUnmodifiableList;
    }
}
