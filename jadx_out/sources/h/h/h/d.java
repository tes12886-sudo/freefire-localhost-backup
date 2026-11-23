package h.h.h;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    private static class a implements Executor {
        private final Handler a;

        a(Handler handler) {
            h.h.k.e.f(handler);
            this.a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Handler handler = this.a;
            h.h.k.e.f(runnable);
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.a + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
