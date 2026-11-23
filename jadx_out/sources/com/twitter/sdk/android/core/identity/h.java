package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import j.g.a.a.a.j;
import j.g.a.a.a.l;
import j.g.a.a.a.m;
import j.g.a.a.a.p;
import j.g.a.a.a.q;
import j.g.a.a.a.u;
import j.g.a.a.a.v;
import j.g.a.a.a.x;

/* JADX INFO: loaded from: classes.dex */
public class h {
    final com.twitter.sdk.android.core.identity.b a;
    final l<x> b;
    final p c;

    private static class a {
        private static final com.twitter.sdk.android.core.identity.b a = new com.twitter.sdk.android.core.identity.b();
    }

    static class b extends j.g.a.a.a.c<x> {
        private final l<x> a;
        private final j.g.a.a.a.c<x> b;

        b(l<x> lVar, j.g.a.a.a.c<x> cVar) {
            this.a = lVar;
            this.b = cVar;
        }

        @Override // j.g.a.a.a.c
        public void c(v vVar) {
            m.g().c("Twitter", "Authorization completed with an error", vVar);
            this.b.c(vVar);
        }

        @Override // j.g.a.a.a.c
        public void d(j<x> jVar) {
            m.g().d("Twitter", "Authorization completed successfully");
            this.a.a(jVar.a);
            this.b.d(jVar);
        }
    }

    public h() {
        this(u.f(), u.f().c(), u.f().g(), a.a);
    }

    h(u uVar, p pVar, l<x> lVar, com.twitter.sdk.android.core.identity.b bVar) {
        this.a = bVar;
        this.c = pVar;
        this.b = lVar;
    }

    private boolean b(Activity activity, b bVar) {
        m.g().d("Twitter", "Using OAuth");
        com.twitter.sdk.android.core.identity.b bVar2 = this.a;
        p pVar = this.c;
        return bVar2.a(activity, new d(pVar, bVar, pVar.c()));
    }

    private boolean c(Activity activity, b bVar) {
        if (!g.g(activity)) {
            return false;
        }
        m.g().d("Twitter", "Using SSO");
        com.twitter.sdk.android.core.identity.b bVar2 = this.a;
        p pVar = this.c;
        return bVar2.a(activity, new g(pVar, bVar, pVar.c()));
    }

    private void e(Activity activity, j.g.a.a.a.c<x> cVar) {
        b bVar = new b(this.b, cVar);
        if (c(activity, bVar) || b(activity, bVar)) {
            return;
        }
        bVar.c(new q("Authorize failed."));
    }

    public void a(Activity activity, j.g.a.a.a.c<x> cVar) {
        if (activity == null) {
            throw new IllegalArgumentException("Activity must not be null.");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback must not be null.");
        }
        if (activity.isFinishing()) {
            m.g().c("Twitter", "Cannot authorize, activity is finishing.", null);
        } else {
            e(activity, cVar);
        }
    }

    public int d() {
        return this.c.c();
    }

    public void f(int i2, int i3, Intent intent) {
        m.g().d("Twitter", "onActivityResult called with " + i2 + " " + i3);
        if (!this.a.d()) {
            m.g().c("Twitter", "Authorize not in progress", null);
            return;
        }
        com.twitter.sdk.android.core.identity.a aVarC = this.a.c();
        if (aVarC == null || !aVarC.d(i2, i3, intent)) {
            return;
        }
        this.a.b();
    }
}
