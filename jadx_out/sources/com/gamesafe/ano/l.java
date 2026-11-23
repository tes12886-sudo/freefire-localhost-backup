package com.gamesafe.ano;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
class l implements DialogInterface.OnDismissListener {
    final /* synthetic */ k a;

    l(k kVar) {
        this.a = kVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.a.f != null) {
            this.a.f.a(0);
        }
    }
}
