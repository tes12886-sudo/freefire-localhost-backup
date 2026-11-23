package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        boolean zJ = false;
        String strD = null;
        IBinder iBinderO = null;
        boolean zJ2 = false;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            int i2 = com.google.android.gms.common.internal.y.b.i(iN);
            if (i2 == 1) {
                strD = com.google.android.gms.common.internal.y.b.d(parcel, iN);
            } else if (i2 == 2) {
                iBinderO = com.google.android.gms.common.internal.y.b.o(parcel, iN);
            } else if (i2 == 3) {
                zJ = com.google.android.gms.common.internal.y.b.j(parcel, iN);
            } else if (i2 != 4) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                zJ2 = com.google.android.gms.common.internal.y.b.j(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new j0(strD, iBinderO, zJ, zJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new j0[i2];
    }
}
