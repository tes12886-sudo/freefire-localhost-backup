package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        int iP = 0;
        boolean zJ = false;
        boolean zJ2 = false;
        int iP2 = 0;
        int iP3 = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            int i2 = com.google.android.gms.common.internal.y.b.i(iN);
            if (i2 == 1) {
                iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
            } else if (i2 == 2) {
                zJ = com.google.android.gms.common.internal.y.b.j(parcel, iN);
            } else if (i2 == 3) {
                zJ2 = com.google.android.gms.common.internal.y.b.j(parcel, iN);
            } else if (i2 == 4) {
                iP2 = com.google.android.gms.common.internal.y.b.p(parcel, iN);
            } else if (i2 != 5) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                iP3 = com.google.android.gms.common.internal.y.b.p(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new s(iP, zJ, zJ2, iP2, iP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new s[i2];
    }
}
