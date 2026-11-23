package com.facebook.internal;

import android.content.Intent;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static a d;
    public static final C0055a e = new C0055a(null);
    private Intent a;
    private int b;
    private final UUID c;

    /* JADX INFO: renamed from: com.facebook.internal.a$a, reason: collision with other inner class name */
    public static final class C0055a {
        private C0055a() {
        }

        public /* synthetic */ C0055a(l.y.c.f fVar) {
            this();
        }

        private final void d(a aVar) {
            a.b(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized boolean e(a aVar) {
            a aVarC;
            aVarC = c();
            d(aVar);
            return aVarC != null;
        }

        public final synchronized a b(UUID uuid, int i2) {
            l.y.c.i.e(uuid, "callId");
            a aVarC = c();
            if (aVarC != null && !(!l.y.c.i.a(aVarC.d(), uuid)) && aVarC.e() == i2) {
                e(null);
                return aVarC;
            }
            return null;
        }

        public final a c() {
            return a.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(int i2) {
        this(i2, null, 2, 0 == true ? 1 : 0);
    }

    public a(int i2, UUID uuid) {
        l.y.c.i.e(uuid, "callId");
        this.b = i2;
        this.c = uuid;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(int i2, UUID uuid, int i3, l.y.c.f fVar) {
        if ((i3 & 2) != 0) {
            uuid = UUID.randomUUID();
            l.y.c.i.d(uuid, "UUID.randomUUID()");
        }
        this(i2, uuid);
    }

    public static final /* synthetic */ a a() {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(a aVar) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            d = aVar;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }

    public static final synchronized a c(UUID uuid, int i2) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return null;
        }
        try {
            return e.b(uuid, i2);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
            return null;
        }
    }

    public final UUID d() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            return this.c;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public final int e() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return 0;
        }
        try {
            return this.b;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return 0;
        }
    }

    public final Intent f() {
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

    public final boolean g() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            return e.e(this);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    public final void h(Intent intent) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            this.a = intent;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
