package com.gamesafe.ano;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
class e implements DialogInterface.OnDismissListener {
    final /* synthetic */ d a;

    e(d dVar) {
        this.a = dVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.a.f808i != null) {
            this.a.f808i.a(0);
        }
    }
}
