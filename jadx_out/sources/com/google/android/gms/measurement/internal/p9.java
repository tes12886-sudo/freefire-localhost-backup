package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class p9 implements u3 {
    final /* synthetic */ String a;
    final /* synthetic */ v9 b;

    p9(v9 v9Var, String str) {
        this.b = v9Var;
        this.a = str;
    }

    @Override // com.google.android.gms.measurement.internal.u3
    public final void a(String str, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.b.h(i2, th, bArr, this.a);
    }
}
