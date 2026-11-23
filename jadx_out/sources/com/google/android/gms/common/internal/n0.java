package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        String strD = null;
        String strD2 = null;
        long jQ = 0;
        long jQ2 = 0;
        int iP = 0;
        int iP2 = 0;
        int iP3 = 0;
        int iP4 = 0;
        int iP5 = -1;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            switch (com.google.android.gms.common.internal.y.b.i(iN)) {
                case 1:
                    iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
                    break;
                case 2:
                    iP2 = com.google.android.gms.common.internal.y.b.p(parcel, iN);
                    break;
                case 3:
                    iP3 = com.google.android.gms.common.internal.y.b.p(parcel, iN);
                    break;
                case 4:
                    jQ = com.google.android.gms.common.internal.y.b.q(parcel, iN);
                    break;
                case 5:
                    jQ2 = com.google.android.gms.common.internal.y.b.q(parcel, iN);
                    break;
                case 6:
                    strD = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 7:
                    strD2 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 8:
                    iP4 = com.google.android.gms.common.internal.y.b.p(parcel, iN);
                    break;
                case 9:
                    iP5 = com.google.android.gms.common.internal.y.b.p(parcel, iN);
                    break;
                default:
                    com.google.android.gms.common.internal.y.b.t(parcel, iN);
                    break;
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new n(iP, iP2, iP3, jQ, jQ2, strD, strD2, iP4, iP5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new n[i2];
    }
}
