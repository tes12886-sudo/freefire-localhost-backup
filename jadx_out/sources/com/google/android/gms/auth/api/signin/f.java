package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        String strD4 = null;
        Uri uri = null;
        String strD5 = null;
        String strD6 = null;
        ArrayList arrayListG = null;
        String strD7 = null;
        String strD8 = null;
        long jQ = 0;
        int iP = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            switch (com.google.android.gms.common.internal.y.b.i(iN)) {
                case 1:
                    iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
                    break;
                case 2:
                    strD = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 3:
                    strD2 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 4:
                    strD3 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 5:
                    strD4 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 6:
                    uri = (Uri) com.google.android.gms.common.internal.y.b.c(parcel, iN, Uri.CREATOR);
                    break;
                case 7:
                    strD5 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 8:
                    jQ = com.google.android.gms.common.internal.y.b.q(parcel, iN);
                    break;
                case 9:
                    strD6 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 10:
                    arrayListG = com.google.android.gms.common.internal.y.b.g(parcel, iN, Scope.CREATOR);
                    break;
                case 11:
                    strD7 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 12:
                    strD8 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                default:
                    com.google.android.gms.common.internal.y.b.t(parcel, iN);
                    break;
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new GoogleSignInAccount(iP, strD, strD2, strD3, strD4, uri, strD5, jQ, strD6, arrayListG, strD7, strD8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new GoogleSignInAccount[i2];
    }
}
