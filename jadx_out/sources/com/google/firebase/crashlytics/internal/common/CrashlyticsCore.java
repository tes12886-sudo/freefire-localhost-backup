package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsCore {
    static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final String CRASH_MARKER_FILE_NAME = "crash_marker";
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 4;
    private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final int MAX_STACK_SIZE = 1024;
    private static final String MISSING_BUILD_ID_MSG = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.";
    static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
    private final AnalyticsEventLogger analyticsEventLogger;
    private final FirebaseApp app;
    private final CrashlyticsBackgroundWorker backgroundWorker;
    private final BreadcrumbSource breadcrumbSource;
    private final Context context;
    private CrashlyticsController controller;
    private final ExecutorService crashHandlerExecutor;
    private CrashlyticsFileMarker crashMarker;
    private final DataCollectionArbiter dataCollectionArbiter;
    private boolean didCrashOnPreviousExecution;
    private final IdManager idManager;
    private CrashlyticsFileMarker initializationMarker;
    private final CrashlyticsNativeComponent nativeComponent;
    private final long startTime = System.currentTimeMillis();

    class a implements Callable<Task<Void>> {
        final /* synthetic */ SettingsDataProvider a;

        a(SettingsDataProvider settingsDataProvider) {
            this.a = settingsDataProvider;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() {
            return CrashlyticsCore.this.doBackgroundInitialization(this.a);
        }
    }

    class b implements Runnable {
        final /* synthetic */ SettingsDataProvider a;

        b(SettingsDataProvider settingsDataProvider) {
            this.a = settingsDataProvider;
        }

        @Override // java.lang.Runnable
        public void run() {
            CrashlyticsCore.this.doBackgroundInitialization(this.a);
        }
    }

    class c implements Callable<Boolean> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            try {
                boolean zD = CrashlyticsCore.this.initializationMarker.d();
                if (!zD) {
                    com.google.firebase.crashlytics.internal.a.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(zD);
            } catch (Exception e) {
                com.google.firebase.crashlytics.internal.a.f().e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    class d implements Callable<Boolean> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(CrashlyticsCore.this.controller.r());
        }
    }

    private static final class e implements com.google.firebase.crashlytics.internal.d.b.InterfaceC0132b {
        private final com.google.firebase.crashlytics.internal.g.h a;

        public e(com.google.firebase.crashlytics.internal.g.h hVar) {
            this.a = hVar;
        }

        @Override // com.google.firebase.crashlytics.internal.d.b.InterfaceC0132b
        public File a() {
            File file = new File(this.a.b(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, ExecutorService executorService) {
        this.app = firebaseApp;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.context = firebaseApp.getApplicationContext();
        this.idManager = idManager;
        this.nativeComponent = crashlyticsNativeComponent;
        this.breadcrumbSource = breadcrumbSource;
        this.analyticsEventLogger = analyticsEventLogger;
        this.crashHandlerExecutor = executorService;
        this.backgroundWorker = new CrashlyticsBackgroundWorker(executorService);
    }

    private void checkForPreviousCrash() {
        boolean zEquals;
        try {
            zEquals = Boolean.TRUE.equals((Boolean) a0.a(this.backgroundWorker.h(new d())));
        } catch (Exception unused) {
            zEquals = false;
        }
        this.didCrashOnPreviousExecution = zEquals;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> doBackgroundInitialization(SettingsDataProvider settingsDataProvider) {
        markInitializationStarted();
        try {
            this.breadcrumbSource.a(new com.google.firebase.crashlytics.internal.breadcrumbs.a() { // from class: com.google.firebase.crashlytics.internal.common.b
                @Override // com.google.firebase.crashlytics.internal.breadcrumbs.a
                public final void a(String str) {
                    this.a.log(str);
                }
            });
            if (!settingsDataProvider.b().b().a) {
                com.google.firebase.crashlytics.internal.a.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return com.google.android.gms.tasks.d.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.controller.z()) {
                com.google.firebase.crashlytics.internal.a.f().k("Previous sessions could not be finalized.");
            }
            return this.controller.V(settingsDataProvider.a());
        } catch (Exception e2) {
            com.google.firebase.crashlytics.internal.a.f().e("Crashlytics encountered a problem during asynchronous initialization.", e2);
            return com.google.android.gms.tasks.d.d(e2);
        } finally {
            markInitializationComplete();
        }
    }

    private void finishInitSynchronously(SettingsDataProvider settingsDataProvider) {
        com.google.firebase.crashlytics.internal.a aVarF;
        String str;
        Future<?> futureSubmit = this.crashHandlerExecutor.submit(new b(settingsDataProvider));
        com.google.firebase.crashlytics.internal.a.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            aVarF = com.google.firebase.crashlytics.internal.a.f();
            str = "Crashlytics was interrupted during initialization.";
            aVarF.e(str, e);
        } catch (ExecutionException e3) {
            e = e3;
            aVarF = com.google.firebase.crashlytics.internal.a.f();
            str = "Crashlytics encountered a problem during initialization.";
            aVarF.e(str, e);
        } catch (TimeoutException e4) {
            e = e4;
            aVarF = com.google.firebase.crashlytics.internal.a.f();
            str = "Crashlytics timed out during initialization.";
            aVarF.e(str, e);
        }
    }

    public static String getVersion() {
        return "18.0.1";
    }

    static boolean isBuildIdValid(String str, boolean z) {
        if (!z) {
            com.google.firebase.crashlytics.internal.a.f().i("Configured not to require a build ID.");
            return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
        }
        if (!TextUtils.isEmpty(str)) {
            return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", MISSING_BUILD_ID_MSG);
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    public Task<Boolean> checkForUnsentReports() {
        return this.controller.o();
    }

    public Task<Void> deleteUnsentReports() {
        return this.controller.q();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.didCrashOnPreviousExecution;
    }

    boolean didPreviousInitializationFail() {
        return this.initializationMarker.c();
    }

    public Task<Void> doBackgroundInitializationAsync(SettingsDataProvider settingsDataProvider) {
        return a0.b(this.crashHandlerExecutor, new a(settingsDataProvider));
    }

    CrashlyticsController getController() {
        return this.controller;
    }

    public void log(String str) {
        this.controller.c0(System.currentTimeMillis() - this.startTime, str);
    }

    public void logException(Throwable th) {
        this.controller.Y(Thread.currentThread(), th);
    }

    void markInitializationComplete() {
        this.backgroundWorker.h(new c());
    }

    void markInitializationStarted() {
        this.backgroundWorker.b();
        this.initializationMarker.a();
        com.google.firebase.crashlytics.internal.a.f().i("Initialization marker file was created.");
    }

    public boolean onPreExecute(AppData appData, SettingsDataProvider settingsDataProvider) {
        if (!isBuildIdValid(appData.b, k.k(this.context, CRASHLYTICS_REQUIRE_BUILD_ID, CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT))) {
            throw new IllegalStateException(MISSING_BUILD_ID_MSG);
        }
        try {
            com.google.firebase.crashlytics.internal.g.i iVar = new com.google.firebase.crashlytics.internal.g.i(this.context);
            this.crashMarker = new CrashlyticsFileMarker(CRASH_MARKER_FILE_NAME, iVar);
            this.initializationMarker = new CrashlyticsFileMarker(INITIALIZATION_MARKER_FILE_NAME, iVar);
            z zVar = new z();
            e eVar = new e(iVar);
            com.google.firebase.crashlytics.internal.d.b bVar = new com.google.firebase.crashlytics.internal.d.b(this.context, eVar);
            this.controller = new CrashlyticsController(this.context, this.backgroundWorker, this.idManager, this.dataCollectionArbiter, iVar, this.crashMarker, appData, zVar, bVar, eVar, x.a(this.context, this.idManager, iVar, appData, bVar, zVar, new com.google.firebase.crashlytics.internal.i.a(MAX_STACK_SIZE, new com.google.firebase.crashlytics.internal.i.c(10)), settingsDataProvider), this.nativeComponent, this.analyticsEventLogger);
            boolean zDidPreviousInitializationFail = didPreviousInitializationFail();
            checkForPreviousCrash();
            this.controller.w(Thread.getDefaultUncaughtExceptionHandler(), settingsDataProvider);
            if (!zDidPreviousInitializationFail || !k.c(this.context)) {
                com.google.firebase.crashlytics.internal.a.f().b("Successfully configured exception handler.");
                return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
            }
            com.google.firebase.crashlytics.internal.a.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            finishInitSynchronously(settingsDataProvider);
            return false;
        } catch (Exception e2) {
            com.google.firebase.crashlytics.internal.a.f().e("Crashlytics was not started due to an exception during initialization", e2);
            this.controller = null;
            return false;
        }
    }

    public Task<Void> sendUnsentReports() {
        return this.controller.R();
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.dataCollectionArbiter.setCrashlyticsDataCollectionEnabled(bool);
    }

    public void setCustomKey(String str, String str2) {
        this.controller.S(str, str2);
    }

    public void setCustomKeys(Map<String, String> map) {
        this.controller.T(map);
    }

    public void setUserId(String str) {
        this.controller.U(str);
    }
}
