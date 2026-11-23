package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends j.d.a.c.f.b.b implements s {
    public t() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // j.d.a.c.f.b.b
    protected final boolean j(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 101:
                w0((GoogleSignInAccount) j.d.a.c.f.b.c.a(parcel, GoogleSignInAccount.CREATOR), (Status) j.d.a.c.f.b.c.a(parcel, Status.CREATOR));
                throw null;
            case 102:
                F((Status) j.d.a.c.f.b.c.a(parcel, Status.CREATOR));
                break;
            case 103:
                d0((Status) j.d.a.c.f.b.c.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
