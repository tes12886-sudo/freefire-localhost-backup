package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class b0 extends a0 {
    private final byte[] b;

    b0(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.b = bArr;
    }

    @Override // com.google.android.gms.common.a0
    final byte[] c1() {
        return this.b;
    }
}
