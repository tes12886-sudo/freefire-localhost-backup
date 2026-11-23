package com.facebook.share.b;

import com.facebook.share.c.r;
import com.facebook.share.c.t;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final j a = new j();

    public interface a {
        JSONObject a(t tVar);
    }

    private j() {
    }

    private final JSONArray a(List<?> list, a aVar) {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(d(it.next(), aVar));
        }
        return jSONArray;
    }

    public static final JSONObject b(com.facebook.share.c.p pVar, a aVar) throws JSONException {
        if (pVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : pVar.d()) {
            jSONObject.put(str, d(pVar.a(str), aVar));
        }
        return jSONObject;
    }

    private final JSONObject c(r rVar, a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : rVar.d()) {
            jSONObject.put(str, d(rVar.a(str), aVar));
        }
        return jSONObject;
    }

    public static final Object d(Object obj, a aVar) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        try {
            if (obj instanceof t) {
                if (aVar != null) {
                    return aVar.a((t) obj);
                }
                return null;
            }
            if (obj instanceof r) {
                return a.c((r) obj, aVar);
            }
            if (obj instanceof List) {
                return a.a((List) obj, aVar);
            }
            return null;
        } catch (Exception unused) {
        }
    }
}
