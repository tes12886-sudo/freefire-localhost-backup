package com.google.firebase.crashlytics.internal.j;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.k;

/* JADX INFO: loaded from: classes.dex */
public class a implements b {
    private final Context a;
    private boolean b = false;
    private String c;

    public a(Context context) {
        this.a = context;
    }

    @Override // com.google.firebase.crashlytics.internal.j.b
    public String a() {
        if (!this.b) {
            this.c = k.A(this.a);
            this.b = true;
        }
        String str = this.c;
        if (str != null) {
            return str;
        }
        return null;
    }
}
