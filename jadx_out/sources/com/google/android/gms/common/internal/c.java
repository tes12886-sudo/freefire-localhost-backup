package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T extends IInterface> {
    private static final com.google.android.gms.common.c[] C = new com.google.android.gms.common.c[0];
    private volatile l1 A;
    protected AtomicInteger B;
    private int a;
    private long b;
    private long c;
    private int d;
    private long e;
    private volatile String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    w1 f1001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f1002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h f1003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final GoogleApiAvailabilityLight f1004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Handler f1005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f1006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f1007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @GuardedBy("mServiceBrokerLock")
    private m f1008n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected InterfaceC0123c f1009o;

    @GuardedBy("mLock")
    private IInterface p;
    private final ArrayList q;

    @GuardedBy("mLock")
    private i1 r;

    @GuardedBy("mLock")
    private int s;
    private final a t;
    private final b u;
    private final int v;
    private final String w;
    private volatile String x;
    private ConnectionResult y;
    private boolean z;

    public interface a {
        void j(int i2);

        void o(Bundle bundle);
    }

    public interface b {
        void m(ConnectionResult connectionResult);
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.c$c, reason: collision with other inner class name */
    public interface InterfaceC0123c {
        void a(ConnectionResult connectionResult);
    }

    protected class d implements InterfaceC0123c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.c.InterfaceC0123c
        public final void a(ConnectionResult connectionResult) {
            if (connectionResult.n()) {
                c cVar = c.this;
                cVar.f(null, cVar.H());
            } else if (c.this.u != null) {
                c.this.u.m(connectionResult);
            }
        }
    }

    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected c(Context context, Looper looper, int i2, a aVar, b bVar, String str) {
        h hVarB = h.b(context);
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
        q.k(aVar);
        q.k(bVar);
        this(context, looper, hVarB, googleApiAvailabilityLight, i2, aVar, bVar, str);
    }

    protected c(Context context, Looper looper, h hVar, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i2, a aVar, b bVar, String str) {
        this.f = null;
        this.f1006l = new Object();
        this.f1007m = new Object();
        this.q = new ArrayList();
        this.s = 1;
        this.y = null;
        this.z = false;
        this.A = null;
        this.B = new AtomicInteger(0);
        q.l(context, "Context must not be null");
        this.f1002h = context;
        q.l(looper, "Looper must not be null");
        q.l(hVar, "Supervisor must not be null");
        this.f1003i = hVar;
        q.l(googleApiAvailabilityLight, "API availability must not be null");
        this.f1004j = googleApiAvailabilityLight;
        this.f1005k = new f1(this, looper);
        this.v = i2;
        this.t = aVar;
        this.u = bVar;
        this.w = str;
    }

    static /* bridge */ /* synthetic */ void h0(c cVar, l1 l1Var) {
        cVar.A = l1Var;
        if (cVar.X()) {
            com.google.android.gms.common.internal.e eVar = l1Var.d;
            r.b().c(eVar == null ? null : eVar.q());
        }
    }

    static /* bridge */ /* synthetic */ void i0(c cVar, int i2) {
        int i3;
        int i4;
        synchronized (cVar.f1006l) {
            i3 = cVar.s;
        }
        if (i3 == 3) {
            cVar.z = true;
            i4 = 5;
        } else {
            i4 = 4;
        }
        Handler handler = cVar.f1005k;
        handler.sendMessage(handler.obtainMessage(i4, cVar.B.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean l0(c cVar, int i2, int i3, IInterface iInterface) {
        synchronized (cVar.f1006l) {
            if (cVar.s != i2) {
                return false;
            }
            cVar.n0(i3, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean m0(c cVar) {
        if (cVar.z || TextUtils.isEmpty(cVar.J()) || TextUtils.isEmpty(cVar.G())) {
            return false;
        }
        try {
            Class.forName(cVar.J());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(int i2, IInterface iInterface) {
        w1 w1Var;
        q.a((i2 == 4) == (iInterface != null));
        synchronized (this.f1006l) {
            this.s = i2;
            this.p = iInterface;
            if (i2 == 1) {
                i1 i1Var = this.r;
                if (i1Var != null) {
                    h hVar = this.f1003i;
                    String strC = this.f1001g.c();
                    q.k(strC);
                    hVar.e(strC, this.f1001g.b(), this.f1001g.a(), i1Var, c0(), this.f1001g.d());
                    this.r = null;
                }
            } else if (i2 == 2 || i2 == 3) {
                i1 i1Var2 = this.r;
                if (i1Var2 != null && (w1Var = this.f1001g) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + w1Var.c() + " on " + w1Var.b());
                    h hVar2 = this.f1003i;
                    String strC2 = this.f1001g.c();
                    q.k(strC2);
                    hVar2.e(strC2, this.f1001g.b(), this.f1001g.a(), i1Var2, c0(), this.f1001g.d());
                    this.B.incrementAndGet();
                }
                i1 i1Var3 = new i1(this, this.B.get());
                this.r = i1Var3;
                w1 w1Var2 = (this.s != 3 || G() == null) ? new w1(L(), K(), false, h.a(), N()) : new w1(D().getPackageName(), G(), true, h.a(), false);
                this.f1001g = w1Var2;
                if (w1Var2.d() && k() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f1001g.c())));
                }
                h hVar3 = this.f1003i;
                String strC3 = this.f1001g.c();
                q.k(strC3);
                if (!hVar3.f(new p1(strC3, this.f1001g.b(), this.f1001g.a(), this.f1001g.d()), i1Var3, c0(), B())) {
                    Log.w("GmsClient", "unable to connect to service: " + this.f1001g.c() + " on " + this.f1001g.b());
                    j0(16, null, this.B.get());
                }
            } else if (i2 == 4) {
                q.k(iInterface);
                P(iInterface);
            }
        }
    }

    public com.google.android.gms.common.c[] A() {
        return C;
    }

    protected Executor B() {
        return null;
    }

    public Bundle C() {
        return null;
    }

    public final Context D() {
        return this.f1002h;
    }

    public int E() {
        return this.v;
    }

    protected Bundle F() {
        return new Bundle();
    }

    protected String G() {
        return null;
    }

    protected Set<Scope> H() {
        return Collections.emptySet();
    }

    public final T I() {
        T t;
        synchronized (this.f1006l) {
            if (this.s == 5) {
                throw new DeadObjectException();
            }
            w();
            t = (T) this.p;
            q.l(t, "Client is connected but service is null");
        }
        return t;
    }

    protected abstract String J();

    protected abstract String K();

    protected String L() {
        return "com.google.android.gms";
    }

    public com.google.android.gms.common.internal.e M() {
        l1 l1Var = this.A;
        if (l1Var == null) {
            return null;
        }
        return l1Var.d;
    }

    protected boolean N() {
        return k() >= 211700000;
    }

    public boolean O() {
        return this.A != null;
    }

    protected void P(T t) {
        this.c = System.currentTimeMillis();
    }

    protected void Q(ConnectionResult connectionResult) {
        this.d = connectionResult.f();
        this.e = System.currentTimeMillis();
    }

    protected void R(int i2) {
        this.a = i2;
        this.b = System.currentTimeMillis();
    }

    protected void S(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.f1005k;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new j1(this, i2, iBinder, bundle)));
    }

    public boolean T() {
        return false;
    }

    public void U(String str) {
        this.x = str;
    }

    public void V(int i2) {
        Handler handler = this.f1005k;
        handler.sendMessage(handler.obtainMessage(6, this.B.get(), i2));
    }

    protected void W(InterfaceC0123c interfaceC0123c, int i2, PendingIntent pendingIntent) {
        q.l(interfaceC0123c, "Connection progress callbacks cannot be null.");
        this.f1009o = interfaceC0123c;
        Handler handler = this.f1005k;
        handler.sendMessage(handler.obtainMessage(3, this.B.get(), i2, pendingIntent));
    }

    public boolean X() {
        return false;
    }

    public boolean a() {
        boolean z;
        synchronized (this.f1006l) {
            z = this.s == 4;
        }
        return z;
    }

    public void c(e eVar) {
        eVar.a();
    }

    protected final String c0() {
        String str = this.w;
        return str == null ? this.f1002h.getClass().getName() : str;
    }

    public boolean d() {
        return false;
    }

    public void f(j jVar, Set<Scope> set) {
        Bundle bundleF = F();
        int i2 = this.v;
        String str = this.x;
        int i3 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Scope[] scopeArr = f.f1012o;
        Bundle bundle = new Bundle();
        com.google.android.gms.common.c[] cVarArr = f.p;
        f fVar = new f(6, i2, i3, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        fVar.d = this.f1002h.getPackageName();
        fVar.f1013g = bundleF;
        if (set != null) {
            fVar.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (u()) {
            Account accountZ = z();
            if (accountZ == null) {
                accountZ = new Account("<<default account>>", "com.google");
            }
            fVar.f1014h = accountZ;
            if (jVar != null) {
                fVar.e = jVar.asBinder();
            }
        } else if (T()) {
            fVar.f1014h = z();
        }
        fVar.f1015i = C;
        fVar.f1016j = A();
        if (X()) {
            fVar.f1019m = true;
        }
        try {
            synchronized (this.f1007m) {
                m mVar = this.f1008n;
                if (mVar != null) {
                    mVar.e0(new h1(this, this.B.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            V(3);
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            S(8, null, null, this.B.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            S(8, null, null, this.B.get());
        }
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2;
        IInterface iInterface;
        m mVar;
        String str2;
        String strValueOf;
        synchronized (this.f1006l) {
            i2 = this.s;
            iInterface = this.p;
        }
        synchronized (this.f1007m) {
            mVar = this.f1008n;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i2 == 1) {
            str2 = "DISCONNECTED";
        } else if (i2 == 2) {
            str2 = "REMOTE_CONNECTING";
        } else if (i2 == 3) {
            str2 = "LOCAL_CONNECTING";
        } else if (i2 != 4) {
            str2 = i2 != 5 ? "UNKNOWN" : "DISCONNECTING";
        } else {
            str2 = "CONNECTED";
        }
        printWriter.print(str2);
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) J()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (mVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(mVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.c;
            printWriterAppend.println(j2 + " " + simpleDateFormat.format(new Date(j2)));
        }
        if (this.b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i3 = this.a;
            if (i3 == 1) {
                strValueOf = "CAUSE_SERVICE_DISCONNECTED";
            } else if (i3 != 2) {
                strValueOf = i3 != 3 ? String.valueOf(i3) : "CAUSE_DEAD_OBJECT_EXCEPTION";
            } else {
                strValueOf = "CAUSE_NETWORK_LOST";
            }
            printWriter.append((CharSequence) strValueOf);
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.b;
            printWriterAppend2.println(j3 + " " + simpleDateFormat.format(new Date(j3)));
        }
        if (this.e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.d.a(this.d));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j4 = this.e;
            printWriterAppend3.println(j4 + " " + simpleDateFormat.format(new Date(j4)));
        }
    }

    public void h(String str) {
        this.f = str;
        s();
    }

    public boolean i() {
        return true;
    }

    protected final void j0(int i2, Bundle bundle, int i3) {
        Handler handler = this.f1005k;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new k1(this, i2, null)));
    }

    public int k() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public boolean l() {
        boolean z;
        synchronized (this.f1006l) {
            int i2 = this.s;
            z = true;
            if (i2 != 2 && i2 != 3) {
                z = false;
            }
        }
        return z;
    }

    public final com.google.android.gms.common.c[] m() {
        l1 l1Var = this.A;
        if (l1Var == null) {
            return null;
        }
        return l1Var.b;
    }

    public String n() {
        w1 w1Var;
        if (!a() || (w1Var = this.f1001g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return w1Var.b();
    }

    public String q() {
        return this.f;
    }

    public void r(InterfaceC0123c interfaceC0123c) {
        q.l(interfaceC0123c, "Connection progress callbacks cannot be null.");
        this.f1009o = interfaceC0123c;
        n0(2, null);
    }

    public void s() {
        this.B.incrementAndGet();
        synchronized (this.q) {
            int size = this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((g1) this.q.get(i2)).d();
            }
            this.q.clear();
        }
        synchronized (this.f1007m) {
            this.f1008n = null;
        }
        n0(1, null);
    }

    public Intent t() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean u() {
        return false;
    }

    public void v() {
        int iIsGooglePlayServicesAvailable = this.f1004j.isGooglePlayServicesAvailable(this.f1002h, k());
        if (iIsGooglePlayServicesAvailable == 0) {
            r(new d());
        } else {
            n0(1, null);
            W(new d(), iIsGooglePlayServicesAvailable, null);
        }
    }

    protected final void w() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract T x(IBinder iBinder);

    protected boolean y() {
        return false;
    }

    public Account z() {
        return null;
    }
}
