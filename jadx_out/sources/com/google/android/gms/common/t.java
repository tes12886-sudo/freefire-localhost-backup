package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        String strD = null;
        int iP = 0;
        long jQ = -1;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            int i2 = com.google.android.gms.common.internal.y.b.i(iN);
            if (i2 == 1) {
                strD = com.google.android.gms.common.internal.y.b.d(parcel, iN);
            } else if (i2 == 2) {
                iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
            } else if (i2 != 3) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                jQ = com.google.android.gms.common.internal.y.b.q(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new c(strD, iP, jQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new c[i2];
    }
}
