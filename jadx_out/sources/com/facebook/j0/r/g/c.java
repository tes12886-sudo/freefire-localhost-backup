package com.facebook.j0.r.g;

import l.y.c.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final String a;
    private final int b;
    private final int c;
    private final String d;
    private final String e;
    private final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f652h;

    public enum a {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int a;

        a(int i2) {
            this.a = i2;
        }

        public final int a() {
            return this.a;
        }
    }

    public c(JSONObject jSONObject) throws JSONException {
        i.e(jSONObject, "component");
        String string = jSONObject.getString("class_name");
        i.d(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.a = string;
        this.b = jSONObject.optInt("index", -1);
        this.c = jSONObject.optInt("id");
        String strOptString = jSONObject.optString("text");
        i.d(strOptString, "component.optString(PATH_TEXT_KEY)");
        this.d = strOptString;
        String strOptString2 = jSONObject.optString("tag");
        i.d(strOptString2, "component.optString(PATH_TAG_KEY)");
        this.e = strOptString2;
        String strOptString3 = jSONObject.optString("description");
        i.d(strOptString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f = strOptString3;
        String strOptString4 = jSONObject.optString("hint");
        i.d(strOptString4, "component.optString(PATH_HINT_KEY)");
        this.f651g = strOptString4;
        this.f652h = jSONObject.optInt("match_bitmask");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.f651g;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final int f() {
        return this.f652h;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.d;
    }
}
