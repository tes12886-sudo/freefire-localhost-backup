package com.garena.pay.android.j;

import android.content.Context;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static float a;
    private static WeakReference<Context> b;

    public static void a(Context context) {
        WeakReference<Context> weakReference = b;
        if (weakReference == null || weakReference.get() == null) {
            WeakReference<Context> weakReference2 = new WeakReference<>(context.getApplicationContext());
            b = weakReference2;
            b(weakReference2.get().getResources().getDisplayMetrics());
        }
    }

    public static void b(DisplayMetrics displayMetrics) {
        a = displayMetrics.density;
        int i2 = displayMetrics.densityDpi;
        float f = displayMetrics.scaledDensity;
        if (i2 == 120 || i2 == 160 || i2 != 240) {
        }
    }
}
