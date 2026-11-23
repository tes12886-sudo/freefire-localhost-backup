package j.d.a.c.d;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    @GuardedBy("MessengerIpcClient.class")
    private static i e;
    private final Context a;
    private final ScheduledExecutorService b;

    @GuardedBy("this")
    private j c = new j(this);

    @GuardedBy("this")
    private int d = 1;

    private i(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    private final synchronized int a() {
        int i2;
        i2 = this.d;
        this.d = i2 + 1;
        return i2;
    }

    public static synchronized i c(Context context) {
        if (e == null) {
            e = new i(context, j.d.a.c.f.e.a.a().a(1, new com.google.android.gms.common.util.q.a("MessengerIpcClient"), j.d.a.c.f.e.f.b));
        }
        return e;
    }

    private final synchronized <T> Task<T> e(u<T> uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(uVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(strValueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.c.e(uVar)) {
            j jVar = new j(this);
            this.c = jVar;
            jVar.e(uVar);
        }
        return uVar.b.a();
    }

    public final Task<Void> d(int i2, Bundle bundle) {
        return e(new r(a(), 2, bundle));
    }

    public final Task<Bundle> f(int i2, Bundle bundle) {
        return e(new w(a(), 1, bundle));
    }
}
