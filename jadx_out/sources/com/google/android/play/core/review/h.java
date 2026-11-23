package com.google.android.play.core.review;

import android.os.Bundle;
import j.d.a.d.a.f.p;

/* JADX INFO: loaded from: classes.dex */
class h<T> extends j.d.a.d.a.b.d {
    final j.d.a.d.a.b.f a;
    final p<T> b;
    final /* synthetic */ j c;

    h(j jVar, j.d.a.d.a.b.f fVar, p<T> pVar) {
        this.c = jVar;
        this.a = fVar;
        this.b = pVar;
    }

    @Override // j.d.a.d.a.b.e
    public void Z0(Bundle bundle) {
        this.c.a.b();
        this.a.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
