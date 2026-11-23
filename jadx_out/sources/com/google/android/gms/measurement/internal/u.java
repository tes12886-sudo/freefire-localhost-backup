package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Parcelable.Creator<t> {
    static void a(t tVar, Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.n(parcel, 2, tVar.a, false);
        com.google.android.gms.common.internal.y.c.m(parcel, 3, tVar.b, i2, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 4, tVar.c, false);
        com.google.android.gms.common.internal.y.c.k(parcel, 5, tVar.d);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ t createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        String strD = null;
        r rVar = null;
        String strD2 = null;
        long jQ = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            int i2 = com.google.android.gms.common.internal.y.b.i(iN);
            if (i2 == 2) {
                strD = com.google.android.gms.common.internal.y.b.d(parcel, iN);
            } else if (i2 == 3) {
                rVar = (r) com.google.android.gms.common.internal.y.b.c(parcel, iN, r.CREATOR);
            } else if (i2 == 4) {
                strD2 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
            } else if (i2 != 5) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                jQ = com.google.android.gms.common.internal.y.b.q(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new t(strD, rVar, strD2, jQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ t[] newArray(int i2) {
        return new t[i2];
    }
}
