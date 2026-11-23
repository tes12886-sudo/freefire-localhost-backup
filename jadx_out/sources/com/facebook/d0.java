package com.facebook;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    private static volatile d0 d;
    public static final a e = new a(null);
    private b0 a;
    private final h.q.a.a b;
    private final c0 c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final d0 a() {
            if (d0.d == null) {
                synchronized (this) {
                    if (d0.d == null) {
                        h.q.a.a aVarB = h.q.a.a.b(r.f());
                        l.y.c.i.d(aVarB, "LocalBroadcastManager.ge…tance(applicationContext)");
                        d0.d = new d0(aVarB, new c0());
                    }
                    l.s sVar = l.s.a;
                }
            }
            d0 d0Var = d0.d;
            if (d0Var != null) {
                return d0Var;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public d0(h.q.a.a aVar, c0 c0Var) {
        l.y.c.i.e(aVar, "localBroadcastManager");
        l.y.c.i.e(c0Var, "profileCache");
        this.b = aVar;
        this.c = c0Var;
    }

    private final void e(b0 b0Var, b0 b0Var2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", b0Var);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", b0Var2);
        this.b.d(intent);
    }

    private final void g(b0 b0Var, boolean z) {
        b0 b0Var2 = this.a;
        this.a = b0Var;
        if (z) {
            c0 c0Var = this.c;
            if (b0Var != null) {
                c0Var.c(b0Var);
            } else {
                c0Var.a();
            }
        }
        if (com.facebook.internal.h0.c(b0Var2, b0Var)) {
            return;
        }
        e(b0Var2, b0Var);
    }

    public final b0 c() {
        return this.a;
    }

    public final boolean d() {
        b0 b0VarB = this.c.b();
        if (b0VarB == null) {
            return false;
        }
        g(b0VarB, false);
        return true;
    }

    public final void f(b0 b0Var) {
        g(b0Var, true);
    }
}
