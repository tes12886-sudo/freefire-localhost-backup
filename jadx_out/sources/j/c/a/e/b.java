package j.c.a.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import j.c.a.e.f.f;

/* JADX INFO: loaded from: classes.dex */
public class b extends j.c.a.e.a {
    private static j.c.a.e.e.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f1914g;
    private long e = -1;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getIntExtra("command", 0) == 1) {
                j.c.a.e.l.b.a("local action to kill:" + context.getPackageName());
                b.this.g();
            }
        }
    }

    private void j() {
        f.t();
        f = null;
        f1914g = false;
    }

    @Override // j.c.a.e.a
    public void d(Message message) {
        if (message.what != 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("REGISTRATION_ID", String.valueOf(j.c.a.e.i.a.d()));
        bundle.putInt("key_service_version", 4);
        bundle.putBoolean("key_is_running", f1914g);
        Message messageObtain = Message.obtain(null, 1, bundle);
        j.c.a.e.l.b.a("generate the reply " + message.replyTo + "  device:" + String.valueOf(j.c.a.e.i.a.d()));
        h(message.replyTo, messageObtain);
    }

    @Override // j.c.a.e.a
    public void e() {
        f.b();
        this.e = j.c.a.e.l.c.a(j.c.a.e.a.b);
        j.c.a.e.l.b.a("DEVICE_ID : " + this.e);
        j.c.a.e.e.c cVar = f;
        if (cVar != null) {
            cVar.t();
        }
        f = new j.c.a.e.e.c(j.c.a.e.a.b);
        if (j.c.a.e.l.c.d(j.c.a.e.a.b)) {
            f.E();
        } else {
            j.c.a.e.a.d.b();
        }
        j.c.a.e.a.d.a(new a());
        j.c.a.e.l.b.a("Current Service Version: 4");
    }

    @Override // j.c.a.e.a
    protected void f() {
    }

    @Override // j.c.a.e.a
    protected void g() {
        f.p();
        stopSelf();
    }

    @Override // j.c.a.e.a
    protected void i() {
        j.c.a.e.a.d.d();
        j.c.a.e.a.d.c();
    }

    @Override // j.c.a.e.a, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        j();
    }

    @Override // j.c.a.e.a, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        f1914g = true;
        return super.onStartCommand(intent, i2, i3);
    }
}
