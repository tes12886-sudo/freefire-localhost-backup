package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        ArrayList arrayListG = null;
        Account account = null;
        String strD = null;
        String strD2 = null;
        ArrayList arrayListG2 = null;
        String strD3 = null;
        int iP = 0;
        boolean zJ = false;
        boolean zJ2 = false;
        boolean zJ3 = false;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            switch (com.google.android.gms.common.internal.y.b.i(iN)) {
                case 1:
                    iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
                    break;
                case 2:
                    arrayListG = com.google.android.gms.common.internal.y.b.g(parcel, iN, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) com.google.android.gms.common.internal.y.b.c(parcel, iN, Account.CREATOR);
                    break;
                case 4:
                    zJ = com.google.android.gms.common.internal.y.b.j(parcel, iN);
                    break;
                case 5:
                    zJ2 = com.google.android.gms.common.internal.y.b.j(parcel, iN);
                    break;
                case 6:
                    zJ3 = com.google.android.gms.common.internal.y.b.j(parcel, iN);
                    break;
                case 7:
                    strD = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 8:
                    strD2 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 9:
                    arrayListG2 = com.google.android.gms.common.internal.y.b.g(parcel, iN, com.google.android.gms.auth.api.signin.internal.a.CREATOR);
                    break;
                case 10:
                    strD3 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                default:
                    com.google.android.gms.common.internal.y.b.t(parcel, iN);
                    break;
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new GoogleSignInOptions(iP, arrayListG, account, zJ, zJ2, zJ3, strD, strD2, arrayListG2, strD3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new GoogleSignInOptions[i2];
    }
}
