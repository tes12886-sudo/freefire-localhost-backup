package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class v3 implements Runnable {
    private final u3 a;
    private final int b;
    private final Throwable c;
    private final byte[] d;
    private final String e;
    private final Map<String, List<String>> f;

    /* synthetic */ v3(String str, u3 u3Var, int i2, Throwable th, byte[] bArr, Map map, t3 t3Var) {
        com.google.android.gms.common.internal.q.k(u3Var);
        this.a = u3Var;
        this.b = i2;
        this.c = th;
        this.d = bArr;
        this.e = str;
        this.f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.e, this.b, this.c, this.d, this.f);
    }
}
