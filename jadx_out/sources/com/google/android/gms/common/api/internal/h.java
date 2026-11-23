package com.google.android.gms.common.api.internal;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public class h {
    private final Object a;

    public h(Activity activity) {
        com.google.android.gms.common.internal.q.l(activity, "Activity must not be null");
        this.a = activity;
    }

    public final Activity a() {
        return (Activity) this.a;
    }

    public final androidx.fragment.app.e b() {
        return (androidx.fragment.app.e) this.a;
    }

    public final boolean c() {
        return this.a instanceof Activity;
    }

    public final boolean d() {
        return this.a instanceof androidx.fragment.app.e;
    }
}
