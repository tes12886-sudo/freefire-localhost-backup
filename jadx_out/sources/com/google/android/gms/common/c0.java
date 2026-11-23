package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
abstract class c0 extends a0 {
    private static final WeakReference c = new WeakReference(null);
    private WeakReference b;

    c0(byte[] bArr) {
        super(bArr);
        this.b = c;
    }

    @Override // com.google.android.gms.common.a0
    final byte[] c1() {
        byte[] bArrP1;
        synchronized (this) {
            bArrP1 = (byte[]) this.b.get();
            if (bArrP1 == null) {
                bArrP1 = p1();
                this.b = new WeakReference(bArrP1);
            }
        }
        return bArrP1;
    }

    protected abstract byte[] p1();
}
