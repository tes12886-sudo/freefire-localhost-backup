package j.d.a.e.a.a;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    private static class a implements f {
        private Messenger a;

        public a(Messenger messenger) {
            this.a = messenger;
        }

        private void a(int i2, Bundle bundle) {
            Message messageObtain = Message.obtain((Handler) null, i2);
            messageObtain.setData(bundle);
            try {
                this.a.send(messageObtain);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // j.d.a.e.a.a.f
        public void onDownloadProgress(j.d.a.e.a.a.b bVar) {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("progress", bVar);
            a(11, bundle);
        }

        @Override // j.d.a.e.a.a.f
        public void onDownloadStateChanged(int i2) {
            Bundle bundle = new Bundle(1);
            bundle.putInt("newState", i2);
            a(10, bundle);
        }

        @Override // j.d.a.e.a.a.f
        public void onServiceConnected(Messenger messenger) {
        }
    }

    private static class b implements h {
        private f a;
        private Class<?> b;
        private boolean c;
        private Messenger d;
        private Context e;
        final Messenger f = new Messenger(new a());

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ServiceConnection f1998g = new ServiceConnectionC0234b();

        class a extends Handler {
            a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 10:
                        b.this.a.onDownloadStateChanged(message.getData().getInt("newState"));
                        break;
                    case 11:
                        Bundle data = message.getData();
                        if (b.this.e != null) {
                            data.setClassLoader(b.this.e.getClassLoader());
                            b.this.a.onDownloadProgress((j.d.a.e.a.a.b) message.getData().getParcelable("progress"));
                        }
                        break;
                    case 12:
                        b.this.a.onServiceConnected((Messenger) message.getData().getParcelable(j.d.a.e.a.a.i.g.EXTRA_MESSAGE_HANDLER));
                        break;
                }
            }
        }

        /* JADX INFO: renamed from: j.d.a.e.a.a.c$b$b, reason: collision with other inner class name */
        class ServiceConnectionC0234b implements ServiceConnection {
            ServiceConnectionC0234b() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                b.this.d = new Messenger(iBinder);
                b.this.a.onServiceConnected(b.this.d);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                b.this.d = null;
            }
        }

        public b(f fVar, Class<?> cls) {
            this.a = null;
            this.a = fVar;
            this.b = cls;
        }

        @Override // j.d.a.e.a.a.h
        public void a(Context context) {
            this.e = context;
            Intent intent = new Intent(context, this.b);
            intent.putExtra(j.d.a.e.a.a.i.g.EXTRA_MESSAGE_HANDLER, this.f);
            if (context.bindService(intent, this.f1998g, 2)) {
                this.c = true;
            }
        }

        @Override // j.d.a.e.a.a.h
        public Messenger b() {
            return this.f;
        }

        @Override // j.d.a.e.a.a.h
        public void c(Context context) {
            if (this.c) {
                context.unbindService(this.f1998g);
                this.c = false;
            }
            this.e = null;
        }
    }

    public static f a(Messenger messenger) {
        return new a(messenger);
    }

    public static h b(f fVar, Class<?> cls) {
        return new b(fVar, cls);
    }

    public static int c(Context context, PendingIntent pendingIntent, Class<?> cls) {
        return j.d.a.e.a.a.i.g.startDownloadServiceIfRequired(context, pendingIntent, cls);
    }

    public static int d(Context context, Intent intent, Class<?> cls) {
        return j.d.a.e.a.a.i.g.startDownloadServiceIfRequired(context, intent, cls);
    }
}
