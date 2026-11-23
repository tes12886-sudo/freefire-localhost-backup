package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator<SignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        String strD = "";
        GoogleSignInAccount googleSignInAccount = null;
        String strD2 = "";
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            int i2 = com.google.android.gms.common.internal.y.b.i(iN);
            if (i2 == 4) {
                strD = com.google.android.gms.common.internal.y.b.d(parcel, iN);
            } else if (i2 == 7) {
                googleSignInAccount = (GoogleSignInAccount) com.google.android.gms.common.internal.y.b.c(parcel, iN, GoogleSignInAccount.CREATOR);
            } else if (i2 != 8) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                strD2 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new SignInAccount(strD, googleSignInAccount, strD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount[] newArray(int i2) {
        return new SignInAccount[i2];
    }
}
