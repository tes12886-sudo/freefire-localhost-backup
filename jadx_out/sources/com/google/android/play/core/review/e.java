package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import j.d.a.d.a.f.p;

/* JADX INFO: loaded from: classes.dex */
public final class e implements a {
    private final j a;
    private final Handler b = new Handler(Looper.getMainLooper());

    e(j jVar) {
        this.a = jVar;
    }

    @Override // com.google.android.play.core.review.a
    public final j.d.a.d.a.f.e<Void> a(Activity activity, ReviewInfo reviewInfo) {
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        p pVar = new p();
        intent.putExtra("result_receiver", new d(this.b, pVar));
        activity.startActivity(intent);
        return pVar.c();
    }

    @Override // com.google.android.play.core.review.a
    public final j.d.a.d.a.f.e<ReviewInfo> b() {
        return this.a.a();
    }
}
