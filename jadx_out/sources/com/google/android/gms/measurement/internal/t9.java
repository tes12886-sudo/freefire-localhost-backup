package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class t9 implements ba {
    final /* synthetic */ v9 a;

    t9(v9 v9Var) {
        this.a = v9Var;
    }

    @Override // com.google.android.gms.measurement.internal.ba
    public final void b(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.a.f().r(new s9(this, str, "_err", bundle));
        } else if (this.a.f1292k != null) {
            this.a.f1292k.d().o().b("AppId not known when logging event", "_err");
        }
    }
}
