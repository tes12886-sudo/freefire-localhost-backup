package com.unity3d.player;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    static final e d;

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2 >= 19;
        b = i2 >= 21;
        boolean z = i2 >= 23;
        c = z;
        d = z ? new h() : null;
    }
}
