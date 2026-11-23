package com.facebook.j0.r.g;

import java.util.ArrayList;
import java.util.List;
import l.y.c.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final String a;
    private final String b;
    private final List<c> c;
    private final String d;

    public b(JSONObject jSONObject) throws JSONException {
        i.e(jSONObject, "component");
        String string = jSONObject.getString("name");
        i.d(string, "component.getString(PARAMETER_NAME_KEY)");
        this.a = string;
        String strOptString = jSONObject.optString("value");
        i.d(strOptString, "component.optString(PARAMETER_VALUE_KEY)");
        this.b = strOptString;
        String strOptString2 = jSONObject.optString("path_type", "absolute");
        i.d(strOptString2, "component.optString(Cons…tants.PATH_TYPE_ABSOLUTE)");
        this.d = strOptString2;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("path");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                i.d(jSONObject2, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new c(jSONObject2));
            }
        }
        this.c = arrayList;
    }

    public final String a() {
        return this.a;
    }

    public final List<c> b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }
}
