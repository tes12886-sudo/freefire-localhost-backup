package j.d.a.c.d;

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
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class j implements ServiceConnection {

    @GuardedBy("this")
    int a;
    final Messenger b;
    s c;

    @GuardedBy("this")
    final Queue<u<?>> d;

    @GuardedBy("this")
    final SparseArray<u<?>> e;
    final /* synthetic */ i f;

    private j(i iVar) {
        this.f = iVar;
        this.a = 0;
        this.b = new Messenger(new j.d.a.c.f.e.e(Looper.getMainLooper(), new Handler.Callback(this) { // from class: j.d.a.c.d.m
            private final j a;

            {
                this.a = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.a.d(message);
            }
        }));
        this.d = new ArrayDeque();
        this.e = new SparseArray<>();
    }

    final void a() {
        this.f.b.execute(new Runnable(this) { // from class: j.d.a.c.d.n
            private final j a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final u<?> uVarPoll;
                final j jVar = this.a;
                while (true) {
                    synchronized (jVar) {
                        if (jVar.a != 2) {
                            return;
                        }
                        if (jVar.d.isEmpty()) {
                            jVar.f();
                            return;
                        } else {
                            uVarPoll = jVar.d.poll();
                            jVar.e.put(uVarPoll.a, uVarPoll);
                            jVar.f.b.schedule(new Runnable(jVar, uVarPoll) { // from class: j.d.a.c.d.p
                                private final j a;
                                private final u b;

                                {
                                    this.a = jVar;
                                    this.b = uVarPoll;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.b(this.b.a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String strValueOf = String.valueOf(uVarPoll);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 8);
                        sb.append("Sending ");
                        sb.append(strValueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context context = jVar.f.a;
                    Messenger messenger = jVar.b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = uVarPoll.c;
                    messageObtain.arg1 = uVarPoll.a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", uVarPoll.d());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", uVarPoll.d);
                    messageObtain.setData(bundle);
                    try {
                        jVar.c.a(messageObtain);
                    } catch (RemoteException e) {
                        jVar.c(2, e.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void b(int i2) {
        u<?> uVar = this.e.get(i2);
        if (uVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i2);
            Log.w("MessengerIpcClient", sb.toString());
            this.e.remove(i2);
            uVar.b(new t(3, "Timed out waiting for response"));
            f();
        }
    }

    final synchronized void c(int i2, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
        }
        int i3 = this.a;
        if (i3 == 0) {
            throw new IllegalStateException();
        }
        if (i3 != 1 && i3 != 2) {
            if (i3 == 3) {
                this.a = 4;
                return;
            } else {
                if (i3 == 4) {
                    return;
                }
                int i4 = this.a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i4);
                throw new IllegalStateException(sb.toString());
            }
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.a = 4;
        com.google.android.gms.common.n.a.b().c(this.f.a, this);
        t tVar = new t(i2, str);
        Iterator<u<?>> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().b(tVar);
        }
        this.d.clear();
        for (int i5 = 0; i5 < this.e.size(); i5++) {
            this.e.valueAt(i5).b(tVar);
        }
        this.e.clear();
    }

    final boolean d(Message message) {
        int i2 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        synchronized (this) {
            u<?> uVar = this.e.get(i2);
            if (uVar == null) {
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(i2);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            this.e.remove(i2);
            f();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                uVar.b(new t(4, "Not supported by GmsCore"));
            } else {
                uVar.a(data);
            }
            return true;
        }
    }

    final synchronized boolean e(u<?> uVar) {
        int i2 = this.a;
        if (i2 == 0) {
            this.d.add(uVar);
            com.google.android.gms.common.internal.q.n(this.a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (com.google.android.gms.common.n.a.b().a(this.f.a, intent, this, 1)) {
                this.f.b.schedule(new Runnable(this) { // from class: j.d.a.c.d.l
                    private final j a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.g();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                c(0, "Unable to bind to service");
            }
            return true;
        }
        if (i2 == 1) {
            this.d.add(uVar);
            return true;
        }
        if (i2 == 2) {
            this.d.add(uVar);
            a();
            return true;
        }
        if (i2 != 3 && i2 != 4) {
            int i3 = this.a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i3);
            throw new IllegalStateException(sb.toString());
        }
        return false;
    }

    final synchronized void f() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            com.google.android.gms.common.n.a.b().c(this.f.a, this);
        }
    }

    final synchronized void g() {
        if (this.a == 1) {
            c(1, "Timed out while binding");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f.b.execute(new Runnable(this, iBinder) { // from class: j.d.a.c.d.o
            private final j a;
            private final IBinder b;

            {
                this.a = this;
                this.b = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j jVar = this.a;
                IBinder iBinder2 = this.b;
                synchronized (jVar) {
                    try {
                        if (iBinder2 == null) {
                            jVar.c(0, "Null service connection");
                            return;
                        }
                        try {
                            jVar.c = new s(iBinder2);
                            jVar.a = 2;
                            jVar.a();
                        } catch (RemoteException e) {
                            jVar.c(0, e.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f.b.execute(new Runnable(this) { // from class: j.d.a.c.d.q
            private final j a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(2, "Service disconnected");
            }
        });
    }
}
