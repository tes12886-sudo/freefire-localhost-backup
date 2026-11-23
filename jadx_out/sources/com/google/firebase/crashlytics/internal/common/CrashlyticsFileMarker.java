package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class CrashlyticsFileMarker {
    private final String a;
    private final com.google.firebase.crashlytics.internal.g.h b;

    public CrashlyticsFileMarker(String str, com.google.firebase.crashlytics.internal.g.h hVar) {
        this.a = str;
        this.b = hVar;
    }

    private File b() {
        return new File(this.b.b(), this.a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e) {
            com.google.firebase.crashlytics.internal.a.f().e("Error creating marker: " + this.a, e);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
