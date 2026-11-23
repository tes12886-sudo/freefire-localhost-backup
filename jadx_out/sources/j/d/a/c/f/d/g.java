package j.d.a.c.f.d;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
final class g {
    static boolean a() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
