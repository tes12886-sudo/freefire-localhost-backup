package com.google.android.gms.common.m;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class a {
    private static InterfaceC0124a a;

    /* JADX INFO: renamed from: com.google.android.gms.common.m.a$a, reason: collision with other inner class name */
    public interface InterfaceC0124a {
        @Deprecated
        ScheduledExecutorService a();
    }

    @Deprecated
    public static synchronized InterfaceC0124a a() {
        if (a == null) {
            a = new b();
        }
        return a;
    }
}
