package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        long jQ = 0;
        long jQ2 = 0;
        long jQ3 = 0;
        String strD = null;
        String strD2 = null;
        y9 y9Var = null;
        String strD3 = null;
        t tVar = null;
        t tVar2 = null;
        t tVar3 = null;
        boolean zJ = false;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            switch (com.google.android.gms.common.internal.y.b.i(iN)) {
                case 2:
                    strD = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 3:
                    strD2 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 4:
                    y9Var = (y9) com.google.android.gms.common.internal.y.b.c(parcel, iN, y9.CREATOR);
                    break;
                case 5:
                    jQ = com.google.android.gms.common.internal.y.b.q(parcel, iN);
                    break;
                case 6:
                    zJ = com.google.android.gms.common.internal.y.b.j(parcel, iN);
                    break;
                case 7:
                    strD3 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 8:
                    tVar = (t) com.google.android.gms.common.internal.y.b.c(parcel, iN, t.CREATOR);
                    break;
                case 9:
                    jQ2 = com.google.android.gms.common.internal.y.b.q(parcel, iN);
                    break;
                case 10:
                    tVar2 = (t) com.google.android.gms.common.internal.y.b.c(parcel, iN, t.CREATOR);
                    break;
                case 11:
                    jQ3 = com.google.android.gms.common.internal.y.b.q(parcel, iN);
                    break;
                case 12:
                    tVar3 = (t) com.google.android.gms.common.internal.y.b.c(parcel, iN, t.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.y.b.t(parcel, iN);
                    break;
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new b(strD, strD2, y9Var, jQ, zJ, strD3, tVar, jQ2, tVar2, jQ3, tVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b[] newArray(int i2) {
        return new b[i2];
    }
}
