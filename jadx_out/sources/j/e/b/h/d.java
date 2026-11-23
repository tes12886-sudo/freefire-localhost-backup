package j.e.b.h;

import android.content.Context;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final j.e.a.a.a.d a = new j.e.a.a.a.d("com.linecorp.linesdk.sharedpreference.encryptionsalt");
    private static volatile boolean b = false;

    private static class a implements Runnable {
        private final Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.a.b(this.a);
        }
    }

    public static j.e.a.a.a.d a() {
        return a;
    }

    public static void b(Context context) {
        if (b) {
            return;
        }
        b = true;
        Executors.newSingleThreadExecutor().execute(new a(context.getApplicationContext()));
    }
}
