package j.c.a;

import android.content.Context;
import android.os.Build;
import j.c.a.e.l.c;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private static b a;
    private static Context b;
    private static j.c.a.f.a c;

    private b() {
    }

    public static synchronized b a() {
        if (a == null) {
            a = new b();
        }
        return a;
    }

    private String b() {
        int identifier = b.getResources().getIdentifier("gcm_defaultSenderId", "string", b.getPackageName());
        return identifier > 0 ? b.getString(identifier) : "";
    }

    private boolean c() {
        int identifier = b.getResources().getIdentifier("is_using_fcm", "bool", b.getPackageName());
        return identifier != 0 && b.getResources().getBoolean(identifier);
    }

    public static void d(Context context, j.c.a.f.a aVar) {
        b = context.getApplicationContext();
        c = aVar;
    }

    public void e() {
        int i2 = Build.VERSION.SDK_INT >= 24 ? c() ? 4 : 3 : 1;
        j.b.a.a.b("beepost mode: %d", Integer.valueOf(i2));
        Context context = b;
        String string = c.b.toString();
        j.c.a.f.a aVar = c;
        j.c.a.c.a.a.e(context, string, aVar.a, aVar.c, null, b(), i2, String.valueOf(c.a(b)));
    }
}
