package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class w7 {
    final Map<String, Callable<? extends j>> a = new HashMap();

    public final void a(String str, Callable<? extends j> callable) {
        this.a.put(str, callable);
    }
}
