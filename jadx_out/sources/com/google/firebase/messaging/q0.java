package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class q0 {
    private final SharedPreferences a;
    private final Executor e;
    private final ArrayDeque<String> d = new ArrayDeque<>();
    private boolean f = false;
    private final String b = "topic_operation_queue";
    private final String c = ",";

    private q0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.a = sharedPreferences;
        this.e = executor;
    }

    private boolean c(boolean z) {
        if (!z || this.f) {
            return z;
        }
        j();
        return true;
    }

    static q0 d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        q0 q0Var = new q0(sharedPreferences, "topic_operation_queue", ",", executor);
        q0Var.e();
        return q0Var;
    }

    private void e() {
        synchronized (this.d) {
            this.d.clear();
            String string = this.a.getString(this.b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.c)) {
                String[] strArrSplit = string.split(this.c, -1);
                if (strArrSplit.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        this.d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void b() {
        synchronized (this.d) {
            this.a.edit().putString(this.b, h()).commit();
        }
    }

    private void j() {
        this.e.execute(new Runnable(this) { // from class: com.google.firebase.messaging.p0
            private final q0 a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.b();
            }
        });
    }

    public boolean a(String str) {
        boolean zAdd;
        if (TextUtils.isEmpty(str) || str.contains(this.c)) {
            return false;
        }
        synchronized (this.d) {
            zAdd = this.d.add(str);
            c(zAdd);
        }
        return zAdd;
    }

    public String f() {
        String strPeek;
        synchronized (this.d) {
            strPeek = this.d.peek();
        }
        return strPeek;
    }

    public boolean g(Object obj) {
        boolean zRemove;
        synchronized (this.d) {
            zRemove = this.d.remove(obj);
            c(zRemove);
        }
        return zRemove;
    }

    public String h() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.c);
        }
        return sb.toString();
    }
}
