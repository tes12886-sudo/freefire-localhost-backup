package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public final bj AFInAppEventType;
    public final ExecutorService AFKeystoreWrapper;

    interface a {
        void AFInAppEventType(String str, String str2);

        void AFKeystoreWrapper(String str, Exception exc);
    }

    y() {
    }

    public y(bj bjVar, ExecutorService executorService) {
        this.AFInAppEventType = bjVar;
        this.AFKeystoreWrapper = executorService;
    }
}
