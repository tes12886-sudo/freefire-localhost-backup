package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class g extends Service {
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = p.c();
    private final Object lock = new Object();
    private int runningTasks = 0;

    class a implements z0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.z0.a
        public Task<Void> a(Intent intent) {
            return g.this.processIntent(intent);
        }
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            w0.b(intent);
        }
        synchronized (this.lock) {
            int i2 = this.runningTasks - 1;
            this.runningTasks = i2;
            if (i2 == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> processIntent(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return com.google.android.gms.tasks.d.e(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new Runnable(this, intent, taskCompletionSource) { // from class: com.google.firebase.messaging.d
            private final g a;
            private final Intent b;
            private final TaskCompletionSource c;

            {
                this.a = this;
                this.b = intent;
                this.c = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.lambda$processIntent$0$EnhancedIntentService(this.b, this.c);
            }
        });
        return taskCompletionSource.a();
    }

    protected abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    final /* synthetic */ void lambda$onStartCommand$1$EnhancedIntentService(Intent intent, Task task) {
        finishTask(intent);
    }

    final /* synthetic */ void lambda$processIntent$0$EnhancedIntentService(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            handleIntent(intent);
        } finally {
            taskCompletionSource.c(null);
        }
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new z0(new a());
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i2, int i3) {
        synchronized (this.lock) {
            this.lastStartId = i3;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        Task<Void> taskProcessIntent = processIntent(startCommandIntent);
        if (taskProcessIntent.isComplete()) {
            finishTask(intent);
            return 2;
        }
        taskProcessIntent.addOnCompleteListener(e.a, new OnCompleteListener(this, intent) { // from class: com.google.firebase.messaging.f
            private final g a;
            private final Intent b;

            {
                this.a = this;
                this.b = intent;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void a(Task task) {
                this.a.lambda$onStartCommand$1$EnhancedIntentService(this.b, task);
            }
        });
        return 3;
    }

    boolean stopSelfResultHook(int i2) {
        return stopSelfResult(i2);
    }
}
