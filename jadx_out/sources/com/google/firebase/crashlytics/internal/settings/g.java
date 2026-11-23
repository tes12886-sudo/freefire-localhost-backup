package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.o;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class g implements f {
    g() {
    }

    private static com.google.firebase.crashlytics.internal.settings.h.a b(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String string = jSONObject2.getString("status");
        boolean zEquals = "new".equals(string);
        String string2 = jSONObject.getString("bundle_id");
        String string3 = jSONObject.getString("org_id");
        String str = zEquals ? "https://update.crashlytics.com/spi/v1/platforms/android/apps" : String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", string2);
        Locale locale = Locale.US;
        return new com.google.firebase.crashlytics.internal.settings.h.a(string, str, String.format(locale, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", string2), String.format(locale, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", string2), string2, string3, jSONObject2.optBoolean("update_required", false), jSONObject2.optInt("report_upload_variant", 0), jSONObject2.optInt("native_report_upload_variant", 0));
    }

    private static com.google.firebase.crashlytics.internal.settings.h.b c(JSONObject jSONObject) {
        return new com.google.firebase.crashlytics.internal.settings.h.b(jSONObject.optBoolean("collect_reports", true));
    }

    private static com.google.firebase.crashlytics.internal.settings.h.c d() {
        return new com.google.firebase.crashlytics.internal.settings.h.c(8, 4);
    }

    private static long e(o oVar, long j2, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return (j2 * 1000) + oVar.a();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.f
    public com.google.firebase.crashlytics.internal.settings.h.e a(o oVar, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        return new com.google.firebase.crashlytics.internal.settings.h.e(e(oVar, iOptInt2, jSONObject), b(jSONObject.getJSONObject("fabric"), jSONObject.getJSONObject("app")), d(), c(jSONObject.getJSONObject("features")), iOptInt, iOptInt2);
    }
}
