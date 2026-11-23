package com.appff.haptic;

import android.os.VibrationEffect;

/* JADX INFO: loaded from: classes.dex */
class e implements Runnable {
    final /* synthetic */ int[] a;
    final /* synthetic */ int[] b;
    final /* synthetic */ int[] c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;
    final /* synthetic */ FFHapticUtils f;

    e(FFHapticUtils fFHapticUtils, int[] iArr, int[] iArr2, int[] iArr3, boolean z, int i2) {
        this.f = fFHapticUtils;
        this.a = iArr;
        this.b = iArr2;
        this.c = iArr3;
        this.d = z;
        this.e = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f.vibrator.vibrate((VibrationEffect) this.f.clazzVibrationEffect.getMethod("createEnvelope", int[].class, int[].class, int[].class, Boolean.TYPE, Integer.TYPE).invoke(null, this.a, this.b, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
