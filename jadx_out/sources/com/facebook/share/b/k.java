package com.facebook.share.b;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    private com.facebook.l a;

    public k(com.facebook.l lVar) {
        this.a = lVar;
    }

    public void a(com.facebook.internal.a aVar) {
        com.facebook.l lVar = this.a;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void b(com.facebook.internal.a aVar, com.facebook.n nVar) {
        com.facebook.l lVar = this.a;
        if (lVar != null) {
            lVar.b(nVar);
        }
    }

    public abstract void c(com.facebook.internal.a aVar, Bundle bundle);
}
