package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class TopicsSubscriber {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f1455j = TimeUnit.HOURS.toSeconds(8);
    private final Context a;
    private final Metadata b;
    private final GmsRpc c;
    private final FirebaseMessaging d;
    private final FirebaseInstallationsApi e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f1456g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t0 f1458i;
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f = new h.f.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1457h = false;

    private TopicsSubscriber(FirebaseMessaging firebaseMessaging, FirebaseInstallationsApi firebaseInstallationsApi, Metadata metadata, t0 t0Var, GmsRpc gmsRpc, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = firebaseMessaging;
        this.e = firebaseInstallationsApi;
        this.b = metadata;
        this.f1458i = t0Var;
        this.c = gmsRpc;
        this.a = context;
        this.f1456g = scheduledExecutorService;
    }

    private void a(s0 s0Var, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        synchronized (this.f) {
            String strE = s0Var.e();
            if (this.f.containsKey(strE)) {
                arrayDeque = this.f.get(strE);
            } else {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque2 = new ArrayDeque<>();
                this.f.put(strE, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(taskCompletionSource);
        }
    }

    private static <T> T b(Task<T> task) throws IOException {
        try {
            return (T) com.google.android.gms.tasks.d.b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e2);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    private void c(String str) throws IOException {
        b(this.c.k((String) b(this.e.e()), this.d.blockingGetToken(), str));
    }

    private void d(String str) throws IOException {
        b(this.c.l((String) b(this.e.e()), this.d.blockingGetToken(), str));
    }

    static Task<TopicsSubscriber> e(final FirebaseMessaging firebaseMessaging, final FirebaseInstallationsApi firebaseInstallationsApi, final Metadata metadata, final GmsRpc gmsRpc, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return com.google.android.gms.tasks.d.c(scheduledExecutorService, new Callable(context, scheduledExecutorService, firebaseMessaging, firebaseInstallationsApi, metadata, gmsRpc) { // from class: com.google.firebase.messaging.u0
            private final Context a;
            private final ScheduledExecutorService b;
            private final FirebaseMessaging c;
            private final FirebaseInstallationsApi d;
            private final Metadata e;
            private final GmsRpc f;

            {
                this.a = context;
                this.b = scheduledExecutorService;
                this.c = firebaseMessaging;
                this.d = firebaseInstallationsApi;
                this.e = metadata;
                this.f = gmsRpc;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return TopicsSubscriber.i(this.a, this.b, this.c, this.d, this.e, this.f);
            }
        });
    }

    static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    static final /* synthetic */ TopicsSubscriber i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, FirebaseInstallationsApi firebaseInstallationsApi, Metadata metadata, GmsRpc gmsRpc) {
        return new TopicsSubscriber(firebaseMessaging, firebaseInstallationsApi, metadata, t0.b(context, scheduledExecutorService), gmsRpc, context, scheduledExecutorService);
    }

    private void j(s0 s0Var) {
        synchronized (this.f) {
            String strE = s0Var.e();
            if (this.f.containsKey(strE)) {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f.get(strE);
                TaskCompletionSource<Void> taskCompletionSourcePoll = arrayDeque.poll();
                if (taskCompletionSourcePoll != null) {
                    taskCompletionSourcePoll.c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f.remove(strE);
                }
            }
        }
    }

    private void o() {
        if (h()) {
            return;
        }
        s(0L);
    }

    boolean f() {
        return this.f1458i.c() != null;
    }

    synchronized boolean h() {
        return this.f1457h;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    boolean k(s0 s0Var) throws IOException {
        String string;
        byte b;
        String string2;
        try {
            String strB = s0Var.b();
            int iHashCode = strB.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && strB.equals("U")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (strB.equals("S")) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                c(s0Var.c());
                if (g()) {
                    String strC = s0Var.c();
                    StringBuilder sb = new StringBuilder(String.valueOf(strC).length() + 31);
                    sb.append("Subscribe to topic: ");
                    sb.append(strC);
                    sb.append(" succeeded.");
                    string2 = sb.toString();
                    Log.d("FirebaseMessaging", string2);
                }
            } else if (b == 1) {
                d(s0Var.c());
                if (g()) {
                    String strC2 = s0Var.c();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strC2).length() + 35);
                    sb2.append("Unsubscribe from topic: ");
                    sb2.append(strC2);
                    sb2.append(" succeeded.");
                    string2 = sb2.toString();
                    Log.d("FirebaseMessaging", string2);
                }
            } else if (g()) {
                String strValueOf = String.valueOf(s0Var);
                StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf).length() + 24);
                sb3.append("Unknown topic operation");
                sb3.append(strValueOf);
                sb3.append(".");
                string2 = sb3.toString();
                Log.d("FirebaseMessaging", string2);
            }
            return true;
        } catch (IOException e) {
            if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                String message = e.getMessage();
                StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + 53);
                sb4.append("Topic operation failed: ");
                sb4.append(message);
                sb4.append(". Will retry Topic operation.");
                string = sb4.toString();
            } else {
                if (e.getMessage() != null) {
                    throw e;
                }
                string = "Topic operation failed without exception message. Will retry Topic operation.";
            }
            Log.e("FirebaseMessaging", string);
            return false;
        }
    }

    void l(Runnable runnable, long j2) {
        this.f1456g.schedule(runnable, j2, TimeUnit.SECONDS);
    }

    Task<Void> m(s0 s0Var) {
        this.f1458i.a(s0Var);
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        a(s0Var, taskCompletionSource);
        return taskCompletionSource.a();
    }

    synchronized void n(boolean z) {
        this.f1457h = z;
    }

    void p() {
        if (f()) {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> q(String str) {
        Task<Void> taskM = m(s0.f(str));
        p();
        return taskM;
    }

    boolean r() {
        while (true) {
            synchronized (this) {
                s0 s0VarC = this.f1458i.c();
                if (s0VarC == null) {
                    if (g()) {
                        Log.d("FirebaseMessaging", "topic sync succeeded");
                    }
                    return true;
                }
                if (!k(s0VarC)) {
                    return false;
                }
                this.f1458i.e(s0VarC);
                j(s0VarC);
            }
        }
    }

    void s(long j2) {
        l(new v0(this, this.a, this.b, Math.min(Math.max(30L, j2 + j2), f1455j)), j2);
        n(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> t(String str) {
        Task<Void> taskM = m(s0.g(str));
        p();
        return taskM;
    }
}
