package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ka implements Parcelable.Creator<ja> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ja createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        long jQ = 0;
        long jQ2 = 0;
        long jQ3 = 0;
        long jQ4 = 0;
        long jQ5 = 0;
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        String strD4 = null;
        String strD5 = null;
        String strD6 = null;
        String strD7 = null;
        Boolean boolK = null;
        ArrayList<String> arrayListE = null;
        String strD8 = null;
        String strD9 = "";
        long jQ6 = -2147483648L;
        boolean zJ = true;
        boolean zJ2 = false;
        int iP = 0;
        boolean zJ3 = true;
        boolean zJ4 = false;
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
                    strD3 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 5:
                    strD4 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 6:
                    jQ = com.google.android.gms.common.internal.y.b.q(parcel, iN);
                    break;
                case 7:
                    jQ2 = com.google.android.gms.common.internal.y.b.q(parcel, iN);
                    break;
                case 8:
                    strD5 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 9:
                    zJ = com.google.android.gms.common.internal.y.b.j(parcel, iN);
                    break;
                case 10:
                    zJ2 = com.google.android.gms.common.internal.y.b.j(parcel, iN);
                    break;
                case 11:
                    jQ6 = com.google.android.gms.common.internal.y.b.q(parcel, iN);
                    break;
                case 12:
                    strD6 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 13:
                    jQ3 = com.google.android.gms.common.internal.y.b.q(parcel, iN);
                    break;
                case 14:
                    jQ4 = com.google.android.gms.common.internal.y.b.q(parcel, iN);
                    break;
                case 15:
                    iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
                    break;
                case 16:
                    zJ3 = com.google.android.gms.common.internal.y.b.j(parcel, iN);
                    break;
                case 17:
                case 20:
                default:
                    com.google.android.gms.common.internal.y.b.t(parcel, iN);
                    break;
                case 18:
                    zJ4 = com.google.android.gms.common.internal.y.b.j(parcel, iN);
                    break;
                case 19:
                    strD7 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 21:
                    boolK = com.google.android.gms.common.internal.y.b.k(parcel, iN);
                    break;
                case 22:
                    jQ5 = com.google.android.gms.common.internal.y.b.q(parcel, iN);
                    break;
                case 23:
                    arrayListE = com.google.android.gms.common.internal.y.b.e(parcel, iN);
                    break;
                case 24:
                    strD8 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 25:
                    strD9 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new ja(strD, strD2, strD3, strD4, jQ, jQ2, strD5, zJ, zJ2, jQ6, strD6, jQ3, jQ4, iP, zJ3, zJ4, strD7, boolK, jQ5, arrayListE, strD8, strD9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ja[] newArray(int i2) {
        return new ja[i2];
    }
}
