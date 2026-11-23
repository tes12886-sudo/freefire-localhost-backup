package com.freefire.vibratefeature;

import android.app.Activity;
import android.os.Vibrator;

/* JADX INFO: loaded from: classes.dex */
public class VibrateUtil {
    public static void StartVibrate(Activity activity, long[] jArr, boolean z) {
        ((Vibrator) activity.getSystemService("vibrator")).vibrate(jArr, z ? 1 : -1);
    }

    public static void StopVibrate(Activity activity) {
        ((Vibrator) activity.getSystemService("vibrator")).cancel();
    }
}
