package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class c {
    private final Executor a;
    private final Context b;
    private final k0 c;

    public c(Context context, k0 k0Var, Executor executor) {
        this.a = executor;
        this.b = context;
        this.c = k0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!com.google.android.gms.common.util.l.f()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    if (runningAppProcessInfo.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void c(a.C0152a c0152a) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.b.getSystemService("notification")).notify(c0152a.b, c0152a.c, c0152a.a.b());
    }

    private h0 d() {
        h0 h0VarF = h0.f(this.c.p("gcm.n.image"));
        if (h0VarF != null) {
            h0VarF.l(this.a);
        }
        return h0VarF;
    }

    private void e(androidx.core.app.i.e eVar, h0 h0Var) {
        if (h0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) com.google.android.gms.tasks.d.b(h0Var.j(), 5L, TimeUnit.SECONDS);
            eVar.o(bitmap);
            androidx.core.app.i.b bVar = new androidx.core.app.i.b();
            bVar.i(bitmap);
            bVar.h(null);
            eVar.x(bVar);
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            h0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            String strValueOf = String.valueOf(e.getCause());
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 26);
            sb.append("Failed to download image: ");
            sb.append(strValueOf);
            Log.w("FirebaseMessaging", sb.toString());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            h0Var.close();
        }
    }

    boolean a() {
        if (this.c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        h0 h0VarD = d();
        a.C0152a c0152aD = a.d(this.b, this.c);
        e(c0152aD.a, h0VarD);
        c(c0152aD);
        return true;
    }
}
