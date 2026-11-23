package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class x {
    private final Object a = new Object();

    @GuardedBy("mLock")
    private Queue b;

    @GuardedBy("mLock")
    private boolean c;

    x() {
    }

    public final void a(w wVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(wVar);
        }
    }

    public final void b(Task task) {
        w wVar;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        wVar = (w) this.b.poll();
                        if (wVar == null) {
                            this.c = false;
                            return;
                        }
                    }
                    wVar.a(task);
                }
            }
        }
    }
}
