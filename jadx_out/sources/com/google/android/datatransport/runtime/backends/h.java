package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static h a(Context context, com.google.android.datatransport.h.z.a aVar, com.google.android.datatransport.h.z.a aVar2, String str) {
        return new c(context, aVar, aVar2, str);
    }

    public abstract Context b();

    public abstract String c();

    public abstract com.google.android.datatransport.h.z.a d();

    public abstract com.google.android.datatransport.h.z.a e();
}
