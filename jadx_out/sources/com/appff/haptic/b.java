package com.appff.haptic;

import android.os.VibrationEffect;

/* JADX INFO: loaded from: classes.dex */
class b implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ FFHapticUtils c;

    b(FFHapticUtils fFHapticUtils, int i2, int i3) {
        this.c = fFHapticUtils;
        this.a = i2;
        this.b = i3;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Class cls = this.c.clazzVibrationEffect;
            Class<?> cls2 = Integer.TYPE;
            this.c.vibrator.vibrate((VibrationEffect) cls.getMethod("createExtPreBaked", cls2, cls2).invoke(null, Integer.valueOf(this.a), Integer.valueOf(this.b)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
