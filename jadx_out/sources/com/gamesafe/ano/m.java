package com.gamesafe.ano;

import android.content.DialogInterface;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
class m implements DialogInterface.OnShowListener {
    final /* synthetic */ k a;

    m(k kVar) {
        this.a = kVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Button button = this.a.a.getButton(-3);
        if (button != null) {
            button.setTextSize(2, 18.0f);
        }
    }
}
