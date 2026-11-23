package h.a.a;

import android.content.Context;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class a {
    static final ExecutorService a = Executors.newCachedThreadPool();
    static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    private static final Object c = new Object();
    static final AtomicReference<h.a.a.g.a> d = new AtomicReference<>(null);

    /* JADX INFO: renamed from: h.a.a.a$a, reason: collision with other inner class name */
    static class C0179a implements h.g.a.b.c<h.a.a.b> {
        final /* synthetic */ Context a;

        C0179a(Context context) {
            this.a = context;
        }

        @Override // h.g.a.b.c
        public Object a(h.g.a.b.a<h.a.a.b> aVar) {
            a.g(this.a, aVar);
            return "getAdvertisingIdInfo";
        }
    }

    static class b implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ h.g.a.b.a b;

        b(Context context, h.g.a.b.a aVar) {
            this.a = context;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVarB = a.b(this.a);
                a.e(eVarB);
                this.b.b(a.c(eVarB.a()));
            } catch (h.a.a.c | IOException | InterruptedException | TimeoutException e) {
                this.b.d(e);
            }
        }
    }

    static class c implements Runnable {
        final /* synthetic */ Future a;
        final /* synthetic */ h.g.a.b.a b;

        c(Future future, h.g.a.b.a aVar) {
            this.a = future;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.isDone()) {
                return;
            }
            this.b.d(new TimeoutException());
            this.a.cancel(true);
        }
    }

    static class d implements Runnable {
        final /* synthetic */ e a;

        d(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.a.a.g.a aVarA = this.a.a();
            if (aVarA.i(this.a.b())) {
                a.d.compareAndSet(aVarA, null);
            }
        }
    }

    static abstract class e {
        e() {
        }

        static e c(h.a.a.g.a aVar, long j2) {
            return new h.a.a.e(aVar, j2);
        }

        abstract h.a.a.g.a a();

        abstract long b();
    }

    public static j.d.b.a.a.a<h.a.a.b> a(Context context) {
        return h.g.a.b.a(new C0179a(context.getApplicationContext()));
    }

    static e b(Context context) {
        e eVarH = h();
        if (eVarH == null) {
            synchronized (c) {
                eVarH = h();
                if (eVarH == null) {
                    h.a.a.g.a aVar = new h.a.a.g.a(context);
                    d.set(aVar);
                    eVarH = e.c(aVar, 0L);
                }
            }
        }
        return eVarH;
    }

    static h.a.a.b c(h.a.a.g.a aVar) throws h.a.a.c, IOException {
        h.a.a.h.a aVarC = aVar.c();
        try {
            String strE = aVarC.e();
            if (strE == null || strE.trim().isEmpty()) {
                throw new h.a.a.c("Advertising ID Provider does not returns an Advertising ID.");
            }
            h.a.a.b.a aVarA = h.a.a.b.a();
            aVarA.b(strE);
            aVarA.d(aVar.e());
            aVarA.c(aVarC.x0());
            return aVarA.a();
        } catch (RemoteException e2) {
            throw new IOException("Remote exception", e2);
        } catch (RuntimeException e3) {
            throw new h.a.a.c("Advertising ID Provider throws a exception.", e3);
        }
    }

    public static boolean d(Context context) {
        return !h.a.a.d.a(context.getPackageManager()).isEmpty();
    }

    static void e(e eVar) {
        b.schedule(new d(eVar), 30L, TimeUnit.SECONDS);
    }

    private static void f(Future<?> future, h.g.a.b.a<h.a.a.b> aVar) {
        b.schedule(new c(future, aVar), 20L, TimeUnit.SECONDS);
    }

    static void g(Context context, h.g.a.b.a<h.a.a.b> aVar) {
        f(a.submit(new b(context, aVar)), aVar);
    }

    private static e h() {
        h.a.a.g.a aVar = d.get();
        if (aVar == null) {
            return null;
        }
        long jA = aVar.a();
        if (jA >= 0) {
            return e.c(aVar, jA);
        }
        return null;
    }
}
