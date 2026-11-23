package com.dts.freefireth;

import android.content.Context;
import com.ano.gshell.AnoApplication;
import h.r.a;

/* JADX INFO: loaded from: classes.dex */
public class FFApplication extends AnoApplication {
    @Override // com.ano.gshell.AnoApplication, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        a.k(this);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
    }
}
