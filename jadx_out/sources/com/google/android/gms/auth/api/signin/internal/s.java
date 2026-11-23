package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public interface s extends IInterface {
    void F(Status status);

    void d0(Status status);

    void w0(GoogleSignInAccount googleSignInAccount, Status status);
}
