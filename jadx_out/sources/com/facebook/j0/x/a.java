package com.facebook.j0.x;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.r;
import java.util.Set;
import l.t.h0;
import l.t.l;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a b = new a();
    private static final Set<String> a = h0.f("fb_mobile_purchase", "StartTrial", "Subscribe");

    /* JADX INFO: renamed from: com.facebook.j0.x.a$a, reason: collision with other inner class name */
    static final class RunnableC0091a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ com.facebook.j0.c b;

        RunnableC0091a(String str, com.facebook.j0.c cVar) {
            this.a = str;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                c.c(this.a, l.b(this.b));
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static final class b implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        b(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.a.getSharedPreferences(this.b, 0);
                String str = this.c + "pingForOnDevice";
                if (sharedPreferences.getLong(str, 0L) == 0) {
                    c.e(this.c);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong(str, System.currentTimeMillis());
                    editorEdit.apply();
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    private a() {
    }

    private final boolean a(com.facebook.j0.c cVar) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            return (cVar.h() ^ true) || (cVar.h() && a.contains(cVar.f()));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    public static final boolean b() {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return false;
        }
        try {
            return (!r.s(r.f()) && !com.facebook.internal.h0.V()) && c.b();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
            return false;
        }
    }

    public static final void c(String str, com.facebook.j0.c cVar) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            i.e(str, "applicationId");
            i.e(cVar, "event");
            if (b.a(cVar)) {
                r.n().execute(new RunnableC0091a(str, cVar));
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }

    public static final void d(String str, String str2) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            Context contextF = r.f();
            if (contextF == null || str == null || str2 == null) {
                return;
            }
            r.n().execute(new b(contextF, str2, str));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }
}
