package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import j.g.a.a.a.p;
import j.g.a.a.a.x;

/* JADX INFO: loaded from: classes.dex */
class d extends a {
    d(p pVar, j.g.a.a.a.c<x> cVar, int i2) {
        super(pVar, cVar, i2);
    }

    @Override // com.twitter.sdk.android.core.identity.a
    public boolean a(Activity activity) {
        activity.startActivityForResult(e(activity), this.a);
        return true;
    }

    Intent e(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) OAuthActivity.class);
        intent.putExtra("auth_config", b());
        return intent;
    }
}
