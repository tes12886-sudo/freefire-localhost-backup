package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.k;
import com.google.firebase.crashlytics.internal.common.q;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCrashlytics {
    static final int APP_EXCEPTION_CALLBACK_TIMEOUT_MS = 500;
    static final String FIREBASE_CRASHLYTICS_ANALYTICS_ORIGIN = "clx";
    static final String LEGACY_CRASH_ANALYTICS_ORIGIN = "crash";
    private final CrashlyticsCore core;

    class a implements Continuation<Void, Object> {
        a() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        public Object a(Task<Void> task) {
            if (task.isSuccessful()) {
                return null;
            }
            com.google.firebase.crashlytics.internal.a.f().e("Error fetching settings.", task.getException());
            return null;
        }
    }

    class b implements Callable<Void> {
        final /* synthetic */ boolean a;
        final /* synthetic */ CrashlyticsCore b;
        final /* synthetic */ com.google.firebase.crashlytics.internal.settings.d c;

        b(boolean z, CrashlyticsCore crashlyticsCore, com.google.firebase.crashlytics.internal.settings.d dVar) {
            this.a = z;
            this.b = crashlyticsCore;
            this.c = dVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (!this.a) {
                return null;
            }
            this.b.doBackgroundInitializationAsync(this.c);
            return null;
        }
    }

    private FirebaseCrashlytics(CrashlyticsCore crashlyticsCore) {
        this.core = crashlyticsCore;
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.getInstance().get(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    static FirebaseCrashlytics init(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Provider<CrashlyticsNativeComponent> provider, Deferred<com.google.firebase.analytics.a.a> deferred) {
        Context applicationContext = firebaseApp.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        com.google.firebase.crashlytics.internal.a.f().g("Initializing Firebase Crashlytics " + CrashlyticsCore.getVersion() + " for " + packageName);
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
        IdManager idManager = new IdManager(applicationContext, packageName, firebaseInstallationsApi, dataCollectionArbiter);
        com.google.firebase.crashlytics.internal.c cVar = new com.google.firebase.crashlytics.internal.c(provider);
        e eVar = new e(deferred);
        CrashlyticsCore crashlyticsCore = new CrashlyticsCore(firebaseApp, idManager, cVar, dataCollectionArbiter, eVar.b(), eVar.a(), q.c("Crashlytics Exception Handler"));
        String applicationId = firebaseApp.getOptions().getApplicationId();
        String strN = k.n(applicationContext);
        com.google.firebase.crashlytics.internal.a.f().b("Mapping file ID is: " + strN);
        try {
            AppData appDataA = AppData.a(applicationContext, idManager, applicationId, strN, new com.google.firebase.crashlytics.internal.j.a(applicationContext));
            com.google.firebase.crashlytics.internal.a.f().i("Installer package name is: " + appDataA.c);
            ExecutorService executorServiceC = q.c("com.google.firebase.crashlytics.startup");
            com.google.firebase.crashlytics.internal.settings.d dVarL = com.google.firebase.crashlytics.internal.settings.d.l(applicationContext, applicationId, idManager, new com.google.firebase.crashlytics.internal.f.b(), appDataA.e, appDataA.f, dataCollectionArbiter);
            dVarL.p(executorServiceC).continueWith(executorServiceC, new a());
            com.google.android.gms.tasks.d.c(executorServiceC, new b(crashlyticsCore.onPreExecute(appDataA, dVarL), crashlyticsCore, dVarL));
            return new FirebaseCrashlytics(crashlyticsCore);
        } catch (PackageManager.NameNotFoundException e) {
            com.google.firebase.crashlytics.internal.a.f().e("Error retrieving app package info.", e);
            return null;
        }
    }

    public Task<Boolean> checkForUnsentReports() {
        return this.core.checkForUnsentReports();
    }

    public void deleteUnsentReports() {
        this.core.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.core.didCrashOnPreviousExecution();
    }

    public void log(String str) {
        this.core.log(str);
    }

    public void recordException(Throwable th) {
        if (th == null) {
            com.google.firebase.crashlytics.internal.a.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.core.logException(th);
        }
    }

    public void sendUnsentReports() {
        this.core.sendUnsentReports();
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.core.setCrashlyticsCollectionEnabled(bool);
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.core.setCrashlyticsCollectionEnabled(Boolean.valueOf(z));
    }

    public void setCustomKey(String str, double d) {
        this.core.setCustomKey(str, Double.toString(d));
    }

    public void setCustomKey(String str, float f) {
        this.core.setCustomKey(str, Float.toString(f));
    }

    public void setCustomKey(String str, int i2) {
        this.core.setCustomKey(str, Integer.toString(i2));
    }

    public void setCustomKey(String str, long j2) {
        this.core.setCustomKey(str, Long.toString(j2));
    }

    public void setCustomKey(String str, String str2) {
        this.core.setCustomKey(str, str2);
    }

    public void setCustomKey(String str, boolean z) {
        this.core.setCustomKey(str, Boolean.toString(z));
    }

    public void setCustomKeys(CustomKeysAndValues customKeysAndValues) {
        this.core.setCustomKeys(customKeysAndValues.a);
    }

    public void setUserId(String str) {
        this.core.setUserId(str);
    }
}
