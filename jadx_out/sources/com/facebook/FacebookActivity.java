package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class FacebookActivity extends androidx.fragment.app.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f557o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Fragment f558n;

    static {
        String name = FacebookActivity.class.getName();
        l.y.c.i.d(name, "FacebookActivity::class.java.name");
        f557o = name;
    }

    private final void D() {
        Intent intent = getIntent();
        l.y.c.i.d(intent, "requestIntent");
        n nVarV = com.facebook.internal.c0.v(com.facebook.internal.c0.A(intent));
        Intent intent2 = getIntent();
        l.y.c.i.d(intent2, "intent");
        setResult(0, com.facebook.internal.c0.p(intent2, null, nVarV));
        finish();
    }

    public final Fragment B() {
        return this.f558n;
    }

    protected Fragment C() {
        androidx.fragment.app.d dVar;
        Intent intent = getIntent();
        androidx.fragment.app.n nVarS = s();
        l.y.c.i.d(nVarS, "supportFragmentManager");
        Fragment fragmentI0 = nVarS.i0("SingleFragment");
        Fragment fragment = fragmentI0;
        if (fragmentI0 == null) {
            l.y.c.i.d(intent, "intent");
            if (l.y.c.i.a("FacebookDialogFragment", intent.getAction())) {
                com.facebook.internal.k kVar = new com.facebook.internal.k();
                kVar.F1(true);
                dVar = kVar;
            } else if (l.y.c.i.a("DeviceShareDialogFragment", intent.getAction())) {
                Log.w(f557o, "Please stop use Device Share Dialog, this feature has been disabled and all related classes in Facebook Android SDK will be removed from v13.0.0 release.");
                com.facebook.share.b.c cVar = new com.facebook.share.b.c();
                cVar.F1(true);
                Parcelable parcelableExtra = intent.getParcelableExtra("content");
                if (parcelableExtra == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.share.model.ShareContent<*, *>");
                }
                cVar.f2((com.facebook.share.c.e) parcelableExtra);
                dVar = cVar;
            } else {
                Fragment bVar = l.y.c.i.a("ReferralFragment", intent.getAction()) ? new com.facebook.m0.b() : new com.facebook.login.n();
                bVar.F1(true);
                androidx.fragment.app.w wVarM = nVarS.m();
                wVarM.b(com.facebook.common.b.c, bVar, "SingleFragment");
                wVarM.f();
                fragment = bVar;
            }
            dVar.V1(nVarS, "SingleFragment");
            fragment = dVar;
        }
        return fragment;
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            l.y.c.i.e(str, "prefix");
            l.y.c.i.e(printWriter, "writer");
            if (com.facebook.internal.n0.a.b.f.n(str, printWriter, strArr)) {
                return;
            }
            super.dump(str, fileDescriptor, printWriter, strArr);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        l.y.c.i.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f558n;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!r.x()) {
            com.facebook.internal.h0.f0(f557o, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            l.y.c.i.d(applicationContext, "applicationContext");
            r.D(applicationContext);
        }
        setContentView(com.facebook.common.c.a);
        l.y.c.i.d(intent, "intent");
        if (l.y.c.i.a("PassThrough", intent.getAction())) {
            D();
        } else {
            this.f558n = C();
        }
    }
}
