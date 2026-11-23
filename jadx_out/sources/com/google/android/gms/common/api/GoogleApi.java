package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.d2;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.common.api.internal.o1;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes.dex */
public abstract class GoogleApi<O extends com.google.android.gms.common.api.a.d> implements HasApiKey<O> {
    private final Context a;
    private final String b;
    private final com.google.android.gms.common.api.a c;
    private final com.google.android.gms.common.api.a.d d;
    private final com.google.android.gms.common.api.internal.b e;
    private final Looper f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotOnlyInitialized
    private final e f917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.p f918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.g f919j;

    public static class a {
        public static final a c = new C0119a().a();
        public final com.google.android.gms.common.api.internal.p a;
        public final Looper b;

        /* JADX INFO: renamed from: com.google.android.gms.common.api.GoogleApi$a$a, reason: collision with other inner class name */
        public static class C0119a {
            private com.google.android.gms.common.api.internal.p a;
            private Looper b;

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.a == null) {
                    this.a = new com.google.android.gms.common.api.internal.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.a, this.b);
            }

            @CanIgnoreReturnValue
            public C0119a b(com.google.android.gms.common.api.internal.p pVar) {
                com.google.android.gms.common.internal.q.l(pVar, "StatusExceptionMapper must not be null.");
                this.a = pVar;
                return this;
            }
        }

        private a(com.google.android.gms.common.api.internal.p pVar, Account account, Looper looper) {
            this.a = pVar;
            this.b = looper;
        }
    }

    private GoogleApi(Context context, Activity activity, com.google.android.gms.common.api.a aVar, com.google.android.gms.common.api.a.d dVar, a aVar2) {
        com.google.android.gms.common.internal.q.l(context, "Null context is not permitted.");
        com.google.android.gms.common.internal.q.l(aVar, "Api must not be null.");
        com.google.android.gms.common.internal.q.l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        String str = null;
        if (com.google.android.gms.common.util.l.k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.b = str;
        this.c = aVar;
        this.d = dVar;
        this.f = aVar2.b;
        com.google.android.gms.common.api.internal.b bVarA = com.google.android.gms.common.api.internal.b.a(aVar, dVar, str);
        this.e = bVarA;
        this.f917h = new o1(this);
        com.google.android.gms.common.api.internal.g gVarZ = com.google.android.gms.common.api.internal.g.z(this.a);
        this.f919j = gVarZ;
        this.f916g = gVarZ.n();
        this.f918i = aVar2.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            x.u(activity, gVarZ, bVarA);
        }
        gVarZ.c(this);
    }

    public GoogleApi(Context context, com.google.android.gms.common.api.a<O> aVar, O o2, a aVar2) {
        this(context, null, aVar, o2, aVar2);
    }

    @Deprecated
    public GoogleApi(Context context, com.google.android.gms.common.api.a<O> aVar, O o2, com.google.android.gms.common.api.internal.p pVar) {
        a.C0119a c0119a = new a.C0119a();
        c0119a.b(pVar);
        this(context, aVar, o2, c0119a.a());
    }

    private final com.google.android.gms.common.api.internal.d n(int i2, com.google.android.gms.common.api.internal.d dVar) {
        dVar.n();
        this.f919j.G(this, i2, dVar);
        return dVar;
    }

    private final Task o(int i2, com.google.android.gms.common.api.internal.r rVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f919j.H(this, i2, rVar, taskCompletionSource, this.f918i);
        return taskCompletionSource.a();
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    public final com.google.android.gms.common.api.internal.b<O> b() {
        return this.e;
    }

    public e c() {
        return this.f917h;
    }

    protected com.google.android.gms.common.internal.d.a d() {
        Account accountB;
        GoogleSignInAccount googleSignInAccountD;
        GoogleSignInAccount googleSignInAccountD2;
        com.google.android.gms.common.internal.d.a aVar = new com.google.android.gms.common.internal.d.a();
        com.google.android.gms.common.api.a.d dVar = this.d;
        if (!(dVar instanceof com.google.android.gms.common.api.a.d.b) || (googleSignInAccountD2 = ((com.google.android.gms.common.api.a.d.b) dVar).d()) == null) {
            com.google.android.gms.common.api.a.d dVar2 = this.d;
            accountB = dVar2 instanceof com.google.android.gms.common.api.a.d.InterfaceC0121a ? ((com.google.android.gms.common.api.a.d.InterfaceC0121a) dVar2).b() : null;
        } else {
            accountB = googleSignInAccountD2.b();
        }
        aVar.d(accountB);
        com.google.android.gms.common.api.a.d dVar3 = this.d;
        aVar.c((!(dVar3 instanceof com.google.android.gms.common.api.a.d.b) || (googleSignInAccountD = ((com.google.android.gms.common.api.a.d.b) dVar3).d()) == null) ? Collections.emptySet() : googleSignInAccountD.s());
        aVar.e(this.a.getClass().getName());
        aVar.b(this.a.getPackageName());
        return aVar;
    }

    public <TResult, A extends com.google.android.gms.common.api.a.b> Task<TResult> e(com.google.android.gms.common.api.internal.r<A, TResult> rVar) {
        return o(2, rVar);
    }

    public <A extends com.google.android.gms.common.api.a.b, T extends com.google.android.gms.common.api.internal.d<? extends j, A>> T f(T t) {
        n(1, t);
        return t;
    }

    public O g() {
        return (O) this.d;
    }

    public Context h() {
        return this.a;
    }

    protected String i() {
        return this.b;
    }

    public Looper j() {
        return this.f;
    }

    public final int k() {
        return this.f916g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.google.android.gms.common.api.a.f l(Looper looper, j1 j1Var) {
        com.google.android.gms.common.internal.d dVarA = d().a();
        com.google.android.gms.common.api.a.AbstractC0120a abstractC0120aA = this.c.a();
        com.google.android.gms.common.internal.q.k(abstractC0120aA);
        com.google.android.gms.common.api.a.f fVarC = abstractC0120aA.c(this.a, looper, dVarA, this.d, j1Var, j1Var);
        String strI = i();
        if (strI != null && (fVarC instanceof com.google.android.gms.common.internal.c)) {
            ((com.google.android.gms.common.internal.c) fVarC).U(strI);
        }
        if (strI != null && (fVarC instanceof com.google.android.gms.common.api.internal.k)) {
            ((com.google.android.gms.common.api.internal.k) fVarC).w(strI);
        }
        return fVarC;
    }

    public final d2 m(Context context, Handler handler) {
        return new d2(context, handler, d().a());
    }
}
