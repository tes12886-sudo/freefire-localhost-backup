package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class i implements Runnable {
    final /* synthetic */ Task a;
    final /* synthetic */ j b;

    i(j jVar, Task task) {
        this.b = jVar;
        this.a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isCanceled()) {
            this.b.c.c();
            return;
        }
        try {
            this.b.c.b(this.b.b.a(this.a));
        } catch (b e) {
            if (e.getCause() instanceof Exception) {
                this.b.c.a((Exception) e.getCause());
            } else {
                this.b.c.a(e);
            }
        } catch (Exception e2) {
            this.b.c.a(e2);
        }
    }
}
