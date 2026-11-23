package com.google.android.gms.common.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class h implements e {
    private static final h a = new h();

    private h() {
    }

    public static e d() {
        return a;
    }

    @Override // com.google.android.gms.common.util.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.e
    public final long b() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.common.util.e
    public final long c() {
        return SystemClock.elapsedRealtime();
    }
}
