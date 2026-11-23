package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.n;

/* JADX INFO: loaded from: classes.dex */
public class j extends androidx.fragment.app.d {
    private Dialog x0;
    private DialogInterface.OnCancelListener y0;
    private Dialog z0;

    public static j W1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        j jVar = new j();
        com.google.android.gms.common.internal.q.l(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        jVar.x0 = dialog2;
        if (onCancelListener != null) {
            jVar.y0 = onCancelListener;
        }
        return jVar;
    }

    @Override // androidx.fragment.app.d
    public Dialog P1(Bundle bundle) {
        Dialog dialog = this.x0;
        if (dialog != null) {
            return dialog;
        }
        T1(false);
        if (this.z0 == null) {
            Context contextS = s();
            com.google.android.gms.common.internal.q.k(contextS);
            this.z0 = new AlertDialog.Builder(contextS).create();
        }
        return this.z0;
    }

    @Override // androidx.fragment.app.d
    public void V1(n nVar, String str) {
        super.V1(nVar, str);
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.y0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
