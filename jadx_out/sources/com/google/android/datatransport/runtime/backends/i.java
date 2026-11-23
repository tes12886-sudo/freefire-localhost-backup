package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
class i {
    private final Context a;
    private final com.google.android.datatransport.h.z.a b;
    private final com.google.android.datatransport.h.z.a c;

    i(Context context, com.google.android.datatransport.h.z.a aVar, com.google.android.datatransport.h.z.a aVar2) {
        this.a = context;
        this.b = aVar;
        this.c = aVar2;
    }

    h a(String str) {
        return h.a(this.a, this.b, this.c, str);
    }
}
