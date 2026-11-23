package com.facebook.j0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final a b = new a(null);
    private final h a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final void a(Application application, String str) {
            l.y.c.i.e(application, "application");
            h.f645j.d(application, str);
        }

        public final String b(Context context) {
            l.y.c.i.e(context, "context");
            return h.f645j.g(context);
        }

        public final b c() {
            return h.f645j.h();
        }

        public final String d() {
            return com.facebook.j0.b.b();
        }

        public final void e(Context context, String str) {
            l.y.c.i.e(context, "context");
            h.f645j.k(context, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final g f(Context context) {
            l.y.c.i.e(context, "context");
            return new g(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public final void g() {
            h.f645j.o();
        }
    }

    public enum b {
        AUTO,
        EXPLICIT_ONLY
    }

    private g(Context context, String str, com.facebook.a aVar) {
        this.a = new h(context, str, aVar);
    }

    public /* synthetic */ g(Context context, String str, com.facebook.a aVar, l.y.c.f fVar) {
        this(context, str, aVar);
    }

    public final void a() {
        this.a.j();
    }

    public final void b(String str, Bundle bundle) {
        this.a.l(str, bundle);
    }
}
