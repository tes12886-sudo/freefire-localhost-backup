package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class v extends j.d.a.c.f.b.a implements u {
    v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.u
    public final void M0(s sVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelJ = j();
        j.d.a.c.f.b.c.b(parcelJ, sVar);
        j.d.a.c.f.b.c.c(parcelJ, googleSignInOptions);
        m(102, parcelJ);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.u
    public final void g1(s sVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelJ = j();
        j.d.a.c.f.b.c.b(parcelJ, sVar);
        j.d.a.c.f.b.c.c(parcelJ, googleSignInOptions);
        m(103, parcelJ);
    }
}
