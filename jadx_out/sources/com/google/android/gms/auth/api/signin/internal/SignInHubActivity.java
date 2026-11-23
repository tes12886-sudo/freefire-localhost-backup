package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class SignInHubActivity extends androidx.fragment.app.e {
    private static boolean s;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f913n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SignInConfiguration f914o;
    private boolean p;
    private int q;
    private Intent r;

    private class a implements h.p.a.a.InterfaceC0206a<Void> {
        private a() {
        }

        @Override // h.p.a.a.InterfaceC0206a
        public final /* synthetic */ void a(h.p.b.b<Void> bVar, Void r3) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.q, SignInHubActivity.this.r);
            SignInHubActivity.this.finish();
        }

        @Override // h.p.a.a.InterfaceC0206a
        public final h.p.b.b<Void> b(int i2, Bundle bundle) {
            return new g(SignInHubActivity.this, com.google.android.gms.common.api.e.j());
        }

        @Override // h.p.a.a.InterfaceC0206a
        public final void c(h.p.b.b<Void> bVar) {
        }
    }

    private final void C(int i2) {
        Status status = new Status(i2);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        s = false;
    }

    private final void E() {
        t().c(0, null, new a());
        s = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        if (this.f913n) {
            return;
        }
        setResult(0);
        if (i2 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.d() != null) {
                GoogleSignInAccount googleSignInAccountD = signInAccount.d();
                p.c(this).b(this.f914o.f(), googleSignInAccountD);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccountD);
                this.p = true;
                this.q = i3;
                this.r = intent;
                E();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                C(intExtra);
                return;
            }
        }
        C(8);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            C(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String strValueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", strValueOf.length() != 0 ? "Unknown action: ".concat(strValueOf) : new String("Unknown action: "));
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
        this.f914o = signInConfiguration;
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        if (!(bundle == null)) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.p = z;
            if (z) {
                this.q = bundle.getInt("signInResultCode");
                this.r = (Intent) bundle.getParcelable("signInResultData");
                E();
                return;
            }
            return;
        }
        if (s) {
            setResult(0);
            C(12502);
            return;
        }
        s = true;
        Intent intent2 = new Intent(action);
        intent2.setPackage(action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
        intent2.putExtra("config", this.f914o);
        try {
            startActivityForResult(intent2, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f913n = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            C(17);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.p);
        if (this.p) {
            bundle.putInt("signInResultCode", this.q);
            bundle.putParcelable("signInResultData", this.r);
        }
    }
}
