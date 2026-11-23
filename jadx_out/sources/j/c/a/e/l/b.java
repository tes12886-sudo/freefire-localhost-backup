package j.c.a.e.l;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static boolean a;

    public static abstract class a implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            b.d("NETWORK THREAD CRASH");
            b.b(th);
        }
    }

    public static void a(String str) {
        if (a) {
            Log.d("GPNS MSDK", str);
        }
    }

    public static void b(Throwable th) {
        if (a) {
            Log.e("GPNS MSDK", th.getMessage(), th);
        }
    }

    public static void c(String str) {
    }

    public static void d(String str) {
        if (a) {
            Log.i("GPNS MSDK", str);
        }
    }
}
