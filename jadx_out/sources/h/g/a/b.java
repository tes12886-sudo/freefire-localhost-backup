package h.g.a;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    public static final class a<T> {
        Object a;
        d<T> b;
        private h.g.a.c<Void> c = h.g.a.c.s();
        private boolean d;

        a() {
        }

        private void c() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        void a() {
            this.a = null;
            this.b = null;
            this.c.p(null);
        }

        public boolean b(T t) {
            this.d = true;
            d<T> dVar = this.b;
            boolean z = dVar != null && dVar.b(t);
            if (z) {
                c();
            }
            return z;
        }

        public boolean d(Throwable th) {
            this.d = true;
            d<T> dVar = this.b;
            boolean z = dVar != null && dVar.c(th);
            if (z) {
                c();
            }
            return z;
        }

        protected void finalize() {
            h.g.a.c<Void> cVar;
            d<T> dVar = this.b;
            if (dVar != null && !dVar.isDone()) {
                dVar.c(new C0192b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
            }
            if (this.d || (cVar = this.c) == null) {
                return;
            }
            cVar.p(null);
        }
    }

    /* JADX INFO: renamed from: h.g.a.b$b, reason: collision with other inner class name */
    static final class C0192b extends Throwable {
        C0192b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public interface c<T> {
        Object a(a<T> aVar);
    }

    private static final class d<T> implements j.d.b.a.a.a<T> {
        final WeakReference<a<T>> a;
        private final h.g.a.a<T> b = new a();

        class a extends h.g.a.a<T> {
            a() {
            }

            @Override // h.g.a.a
            protected String m() {
                a<T> aVar = d.this.a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.a + "]";
            }
        }

        d(a<T> aVar) {
            this.a = new WeakReference<>(aVar);
        }

        @Override // j.d.b.a.a.a
        public void a(Runnable runnable, Executor executor) {
            this.b.a(runnable, executor);
        }

        boolean b(T t) {
            return this.b.p(t);
        }

        boolean c(Throwable th) {
            return this.b.q(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            a<T> aVar = this.a.get();
            boolean zCancel = this.b.cancel(z);
            if (zCancel && aVar != null) {
                aVar.a();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.b.get();
        }

        @Override // java.util.concurrent.Future
        public T get(long j2, TimeUnit timeUnit) {
            return this.b.get(j2, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.b.isDone();
        }

        public String toString() {
            return this.b.toString();
        }
    }

    public static <T> j.d.b.a.a.a<T> a(c<T> cVar) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.b = dVar;
        aVar.a = cVar.getClass();
        try {
            Object objA = cVar.a(aVar);
            if (objA != null) {
                aVar.a = objA;
            }
        } catch (Exception e) {
            dVar.c(e);
        }
        return dVar;
    }
}
