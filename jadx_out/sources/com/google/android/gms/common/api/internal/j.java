package com.google.android.gms.common.api.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
        this.a.clear();
    }
}
