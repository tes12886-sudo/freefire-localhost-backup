package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class w2 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean b;
    protected final AtomicReference c;
    private final Handler d;
    protected final GoogleApiAvailability e;

    w2(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.c = new AtomicReference(null);
        this.d = new j.d.a.c.f.d.n(Looper.getMainLooper());
        this.e = googleApiAvailability;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(ConnectionResult connectionResult, int i2) {
        this.c.set(null);
        m(connectionResult, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.c.set(null);
        n();
    }

    private static final int p(t2 t2Var) {
        if (t2Var == null) {
            return -1;
        }
        return t2Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i2, int i3, Intent intent) {
        t2 t2Var = (t2) this.c.get();
        if (i2 != 1) {
            if (i2 == 2) {
                int iIsGooglePlayServicesAvailable = this.e.isGooglePlayServicesAvailable(b());
                if (iIsGooglePlayServicesAvailable == 0) {
                    o();
                    return;
                } else {
                    if (t2Var == null) {
                        return;
                    }
                    if (t2Var.b().f() == 18 && iIsGooglePlayServicesAvailable == 18) {
                        return;
                    }
                }
            }
        } else if (i3 == -1) {
            o();
            return;
        } else if (i3 == 0) {
            if (t2Var == null) {
                return;
            }
            l(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, t2Var.b().toString()), p(t2Var));
            return;
        }
        if (t2Var != null) {
            l(t2Var.b(), t2Var.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.c.set(bundle.getBoolean("resolving_error", false) ? new t2(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        t2 t2Var = (t2) this.c.get();
        if (t2Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", t2Var.a());
        bundle.putInt("failed_status", t2Var.b().f());
        bundle.putParcelable("failed_resolution", t2Var.b().j());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.b = false;
    }

    protected abstract void m(ConnectionResult connectionResult, int i2);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new ConnectionResult(13, null), p((t2) this.c.get()));
    }

    public final void s(ConnectionResult connectionResult, int i2) {
        t2 t2Var = new t2(connectionResult, i2);
        AtomicReference atomicReference = this.c;
        while (!atomicReference.compareAndSet(null, t2Var)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.d.post(new v2(this, t2Var));
    }
}
