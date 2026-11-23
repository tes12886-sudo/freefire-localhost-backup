package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class g implements FirebaseInstallationsApi {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f1438m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f1439n = new a();
    private final FirebaseApp a;
    private final com.google.firebase.installations.q.c b;
    private final com.google.firebase.installations.p.c c;
    private final n d;
    private final com.google.firebase.installations.p.b e;
    private final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f1440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f1441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ExecutorService f1442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f1443j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set<com.google.firebase.installations.o.a> f1444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<m> f1445l;

    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.google.firebase.installations.q.f.b.values().length];
            b = iArr;
            try {
                iArr[com.google.firebase.installations.q.f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[com.google.firebase.installations.q.f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[com.google.firebase.installations.q.f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.google.firebase.installations.q.d.b.values().length];
            a = iArr2;
            try {
                iArr2[com.google.firebase.installations.q.d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[com.google.firebase.installations.q.d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    g(FirebaseApp firebaseApp, Provider<com.google.firebase.platforminfo.h> provider, Provider<com.google.firebase.j.f> provider2) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f1439n), firebaseApp, new com.google.firebase.installations.q.c(firebaseApp.getApplicationContext(), provider, provider2), new com.google.firebase.installations.p.c(firebaseApp), n.c(), new com.google.firebase.installations.p.b(firebaseApp), new l());
    }

    g(ExecutorService executorService, FirebaseApp firebaseApp, com.google.firebase.installations.q.c cVar, com.google.firebase.installations.p.c cVar2, n nVar, com.google.firebase.installations.p.b bVar, l lVar) {
        this.f1440g = new Object();
        this.f1444k = new HashSet();
        this.f1445l = new ArrayList();
        this.a = firebaseApp;
        this.b = cVar;
        this.c = cVar2;
        this.d = nVar;
        this.e = bVar;
        this.f = lVar;
        this.f1441h = executorService;
        this.f1442i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f1439n);
    }

    private void A(Exception exc) {
        synchronized (this.f1440g) {
            Iterator<m> it = this.f1445l.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    private void B(com.google.firebase.installations.p.d dVar) {
        synchronized (this.f1440g) {
            Iterator<m> it = this.f1445l.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void C(String str) {
        this.f1443j = str;
    }

    private synchronized void D(com.google.firebase.installations.p.d dVar, com.google.firebase.installations.p.d dVar2) {
        if (this.f1444k.size() != 0 && !dVar.d().equals(dVar2.d())) {
            Iterator<com.google.firebase.installations.o.a> it = this.f1444k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    private Task<k> b() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        d(new i(this.d, taskCompletionSource));
        return taskCompletionSource.a();
    }

    private Task<String> c() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        d(new j(taskCompletionSource));
        return taskCompletionSource.a();
    }

    private void d(m mVar) {
        synchronized (this.f1440g) {
            this.f1445l.add(mVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void s(boolean z) {
        com.google.firebase.installations.p.d dVarZ;
        Exception iOException;
        com.google.firebase.installations.p.d dVarN = n();
        try {
            if (dVarN.i() || dVarN.l()) {
                dVarZ = z(dVarN);
            } else {
                if (!z && !this.d.f(dVarN)) {
                    return;
                }
                dVarZ = h(dVarN);
            }
            q(dVarZ);
            D(dVarN, dVarZ);
            if (dVarZ.k()) {
                C(dVarZ.d());
            }
            if (dVarZ.i()) {
                iOException = new h(h.a.BAD_CONFIG);
            } else {
                if (!dVarZ.j()) {
                    B(dVarZ);
                    return;
                }
                iOException = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
            }
            A(iOException);
        } catch (h e) {
            A(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void w(final boolean z) {
        com.google.firebase.installations.p.d dVarO = o();
        if (z) {
            dVarO = dVarO.p();
        }
        B(dVarO);
        this.f1442i.execute(new Runnable() { // from class: com.google.firebase.installations.a
            @Override // java.lang.Runnable
            public final void run() {
                this.a.s(z);
            }
        });
    }

    private com.google.firebase.installations.p.d h(com.google.firebase.installations.p.d dVar) throws h {
        com.google.firebase.installations.q.f fVarE = this.b.e(i(), dVar.d(), p(), dVar.f());
        int i2 = b.b[fVarE.b().ordinal()];
        if (i2 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.d.b());
        }
        if (i2 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i2 != 3) {
            throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
        }
        C(null);
        return dVar.r();
    }

    private synchronized String k() {
        return this.f1443j;
    }

    public static g l() {
        return m(FirebaseApp.getInstance());
    }

    public static g m(FirebaseApp firebaseApp) {
        q.b(firebaseApp != null, "Null is not a valid value of FirebaseApp.");
        return (g) firebaseApp.get(FirebaseInstallationsApi.class);
    }

    private com.google.firebase.installations.p.d n() {
        com.google.firebase.installations.p.d dVarC;
        synchronized (f1438m) {
            f fVarA = f.a(this.a.getApplicationContext(), "generatefid.lock");
            try {
                dVarC = this.c.c();
                if (fVarA != null) {
                    fVarA.b();
                }
            } catch (Throwable th) {
                if (fVarA != null) {
                    fVarA.b();
                }
                throw th;
            }
        }
        return dVarC;
    }

    private com.google.firebase.installations.p.d o() {
        com.google.firebase.installations.p.d dVarC;
        synchronized (f1438m) {
            f fVarA = f.a(this.a.getApplicationContext(), "generatefid.lock");
            try {
                dVarC = this.c.c();
                if (dVarC.j()) {
                    String strY = y(dVarC);
                    com.google.firebase.installations.p.c cVar = this.c;
                    dVarC = dVarC.t(strY);
                    cVar.a(dVarC);
                }
                if (fVarA != null) {
                    fVarA.b();
                }
            } catch (Throwable th) {
                if (fVarA != null) {
                    fVarA.b();
                }
                throw th;
            }
        }
        return dVarC;
    }

    private void q(com.google.firebase.installations.p.d dVar) {
        synchronized (f1438m) {
            f fVarA = f.a(this.a.getApplicationContext(), "generatefid.lock");
            try {
                this.c.a(dVar);
                if (fVarA != null) {
                    fVarA.b();
                }
            } catch (Throwable th) {
                if (fVarA != null) {
                    fVarA.b();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void u() {
        v(false);
    }

    private void x() {
        q.h(j(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        q.h(p(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        q.h(i(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        q.b(n.h(j()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        q.b(n.g(i()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String y(com.google.firebase.installations.p.d dVar) {
        if ((!this.a.getName().equals("CHIME_ANDROID_SDK") && !this.a.isDefaultApp()) || !dVar.m()) {
            return this.f.a();
        }
        String strF = this.e.f();
        return TextUtils.isEmpty(strF) ? this.f.a() : strF;
    }

    private com.google.firebase.installations.p.d z(com.google.firebase.installations.p.d dVar) throws h {
        com.google.firebase.installations.q.d dVarD = this.b.d(i(), dVar.d(), p(), j(), (dVar.d() == null || dVar.d().length() != 11) ? null : this.e.i());
        int i2 = b.a[dVarD.e().ordinal()];
        if (i2 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i2 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public Task<k> a(final boolean z) {
        x();
        Task<k> taskB = b();
        this.f1441h.execute(new Runnable() { // from class: com.google.firebase.installations.c
            @Override // java.lang.Runnable
            public final void run() {
                this.a.w(z);
            }
        });
        return taskB;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public Task<String> e() {
        x();
        String strK = k();
        if (strK != null) {
            return com.google.android.gms.tasks.d.e(strK);
        }
        Task<String> taskC = c();
        this.f1441h.execute(new Runnable() { // from class: com.google.firebase.installations.b
            @Override // java.lang.Runnable
            public final void run() {
                this.a.u();
            }
        });
        return taskC;
    }

    String i() {
        return this.a.getOptions().getApiKey();
    }

    String j() {
        return this.a.getOptions().getApplicationId();
    }

    String p() {
        return this.a.getOptions().getProjectId();
    }
}
