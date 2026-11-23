package com.facebook.j0.t;

import android.content.Context;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b a = new b();

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
                b.a(b.a);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.j0.t.b$b, reason: collision with other inner class name */
    static final class RunnableC0083b implements Runnable {
        public static final RunnableC0083b a = new RunnableC0083b();

        RunnableC0083b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                b.a(b.a);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    private b() {
    }

    public static final /* synthetic */ void a(b bVar) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return;
        }
        try {
            bVar.b();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
        }
    }

    private final void b() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            c.b bVar = c.x;
            e.e(bVar.d(), bVar.e());
            bVar.d().clear();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public static final void c(Context context) {
        c.b bVar;
        c cVarC;
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return;
        }
        try {
            i.e(context, "context");
            if (h.a("com.android.billingclient.api.Purchase") == null || (cVarC = (bVar = c.x).c(context)) == null || !bVar.f().get()) {
                return;
            }
            if (e.d()) {
                cVarC.p("inapp", a.a);
            } else {
                cVarC.o("inapp", RunnableC0083b.a);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
        }
    }
}
