package j.c.a.e.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appff.haptic.base.Utils;

/* JADX INFO: loaded from: classes.dex */
public class b extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (j.c.a.e.l.c.d(context)) {
            j.c.a.e.l.b.d("NETWORK_CHANGED : true");
            j.c.a.e.l.b.d("SCHEDULE_WAKE_CONNECT");
            j.c.a.e.l.a.g(context, Utils.MAX_DURATION);
            j.c.a.e.a.a().d();
        }
    }
}
