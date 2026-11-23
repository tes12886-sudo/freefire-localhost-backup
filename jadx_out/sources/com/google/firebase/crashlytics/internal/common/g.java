package com.google.firebase.crashlytics.internal.common;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
