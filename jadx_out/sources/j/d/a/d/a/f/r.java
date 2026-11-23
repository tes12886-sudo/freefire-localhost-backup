package j.d.a.d.a.f;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class r implements Executor {
    r() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
