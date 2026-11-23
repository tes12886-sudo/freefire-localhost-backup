package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes.dex */
public class g implements Handler.Callback {
    public static final Status r = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status s = new Status(4, "The user must be signed in to make this API call.");
    private static final Object t = new Object();

    @GuardedBy("lock")
    private static g u;
    private com.google.android.gms.common.internal.u e;
    private com.google.android.gms.common.internal.w f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final GoogleApiAvailability f954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.common.internal.m0 f955i;

    @NotOnlyInitialized
    private final Handler p;
    private volatile boolean q;
    private long a = 5000;
    private long b = 120000;
    private long c = 10000;
    private boolean d = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicInteger f956j = new AtomicInteger(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f957k = new AtomicInteger(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f958l = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @GuardedBy("lock")
    private x f959m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @GuardedBy("lock")
    private final Set f960n = new h.f.b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set f961o = new h.f.b();

    private g(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.q = true;
        this.f953g = context;
        j.d.a.c.f.d.n nVar = new j.d.a.c.f.d.n(looper, this);
        this.p = nVar;
        this.f954h = googleApiAvailability;
        this.f955i = new com.google.android.gms.common.internal.m0(googleApiAvailability);
        if (com.google.android.gms.common.util.i.a(context)) {
            this.q = false;
        }
        nVar.sendMessage(nVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (t) {
            g gVar = u;
            if (gVar != null) {
                gVar.f957k.incrementAndGet();
                Handler handler = gVar.p;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status i(b bVar, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + bVar.b() + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    private final j1 j(GoogleApi googleApi) {
        b bVarB = googleApi.b();
        j1 j1Var = (j1) this.f958l.get(bVarB);
        if (j1Var == null) {
            j1Var = new j1(this, googleApi);
            this.f958l.put(bVarB, j1Var);
        }
        if (j1Var.P()) {
            this.f961o.add(bVarB);
        }
        j1Var.E();
        return j1Var;
    }

    private final com.google.android.gms.common.internal.w k() {
        if (this.f == null) {
            this.f = com.google.android.gms.common.internal.v.a(this.f953g);
        }
        return this.f;
    }

    private final void l() {
        com.google.android.gms.common.internal.u uVar = this.e;
        if (uVar != null) {
            if (uVar.f() > 0 || g()) {
                k().a(uVar);
            }
            this.e = null;
        }
    }

    private final void m(TaskCompletionSource taskCompletionSource, int i2, GoogleApi googleApi) {
        t1 t1VarB;
        if (i2 == 0 || (t1VarB = t1.b(this, i2, googleApi.b())) == null) {
            return;
        }
        Task taskA = taskCompletionSource.a();
        final Handler handler = this.p;
        handler.getClass();
        taskA.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.d1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, t1VarB);
    }

    public static g y() {
        g gVar;
        synchronized (t) {
            com.google.android.gms.common.internal.q.l(u, "Must guarantee manager is non-null before using getInstance");
            gVar = u;
        }
        return gVar;
    }

    public static g z(Context context) {
        g gVar;
        synchronized (t) {
            if (u == null) {
                u = new g(context.getApplicationContext(), com.google.android.gms.common.internal.h.c().getLooper(), GoogleApiAvailability.getInstance());
            }
            gVar = u;
        }
        return gVar;
    }

    public final Task B(Iterable iterable) {
        s2 s2Var = new s2(iterable);
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(2, s2Var));
        return s2Var.a();
    }

    public final void G(GoogleApi googleApi, int i2, d dVar) {
        m2 m2Var = new m2(i2, dVar);
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(4, new x1(m2Var, this.f957k.get(), googleApi)));
    }

    public final void H(GoogleApi googleApi, int i2, r rVar, TaskCompletionSource taskCompletionSource, p pVar) {
        m(taskCompletionSource, rVar.d(), googleApi);
        n2 n2Var = new n2(i2, rVar, taskCompletionSource, pVar);
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(4, new x1(n2Var, this.f957k.get(), googleApi)));
    }

    final void I(com.google.android.gms.common.internal.n nVar, int i2, long j2, int i3) {
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(18, new u1(nVar, i2, j2, i3)));
    }

    public final void J(ConnectionResult connectionResult, int i2) {
        if (h(connectionResult, i2)) {
            return;
        }
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(5, i2, 0, connectionResult));
    }

    public final void b() {
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void c(GoogleApi googleApi) {
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    public final void d(x xVar) {
        synchronized (t) {
            if (this.f959m != xVar) {
                this.f959m = xVar;
                this.f960n.clear();
            }
            this.f960n.addAll(xVar.t());
        }
    }

    final void e(x xVar) {
        synchronized (t) {
            if (this.f959m == xVar) {
                this.f959m = null;
                this.f960n.clear();
            }
        }
    }

    final boolean g() {
        if (this.d) {
            return false;
        }
        com.google.android.gms.common.internal.s sVarA = com.google.android.gms.common.internal.r.b().a();
        if (sVarA != null && !sVarA.j()) {
            return false;
        }
        int iA = this.f955i.a(this.f953g, 203400000);
        return iA == -1 || iA == 0;
    }

    final boolean h(ConnectionResult connectionResult, int i2) {
        return this.f954h.zah(this.f953g, connectionResult, i2);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:67:0x021c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0229  */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x01eb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x0229, please report this as an issue */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        TaskCompletionSource taskCompletionSourceB;
        Boolean boolValueOf;
        int i2 = message.what;
        j1 j1Var = null;
        switch (i2) {
            case 1:
                this.c = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.p.removeMessages(12);
                for (b bVar : this.f958l.keySet()) {
                    Handler handler = this.p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.c);
                }
                return true;
            case 2:
                s2 s2Var = (s2) message.obj;
                for (b bVar2 : s2Var.b()) {
                    j1 j1Var2 = (j1) this.f958l.get(bVar2);
                    if (j1Var2 == null) {
                        s2Var.c(bVar2, new ConnectionResult(13), null);
                        return true;
                    }
                    if (j1Var2.O()) {
                        s2Var.c(bVar2, ConnectionResult.e, j1Var2.v().n());
                    } else {
                        ConnectionResult connectionResultT = j1Var2.t();
                        if (connectionResultT != null) {
                            s2Var.c(bVar2, connectionResultT, null);
                        } else {
                            j1Var2.J(s2Var);
                            j1Var2.E();
                        }
                    }
                }
                return true;
            case 3:
                for (j1 j1Var3 : this.f958l.values()) {
                    j1Var3.D();
                    j1Var3.E();
                }
                return true;
            case 4:
            case 8:
            case 13:
                x1 x1Var = (x1) message.obj;
                j1 j1VarJ = (j1) this.f958l.get(x1Var.c.b());
                if (j1VarJ == null) {
                    j1VarJ = j(x1Var.c);
                }
                if (!j1VarJ.P() || this.f957k.get() == x1Var.b) {
                    j1VarJ.F(x1Var.a);
                } else {
                    x1Var.a.a(r);
                    j1VarJ.L();
                }
                return true;
            case 5:
                int i3 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                for (j1 j1Var4 : this.f958l.values()) {
                    if (j1Var4.r() == i3) {
                        j1Var = j1Var4;
                        if (j1Var != null) {
                            Log.wtf("GoogleApiManager", "Could not find API instance " + i3 + " while trying to fail enqueued calls.", new Exception());
                        } else if (connectionResult.f() == 13) {
                            j1Var.d(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f954h.getErrorString(connectionResult.f()) + ": " + connectionResult.h()));
                        } else {
                            j1Var.d(i(j1Var.c, connectionResult));
                        }
                        return true;
                    }
                }
                if (j1Var != null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i3 + " while trying to fail enqueued calls.", new Exception());
                } else if (connectionResult.f() == 13) {
                    j1Var.d(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f954h.getErrorString(connectionResult.f()) + ": " + connectionResult.h()));
                } else {
                    j1Var.d(i(j1Var.c, connectionResult));
                }
                return true;
            case 6:
                if (this.f953g.getApplicationContext() instanceof Application) {
                    c.c((Application) this.f953g.getApplicationContext());
                    c.b().a(new e1(this));
                    if (!c.b().e(true)) {
                        this.c = 300000L;
                    }
                }
                return true;
            case 7:
                j((GoogleApi) message.obj);
                return true;
            case 9:
                if (this.f958l.containsKey(message.obj)) {
                    ((j1) this.f958l.get(message.obj)).K();
                }
                return true;
            case 10:
                Iterator it = this.f961o.iterator();
                while (it.hasNext()) {
                    j1 j1Var5 = (j1) this.f958l.remove((b) it.next());
                    if (j1Var5 != null) {
                        j1Var5.L();
                    }
                }
                this.f961o.clear();
                return true;
            case 11:
                if (this.f958l.containsKey(message.obj)) {
                    ((j1) this.f958l.get(message.obj)).M();
                }
                return true;
            case 12:
                if (this.f958l.containsKey(message.obj)) {
                    ((j1) this.f958l.get(message.obj)).a();
                }
                return true;
            case 14:
                y yVar = (y) message.obj;
                b bVarA = yVar.a();
                if (this.f958l.containsKey(bVarA)) {
                    boolean zQ = ((j1) this.f958l.get(bVarA)).q(false);
                    taskCompletionSourceB = yVar.b();
                    boolValueOf = Boolean.valueOf(zQ);
                } else {
                    taskCompletionSourceB = yVar.b();
                    boolValueOf = Boolean.FALSE;
                }
                taskCompletionSourceB.c(boolValueOf);
                return true;
            case 15:
                l1 l1Var = (l1) message.obj;
                if (this.f958l.containsKey(l1Var.a)) {
                    j1.B((j1) this.f958l.get(l1Var.a), l1Var);
                }
                return true;
            case 16:
                l1 l1Var2 = (l1) message.obj;
                if (this.f958l.containsKey(l1Var2.a)) {
                    j1.C((j1) this.f958l.get(l1Var2.a), l1Var2);
                }
                return true;
            case 17:
                l();
                return true;
            case 18:
                u1 u1Var = (u1) message.obj;
                if (u1Var.c == 0) {
                    k().a(new com.google.android.gms.common.internal.u(u1Var.b, Arrays.asList(u1Var.a)));
                } else {
                    com.google.android.gms.common.internal.u uVar = this.e;
                    if (uVar != null) {
                        List listH = uVar.h();
                        if (uVar.f() != u1Var.b || (listH != null && listH.size() >= u1Var.d)) {
                            this.p.removeMessages(17);
                            l();
                        } else {
                            this.e.j(u1Var.a);
                        }
                    }
                    if (this.e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(u1Var.a);
                        this.e = new com.google.android.gms.common.internal.u(u1Var.b, arrayList);
                        Handler handler2 = this.p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), u1Var.c);
                    }
                }
                return true;
            case 19:
                this.d = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i2);
                return false;
        }
    }

    public final int n() {
        return this.f956j.getAndIncrement();
    }

    final j1 x(b bVar) {
        return (j1) this.f958l.get(bVar);
    }
}
