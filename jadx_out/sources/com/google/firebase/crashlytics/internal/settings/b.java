package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.o;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class b implements f {
    b() {
    }

    private static com.google.firebase.crashlytics.internal.settings.h.a b(JSONObject jSONObject) {
        return new com.google.firebase.crashlytics.internal.settings.h.a(jSONObject.getString("status"), jSONObject.getString("url"), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false));
    }

    private static com.google.firebase.crashlytics.internal.settings.h.b c(JSONObject jSONObject) {
        return new com.google.firebase.crashlytics.internal.settings.h.b(jSONObject.optBoolean("collect_reports", true));
    }

    private static com.google.firebase.crashlytics.internal.settings.h.c d(JSONObject jSONObject) {
        return new com.google.firebase.crashlytics.internal.settings.h.c(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    static com.google.firebase.crashlytics.internal.settings.h.d e(o oVar) {
        JSONObject jSONObject = new JSONObject();
        return new com.google.firebase.crashlytics.internal.settings.h.e(f(oVar, 3600L, jSONObject), null, d(jSONObject), c(jSONObject), 0, 3600);
    }

    private static long f(o oVar, long j2, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return (j2 * 1000) + oVar.a();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.f
    public com.google.firebase.crashlytics.internal.settings.h.e a(o oVar, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        return new com.google.firebase.crashlytics.internal.settings.h.e(f(oVar, iOptInt2, jSONObject), b(jSONObject.getJSONObject("app")), d(jSONObject.getJSONObject("session")), c(jSONObject.getJSONObject("features")), iOptInt, iOptInt2);
    }
}
