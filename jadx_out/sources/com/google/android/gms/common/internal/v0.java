package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        IBinder iBinderO = null;
        ConnectionResult connectionResult = null;
        int iP = 0;
        boolean zJ = false;
        boolean zJ2 = false;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            int i2 = com.google.android.gms.common.internal.y.b.i(iN);
            if (i2 == 1) {
                iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
            } else if (i2 == 2) {
                iBinderO = com.google.android.gms.common.internal.y.b.o(parcel, iN);
            } else if (i2 == 3) {
                connectionResult = (ConnectionResult) com.google.android.gms.common.internal.y.b.c(parcel, iN, ConnectionResult.CREATOR);
            } else if (i2 == 4) {
                zJ = com.google.android.gms.common.internal.y.b.j(parcel, iN);
            } else if (i2 != 5) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                zJ2 = com.google.android.gms.common.internal.y.b.j(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new u0(iP, iBinderO, connectionResult, zJ, zJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new u0[i2];
    }
}
