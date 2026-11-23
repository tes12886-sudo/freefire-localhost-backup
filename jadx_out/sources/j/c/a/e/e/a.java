package j.c.a.e.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private BroadcastReceiver c;
    private Context d;
    private boolean b = false;
    private b a = new b();

    public a(Context context) {
        this.d = context;
    }

    public void a(BroadcastReceiver broadcastReceiver) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.garena.android.gpns.local");
        this.d.registerReceiver(broadcastReceiver, intentFilter);
        this.c = broadcastReceiver;
    }

    public void b() {
        if (!this.b) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.d.registerReceiver(this.a, intentFilter);
        }
        this.b = true;
    }

    public void c() {
        BroadcastReceiver broadcastReceiver = this.c;
        if (broadcastReceiver != null) {
            this.d.unregisterReceiver(broadcastReceiver);
        }
    }

    public void d() {
        if (this.b) {
            this.d.unregisterReceiver(this.a);
        }
        this.b = false;
    }
}
