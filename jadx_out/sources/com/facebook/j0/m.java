package com.facebook.j0;

import android.content.Context;
import android.os.Bundle;
import com.facebook.r;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final a b = new a(null);
    private final h a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final Executor a() {
            return h.f645j.f();
        }

        public final g.b b() {
            return h.f645j.h();
        }

        public final String c() {
            return h.f645j.j();
        }

        public final void d(Map<String, String> map) {
            l.y.c.i.e(map, "ud");
            p.i(map);
        }
    }

    public m(Context context) {
        this(new h(context, (String) null, (com.facebook.a) null));
    }

    public m(Context context, String str) {
        this(new h(context, str, (com.facebook.a) null));
    }

    public m(h hVar) {
        l.y.c.i.e(hVar, "loggerImpl");
        this.a = hVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(String str, String str2, com.facebook.a aVar) {
        this(new h(str, str2, aVar));
        l.y.c.i.e(str, "activityName");
    }

    public final void a() {
        this.a.j();
    }

    public final void b(Bundle bundle) {
        l.y.c.i.e(bundle, "parameters");
        if (((bundle.getInt("previous") & 2) != 0) || r.j()) {
            this.a.o("fb_sdk_settings_changed", null, bundle);
        }
    }

    public final void c(String str, double d, Bundle bundle) {
        if (r.j()) {
            this.a.k(str, d, bundle);
        }
    }

    public final void d(String str, Bundle bundle) {
        if (r.j()) {
            this.a.l(str, bundle);
        }
    }

    public final void e(String str, String str2) {
        this.a.n(str, str2);
    }

    public final void f(String str) {
        if (r.j()) {
            this.a.o(str, null, null);
        }
    }

    public final void g(String str, Bundle bundle) {
        if (r.j()) {
            this.a.o(str, null, bundle);
        }
    }

    public final void h(String str, Double d, Bundle bundle) {
        if (r.j()) {
            this.a.o(str, d, bundle);
        }
    }

    public final void i(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (r.j()) {
            this.a.p(str, bigDecimal, currency, bundle);
        }
    }

    public final void j(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (r.j()) {
            this.a.r(bigDecimal, currency, bundle);
        }
    }
}
