package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        PendingIntent pendingIntent = null;
        String strD = null;
        int iP = 0;
        int iP2 = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            int i2 = com.google.android.gms.common.internal.y.b.i(iN);
            if (i2 == 1) {
                iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
            } else if (i2 == 2) {
                iP2 = com.google.android.gms.common.internal.y.b.p(parcel, iN);
            } else if (i2 == 3) {
                pendingIntent = (PendingIntent) com.google.android.gms.common.internal.y.b.c(parcel, iN, PendingIntent.CREATOR);
            } else if (i2 != 4) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                strD = com.google.android.gms.common.internal.y.b.d(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new ConnectionResult(iP, iP2, pendingIntent, strD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new ConnectionResult[i2];
    }
}
