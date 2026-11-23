package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class v0 implements Runnable {
    private static final Object f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Boolean f1477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Boolean f1478h;
    private final Context a;
    private final Metadata b;
    private final PowerManager.WakeLock c;
    private final TopicsSubscriber d;
    private final long e;

    class a extends BroadcastReceiver {
        private v0 a;

        public a(v0 v0Var) {
            this.a = v0Var;
        }

        public void a() {
            if (v0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            v0.this.a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            v0 v0Var = this.a;
            if (v0Var == null) {
                return;
            }
            if (v0Var.i()) {
                if (v0.j()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.a.d.l(this.a, 0L);
                context.unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    v0(TopicsSubscriber topicsSubscriber, Context context, Metadata metadata, long j2) {
        this.d = topicsSubscriber;
        this.a = context;
        this.e = j2;
        this.b = metadata;
        this.c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }

    private static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f) {
            Boolean bool = f1478h;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f1478h = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        Log.d("FirebaseMessaging", e(str));
        return false;
    }

    private static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (f) {
            Boolean bool = f1477g;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f1477g = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (h(this.a)) {
            this.c.acquire(b.a);
        }
        try {
            this.d.n(true);
            if (!this.b.g()) {
                this.d.n(false);
            } else if (f(this.a) && !i()) {
                new a(this).a();
            } else {
                if (this.d.r()) {
                    this.d.n(false);
                } else {
                    this.d.s(this.e);
                }
            }
        } catch (IOException e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.e("FirebaseMessaging", strValueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(strValueOf) : new String("Failed to sync topics. Won't retry sync. "));
            this.d.n(false);
        } finally {
            if (h(this.a)) {
                try {
                    this.c.release();
                } catch (RuntimeException unused) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        }
    }
}
