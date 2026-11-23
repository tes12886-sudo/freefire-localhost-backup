package com.facebook.j0;

import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.r;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final String a;
    private static final ReentrantReadWriteLock b;
    private static String c;
    private static volatile boolean d;
    public static final b e = new b();

    static final class a implements Runnable {
        public static final a a = new a();

        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                b.e.c();
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static {
        String simpleName = b.class.getSimpleName();
        l.y.c.i.d(simpleName, "AnalyticsUserIDStore::class.java.simpleName");
        a = simpleName;
        b = new ReentrantReadWriteLock();
    }

    private b() {
    }

    public static final String b() {
        if (!d) {
            Log.w(a, "initStore should have been called before calling setUserID");
            e.c();
        }
        b.readLock().lock();
        try {
            return c;
        } finally {
            b.readLock().unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        if (d) {
            return;
        }
        b.writeLock().lock();
        try {
            if (d) {
                return;
            }
            c = PreferenceManager.getDefaultSharedPreferences(r.f()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            d = true;
        } finally {
            b.writeLock().unlock();
        }
    }

    public static final void d() {
        if (d) {
            return;
        }
        m.b.a().execute(a.a);
    }
}
