package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
class n implements Thread.UncaughtExceptionHandler {
    private final a a;
    private final SettingsDataProvider b;
    private final Thread.UncaughtExceptionHandler c;
    private final AtomicBoolean d = new AtomicBoolean(false);

    interface a {
        void a(SettingsDataProvider settingsDataProvider, Thread thread, Throwable th);
    }

    public n(a aVar, SettingsDataProvider settingsDataProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = aVar;
        this.b = settingsDataProvider;
        this.c = uncaughtExceptionHandler;
    }

    boolean a() {
        return this.d.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        com.google.firebase.crashlytics.internal.a aVarF;
        String str;
        this.d.set(true);
        try {
            if (thread != null) {
                if (th == null) {
                    aVarF = com.google.firebase.crashlytics.internal.a.f();
                    str = "Could not handle uncaught exception; null throwable";
                } else {
                    this.a.a(this.b, thread, th);
                }
            }
            aVarF = com.google.firebase.crashlytics.internal.a.f();
            str = "Could not handle uncaught exception; null thread";
            aVarF.d(str);
        } catch (Exception e) {
            com.google.firebase.crashlytics.internal.a.f().e("An error occurred in the uncaught exception handler", e);
        } finally {
            com.google.firebase.crashlytics.internal.a.f().b("Completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(thread, th);
            this.d.set(false);
        }
    }
}
