package j.c.a.e;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends Service {
    protected static Context b;
    protected static j.c.a.e.g.a c;
    protected static j.c.a.e.e.a d;
    final Messenger a = new Messenger(new b());

    private class b extends Handler {
        private b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2;
            switch (message.what) {
                case 9991:
                    i2 = 2;
                    break;
                case 9992:
                    return;
                case 9993:
                    j.c.a.e.l.b.a("MSG_SELFDESTRUCT");
                    a.this.g();
                    i2 = 3;
                    break;
                default:
                    a.this.d(message);
                    return;
            }
            a.this.h(message.replyTo, Message.obtain((Handler) null, i2));
        }
    }

    public static j.c.a.e.e.a a() {
        return d;
    }

    public static j.c.a.e.g.a b() {
        return c;
    }

    public static Context c() {
        return b;
    }

    public abstract void d(Message message);

    public abstract void e();

    protected abstract void f();

    protected abstract void g();

    protected void h(Messenger messenger, Message message) {
        try {
            messenger.send(message);
        } catch (RemoteException e) {
            j.c.a.e.l.b.b(e);
        }
    }

    protected abstract void i();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        j.c.a.e.l.b.a("======== OnCreated " + getPackageName() + " ============");
        b = this;
        c = new j.c.a.e.g.a();
        d = new j.c.a.e.e.a(b);
        e();
        f();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        i();
        j.c.a.e.l.b.a("======== OnDestroy " + getPackageName() + " ============");
        Process.killProcess(Process.myPid());
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        return 1;
    }
}
