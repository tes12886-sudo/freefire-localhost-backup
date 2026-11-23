package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class p1 implements Parcelable.Creator<o1> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ o1 createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        long jQ = 0;
        long jQ2 = 0;
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        Bundle bundleA = null;
        String strD4 = null;
        boolean zJ = false;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            switch (com.google.android.gms.common.internal.y.b.i(iN)) {
                case 1:
                    jQ = com.google.android.gms.common.internal.y.b.q(parcel, iN);
                    break;
                case 2:
                    jQ2 = com.google.android.gms.common.internal.y.b.q(parcel, iN);
                    break;
                case 3:
                    zJ = com.google.android.gms.common.internal.y.b.j(parcel, iN);
                    break;
                case 4:
                    strD = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 5:
                    strD2 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 6:
                    strD3 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 7:
                    bundleA = com.google.android.gms.common.internal.y.b.a(parcel, iN);
                    break;
                case 8:
                    strD4 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                default:
                    com.google.android.gms.common.internal.y.b.t(parcel, iN);
                    break;
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new o1(jQ, jQ2, zJ, strD, strD2, strD3, bundleA, strD4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ o1[] newArray(int i2) {
        return new o1[i2];
    }
}
