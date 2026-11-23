package com.google.android.play.core.assetpacks;

/* JADX INFO: loaded from: classes.dex */
final class k0 extends RuntimeException {
    final int a;

    k0(String str) {
        super(str);
        this.a = -1;
    }

    k0(String str, int i2) {
        super(str);
        this.a = i2;
    }

    k0(String str, Exception exc) {
        super(str, exc);
        this.a = -1;
    }

    k0(String str, Exception exc, int i2) {
        super(str, exc);
        this.a = i2;
    }
}
