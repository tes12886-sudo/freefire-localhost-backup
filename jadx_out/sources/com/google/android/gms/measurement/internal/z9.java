package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class z9 implements Parcelable.Creator<y9> {
    static void a(y9 y9Var, Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.i(parcel, 1, y9Var.a);
        com.google.android.gms.common.internal.y.c.n(parcel, 2, y9Var.b, false);
        com.google.android.gms.common.internal.y.c.k(parcel, 3, y9Var.c);
        com.google.android.gms.common.internal.y.c.l(parcel, 4, y9Var.d, false);
        com.google.android.gms.common.internal.y.c.g(parcel, 5, null, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 6, y9Var.e, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 7, y9Var.f, false);
        com.google.android.gms.common.internal.y.c.f(parcel, 8, y9Var.f1303g, false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ y9 createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        String strD = null;
        Long lR = null;
        Float fM = null;
        String strD2 = null;
        String strD3 = null;
        Double dL = null;
        long jQ = 0;
        int iP = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            switch (com.google.android.gms.common.internal.y.b.i(iN)) {
                case 1:
                    iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
                    break;
                case 2:
                    strD = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 3:
                    jQ = com.google.android.gms.common.internal.y.b.q(parcel, iN);
                    break;
                case 4:
                    lR = com.google.android.gms.common.internal.y.b.r(parcel, iN);
                    break;
                case 5:
                    fM = com.google.android.gms.common.internal.y.b.m(parcel, iN);
                    break;
                case 6:
                    strD2 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 7:
                    strD3 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 8:
                    dL = com.google.android.gms.common.internal.y.b.l(parcel, iN);
                    break;
                default:
                    com.google.android.gms.common.internal.y.b.t(parcel, iN);
                    break;
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new y9(iP, strD, jQ, lR, fM, strD2, strD3, dL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ y9[] newArray(int i2) {
        return new y9[i2];
    }
}
