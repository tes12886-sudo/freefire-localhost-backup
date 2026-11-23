package com.appff.haptic;

/* JADX INFO: loaded from: classes.dex */
class k implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ FFHapticUtils c;

    k(FFHapticUtils fFHapticUtils, int i2, int i3) {
        this.c = fFHapticUtils;
        this.a = i2;
        this.b = i3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.appff.haptic.base.d.a(this.c.mContext).a(this.a, this.b, 0);
    }
}
