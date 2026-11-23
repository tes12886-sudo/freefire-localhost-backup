package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class j2 implements ThreadFactory {
    private final /* synthetic */ int a = 0;
    static final ThreadFactory c = new j2(null);
    static final ThreadFactory b = new j2();

    private j2() {
    }

    private j2(byte[] bArr) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return this.a != 0 ? new Thread(runnable, "AssetPackBackgroundExecutor") : new Thread(runnable, "UpdateListenerExecutor");
    }
}
