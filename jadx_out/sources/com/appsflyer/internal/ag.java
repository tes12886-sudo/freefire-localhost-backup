package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ag {
    public static b valueOf = null;
    public static long values = 500;

    /* JADX INFO: renamed from: com.appsflyer.internal.ag$1, reason: invalid class name */
    final class AnonymousClass1 implements Application.ActivityLifecycleCallbacks {
        final /* synthetic */ b AFInAppEventType;
        boolean AFKeystoreWrapper;
        private /* synthetic */ Executor valueOf;
        boolean values = true;

        AnonymousClass1(Executor executor, b bVar) {
            this.valueOf = executor;
            this.AFInAppEventType = bVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(final Activity activity, Bundle bundle) {
            this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.ag.1.5
                @Override // java.lang.Runnable
                public final void run() {
                    i.values();
                    Intent intent = activity.getIntent();
                    if (i.AFKeystoreWrapper(intent) == null || intent == i.AFInAppEventParameterName) {
                        return;
                    }
                    i.AFInAppEventParameterName = intent;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(final Activity activity) {
            this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.ag.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass1.this.values = true;
                    final Context applicationContext = activity.getApplicationContext();
                    try {
                        new Timer().schedule(new TimerTask() { // from class: com.appsflyer.internal.ag.1.1.2
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public final void run() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                if (anonymousClass1.AFKeystoreWrapper && anonymousClass1.values) {
                                    anonymousClass1.AFKeystoreWrapper = false;
                                    try {
                                        anonymousClass1.AFInAppEventType.valueOf(applicationContext);
                                    } catch (Exception e) {
                                        AFLogger.valueOf("Listener threw exception! ", e);
                                    }
                                }
                            }
                        }, ag.values);
                    } catch (Throwable th) {
                        AFLogger.valueOf("Background task failed with a throwable: ", th);
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(final Activity activity) {
            this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.ag.1.3
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    if (!anonymousClass1.AFKeystoreWrapper) {
                        try {
                            anonymousClass1.AFInAppEventType.AFKeystoreWrapper(activity);
                        } catch (Exception e) {
                            AFLogger.values("Listener thrown an exception: ", e);
                        }
                    }
                    AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                    anonymousClass2.values = false;
                    anonymousClass2.AFKeystoreWrapper = true;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    public interface b {
        void AFKeystoreWrapper(Activity activity);

        void valueOf(Context context);
    }

    static void AFKeystoreWrapper(Context context, b bVar, Executor executor) {
        valueOf = bVar;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(executor, bVar);
        if (context instanceof Activity) {
            anonymousClass1.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(anonymousClass1);
    }
}
