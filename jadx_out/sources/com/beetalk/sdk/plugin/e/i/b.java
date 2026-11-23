package com.beetalk.sdk.plugin.e.i;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class b extends DialogFragment implements d.f {
    private d a;

    @SuppressLint({"ValidFragment"})
    b(c cVar) {
        String str;
        d dVar = new d(this);
        this.a = dVar;
        dVar.q(cVar.c);
        this.a.u(cVar.e);
        String str2 = cVar.a;
        if (str2 != null && (str = cVar.b) != null) {
            this.a.r(str2, str);
        }
        this.a.v(cVar.d);
        this.a.t(cVar.f);
    }

    @Override // android.app.DialogFragment
    public void dismiss() {
        if (getFragmentManager() != null) {
            super.dismiss();
        }
    }

    @Override // android.app.DialogFragment, com.beetalk.sdk.plugin.e.i.d.f
    public void dismissAllowingStateLoss() {
        if (getFragmentManager() != null) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.a.m(dialogInterface);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return this.a.n(bundle);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.a.m(null);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    @SuppressLint({"NewApi"})
    public void onStart() {
        super.onStart();
        this.a.o();
    }
}
