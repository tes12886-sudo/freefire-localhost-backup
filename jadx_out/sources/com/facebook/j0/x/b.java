package com.facebook.j0.x;

import android.os.Bundle;
import com.facebook.internal.h0;
import com.facebook.internal.t;
import java.util.List;
import l.t.u;
import l.y.c.i;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final String a;
    public static final b b = new b();

    static {
        String simpleName = c.class.getSimpleName();
        i.d(simpleName, "RemoteServiceWrapper::class.java.simpleName");
        a = simpleName;
    }

    private b() {
    }

    public static final Bundle a(c.a aVar, String str, List<com.facebook.j0.c> list) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return null;
        }
        try {
            i.e(aVar, "eventType");
            i.e(str, "applicationId");
            i.e(list, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", aVar.toString());
            bundle.putString("app_id", str);
            if (c.a.CUSTOM_APP_EVENTS == aVar) {
                JSONArray jSONArrayB = b.b(list, str);
                if (jSONArrayB.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", jSONArrayB.toString());
            }
            return bundle;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
            return null;
        }
    }

    private final JSONArray b(List<com.facebook.j0.c> list, String str) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<com.facebook.j0.c> listR = u.R(list);
            com.facebook.j0.s.a.d(listR);
            boolean zC = c(str);
            for (com.facebook.j0.c cVar : listR) {
                if (!cVar.g()) {
                    h0.f0(a, "Event with invalid checksum: " + cVar);
                } else if ((!cVar.h()) || (cVar.h() && zC)) {
                    jSONArray.put(cVar.e());
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final boolean c(String str) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            t tVarO = com.facebook.internal.u.o(str, false);
            if (tVarO != null) {
                return tVarO.m();
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }
}
