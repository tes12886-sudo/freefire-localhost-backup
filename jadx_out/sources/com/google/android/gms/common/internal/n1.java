package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class n1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        s sVar = null;
        int[] iArrB = null;
        int[] iArrB2 = null;
        boolean zJ = false;
        boolean zJ2 = false;
        int iP = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            switch (com.google.android.gms.common.internal.y.b.i(iN)) {
                case 1:
                    sVar = (s) com.google.android.gms.common.internal.y.b.c(parcel, iN, s.CREATOR);
                    break;
                case 2:
                    zJ = com.google.android.gms.common.internal.y.b.j(parcel, iN);
                    break;
                case 3:
                    zJ2 = com.google.android.gms.common.internal.y.b.j(parcel, iN);
                    break;
                case 4:
                    iArrB = com.google.android.gms.common.internal.y.b.b(parcel, iN);
                    break;
                case 5:
                    iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
                    break;
                case 6:
                    iArrB2 = com.google.android.gms.common.internal.y.b.b(parcel, iN);
                    break;
                default:
                    com.google.android.gms.common.internal.y.b.t(parcel, iN);
                    break;
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new e(sVar, zJ, zJ2, iArrB, iP, iArrB2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new e[i2];
    }
}
