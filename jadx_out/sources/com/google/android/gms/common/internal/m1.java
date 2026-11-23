package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        Bundle bundleA = null;
        com.google.android.gms.common.c[] cVarArr = null;
        e eVar = null;
        int iP = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            int i2 = com.google.android.gms.common.internal.y.b.i(iN);
            if (i2 == 1) {
                bundleA = com.google.android.gms.common.internal.y.b.a(parcel, iN);
            } else if (i2 == 2) {
                cVarArr = (com.google.android.gms.common.c[]) com.google.android.gms.common.internal.y.b.f(parcel, iN, com.google.android.gms.common.c.CREATOR);
            } else if (i2 == 3) {
                iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
            } else if (i2 != 4) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                eVar = (e) com.google.android.gms.common.internal.y.b.c(parcel, iN, e.CREATOR);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new l1(bundleA, cVarArr, iP, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new l1[i2];
    }
}
