package com.appff.haptic;

/* JADX INFO: loaded from: classes.dex */
class i implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ FFHapticUtils d;

    i(FFHapticUtils fFHapticUtils, String str, int i2, int i3) {
        this.d = fFHapticUtils;
        this.a = str;
        this.b = i2;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.appff.haptic.base.d.a(this.d.mContext).a(this.a, this.b, 0, this.c, 0);
    }
}
