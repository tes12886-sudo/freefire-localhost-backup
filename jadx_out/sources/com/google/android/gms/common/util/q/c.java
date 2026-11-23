package com.google.android.gms.common.util.q;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
final class c implements Runnable {
    private final Runnable a;

    public c(Runnable runnable, int i2) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.a.run();
    }
}
