package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.o;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private final o a;

    e(o oVar) {
        this.a = oVar;
    }

    private static f a(int i2) {
        return i2 != 3 ? new b() : new g();
    }

    public com.google.firebase.crashlytics.internal.settings.h.e b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.a, jSONObject);
    }
}
