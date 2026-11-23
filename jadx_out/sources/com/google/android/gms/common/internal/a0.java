package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        int iP = 0;
        ArrayList arrayListG = null;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            int i2 = com.google.android.gms.common.internal.y.b.i(iN);
            if (i2 == 1) {
                iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
            } else if (i2 != 2) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                arrayListG = com.google.android.gms.common.internal.y.b.g(parcel, iN, n.CREATOR);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new u(iP, arrayListG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new u[i2];
    }
}
