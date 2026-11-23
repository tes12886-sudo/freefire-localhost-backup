package com.google.firebase;

import com.google.android.gms.common.internal.q;

/* JADX INFO: loaded from: classes.dex */
public class g extends Exception {
    @Deprecated
    protected g() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str) {
        super(str);
        q.h(str, "Detail message must not be empty");
    }
}
