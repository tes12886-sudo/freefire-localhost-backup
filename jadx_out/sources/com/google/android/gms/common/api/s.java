package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        String strD = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        int iP = 0;
        int iP2 = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            int i2 = com.google.android.gms.common.internal.y.b.i(iN);
            if (i2 == 1) {
                iP2 = com.google.android.gms.common.internal.y.b.p(parcel, iN);
            } else if (i2 == 2) {
                strD = com.google.android.gms.common.internal.y.b.d(parcel, iN);
            } else if (i2 == 3) {
                pendingIntent = (PendingIntent) com.google.android.gms.common.internal.y.b.c(parcel, iN, PendingIntent.CREATOR);
            } else if (i2 == 4) {
                connectionResult = (ConnectionResult) com.google.android.gms.common.internal.y.b.c(parcel, iN, ConnectionResult.CREATOR);
            } else if (i2 != 1000) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new Status(iP, iP2, strD, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new Status[i2];
    }
}
