package n;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class a extends y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0279a f2344h = new C0279a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f2345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f2346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static a f2347k;
    private boolean e;
    private a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f2348g;

    /* JADX INFO: renamed from: n.a$a, reason: collision with other inner class name */
    public static final class C0279a {
        private C0279a() {
        }

        public /* synthetic */ C0279a(l.y.c.f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(a aVar) {
            synchronized (a.class) {
                if (!aVar.e) {
                    return false;
                }
                aVar.e = false;
                for (a aVar2 = a.f2347k; aVar2 != null; aVar2 = aVar2.f) {
                    if (aVar2.f == aVar) {
                        aVar2.f = aVar.f;
                        aVar.f = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:22:0x005f A[Catch: all -> 0x009d, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0014, B:9:0x0026, B:12:0x0032, B:13:0x003b, B:19:0x004e, B:20:0x0056, B:22:0x005f, B:25:0x006f, B:26:0x0074, B:28:0x0084, B:29:0x0087, B:18:0x0047, B:32:0x008b, B:33:0x0090, B:34:0x0091, B:35:0x009c), top: B:41:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:25:0x006f A[Catch: all -> 0x009d, LOOP:0: B:20:0x0056->B:25:0x006f, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0014, B:9:0x0026, B:12:0x0032, B:13:0x003b, B:19:0x004e, B:20:0x0056, B:22:0x005f, B:25:0x006f, B:26:0x0074, B:28:0x0084, B:29:0x0087, B:18:0x0047, B:32:0x008b, B:33:0x0090, B:34:0x0091, B:35:0x009c), top: B:41:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x0084 A[Catch: all -> 0x009d, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0014, B:9:0x0026, B:12:0x0032, B:13:0x003b, B:19:0x004e, B:20:0x0056, B:22:0x005f, B:25:0x006f, B:26:0x0074, B:28:0x0084, B:29:0x0087, B:18:0x0047, B:32:0x008b, B:33:0x0090, B:34:0x0091, B:35:0x009c), top: B:41:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x0074 A[EDGE_INSN: B:42:0x0074->B:26:0x0074 BREAK  A[LOOP:0: B:20:0x0056->B:25:0x006f], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:43:0x006e A[SYNTHETIC] */
        public final void e(a aVar, long j2, boolean z) {
            long jW;
            a aVar2;
            a aVar3;
            synchronized (a.class) {
                if (!(!aVar.e)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                aVar.e = true;
                if (a.f2347k == null) {
                    C0279a c0279a = a.f2344h;
                    a.f2347k = new a();
                    new b().start();
                }
                long jNanoTime = System.nanoTime();
                if (j2 == 0 || !z) {
                    if (j2 == 0) {
                        if (!z) {
                            throw new AssertionError();
                        }
                        aVar.f2348g = aVar.c();
                    }
                    jW = aVar.w(jNanoTime);
                    aVar2 = a.f2347k;
                    while (true) {
                        l.y.c.i.c(aVar2);
                        if (aVar2.f != null) {
                            break;
                        }
                        aVar3 = aVar2.f;
                        l.y.c.i.c(aVar3);
                        if (jW < aVar3.w(jNanoTime)) {
                            break;
                        } else {
                            aVar2 = aVar2.f;
                        }
                    }
                    aVar.f = aVar2.f;
                    aVar2.f = aVar;
                    if (aVar2 == a.f2347k) {
                        a.class.notify();
                    }
                    l.s sVar = l.s.a;
                } else {
                    j2 = Math.min(j2, aVar.c() - jNanoTime);
                }
                aVar.f2348g = j2 + jNanoTime;
                jW = aVar.w(jNanoTime);
                aVar2 = a.f2347k;
                while (true) {
                    l.y.c.i.c(aVar2);
                    if (aVar2.f != null) {
                        break;
                        break;
                    }
                    aVar3 = aVar2.f;
                    l.y.c.i.c(aVar3);
                    if (jW < aVar3.w(jNanoTime)) {
                        break;
                        break;
                    }
                    aVar2 = aVar2.f;
                }
                aVar.f = aVar2.f;
                aVar2.f = aVar;
                if (aVar2 == a.f2347k) {
                    a.class.notify();
                }
                l.s sVar2 = l.s.a;
            }
        }

        public final a c() throws InterruptedException {
            a aVar = a.f2347k;
            l.y.c.i.c(aVar);
            a aVar2 = aVar.f;
            long jNanoTime = System.nanoTime();
            if (aVar2 == null) {
                a.class.wait(a.f2345i);
                a aVar3 = a.f2347k;
                l.y.c.i.c(aVar3);
                if (aVar3.f != null || System.nanoTime() - jNanoTime < a.f2346j) {
                    return null;
                }
                return a.f2347k;
            }
            long jW = aVar2.w(jNanoTime);
            if (jW > 0) {
                long j2 = jW / 1000000;
                a.class.wait(j2, (int) (jW - (1000000 * j2)));
                return null;
            }
            a aVar4 = a.f2347k;
            l.y.c.i.c(aVar4);
            aVar4.f = aVar2.f;
            aVar2.f = null;
            return aVar2;
        }
    }

    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a aVarC;
            while (true) {
                try {
                    synchronized (a.class) {
                        try {
                            aVarC = a.f2344h.c();
                            if (aVarC == a.f2347k) {
                                a.f2347k = null;
                                return;
                            }
                            l.s sVar = l.s.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (aVarC != null) {
                        aVarC.z();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public static final class c implements v {
        final /* synthetic */ v b;

        c(v vVar) {
            this.b = vVar;
        }

        @Override // n.v
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a d() {
            return a.this;
        }

        @Override // n.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a aVar = a.this;
            v vVar = this.b;
            aVar.t();
            try {
                try {
                    vVar.close();
                    l.s sVar = l.s.a;
                    if (aVar.u()) {
                        throw aVar.n(null);
                    }
                } catch (IOException e) {
                    if (!aVar.u()) {
                        throw e;
                    }
                    throw aVar.n(e);
                }
            } catch (Throwable th) {
                aVar.u();
                throw th;
            }
        }

        @Override // n.v, java.io.Flushable
        public void flush() throws IOException {
            a aVar = a.this;
            v vVar = this.b;
            aVar.t();
            try {
                try {
                    vVar.flush();
                    l.s sVar = l.s.a;
                    if (aVar.u()) {
                        throw aVar.n(null);
                    }
                } catch (IOException e) {
                    if (!aVar.u()) {
                        throw e;
                    }
                    throw aVar.n(e);
                }
            } catch (Throwable th) {
                aVar.u();
                throw th;
            }
        }

        @Override // n.v
        public void h(n.b bVar, long j2) throws IOException {
            l.y.c.i.e(bVar, "source");
            c0.b(bVar.r0(), 0L, j2);
            while (true) {
                long j3 = 0;
                if (j2 <= 0) {
                    return;
                }
                s sVar = bVar.a;
                while (true) {
                    l.y.c.i.c(sVar);
                    if (j3 >= 65536) {
                        break;
                    }
                    j3 += (long) (sVar.c - sVar.b);
                    if (j3 >= j2) {
                        j3 = j2;
                        break;
                    }
                    sVar = sVar.f;
                }
                a aVar = a.this;
                v vVar = this.b;
                aVar.t();
                try {
                    try {
                        vVar.h(bVar, j3);
                        l.s sVar2 = l.s.a;
                        if (aVar.u()) {
                            throw aVar.n(null);
                        }
                        j2 -= j3;
                    } catch (IOException e) {
                        if (!aVar.u()) {
                            throw e;
                        }
                        throw aVar.n(e);
                    }
                } catch (Throwable th) {
                    aVar.u();
                    throw th;
                }
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.b + ')';
        }
    }

    public static final class d implements x {
        final /* synthetic */ x b;

        d(x xVar) {
            this.b = xVar;
        }

        @Override // n.x
        public long I(n.b bVar, long j2) throws IOException {
            l.y.c.i.e(bVar, "sink");
            a aVar = a.this;
            x xVar = this.b;
            aVar.t();
            try {
                try {
                    long jI = xVar.I(bVar, j2);
                    if (aVar.u()) {
                        throw aVar.n(null);
                    }
                    return jI;
                } catch (IOException e) {
                    if (aVar.u()) {
                        throw aVar.n(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                aVar.u();
                throw th;
            }
        }

        @Override // n.x
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a d() {
            return a.this;
        }

        @Override // n.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a aVar = a.this;
            x xVar = this.b;
            aVar.t();
            try {
                try {
                    xVar.close();
                    l.s sVar = l.s.a;
                    if (aVar.u()) {
                        throw aVar.n(null);
                    }
                } catch (IOException e) {
                    if (!aVar.u()) {
                        throw e;
                    }
                    throw aVar.n(e);
                }
            } catch (Throwable th) {
                aVar.u();
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.b + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f2345i = millis;
        f2346j = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long w(long j2) {
        return this.f2348g - j2;
    }

    public final IOException n(IOException iOException) {
        return v(iOException);
    }

    public final void t() {
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            f2344h.e(this, jH, zE);
        }
    }

    public final boolean u() {
        return f2344h.d(this);
    }

    protected IOException v(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final v x(v vVar) {
        l.y.c.i.e(vVar, "sink");
        return new c(vVar);
    }

    public final x y(x xVar) {
        l.y.c.i.e(xVar, "source");
        return new d(xVar);
    }

    protected void z() {
    }
}
