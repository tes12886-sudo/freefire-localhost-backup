package com.appff.haptic.base;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    private static d a;

    public static int a(int i2, int i3) {
        if (i3 < 41 || i3 > 68) {
            if (i2 <= 0 || i2 >= 50) {
                return (i2 < 50 || i2 > 100) ? 0 : 15;
            }
            return 10;
        }
        if (i2 > 0 && i2 < 50) {
            return 15;
        }
        if (i2 < 50 || i2 >= 75) {
            return (i2 < 75 || i2 > 100) ? 0 : 30;
        }
        return 20;
    }

    public static d a(Context context) {
        if (a == null) {
            synchronized (d.class) {
                if (a == null) {
                    a = new com.appff.haptic.a.a(context);
                }
            }
        }
        return a;
    }

    public abstract int a(String str);

    public abstract void a();

    public abstract void a(int i2);

    public abstract void a(int i2, int i3, int i4);

    public abstract void a(File file, int i2, int i3, int i4, int i5);

    public abstract void a(String str, int i2, int i3, int i4, int i5);

    public abstract void b(int i2);

    public abstract void b(int i2, int i3);

    public abstract void b(File file, int i2, int i3, int i4, int i5);

    public abstract void b(String str, int i2, int i3, int i4, int i5);

    public abstract void c(int i2);
}
