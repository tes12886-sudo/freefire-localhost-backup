package com.appff.haptic;

/* JADX INFO: loaded from: classes.dex */
class h implements Runnable {
    final /* synthetic */ StringBuilder a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ FFHapticUtils f;

    h(FFHapticUtils fFHapticUtils, StringBuilder sb, int i2, int i3, int i4, int i5) {
        this.f = fFHapticUtils;
        this.a = sb;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.appff.haptic.base.d.a(this.f.mContext).a(this.a.toString(), this.b, this.c, this.d, this.e);
    }
}
