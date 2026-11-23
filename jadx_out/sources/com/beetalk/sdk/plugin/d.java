package com.beetalk.sdk.plugin;

import com.beetalk.sdk.u.f;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static Vector<com.beetalk.sdk.u.b> a(JSONObject jSONObject) {
        Vector<com.beetalk.sdk.u.b> vector = new Vector<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("friends_groups");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                com.beetalk.sdk.u.b bVar = new com.beetalk.sdk.u.b();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                jSONObject2.optInt("platform");
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("friends");
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("uids");
                int length = jSONArrayOptJSONArray == null ? 0 : jSONArrayOptJSONArray.length();
                int length2 = jSONArrayOptJSONArray2 == null ? 0 : jSONArrayOptJSONArray2.length();
                bVar.a = new Vector<>(length);
                bVar.b = new Vector<>(length);
                if (jSONArrayOptJSONArray != null) {
                    for (int i3 = 0; i3 < length; i3++) {
                        com.beetalk.sdk.u.d dVar = new com.beetalk.sdk.u.d();
                        dVar.a = jSONArrayOptJSONArray.getString(i3);
                        if (i3 < length2) {
                            jSONArrayOptJSONArray2.getLong(i3);
                        }
                        bVar.a.add(dVar.a);
                        bVar.b.add(dVar);
                    }
                }
                vector.add(bVar);
            }
            return vector;
        } catch (Exception e) {
            com.beetalk.sdk.x.a.b(e);
            return null;
        }
    }

    public static Vector<f> b(JSONObject jSONObject) {
        Vector<f> vector = new Vector<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("friends");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                f fVar = new f();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                jSONObject2.optString("open_id");
                jSONObject2.optInt("platform");
                jSONObject2.optInt("gender");
                jSONObject2.optString("nickname");
                jSONObject2.optString("icon");
                vector.add(fVar);
            }
            return vector;
        } catch (JSONException e) {
            com.beetalk.sdk.x.a.b(e);
            return null;
        }
    }
}
