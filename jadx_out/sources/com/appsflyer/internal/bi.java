package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class bi<ResponseBody> {
    public final AtomicBoolean AFInAppEventParameterName = new AtomicBoolean(false);
    final bj AFInAppEventType;
    final bn<ResponseBody> AFKeystoreWrapper;
    final v valueOf;
    public final ExecutorService values;

    public bi(v vVar, ExecutorService executorService, bj bjVar, bn<ResponseBody> bnVar) {
        this.valueOf = vVar;
        this.values = executorService;
        this.AFInAppEventType = bjVar;
        this.AFKeystoreWrapper = bnVar;
    }
}
