package j.d.a.c.f.g;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class u extends WeakReference<Throwable> {
    private final int a;

    public u(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == u.class) {
            if (this == obj) {
                return true;
            }
            u uVar = (u) obj;
            if (this.a == uVar.a && get() == uVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
