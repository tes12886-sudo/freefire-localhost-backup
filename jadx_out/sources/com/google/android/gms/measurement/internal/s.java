package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable.Creator<r> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ r createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            if (com.google.android.gms.common.internal.y.b.i(iN) != 2) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                bundleA = com.google.android.gms.common.internal.y.b.a(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new r(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ r[] newArray(int i2) {
        return new r[i2];
    }
}
