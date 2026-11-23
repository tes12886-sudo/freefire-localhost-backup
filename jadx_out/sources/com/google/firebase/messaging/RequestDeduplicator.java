package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
class RequestDeduplicator {
    private final Executor a;

    @GuardedBy("this")
    private final Map<String, Task<String>> b = new h.f.a();

    interface a {
        Task<String> start();
    }

    RequestDeduplicator(Executor executor) {
        this.a = executor;
    }

    synchronized Task<String> a(final String str, a aVar) {
        Task<String> task = this.b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String strValueOf = String.valueOf(str);
                Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Joining ongoing request for: ".concat(strValueOf) : new String("Joining ongoing request for: "));
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String strValueOf2 = String.valueOf(str);
            Log.d("FirebaseMessaging", strValueOf2.length() != 0 ? "Making new request for: ".concat(strValueOf2) : new String("Making new request for: "));
        }
        Task taskContinueWithTask = aVar.start().continueWithTask(this.a, new Continuation(this, str) { // from class: com.google.firebase.messaging.m0
            private final RequestDeduplicator a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object a(Task task2) {
                this.a.b(this.b, task2);
                return task2;
            }
        });
        this.b.put(str, (Task<String>) taskContinueWithTask);
        return taskContinueWithTask;
    }

    final /* synthetic */ Task b(String str, Task task) {
        synchronized (this) {
            this.b.remove(str);
        }
        return task;
    }
}
