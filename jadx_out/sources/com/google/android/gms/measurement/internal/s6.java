package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class s6 implements ba {
    final /* synthetic */ d7 a;

    s6(d7 d7Var) {
        this.a = d7Var;
    }

    @Override // com.google.android.gms.measurement.internal.ba
    public final void b(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.a.X("auto", "_err", bundle);
        } else {
            a5.u();
            throw null;
        }
    }
}
