package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c implements a, BreadcrumbSource {
    private com.google.firebase.crashlytics.internal.breadcrumbs.a a;

    private static String b(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void a(com.google.firebase.crashlytics.internal.breadcrumbs.a aVar) {
        this.a = aVar;
        com.google.firebase.crashlytics.internal.a.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void n(String str, Bundle bundle) {
        com.google.firebase.crashlytics.internal.breadcrumbs.a aVar = this.a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                com.google.firebase.crashlytics.internal.a.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
