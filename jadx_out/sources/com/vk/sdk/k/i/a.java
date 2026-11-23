package com.vk.sdk.k.i;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    private d a;
    private e b = e.Created;
    private boolean c = false;
    private ExecutorService d;

    /* JADX INFO: renamed from: com.vk.sdk.k.i.a$a, reason: collision with other inner class name */
    class RunnableC0164a implements Runnable {
        RunnableC0164a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.a != null) {
                a.this.a.onComplete();
            }
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            try {
                iArr[e.Paused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.Executing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.Canceled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.Finished.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.Ready.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static abstract class c<OperationType extends a, ResponseType> {
        public abstract void a(OperationType operationtype, ResponseType responsetype);

        public abstract void b(OperationType operationtype, com.vk.sdk.k.c cVar);
    }

    public interface d {
        void onComplete();
    }

    public enum e {
        Created,
        Ready,
        Executing,
        Paused,
        Finished,
        Canceled
    }

    public a() {
        f(e.Ready);
    }

    private boolean d(e eVar, e eVar2, boolean z) {
        int i2;
        int[] iArr = b.a;
        int i3 = iArr[eVar.ordinal()];
        if (i3 == 1) {
            return (iArr[eVar2.ordinal()] == 3 || eVar2 == e.Ready) ? false : true;
        }
        if (i3 == 2) {
            int i4 = iArr[eVar2.ordinal()];
            return (i4 == 1 || i4 == 3 || i4 == 4) ? false : true;
        }
        if (i3 == 3 || i3 == 4) {
            return true;
        }
        if (i3 != 5 || (i2 = iArr[eVar2.ordinal()]) == 1 || i2 == 2 || i2 == 3) {
            return false;
        }
        if (i2 != 4) {
            return true;
        }
        return !z;
    }

    public void b() {
        this.c = true;
        f(e.Canceled);
    }

    public void c() {
        RunnableC0164a runnableC0164a = new RunnableC0164a();
        ExecutorService executorService = this.d;
        if (executorService != null) {
            executorService.submit(runnableC0164a);
        } else {
            runnableC0164a.run();
        }
    }

    protected void e(d dVar) {
        this.a = dVar;
    }

    protected void f(e eVar) {
        if (d(this.b, eVar, this.c)) {
            return;
        }
        this.b = eVar;
        if (eVar == e.Finished || eVar == e.Canceled) {
            c();
        }
    }

    public void g(ExecutorService executorService) {
        this.d = executorService;
    }

    protected e h() {
        return this.b;
    }
}
