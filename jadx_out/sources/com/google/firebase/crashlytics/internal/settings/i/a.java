package com.google.firebase.crashlytics.internal.settings.i;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.f.c;
import com.google.firebase.crashlytics.internal.settings.h.f;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a implements b {
    private final String a;
    private final com.google.firebase.crashlytics.internal.f.b b;
    private final com.google.firebase.crashlytics.internal.a c;

    public a(String str, com.google.firebase.crashlytics.internal.f.b bVar) {
        this(str, bVar, com.google.firebase.crashlytics.internal.a.f());
    }

    a(String str, com.google.firebase.crashlytics.internal.f.b bVar, com.google.firebase.crashlytics.internal.a aVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.c = aVar;
        this.b = bVar;
        this.a = str;
    }

    private com.google.firebase.crashlytics.internal.f.a b(com.google.firebase.crashlytics.internal.f.a aVar, f fVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", fVar.a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", CrashlyticsCore.getVersion());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", fVar.b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", fVar.c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", fVar.d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", fVar.e.a());
        return aVar;
    }

    private void c(com.google.firebase.crashlytics.internal.f.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            this.c.l("Failed to parse settings JSON from " + this.a, e);
            this.c.k("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(f fVar) {
        HashMap map = new HashMap();
        map.put("build_version", fVar.f1433h);
        map.put("display_version", fVar.f1432g);
        map.put("source", Integer.toString(fVar.f1434i));
        String str = fVar.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.i.b
    public JSONObject a(f fVar, boolean z) {
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map<String, String> mapF = f(fVar);
            com.google.firebase.crashlytics.internal.f.a aVarD = d(mapF);
            b(aVarD, fVar);
            this.c.b("Requesting settings from " + this.a);
            this.c.i("Settings query params were: " + mapF);
            return g(aVarD.c());
        } catch (IOException e) {
            this.c.e("Settings request failed.", e);
            return null;
        }
    }

    protected com.google.firebase.crashlytics.internal.f.a d(Map<String, String> map) {
        com.google.firebase.crashlytics.internal.f.a aVarA = this.b.a(this.a, map);
        aVarA.d("User-Agent", "Crashlytics Android SDK/" + CrashlyticsCore.getVersion());
        aVarA.d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return aVarA;
    }

    JSONObject g(c cVar) {
        int iB = cVar.b();
        this.c.i("Settings response code was: " + iB);
        if (h(iB)) {
            return e(cVar.a());
        }
        this.c.d("Settings request failed; (status: " + iB + ") from " + this.a);
        return null;
    }

    boolean h(int i2) {
        return i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203;
    }
}
