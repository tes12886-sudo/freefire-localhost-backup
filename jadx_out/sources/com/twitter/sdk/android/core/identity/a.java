package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import j.g.a.a.a.j;
import j.g.a.a.a.p;
import j.g.a.a.a.q;
import j.g.a.a.a.r;
import j.g.a.a.a.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    protected final int a;
    private final p b;
    private final j.g.a.a.a.c<x> c;

    a(p pVar, j.g.a.a.a.c<x> cVar, int i2) {
        this.b = pVar;
        this.c = cVar;
        this.a = i2;
    }

    public abstract boolean a(Activity activity);

    p b() {
        return this.b;
    }

    j.g.a.a.a.c<x> c() {
        return this.c;
    }

    public boolean d(int i2, int i3, Intent intent) {
        q qVar;
        if (this.a != i2) {
            return false;
        }
        j.g.a.a.a.c<x> cVarC = c();
        if (cVarC == null) {
            return true;
        }
        if (i3 == -1) {
            String stringExtra = intent.getStringExtra("tk");
            String stringExtra2 = intent.getStringExtra("ts");
            cVarC.d(new j<>(new x(new r(stringExtra, stringExtra2), intent.getLongExtra("user_id", 0L), intent.getStringExtra("screen_name")), null));
            return true;
        }
        if (i3 == 0) {
            qVar = new q("Authorize canceled.");
        } else {
            qVar = (intent == null || !intent.hasExtra("auth_error")) ? new q("Authorize failed.") : (q) intent.getSerializableExtra("auth_error");
        }
        cVarC.c(qVar);
        return true;
    }
}
