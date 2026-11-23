package com.google.android.gms.common.m;

import j.d.a.c.f.f.h;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
final class b implements a.InterfaceC0124a {
    b() {
    }

    @Override // com.google.android.gms.common.m.a.InterfaceC0124a
    public final ScheduledExecutorService a() {
        h.a();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
