package com.google.firebase.crashlytics.internal.i;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final e d;

    public e(Throwable th, d dVar) {
        this.a = th.getLocalizedMessage();
        this.b = th.getClass().getName();
        this.c = dVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.d = cause != null ? new e(cause, dVar) : null;
    }
}
