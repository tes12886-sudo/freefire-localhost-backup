package com.google.firebase.analytics.connector.internal;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    final Set<String> a;
    private final com.google.firebase.analytics.a.a.b b;
    private final com.google.android.gms.measurement.a.a c;
    private final c d;

    public d(com.google.android.gms.measurement.a.a aVar, com.google.firebase.analytics.a.a.b bVar) {
        this.b = bVar;
        this.c = aVar;
        c cVar = new c(this);
        this.d = cVar;
        aVar.b(cVar);
        this.a = new HashSet();
    }
}
