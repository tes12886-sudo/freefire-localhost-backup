package com.appff.haptic;

/* JADX INFO: loaded from: classes.dex */
class g implements Runnable {
    final /* synthetic */ StringBuilder a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ FFHapticUtils d;

    g(FFHapticUtils fFHapticUtils, StringBuilder sb, int i2, int i3) {
        this.d = fFHapticUtils;
        this.a = sb;
        this.b = i2;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.appff.haptic.base.d.a(this.d.mContext).a(this.a.toString(), this.b, 0, this.c, 0);
    }
}
