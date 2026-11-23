package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
final class w4 extends Thread {
    private final Object a;
    private final BlockingQueue<v4<?>> b;
    private boolean c = false;
    final /* synthetic */ x4 d;

    public w4(x4 x4Var, String str, BlockingQueue<v4<?>> blockingQueue) {
        this.d = x4Var;
        com.google.android.gms.common.internal.q.k(str);
        com.google.android.gms.common.internal.q.k(blockingQueue);
        this.a = new Object();
        this.b = blockingQueue;
        setName(str);
    }

    private final void b() {
        synchronized (this.d.f1300i) {
            if (!this.c) {
                this.d.f1301j.release();
                this.d.f1300i.notifyAll();
                if (this == this.d.c) {
                    x4.z(this.d, null);
                } else if (this == this.d.d) {
                    x4.B(this.d, null);
                } else {
                    this.d.a.d().o().a("Current scheduler thread is neither worker nor network");
                }
                this.c = true;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.d.a.d().r().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.d.f1301j.acquire();
                z = true;
            } catch (InterruptedException e) {
                c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                v4<?> v4VarPoll = this.b.poll();
                if (v4VarPoll == null) {
                    synchronized (this.a) {
                        if (this.b.peek() == null) {
                            x4.w(this.d);
                            try {
                                this.a.wait(30000L);
                            } catch (InterruptedException e2) {
                                c(e2);
                            }
                        }
                    }
                    synchronized (this.d.f1300i) {
                        if (this.b.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(true != v4VarPoll.b ? 10 : threadPriority);
                    v4VarPoll.run();
                }
            }
            if (this.d.a.z().w(null, f3.p0)) {
                b();
            }
            b();
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
