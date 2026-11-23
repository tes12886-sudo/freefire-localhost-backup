package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public class o {
    private static final Object c = new Object();

    @GuardedBy("lock")
    private static c1 d;
    private final Context a;
    private final Executor b = h.a;

    public o(Context context) {
        this.a = context;
    }

    private static Task<Integer> a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return b(context, "com.google.firebase.MESSAGING_EVENT").c(intent).continueWith(k.a, l.a);
    }

    private static c1 b(Context context, String str) {
        c1 c1Var;
        synchronized (c) {
            if (d == null) {
                d = new c1(context, "com.google.firebase.MESSAGING_EVENT");
            }
            c1Var = d;
        }
        return c1Var;
    }

    static final /* synthetic */ Integer c(Task task) {
        return -1;
    }

    static final /* synthetic */ Task f(Context context, Intent intent, Task task) {
        return (com.google.android.gms.common.util.l.h() && ((Integer) task.getResult()).intValue() == 402) ? a(context, intent).continueWith(m.a, n.a) : task;
    }

    public Task<Integer> g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> h(final Context context, final Intent intent) {
        boolean z = false;
        if (com.google.android.gms.common.util.l.h() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        return (z && (intent.getFlags() & 268435456) == 0) ? a(context, intent) : com.google.android.gms.tasks.d.c(this.b, new Callable(context, intent) { // from class: com.google.firebase.messaging.i
            private final Context a;
            private final Intent b;

            {
                this.a = context;
                this.b = intent;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return Integer.valueOf(o0.b().g(this.a, this.b));
            }
        }).continueWithTask(this.b, new Continuation(context, intent) { // from class: com.google.firebase.messaging.j
            private final Context a;
            private final Intent b;

            {
                this.a = context;
                this.b = intent;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object a(Task task) {
                return o.f(this.a, this.b, task);
            }
        });
    }
}
