package com.facebook.j0.u;

import com.facebook.internal.s;
import com.facebook.j0.w.d;
import com.facebook.r;
import java.util.List;
import java.util.Map;
import l.t.u;
import l.y.c.i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static boolean a;
    private static boolean b;
    public static final a c = new a();

    private a() {
    }

    public static final void a() {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            a = true;
            b = s.f("FBSDKFeatureIntegritySample", r.g(), false);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }

    private final String b(String str) {
        String str2;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            String[] strArrO = d.o(d.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            return (strArrO == null || (str2 = strArrO[0]) == null) ? "none" : str2;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public static final void c(Map<String, String> map) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            i.e(map, "parameters");
            if (!a || map.isEmpty()) {
                return;
            }
            try {
                List<String> listP = u.P(map.keySet());
                JSONObject jSONObject = new JSONObject();
                for (String str : listP) {
                    String str2 = map.get(str);
                    if (str2 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    String str3 = str2;
                    a aVar = c;
                    if (aVar.d(str) || aVar.d(str3)) {
                        map.remove(str);
                        if (!b) {
                            str3 = "";
                        }
                        jSONObject.put(str, str3);
                    }
                }
                if (jSONObject.length() != 0) {
                    String string = jSONObject.toString();
                    i.d(string, "restrictiveParamJson.toString()");
                    map.put("_onDeviceParams", string);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }

    private final boolean d(String str) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            return !i.a("none", b(str));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }
}
