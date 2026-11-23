package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Parcelable.Creator<SignInConfiguration> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInConfiguration createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        String strD = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            int i2 = com.google.android.gms.common.internal.y.b.i(iN);
            if (i2 == 2) {
                strD = com.google.android.gms.common.internal.y.b.d(parcel, iN);
            } else if (i2 != 5) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                googleSignInOptions = (GoogleSignInOptions) com.google.android.gms.common.internal.y.b.c(parcel, iN, GoogleSignInOptions.CREATOR);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new SignInConfiguration(strD, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInConfiguration[] newArray(int i2) {
        return new SignInConfiguration[i2];
    }
}
