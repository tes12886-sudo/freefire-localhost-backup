package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
class CrashlyticsController {
    static final FilenameFilter t = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.a
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };
    private final Context a;
    private final DataCollectionArbiter b;
    private final CrashlyticsFileMarker c;
    private final z d;
    private final CrashlyticsBackgroundWorker e;
    private final IdManager f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.g.h f1367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppData f1368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.d.b.InterfaceC0132b f1369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.d.b f1370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final CrashlyticsNativeComponent f1371k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f1372l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AnalyticsEventLogger f1373m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final x f1374n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private n f1375o;
    final TaskCompletionSource<Boolean> p = new TaskCompletionSource<>();
    final TaskCompletionSource<Boolean> q = new TaskCompletionSource<>();
    final TaskCompletionSource<Void> r = new TaskCompletionSource<>();
    final AtomicBoolean s = new AtomicBoolean(false);

    class a implements Callable<Void> {
        final /* synthetic */ long a;

        a(long j2) {
            this.a = j2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.a);
            CrashlyticsController.this.f1373m.a("_ae", bundle);
            return null;
        }
    }

    class b implements n.a {
        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.common.n.a
        public void a(SettingsDataProvider settingsDataProvider, Thread thread, Throwable th) {
            CrashlyticsController.this.I(settingsDataProvider, thread, th);
        }
    }

    class c implements Callable<Task<Void>> {
        final /* synthetic */ Date a;
        final /* synthetic */ Throwable b;
        final /* synthetic */ Thread c;
        final /* synthetic */ SettingsDataProvider d;

        class a implements SuccessContinuation<com.google.firebase.crashlytics.internal.settings.h.a, Void> {
            final /* synthetic */ Executor a;

            a(Executor executor) {
                this.a = executor;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Task<Void> a(com.google.firebase.crashlytics.internal.settings.h.a aVar) {
                if (aVar != null) {
                    return com.google.android.gms.tasks.d.g(CrashlyticsController.this.P(), CrashlyticsController.this.f1374n.p(this.a));
                }
                com.google.firebase.crashlytics.internal.a.f().k("Received null app settings, cannot send reports at crash time.");
                return com.google.android.gms.tasks.d.e(null);
            }
        }

        c(Date date, Throwable th, Thread thread, SettingsDataProvider settingsDataProvider) {
            this.a = date;
            this.b = th;
            this.c = thread;
            this.d = settingsDataProvider;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() {
            long jH = CrashlyticsController.H(this.a);
            String strC = CrashlyticsController.this.C();
            if (strC == null) {
                com.google.firebase.crashlytics.internal.a.f().d("Tried to write a fatal exception while no session was open.");
                return com.google.android.gms.tasks.d.e(null);
            }
            CrashlyticsController.this.c.a();
            CrashlyticsController.this.f1374n.l(this.b, this.c, strC, jH);
            CrashlyticsController.this.v(this.a.getTime());
            CrashlyticsController.this.s();
            CrashlyticsController.this.u();
            if (!CrashlyticsController.this.b.isAutomaticDataCollectionEnabled()) {
                return com.google.android.gms.tasks.d.e(null);
            }
            Executor executorC = CrashlyticsController.this.e.c();
            return this.d.a().onSuccessTask(executorC, new a(executorC));
        }
    }

    class d implements SuccessContinuation<Void, Boolean> {
        d(CrashlyticsController crashlyticsController) {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task<Boolean> a(Void r1) {
            return com.google.android.gms.tasks.d.e(Boolean.TRUE);
        }
    }

    class e implements SuccessContinuation<Boolean, Void> {
        final /* synthetic */ Task a;

        class a implements Callable<Task<Void>> {
            final /* synthetic */ Boolean a;

            /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$e$a$a, reason: collision with other inner class name */
            class C0130a implements SuccessContinuation<com.google.firebase.crashlytics.internal.settings.h.a, Void> {
                final /* synthetic */ Executor a;

                C0130a(Executor executor) {
                    this.a = executor;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Task<Void> a(com.google.firebase.crashlytics.internal.settings.h.a aVar) {
                    if (aVar == null) {
                        com.google.firebase.crashlytics.internal.a.f().k("Received null app settings at app startup. Cannot send cached reports");
                    } else {
                        CrashlyticsController.this.P();
                        CrashlyticsController.this.f1374n.p(this.a);
                        CrashlyticsController.this.r.e(null);
                    }
                    return com.google.android.gms.tasks.d.e(null);
                }
            }

            a(Boolean bool) {
                this.a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task<Void> call() {
                if (this.a.booleanValue()) {
                    com.google.firebase.crashlytics.internal.a.f().b("Sending cached crash reports...");
                    CrashlyticsController.this.b.grantDataCollectionPermission(this.a.booleanValue());
                    Executor executorC = CrashlyticsController.this.e.c();
                    return e.this.a.onSuccessTask(executorC, new C0130a(executorC));
                }
                com.google.firebase.crashlytics.internal.a.f().i("Deleting cached crash reports...");
                CrashlyticsController.p(CrashlyticsController.this.L());
                CrashlyticsController.this.f1374n.o();
                CrashlyticsController.this.r.e(null);
                return com.google.android.gms.tasks.d.e(null);
            }
        }

        e(Task task) {
            this.a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task<Void> a(Boolean bool) {
            return CrashlyticsController.this.e.i(new a(bool));
        }
    }

    class f implements Callable<Void> {
        final /* synthetic */ long a;
        final /* synthetic */ String b;

        f(long j2, String str) {
            this.a = j2;
            this.b = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (CrashlyticsController.this.J()) {
                return null;
            }
            CrashlyticsController.this.f1370j.g(this.a, this.b);
            return null;
        }
    }

    class g implements Runnable {
        final /* synthetic */ Date a;
        final /* synthetic */ Throwable b;
        final /* synthetic */ Thread c;

        g(Date date, Throwable th, Thread thread) {
            this.a = date;
            this.b = th;
            this.c = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashlyticsController.this.J()) {
                return;
            }
            long jH = CrashlyticsController.H(this.a);
            String strC = CrashlyticsController.this.C();
            if (strC == null) {
                com.google.firebase.crashlytics.internal.a.f().k("Tried to write a non-fatal exception while no session was open.");
            } else {
                CrashlyticsController.this.f1374n.m(this.b, this.c, strC, jH);
            }
        }
    }

    class h implements Callable<Void> {
        final /* synthetic */ z a;

        h(z zVar) {
            this.a = zVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Throwable {
            String strC = CrashlyticsController.this.C();
            if (strC == null) {
                com.google.firebase.crashlytics.internal.a.f().b("Tried to cache user data while no session was open.");
                return null;
            }
            CrashlyticsController.this.f1374n.n(strC);
            new u(CrashlyticsController.this.E()).f(strC, this.a);
            return null;
        }
    }

    class i implements Callable<Void> {
        final /* synthetic */ Map a;

        i(Map map) {
            this.a = map;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Throwable {
            new u(CrashlyticsController.this.E()).e(CrashlyticsController.this.C(), this.a);
            return null;
        }
    }

    class j implements Callable<Void> {
        j() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            CrashlyticsController.this.u();
            return null;
        }
    }

    CrashlyticsController(Context context, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, com.google.firebase.crashlytics.internal.g.h hVar, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, z zVar, com.google.firebase.crashlytics.internal.d.b bVar, com.google.firebase.crashlytics.internal.d.b.InterfaceC0132b interfaceC0132b, x xVar, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger) {
        this.a = context;
        this.e = crashlyticsBackgroundWorker;
        this.f = idManager;
        this.b = dataCollectionArbiter;
        this.f1367g = hVar;
        this.c = crashlyticsFileMarker;
        this.f1368h = appData;
        this.d = zVar;
        this.f1370j = bVar;
        this.f1369i = interfaceC0132b;
        this.f1371k = crashlyticsNativeComponent;
        this.f1372l = appData.f1366g.a();
        this.f1373m = analyticsEventLogger;
        this.f1374n = xVar;
    }

    private static boolean A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private Context B() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String C() {
        List<String> listH = this.f1374n.h();
        if (listH.isEmpty()) {
            return null;
        }
        return listH.get(0);
    }

    private static long D() {
        return H(new Date());
    }

    static List<v> F(com.google.firebase.crashlytics.internal.b bVar, String str, File file, byte[] bArr) {
        u uVar = new u(file);
        File fileB = uVar.b(str);
        File fileA = uVar.a(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.google.firebase.crashlytics.internal.common.i("logs_file", "logs", bArr));
        arrayList.add(new r("crash_meta_file", "metadata", bVar.f()));
        arrayList.add(new r("session_meta_file", "session", bVar.e()));
        arrayList.add(new r("app_meta_file", "app", bVar.a()));
        arrayList.add(new r("device_meta_file", "device", bVar.c()));
        arrayList.add(new r("os_meta_file", "os", bVar.b()));
        arrayList.add(new r("minidump_file", "minidump", bVar.d()));
        arrayList.add(new r("user_meta_file", "user", fileB));
        arrayList.add(new r("keys_file", "keys", fileA));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long H(Date date) {
        return date.getTime() / 1000;
    }

    private static File[] M(File file, FilenameFilter filenameFilter) {
        return x(file.listFiles(filenameFilter));
    }

    private File[] N(FilenameFilter filenameFilter) {
        return M(E(), filenameFilter);
    }

    private Task<Void> O(long j2) {
        if (A()) {
            com.google.firebase.crashlytics.internal.a.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return com.google.android.gms.tasks.d.e(null);
        }
        com.google.firebase.crashlytics.internal.a.f().b("Logging app exception event to Firebase Analytics");
        return com.google.android.gms.tasks.d.c(new ScheduledThreadPoolExecutor(1), new a(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> P() {
        ArrayList arrayList = new ArrayList();
        for (File file : L()) {
            try {
                arrayList.add(O(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                com.google.firebase.crashlytics.internal.a.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return com.google.android.gms.tasks.d.f(arrayList);
    }

    private Task<Boolean> W() {
        Boolean bool = Boolean.TRUE;
        if (this.b.isAutomaticDataCollectionEnabled()) {
            com.google.firebase.crashlytics.internal.a.f().b("Automatic data collection is enabled. Allowing upload.");
            this.p.e(Boolean.FALSE);
            return com.google.android.gms.tasks.d.e(bool);
        }
        com.google.firebase.crashlytics.internal.a.f().b("Automatic data collection is disabled.");
        com.google.firebase.crashlytics.internal.a.f().i("Notifying that unsent reports are available.");
        this.p.e(bool);
        Task<TContinuationResult> taskOnSuccessTask = this.b.waitForAutomaticDataCollectionEnabled().onSuccessTask(new d(this));
        com.google.firebase.crashlytics.internal.a.f().b("Waiting for send/deleteUnsentReports to be called.");
        return a0.d(taskOnSuccessTask, this.q.a());
    }

    private void X(String str, long j2) {
        this.f1371k.e(str, String.format(Locale.US, "Crashlytics Android SDK/%s", CrashlyticsCore.getVersion()), j2);
    }

    private void Z(String str) {
        String strF = this.f.f();
        AppData appData = this.f1368h;
        this.f1371k.d(str, strF, appData.e, appData.f, this.f.a(), p.a(this.f1368h.c).c(), this.f1372l);
    }

    private void a0(String str) {
        Context contextB = B();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        this.f1371k.c(str, k.l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), k.s(), ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount()), k.y(contextB), k.m(contextB), Build.MANUFACTURER, Build.PRODUCT);
    }

    private void b0(String str) {
        this.f1371k.f(str, Build.VERSION.RELEASE, Build.VERSION.CODENAME, k.z(B()));
    }

    private void m(Map<String, String> map) {
        this.e.h(new i(map));
    }

    private void n(z zVar) {
        this.e.h(new h(zVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(File[] fileArr) {
        if (fileArr == null) {
            return;
        }
        for (File file : fileArr) {
            file.delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void t(boolean z) {
        List<String> listH = this.f1374n.h();
        if (listH.size() <= z) {
            com.google.firebase.crashlytics.internal.a.f().i("No open sessions to be closed.");
            return;
        }
        String str = listH.get(z ? 1 : 0);
        if (this.f1371k.h(str)) {
            y(str);
            if (!this.f1371k.a(str)) {
                com.google.firebase.crashlytics.internal.a.f().k("Could not finalize native session: " + str);
            }
        }
        this.f1374n.c(D(), z != 0 ? listH.get(0) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        long jD = D();
        String string = new com.google.firebase.crashlytics.internal.common.j(this.f).toString();
        com.google.firebase.crashlytics.internal.a.f().b("Opening a new session with ID " + string);
        this.f1371k.g(string);
        X(string, jD);
        Z(string);
        b0(string);
        a0(string);
        this.f1370j.e(string);
        this.f1374n.i(string, jD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(long j2) {
        try {
            new File(E(), ".ae" + j2).createNewFile();
        } catch (IOException e2) {
            com.google.firebase.crashlytics.internal.a.f().l("Could not create app exception marker file.", e2);
        }
    }

    private static File[] x(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    private void y(String str) {
        com.google.firebase.crashlytics.internal.a.f().i("Finalizing native report for session " + str);
        com.google.firebase.crashlytics.internal.b bVarB = this.f1371k.b(str);
        File fileD = bVarB.d();
        if (fileD == null || !fileD.exists()) {
            com.google.firebase.crashlytics.internal.a.f().k("No minidump data found for session " + str);
            return;
        }
        long jLastModified = fileD.lastModified();
        com.google.firebase.crashlytics.internal.d.b bVar = new com.google.firebase.crashlytics.internal.d.b(this.a, this.f1369i, str);
        File file = new File(G(), str);
        if (!file.mkdirs()) {
            com.google.firebase.crashlytics.internal.a.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        v(jLastModified);
        List<v> listF = F(bVarB, str, E(), bVar.b());
        w.b(file, listF);
        this.f1374n.b(str, listF);
        bVar.a();
    }

    File E() {
        return this.f1367g.b();
    }

    File G() {
        return new File(E(), "native-sessions");
    }

    synchronized void I(SettingsDataProvider settingsDataProvider, Thread thread, Throwable th) {
        com.google.firebase.crashlytics.internal.a.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            a0.a(this.e.i(new c(new Date(), th, thread, settingsDataProvider)));
        } catch (Exception e2) {
            com.google.firebase.crashlytics.internal.a.f().e("Error handling uncaught exception", e2);
        }
    }

    boolean J() {
        n nVar = this.f1375o;
        return nVar != null && nVar.a();
    }

    File[] L() {
        return N(t);
    }

    void Q() {
        this.e.h(new j());
    }

    Task<Void> R() {
        this.q.e(Boolean.TRUE);
        return this.r.a();
    }

    void S(String str, String str2) {
        try {
            this.d.g(str, str2);
            m(this.d.c());
        } catch (IllegalArgumentException e2) {
            Context context = this.a;
            if (context != null && k.w(context)) {
                throw e2;
            }
            com.google.firebase.crashlytics.internal.a.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void T(Map<String, String> map) {
        this.d.h(map);
        m(this.d.c());
    }

    void U(String str) {
        this.d.j(str);
        n(this.d);
    }

    Task<Void> V(Task<com.google.firebase.crashlytics.internal.settings.h.a> task) {
        if (this.f1374n.e()) {
            com.google.firebase.crashlytics.internal.a.f().i("Crash reports are available to be sent.");
            return W().onSuccessTask(new e(task));
        }
        com.google.firebase.crashlytics.internal.a.f().i("No crash reports are available to be sent.");
        this.p.e(Boolean.FALSE);
        return com.google.android.gms.tasks.d.e(null);
    }

    void Y(Thread thread, Throwable th) {
        this.e.g(new g(new Date(), th, thread));
    }

    void c0(long j2, String str) {
        this.e.h(new f(j2, str));
    }

    Task<Boolean> o() {
        if (this.s.compareAndSet(false, true)) {
            return this.p.a();
        }
        com.google.firebase.crashlytics.internal.a.f().k("checkForUnsentReports should only be called once per execution.");
        return com.google.android.gms.tasks.d.e(Boolean.FALSE);
    }

    Task<Void> q() {
        this.q.e(Boolean.FALSE);
        return this.r.a();
    }

    boolean r() {
        if (!this.c.c()) {
            String strC = C();
            return strC != null && this.f1371k.h(strC);
        }
        com.google.firebase.crashlytics.internal.a.f().i("Found previous crash marker.");
        this.c.d();
        return true;
    }

    void s() {
        t(false);
    }

    void w(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsDataProvider settingsDataProvider) {
        Q();
        n nVar = new n(new b(), settingsDataProvider, uncaughtExceptionHandler);
        this.f1375o = nVar;
        Thread.setDefaultUncaughtExceptionHandler(nVar);
    }

    boolean z() {
        this.e.b();
        if (J()) {
            com.google.firebase.crashlytics.internal.a.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        com.google.firebase.crashlytics.internal.a.f().i("Finalizing previously open sessions.");
        try {
            t(true);
            com.google.firebase.crashlytics.internal.a.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e2) {
            com.google.firebase.crashlytics.internal.a.f().e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }
}
