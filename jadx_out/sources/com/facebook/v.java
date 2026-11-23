package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class v extends AsyncTask<Void, Void, List<? extends x>> {
    private static final String d = v.class.getCanonicalName();
    private Exception a;
    private final HttpURLConnection b;
    private final w c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(w wVar) {
        this(null, wVar);
        l.y.c.i.e(wVar, "requests");
    }

    public v(HttpURLConnection httpURLConnection, w wVar) {
        l.y.c.i.e(wVar, "requests");
        this.b = httpURLConnection;
        this.c = wVar;
    }

    public List<x> a(Void... voidArr) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            l.y.c.i.e(voidArr, "params");
            try {
                HttpURLConnection httpURLConnection = this.b;
                return httpURLConnection == null ? this.c.h() : u.t.m(httpURLConnection, this.c);
            } catch (Exception e) {
                this.a = e;
                return null;
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    protected void b(List<x> list) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            l.y.c.i.e(list, "result");
            super.onPostExecute(list);
            Exception exc = this.a;
            if (exc != null) {
                String str = d;
                l.y.c.o oVar = l.y.c.o.a;
                String str2 = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                l.y.c.i.d(str2, "java.lang.String.format(format, *args)");
                com.facebook.internal.h0.f0(str, str2);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ List<? extends x> doInBackground(Void[] voidArr) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            return a(voidArr);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(List<? extends x> list) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            b(list);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            super.onPreExecute();
            if (r.v()) {
                String str = d;
                l.y.c.o oVar = l.y.c.o.a;
                String str2 = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                l.y.c.i.d(str2, "java.lang.String.format(format, *args)");
                com.facebook.internal.h0.f0(str, str2);
            }
            if (this.c.s() == null) {
                this.c.D(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.b + ", requests: " + this.c + "}";
        l.y.c.i.d(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
