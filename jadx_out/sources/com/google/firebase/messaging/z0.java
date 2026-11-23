package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
class z0 extends Binder {
    private final a a;

    interface a {
        Task<Void> a(Intent intent);
    }

    z0(a aVar) {
        this.a = aVar;
    }

    void b(final c1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.a.a(aVar.a).addOnCompleteListener(x0.a, new OnCompleteListener(aVar) { // from class: com.google.firebase.messaging.y0
            private final c1.a a;

            {
                this.a = aVar;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void a(Task task) {
                this.a.b();
            }
        });
    }
}
