package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Subscriber;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {

    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);

    @SuppressLint({"StaticFieldLeak"})
    private static Store store;

    @GuardedBy("FirebaseMessaging.class")
    static ScheduledExecutorService syncExecutor;

    @SuppressLint({"FirebaseUnknownNullness"})
    static TransportFactory transportFactory;
    private final AutoInit autoInit;
    private final Context context;
    private final Executor fileIoExecutor;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi fis;
    private final GmsRpc gmsRpc;
    private final FirebaseInstanceIdInternal iid;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final Metadata metadata;
    private final RequestDeduplicator requestDeduplicator;

    @GuardedBy("this")
    private boolean syncScheduledOrRunning;
    private final Executor taskExecutor;
    private final Task<TopicsSubscriber> topicsSubscriberTask;

    /* JADX INFO: Access modifiers changed from: private */
    class AutoInit {
        private final Subscriber a;

        @GuardedBy("this")
        private boolean b;

        @GuardedBy("this")
        private com.google.firebase.events.b<com.google.firebase.f> c;

        @GuardedBy("this")
        private Boolean d;

        AutoInit(Subscriber subscriber) {
            this.a = subscriber;
        }

        private Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context applicationContext = FirebaseMessaging.this.firebaseApp.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void a() {
            if (this.b) {
                return;
            }
            Boolean boolD = d();
            this.d = boolD;
            if (boolD == null) {
                com.google.firebase.events.b<com.google.firebase.f> bVar = new com.google.firebase.events.b(this) { // from class: com.google.firebase.messaging.c0
                    private final FirebaseMessaging.AutoInit a;

                    {
                        this.a = this;
                    }

                    @Override // com.google.firebase.events.b
                    public void a(com.google.firebase.events.a aVar) {
                        this.a.c(aVar);
                    }
                };
                this.c = bVar;
                this.a.a(com.google.firebase.f.class, bVar);
            }
            this.b = true;
        }

        synchronized boolean b() {
            Boolean bool;
            a();
            bool = this.d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.firebaseApp.isDataCollectionDefaultEnabled();
        }

        final /* synthetic */ void c(com.google.firebase.events.a aVar) {
            if (b()) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
        }

        synchronized void e(boolean z) {
            a();
            com.google.firebase.events.b<com.google.firebase.f> bVar = this.c;
            if (bVar != null) {
                this.a.d(com.google.firebase.f.class, bVar);
                this.c = null;
            }
            SharedPreferences.Editor editorEdit = FirebaseMessaging.this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            editorEdit.putBoolean("auto_init", z);
            editorEdit.apply();
            if (z) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
            this.d = Boolean.valueOf(z);
        }
    }

    FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<com.google.firebase.platforminfo.h> provider, Provider<com.google.firebase.j.f> provider2, FirebaseInstallationsApi firebaseInstallationsApi, TransportFactory transportFactory2, Subscriber subscriber) {
        this(firebaseApp, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, transportFactory2, subscriber, new Metadata(firebaseApp.getApplicationContext()));
    }

    FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<com.google.firebase.platforminfo.h> provider, Provider<com.google.firebase.j.f> provider2, FirebaseInstallationsApi firebaseInstallationsApi, TransportFactory transportFactory2, Subscriber subscriber, Metadata metadata) {
        this(firebaseApp, firebaseInstanceIdInternal, firebaseInstallationsApi, transportFactory2, subscriber, metadata, new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi), p.e(), p.b());
    }

    FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, FirebaseInstallationsApi firebaseInstallationsApi, TransportFactory transportFactory2, Subscriber subscriber, Metadata metadata, GmsRpc gmsRpc, Executor executor, Executor executor2) {
        this.syncScheduledOrRunning = false;
        transportFactory = transportFactory2;
        this.firebaseApp = firebaseApp;
        this.iid = firebaseInstanceIdInternal;
        this.fis = firebaseInstallationsApi;
        this.autoInit = new AutoInit(subscriber);
        Context applicationContext = firebaseApp.getApplicationContext();
        this.context = applicationContext;
        q qVar = new q();
        this.lifecycleCallbacks = qVar;
        this.metadata = metadata;
        this.taskExecutor = executor;
        this.gmsRpc = gmsRpc;
        this.requestDeduplicator = new RequestDeduplicator(executor);
        this.fileIoExecutor = executor2;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(qVar);
        } else {
            String strValueOf = String.valueOf(applicationContext2);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 125);
            sb.append("Context ");
            sb.append(strValueOf);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.c(new FirebaseInstanceIdInternal.a(this) { // from class: com.google.firebase.messaging.r
            });
        }
        synchronized (FirebaseMessaging.class) {
            if (store == null) {
                store = new Store(applicationContext);
            }
        }
        executor2.execute(new Runnable(this) { // from class: com.google.firebase.messaging.t
            private final FirebaseMessaging a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.lambda$new$0$FirebaseMessaging();
            }
        });
        Task<TopicsSubscriber> taskE = TopicsSubscriber.e(this, firebaseInstallationsApi, metadata, gmsRpc, applicationContext, p.f());
        this.topicsSubscriberTask = taskE;
        taskE.addOnSuccessListener(p.g(), new OnSuccessListener(this) { // from class: com.google.firebase.messaging.u
            private final FirebaseMessaging a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Object obj) {
                this.a.lambda$new$1$FirebaseMessaging((TopicsSubscriber) obj);
            }
        });
    }

    public static synchronized FirebaseMessaging getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) firebaseApp.get(FirebaseMessaging.class);
        com.google.android.gms.common.internal.q.l(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    private String getSubtype() {
        return FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName()) ? "" : this.firebaseApp.getPersistenceKey();
    }

    public static TransportFactory getTransportFactory() {
        return transportFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invokeOnTokenRefresh, reason: merged with bridge method [inline-methods] */
    public void bridge$lambda$0$FirebaseMessaging(String str) {
        if (FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String strValueOf = String.valueOf(this.firebaseApp.getName());
                Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(strValueOf) : new String("Invoking onNewToken for app: "));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra(j.c.a.a.EXTRA_TOKEN, str);
            new o(this.context).g(intent);
        }
    }

    private synchronized void startSync() {
        if (this.syncScheduledOrRunning) {
            return;
        }
        syncWithDelaySecondsInternal(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSyncIfNecessary() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.d();
        } else if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    String blockingGetToken() throws IOException {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) com.google.android.gms.tasks.d.a(firebaseInstanceIdInternal.a());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        Store.Token tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return tokenWithoutTriggeringSync.a;
        }
        final String strC = Metadata.c(this.firebaseApp);
        try {
            String str = (String) com.google.android.gms.tasks.d.a(this.fis.e().continueWithTask(p.d(), new Continuation(this, strC) { // from class: com.google.firebase.messaging.a0
                private final FirebaseMessaging a;
                private final String b;

                {
                    this.a = this;
                    this.b = strC;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public Object a(Task task) {
                    return this.a.lambda$blockingGetToken$9$FirebaseMessaging(this.b, task);
                }
            }));
            store.g(getSubtype(), strC, str, this.metadata.a());
            if (tokenWithoutTriggeringSync == null || !str.equals(tokenWithoutTriggeringSync.a)) {
                bridge$lambda$0$FirebaseMessaging(str);
            }
            return str;
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public Task<Void> deleteToken() {
        if (this.iid != null) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.fileIoExecutor.execute(new Runnable(this, taskCompletionSource) { // from class: com.google.firebase.messaging.w
                private final FirebaseMessaging a;
                private final TaskCompletionSource b;

                {
                    this.a = this;
                    this.b = taskCompletionSource;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.a.lambda$deleteToken$3$FirebaseMessaging(this.b);
                }
            });
            return taskCompletionSource.a();
        }
        if (getTokenWithoutTriggeringSync() == null) {
            return com.google.android.gms.tasks.d.e(null);
        }
        final ExecutorService executorServiceD = p.d();
        return this.fis.e().continueWithTask(executorServiceD, new Continuation(this, executorServiceD) { // from class: com.google.firebase.messaging.x
            private final FirebaseMessaging a;
            private final ExecutorService b;

            {
                this.a = this;
                this.b = executorServiceD;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object a(Task task) {
                return this.a.lambda$deleteToken$5$FirebaseMessaging(this.b, task);
            }
        });
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return j0.a();
    }

    void enqueueTaskWithDelaySeconds(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            if (syncExecutor == null) {
                syncExecutor = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.q.a("TAG"));
            }
            syncExecutor.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    Context getApplicationContext() {
        return this.context;
    }

    public Task<String> getToken() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.a();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.fileIoExecutor.execute(new Runnable(this, taskCompletionSource) { // from class: com.google.firebase.messaging.v
            private final FirebaseMessaging a;
            private final TaskCompletionSource b;

            {
                this.a = this;
                this.b = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.lambda$getToken$2$FirebaseMessaging(this.b);
            }
        });
        return taskCompletionSource.a();
    }

    Store.Token getTokenWithoutTriggeringSync() {
        return store.e(getSubtype(), Metadata.c(this.firebaseApp));
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.b();
    }

    boolean isGmsCorePresent() {
        return this.metadata.g();
    }

    final /* synthetic */ Task lambda$blockingGetToken$8$FirebaseMessaging(Task task) {
        return this.gmsRpc.e((String) task.getResult());
    }

    final /* synthetic */ Task lambda$blockingGetToken$9$FirebaseMessaging(String str, final Task task) {
        return this.requestDeduplicator.a(str, new RequestDeduplicator.a(this, task) { // from class: com.google.firebase.messaging.b0
            private final FirebaseMessaging a;
            private final Task b;

            {
                this.a = this;
                this.b = task;
            }

            @Override // com.google.firebase.messaging.RequestDeduplicator.a
            public Task start() {
                return this.a.lambda$blockingGetToken$8$FirebaseMessaging(this.b);
            }
        });
    }

    final /* synthetic */ void lambda$deleteToken$3$FirebaseMessaging(TaskCompletionSource taskCompletionSource) {
        try {
            this.iid.b(Metadata.c(this.firebaseApp), INSTANCE_ID_SCOPE);
            taskCompletionSource.c(null);
        } catch (Exception e) {
            taskCompletionSource.b(e);
        }
    }

    final /* synthetic */ Void lambda$deleteToken$4$FirebaseMessaging(Task task) {
        store.d(getSubtype(), Metadata.c(this.firebaseApp));
        return null;
    }

    final /* synthetic */ Task lambda$deleteToken$5$FirebaseMessaging(ExecutorService executorService, Task task) {
        return this.gmsRpc.b((String) task.getResult()).continueWith(executorService, new Continuation(this) { // from class: com.google.firebase.messaging.s
            private final FirebaseMessaging a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object a(Task task2) {
                this.a.lambda$deleteToken$4$FirebaseMessaging(task2);
                return null;
            }
        });
    }

    final /* synthetic */ void lambda$getToken$2$FirebaseMessaging(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.c(blockingGetToken());
        } catch (Exception e) {
            taskCompletionSource.b(e);
        }
    }

    final /* synthetic */ void lambda$new$0$FirebaseMessaging() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    final /* synthetic */ void lambda$new$1$FirebaseMessaging(TopicsSubscriber topicsSubscriber) {
        if (isAutoInitEnabled()) {
            topicsSubscriber.p();
        }
    }

    public void send(RemoteMessage remoteMessage) {
        if (TextUtils.isEmpty(remoteMessage.w())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra("app", PendingIntent.getBroadcast(this.context, 0, intent2, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
        intent.setPackage("com.google.android.gms");
        remoteMessage.y(intent);
        this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void setAutoInitEnabled(boolean z) {
        this.autoInit.e(z);
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        j0.y(z);
    }

    synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    public Task<Void> subscribeToTopic(final String str) {
        return this.topicsSubscriberTask.onSuccessTask(new SuccessContinuation(str) { // from class: com.google.firebase.messaging.y
            private final String a;

            {
                this.a = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public Task a(Object obj) {
                return ((TopicsSubscriber) obj).q(this.a);
            }
        });
    }

    synchronized void syncWithDelaySecondsInternal(long j2) {
        enqueueTaskWithDelaySeconds(new r0(this, Math.min(Math.max(30L, j2 + j2), MAX_DELAY_SEC)), j2);
        this.syncScheduledOrRunning = true;
    }

    boolean tokenNeedsRefresh(Store.Token token) {
        return token == null || token.b(this.metadata.a());
    }

    public Task<Void> unsubscribeFromTopic(final String str) {
        return this.topicsSubscriberTask.onSuccessTask(new SuccessContinuation(str) { // from class: com.google.firebase.messaging.z
            private final String a;

            {
                this.a = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public Task a(Object obj) {
                return ((TopicsSubscriber) obj).t(this.a);
            }
        });
    }
}
