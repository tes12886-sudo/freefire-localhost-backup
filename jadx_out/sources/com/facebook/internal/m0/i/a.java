package com.facebook.internal.m0.i;

import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.m0.b;
import com.facebook.r;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final Set<Object> a = Collections.newSetFromMap(new WeakHashMap());
    private static boolean b;

    /* JADX INFO: renamed from: com.facebook.internal.m0.i.a$a, reason: collision with other inner class name */
    public static final class RunnableC0064a implements Runnable {
        final /* synthetic */ Throwable a;

        RunnableC0064a(Throwable th) {
            this.a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException(this.a);
        }
    }

    public static final void a() {
        b = true;
    }

    public static final void b(Throwable th, Object obj) {
        i.e(obj, "o");
        if (b) {
            a.add(obj);
            if (r.j()) {
                com.facebook.internal.m0.a.b(th);
                b.a.b(th, b.c.CrashShield).g();
            }
            e(th);
        }
    }

    public static final boolean c() {
        return false;
    }

    public static final boolean d(Object obj) {
        i.e(obj, "o");
        return a.contains(obj);
    }

    public static final void e(Throwable th) {
        if (c()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0064a(th));
        }
    }
}
