package com.facebook.j0.t;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static g f666g;
    private final Class<?> a;
    private final Class<?> b;
    private final Method c;
    private final Method d;
    private final Method e;
    private final Method f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f668i = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicBoolean f667h = new AtomicBoolean(false);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        private final void a() {
            Class<?> clsA = h.a("com.android.billingclient.api.SkuDetailsParams");
            Class<?> clsA2 = h.a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (clsA == null || clsA2 == null) {
                return;
            }
            Method methodB = h.b(clsA, "newBuilder", new Class[0]);
            Method methodB2 = h.b(clsA2, "setType", String.class);
            Method methodB3 = h.b(clsA2, "setSkusList", List.class);
            Method methodB4 = h.b(clsA2, "build", new Class[0]);
            if (methodB == null || methodB2 == null || methodB3 == null || methodB4 == null) {
                return;
            }
            g.c(new g(clsA, clsA2, methodB, methodB2, methodB3, methodB4));
        }

        public final g b() {
            if (g.a().get()) {
                return g.b();
            }
            a();
            g.a().set(true);
            return g.b();
        }
    }

    public g(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        i.e(cls, "skuDetailsParamsClazz");
        i.e(cls2, "builderClazz");
        i.e(method, "newBuilderMethod");
        i.e(method2, "setTypeMethod");
        i.e(method3, "setSkusListMethod");
        i.e(method4, "buildMethod");
        this.a = cls;
        this.b = cls2;
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = method4;
    }

    public static final /* synthetic */ AtomicBoolean a() {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            return f667h;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    public static final /* synthetic */ g b() {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            return f666g;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(g gVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return;
        }
        try {
            f666g = gVar;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
        }
    }

    public final Object d(String str, List<String> list) {
        Object objC;
        Object objC2;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            Object objC3 = h.c(this.a, this.c, null, new Object[0]);
            if (objC3 != null && (objC = h.c(this.b, this.d, objC3, str)) != null && (objC2 = h.c(this.b, this.e, objC, list)) != null) {
                return h.c(this.b, this.f, objC2, new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public final Class<?> e() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }
}
