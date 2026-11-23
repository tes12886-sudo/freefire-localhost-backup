package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class d implements com.google.android.gms.common.api.j {
    private Status a;
    private GoogleSignInAccount b;

    public d(GoogleSignInAccount googleSignInAccount, Status status) {
        this.b = googleSignInAccount;
        this.a = status;
    }

    public GoogleSignInAccount a() {
        return this.b;
    }

    @Override // com.google.android.gms.common.api.j
    public Status c() {
        return this.a;
    }
}
