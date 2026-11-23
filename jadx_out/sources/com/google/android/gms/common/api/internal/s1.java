package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class s1 extends w2 {
    private TaskCompletionSource f;

    private s1(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.f = new TaskCompletionSource();
        this.a.b("GmsAvailabilityHelper", this);
    }

    public static s1 t(Activity activity) {
        LifecycleFragment lifecycleFragmentC = LifecycleCallback.c(activity);
        s1 s1Var = (s1) lifecycleFragmentC.e("GmsAvailabilityHelper", s1.class);
        if (s1Var == null) {
            return new s1(lifecycleFragmentC);
        }
        if (s1Var.f.a().isComplete()) {
            s1Var.f = new TaskCompletionSource();
        }
        return s1Var;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void g() {
        super.g();
        this.f.d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    @Override // com.google.android.gms.common.api.internal.w2
    protected final void m(ConnectionResult connectionResult, int i2) {
        String strH = connectionResult.h();
        if (strH == null) {
            strH = "Error connecting to Google Play services";
        }
        this.f.b(new com.google.android.gms.common.api.b(new Status(connectionResult, strH, connectionResult.f())));
    }

    @Override // com.google.android.gms.common.api.internal.w2
    protected final void n() {
        Activity activityF = this.a.f();
        if (activityF == null) {
            this.f.d(new com.google.android.gms.common.api.b(new Status(8)));
            return;
        }
        int iIsGooglePlayServicesAvailable = this.e.isGooglePlayServicesAvailable(activityF);
        if (iIsGooglePlayServicesAvailable == 0) {
            this.f.e(null);
        } else {
            if (this.f.a().isComplete()) {
                return;
            }
            s(new ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        }
    }

    public final Task u() {
        return this.f.a();
    }
}
