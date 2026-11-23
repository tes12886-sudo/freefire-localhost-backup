package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static <R extends j> f<R> a(R r, e eVar) {
        com.google.android.gms.common.internal.q.l(r, "Result must not be null");
        com.google.android.gms.common.internal.q.b(!r.c().n(), "Status code must not be SUCCESS");
        q qVar = new q(eVar, r);
        qVar.j(r);
        return qVar;
    }

    public static f<Status> b(Status status, e eVar) {
        com.google.android.gms.common.internal.q.l(status, "Result must not be null");
        com.google.android.gms.common.api.internal.q qVar = new com.google.android.gms.common.api.internal.q(eVar);
        qVar.j(status);
        return qVar;
    }
}
