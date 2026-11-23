package i;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class e implements Closeable {
    private final Object a = new Object();
    private f b;
    private Runnable c;
    private boolean d;

    e(f fVar, Runnable runnable) {
        this.b = fVar;
        this.c = runnable;
    }

    private void c() {
        if (this.d) {
            throw new IllegalStateException("Object already closed");
        }
    }

    void b() {
        synchronized (this.a) {
            c();
            this.c.run();
            close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.a) {
            if (this.d) {
                return;
            }
            this.d = true;
            this.b.O(this);
            this.b = null;
            this.c = null;
        }
    }
}
