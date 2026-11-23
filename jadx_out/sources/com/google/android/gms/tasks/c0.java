package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class c0 implements Runnable {
    final /* synthetic */ b0 a;
    final /* synthetic */ Callable b;

    c0(b0 b0Var, Callable callable) {
        this.a = b0Var;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.b(this.b.call());
        } catch (Exception e) {
            this.a.a(e);
        } catch (Throwable th) {
            this.a.a(new RuntimeException(th));
        }
    }
}
