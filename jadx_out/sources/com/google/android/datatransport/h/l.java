package com.google.android.datatransport.h;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class l implements Executor {
    private final Executor a;

    static class a implements Runnable {
        private final Runnable a;

        a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.run();
            } catch (Exception e) {
                com.google.android.datatransport.h.v.a.c("Executor", "Background execution failure.", e);
            }
        }
    }

    l(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.a.execute(new a(runnable));
    }
}
