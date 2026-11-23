package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int iP = 0;
        int iP2 = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            int i2 = com.google.android.gms.common.internal.y.b.i(iN);
            if (i2 == 1) {
                iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
            } else if (i2 == 2) {
                account = (Account) com.google.android.gms.common.internal.y.b.c(parcel, iN, Account.CREATOR);
            } else if (i2 == 3) {
                iP2 = com.google.android.gms.common.internal.y.b.p(parcel, iN);
            } else if (i2 != 4) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                googleSignInAccount = (GoogleSignInAccount) com.google.android.gms.common.internal.y.b.c(parcel, iN, GoogleSignInAccount.CREATOR);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new s0(iP, account, iP2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new s0[i2];
    }
}
