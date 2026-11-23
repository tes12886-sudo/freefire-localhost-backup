package com.google.firebase.crashlytics.internal.g;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class i implements h {
    private final Context a;

    public i(Context context) {
        this.a = context;
    }

    @Override // com.google.firebase.crashlytics.internal.g.h
    public String a() {
        return new File(this.a.getFilesDir(), ".com.google.firebase.crashlytics").getPath();
    }

    @Override // com.google.firebase.crashlytics.internal.g.h
    public File b() {
        return c(new File(this.a.getFilesDir(), ".com.google.firebase.crashlytics"));
    }

    File c(File file) {
        com.google.firebase.crashlytics.internal.a aVarF;
        String str;
        if (file == null) {
            aVarF = com.google.firebase.crashlytics.internal.a.f();
            str = "Null File";
        } else {
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            aVarF = com.google.firebase.crashlytics.internal.a.f();
            str = "Couldn't create file";
        }
        aVarF.k(str);
        return null;
    }
}
