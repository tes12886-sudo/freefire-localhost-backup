package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.a3;
import com.google.android.gms.common.api.internal.j2;
import com.google.android.gms.common.api.internal.r2;
import com.google.android.gms.common.api.internal.x0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class e {

    @GuardedBy("sAllClients")
    private static final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public static final class a {
        private Account a;
        private int d;
        private View e;
        private String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f924g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Context f926i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private com.google.android.gms.common.api.internal.h f928k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private c f930m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Looper f931n;
        private final Set b = new HashSet();
        private final Set c = new HashSet();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map f925h = new h.f.a();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Map f927j = new h.f.a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f929l = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private GoogleApiAvailability f932o = GoogleApiAvailability.getInstance();
        private com.google.android.gms.common.api.a.AbstractC0120a p = j.d.a.c.g.f.c;
        private final ArrayList q = new ArrayList();
        private final ArrayList r = new ArrayList();

        public a(Context context) {
            this.f926i = context;
            this.f931n = context.getMainLooper();
            this.f = context.getPackageName();
            this.f924g = context.getClass().getName();
        }

        @CanIgnoreReturnValue
        public a a(com.google.android.gms.common.api.a<? extends Object> aVar) {
            com.google.android.gms.common.internal.q.l(aVar, "Api must not be null");
            this.f927j.put(aVar, null);
            com.google.android.gms.common.api.a.e eVarC = aVar.c();
            com.google.android.gms.common.internal.q.l(eVarC, "Base client builder must not be null");
            List<Scope> listA = eVarC.a(null);
            this.c.addAll(listA);
            this.b.addAll(listA);
            return this;
        }

        @CanIgnoreReturnValue
        public <O extends com.google.android.gms.common.api.a.d.c> a b(com.google.android.gms.common.api.a<O> aVar, O o2) {
            com.google.android.gms.common.internal.q.l(aVar, "Api must not be null");
            com.google.android.gms.common.internal.q.l(o2, "Null options are not permitted for this Api");
            this.f927j.put(aVar, o2);
            com.google.android.gms.common.api.a.e eVarC = aVar.c();
            com.google.android.gms.common.internal.q.l(eVarC, "Base client builder must not be null");
            List<Scope> listA = eVarC.a(o2);
            this.c.addAll(listA);
            this.b.addAll(listA);
            return this;
        }

        @CanIgnoreReturnValue
        public a c(b bVar) {
            com.google.android.gms.common.internal.q.l(bVar, "Listener must not be null");
            this.q.add(bVar);
            return this;
        }

        @CanIgnoreReturnValue
        public a d(c cVar) {
            com.google.android.gms.common.internal.q.l(cVar, "Listener must not be null");
            this.r.add(cVar);
            return this;
        }

        public e e() {
            com.google.android.gms.common.internal.q.b(!this.f927j.isEmpty(), "must call addApi() to add at least one API");
            com.google.android.gms.common.internal.d dVarG = g();
            Map mapK = dVarG.k();
            h.f.a aVar = new h.f.a();
            h.f.a aVar2 = new h.f.a();
            ArrayList arrayList = new ArrayList();
            com.google.android.gms.common.api.a aVar3 = null;
            boolean z = false;
            for (com.google.android.gms.common.api.a aVar4 : this.f927j.keySet()) {
                Object obj = this.f927j.get(aVar4);
                boolean z2 = mapK.get(aVar4) != null;
                aVar.put(aVar4, Boolean.valueOf(z2));
                a3 a3Var = new a3(aVar4, z2);
                arrayList.add(a3Var);
                com.google.android.gms.common.api.a.AbstractC0120a abstractC0120aA = aVar4.a();
                com.google.android.gms.common.internal.q.k(abstractC0120aA);
                com.google.android.gms.common.api.a.AbstractC0120a abstractC0120a = abstractC0120aA;
                com.google.android.gms.common.api.a.f fVarC = abstractC0120a.c(this.f926i, this.f931n, dVarG, obj, a3Var, a3Var);
                aVar2.put(aVar4.b(), fVarC);
                if (abstractC0120a.b() == 1) {
                    z = obj != null;
                }
                if (fVarC.d()) {
                    if (aVar3 != null) {
                        throw new IllegalStateException(aVar4.d() + " cannot be used with " + aVar3.d());
                    }
                    aVar3 = aVar4;
                }
            }
            if (aVar3 != null) {
                if (z) {
                    throw new IllegalStateException("With using " + aVar3.d() + ", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                }
                com.google.android.gms.common.internal.q.p(this.a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar3.d());
                com.google.android.gms.common.internal.q.p(this.b.equals(this.c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar3.d());
            }
            x0 x0Var = new x0(this.f926i, new ReentrantLock(), this.f931n, dVarG, this.f932o, this.p, aVar, this.q, this.r, aVar2, this.f929l, x0.t(aVar2.values(), true), arrayList);
            synchronized (e.a) {
                e.a.add(x0Var);
            }
            if (this.f929l >= 0) {
                r2.t(this.f928k).u(this.f929l, x0Var, this.f930m);
            }
            return x0Var;
        }

        @CanIgnoreReturnValue
        public a f(Handler handler) {
            com.google.android.gms.common.internal.q.l(handler, "Handler must not be null");
            this.f931n = handler.getLooper();
            return this;
        }

        public final com.google.android.gms.common.internal.d g() {
            j.d.a.c.g.a aVar = j.d.a.c.g.a.f1982j;
            Map map = this.f927j;
            com.google.android.gms.common.api.a aVar2 = j.d.a.c.g.f.e;
            if (map.containsKey(aVar2)) {
                aVar = (j.d.a.c.g.a) this.f927j.get(aVar2);
            }
            return new com.google.android.gms.common.internal.d(this.a, this.b, this.f925h, this.d, this.e, this.f, this.f924g, aVar, false);
        }
    }

    @Deprecated
    public interface b extends com.google.android.gms.common.api.internal.f {
    }

    @Deprecated
    public interface c extends com.google.android.gms.common.api.internal.l {
    }

    public static Set<e> j() {
        Set<e> set = a;
        synchronized (set) {
        }
        return set;
    }

    public abstract ConnectionResult d();

    public abstract f<Status> e();

    public abstract void f();

    public abstract void g();

    public abstract void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public <A extends com.google.android.gms.common.api.a.b, T extends com.google.android.gms.common.api.internal.d<? extends j, A>> T i(T t) {
        throw new UnsupportedOperationException();
    }

    public Context k() {
        throw new UnsupportedOperationException();
    }

    public Looper l() {
        throw new UnsupportedOperationException();
    }

    public boolean m(com.google.android.gms.common.api.internal.o oVar) {
        throw new UnsupportedOperationException();
    }

    public void n() {
        throw new UnsupportedOperationException();
    }

    public abstract void o(c cVar);

    public abstract void p(c cVar);

    public void q(j2 j2Var) {
        throw new UnsupportedOperationException();
    }
}
