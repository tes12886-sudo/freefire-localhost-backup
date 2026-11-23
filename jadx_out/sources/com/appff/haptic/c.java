package com.appff.haptic;

/* JADX INFO: loaded from: classes.dex */
class c implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ FFHapticUtils d;

    c(FFHapticUtils fFHapticUtils, int i2, int i3, int i4) {
        this.d = fFHapticUtils;
        this.a = i2;
        this.b = i3;
        this.c = i4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.appff.haptic.base.d.a(this.d.mContext).a(this.a, this.b, this.c);
    }
}
