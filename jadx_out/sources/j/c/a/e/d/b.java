package j.c.a.e.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private Context c;
    private boolean d;
    private final Class<? extends j.c.a.e.a> b = j.c.a.e.b.class;
    private String e = "";
    private Messenger f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ServiceConnection f1915g = new ServiceConnectionC0224b();
    private final Messenger a = new Messenger(new c(Looper.getMainLooper()));

    class a implements j.c.a.e.j.c.b {
        a() {
        }

        @Override // j.c.a.e.j.c.b
        public void a(ComponentName componentName) {
            b.this.k(componentName);
        }

        @Override // j.c.a.e.j.c.b
        public void b() {
            b.this.l();
            b.this.k(new ComponentName(b.this.c, (Class<?>) j.c.a.e.b.class));
        }
    }

    /* JADX INFO: renamed from: j.c.a.e.d.b$b, reason: collision with other inner class name */
    class ServiceConnectionC0224b implements ServiceConnection {
        ServiceConnectionC0224b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            j.c.a.e.l.b.a("Service Connected");
            b.this.f = new Messenger(iBinder);
            try {
                Message messageObtain = Message.obtain((Handler) null, 9991);
                messageObtain.replyTo = b.this.a;
                b.this.f.send(messageObtain);
            } catch (RemoteException e) {
                j.c.a.e.l.b.b(e);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            j.c.a.e.l.b.a("Service disconnected");
            b.this.f = null;
        }
    }

    private class c extends Handler {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    b.this.o(Message.obtain((Handler) null, 0));
                } catch (RemoteException e) {
                    j.c.a.e.l.b.b(e);
                }
            }
        }

        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                j.c.a.e.l.b.a("Receive connection ack, request service info");
                try {
                    b.this.o(Message.obtain((Handler) null, 0));
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            }
            b.this.e = ((Bundle) message.obj).getString("REGISTRATION_ID");
            j.c.a.e.l.b.a("Receive Notification Token " + b.this.e);
            if (b.this.e.equals(String.valueOf(-1L))) {
                postDelayed(new a(), 3000L);
                return;
            }
            synchronized (b.this) {
                b.this.notify();
            }
            b.this.p();
        }
    }

    public b(Context context) {
        this.c = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(ComponentName componentName) {
        j.c.a.e.l.b.a("doBindService");
        if (!this.d) {
            this.d = true;
            Intent intent = new Intent();
            intent.setComponent(componentName);
            this.c.bindService(intent, this.f1915g, 1);
            return;
        }
        if (this.f != null) {
            try {
                Message messageObtain = Message.obtain((Handler) null, 9991);
                messageObtain.replyTo = this.a;
                this.f.send(messageObtain);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.c.startService(new Intent(this.c, this.b));
    }

    private void m() {
        if (this.d) {
            j.c.a.e.l.b.a("doUnbindService");
            if (this.f != null) {
                try {
                    Message messageObtain = Message.obtain((Handler) null, 9992);
                    messageObtain.replyTo = this.a;
                    this.f.send(messageObtain);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
            this.c.unbindService(this.f1915g);
            this.d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(Message message) throws RemoteException {
        Messenger messenger;
        j.c.a.e.l.b.a("intend to send message out " + this.d);
        if (!this.d || (messenger = this.f) == null) {
            return;
        }
        message.replyTo = this.a;
        messenger.send(message);
        j.c.a.e.l.b.a("message delivered");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        m();
    }

    public String n() {
        j.c.a.e.l.b.a("Starting service");
        new j.c.a.e.j.c(this.c, new a()).b();
        if (TextUtils.isEmpty(this.e) || this.e.equals(String.valueOf(-1L))) {
            synchronized (this) {
                try {
                    j.c.a.e.l.b.a("lock the worker thread");
                    wait();
                } catch (InterruptedException e) {
                    j.c.a.e.l.b.b(e);
                }
            }
            j.c.a.e.l.b.a("worker thread freed");
        }
        return this.e;
    }
}
