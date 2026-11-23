package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
public class TaskCompletionSource<TResult> {
    private final b0 a = new b0();

    public Task<TResult> a() {
        return this.a;
    }

    public void b(Exception exc) {
        this.a.a(exc);
    }

    public void c(TResult tresult) {
        this.a.b(tresult);
    }

    public boolean d(Exception exc) {
        return this.a.d(exc);
    }

    public boolean e(TResult tresult) {
        return this.a.e(tresult);
    }
}
