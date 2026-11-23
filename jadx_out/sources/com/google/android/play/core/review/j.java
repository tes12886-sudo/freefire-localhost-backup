package com.google.android.play.core.review;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.d.a.d.a.b.p;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final j.d.a.d.a.b.f c = new j.d.a.d.a.b.f("ReviewService");
    final p<j.d.a.d.a.b.c> a;
    private final String b;

    public j(Context context) {
        this.b = context.getPackageName();
        this.a = new p<>(context, c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage(GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE), f.a);
    }

    public final j.d.a.d.a.f.e<ReviewInfo> a() {
        c.d("requestInAppReview (%s)", this.b);
        j.d.a.d.a.f.p pVar = new j.d.a.d.a.f.p();
        this.a.a(new g(this, pVar, pVar));
        return pVar.c();
    }
}
