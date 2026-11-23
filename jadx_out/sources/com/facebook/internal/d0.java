package com.facebook.internal;

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
public abstract class d0 implements ServiceConnection {
    private final Context a;
    private final Handler b;
    private b c;
    private boolean d;
    private Messenger e;
    private final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f603j;

    public static final class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                l.y.c.i.e(message, "message");
                d0.this.c(message);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    public interface b {
        void a(Bundle bundle);
    }

    public d0(Context context, int i2, int i3, int i4, String str, String str2) {
        l.y.c.i.e(context, "context");
        l.y.c.i.e(str, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.f = i2;
        this.f600g = i3;
        this.f601h = str;
        this.f602i = i4;
        this.f603j = str2;
        this.b = new a();
    }

    private final void a(Bundle bundle) {
        if (this.d) {
            this.d = false;
            b bVar = this.c;
            if (bVar != null) {
                bVar.a(bundle);
            }
        }
    }

    private final void e() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f601h);
        String str = this.f603j;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        d(bundle);
        Message messageObtain = Message.obtain((Handler) null, this.f);
        messageObtain.arg1 = this.f602i;
        l.y.c.i.d(messageObtain, "request");
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.b);
        try {
            Messenger messenger = this.e;
            if (messenger != null) {
                messenger.send(messageObtain);
            }
        } catch (RemoteException unused) {
            a(null);
        }
    }

    public final void b() {
        this.d = false;
    }

    protected final void c(Message message) {
        l.y.c.i.e(message, "message");
        if (message.what == this.f600g) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                data = null;
            }
            a(data);
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    protected abstract void d(Bundle bundle);

    public final void f(b bVar) {
        this.c = bVar;
    }

    public final boolean g() {
        synchronized (this) {
            boolean z = false;
            if (this.d) {
                return false;
            }
            if (c0.y(this.f602i) == -1) {
                return false;
            }
            Intent intentO = c0.o(this.a);
            if (intentO != null) {
                this.d = true;
                this.a.bindService(intentO, this, 1);
                z = true;
            }
            return z;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        l.y.c.i.e(componentName, "name");
        l.y.c.i.e(iBinder, "service");
        this.e = new Messenger(iBinder);
        e();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        l.y.c.i.e(componentName, "name");
        this.e = null;
        try {
            this.a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
