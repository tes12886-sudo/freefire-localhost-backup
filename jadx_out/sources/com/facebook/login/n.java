package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public class n extends Fragment {
    private String h0;
    private l i0;
    private l.d j0;

    class a implements l.c {
        a() {
        }

        @Override // com.facebook.login.l.c
        public void a(l.e eVar) {
            n.this.O1(eVar);
        }
    }

    class b implements l.b {
        final /* synthetic */ View a;

        b(n nVar, View view) {
            this.a = view;
        }

        @Override // com.facebook.login.l.b
        public void a() {
            this.a.setVisibility(0);
        }

        @Override // com.facebook.login.l.b
        public void b() {
            this.a.setVisibility(8);
        }
    }

    private void N1(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.h0 = callingActivity.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O1(l.e eVar) {
        this.j0 = null;
        int i2 = eVar.a == l.e.b.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", eVar);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (a0()) {
            m().setResult(i2, intent);
            m().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void G0() {
        super.G0();
        View viewFindViewById = V() == null ? null : V().findViewById(com.facebook.common.b.d);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    protected l K1() {
        return new l(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void L0() {
        super.L0();
        if (this.h0 != null) {
            this.i0.A(this.j0);
        } else {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            m().finish();
        }
    }

    protected int L1() {
        return com.facebook.common.c.c;
    }

    @Override // androidx.fragment.app.Fragment
    public void M0(Bundle bundle) {
        super.M0(bundle);
        bundle.putParcelable("loginClient", this.i0);
    }

    l M1() {
        return this.i0;
    }

    @Override // androidx.fragment.app.Fragment
    public void l0(int i2, int i3, Intent intent) {
        super.l0(i2, i3, intent);
        this.i0.w(i2, i3, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void q0(Bundle bundle) {
        Bundle bundleExtra;
        super.q0(bundle);
        if (bundle != null) {
            l lVar = (l) bundle.getParcelable("loginClient");
            this.i0 = lVar;
            lVar.y(this);
        } else {
            this.i0 = K1();
        }
        this.i0.z(new a());
        androidx.fragment.app.e eVarM = m();
        if (eVarM == null) {
            return;
        }
        N1(eVarM);
        Intent intent = eVarM.getIntent();
        if (intent == null || (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) == null) {
            return;
        }
        this.j0 = (l.d) bundleExtra.getParcelable("request");
    }

    @Override // androidx.fragment.app.Fragment
    public View u0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(L1(), viewGroup, false);
        this.i0.x(new b(this, viewInflate.findViewById(com.facebook.common.b.d)));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void v0() {
        this.i0.c();
        super.v0();
    }
}
