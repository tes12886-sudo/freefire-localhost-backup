package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public final class o1 implements Parcelable.Creator {
    static void a(f fVar, Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.i(parcel, 1, fVar.a);
        com.google.android.gms.common.internal.y.c.i(parcel, 2, fVar.b);
        com.google.android.gms.common.internal.y.c.i(parcel, 3, fVar.c);
        com.google.android.gms.common.internal.y.c.n(parcel, 4, fVar.d, false);
        com.google.android.gms.common.internal.y.c.h(parcel, 5, fVar.e, false);
        com.google.android.gms.common.internal.y.c.p(parcel, 6, fVar.f, i2, false);
        com.google.android.gms.common.internal.y.c.e(parcel, 7, fVar.f1013g, false);
        com.google.android.gms.common.internal.y.c.m(parcel, 8, fVar.f1014h, i2, false);
        com.google.android.gms.common.internal.y.c.p(parcel, 10, fVar.f1015i, i2, false);
        com.google.android.gms.common.internal.y.c.p(parcel, 11, fVar.f1016j, i2, false);
        com.google.android.gms.common.internal.y.c.c(parcel, 12, fVar.f1017k);
        com.google.android.gms.common.internal.y.c.i(parcel, 13, fVar.f1018l);
        com.google.android.gms.common.internal.y.c.c(parcel, 14, fVar.f1019m);
        com.google.android.gms.common.internal.y.c.n(parcel, 15, fVar.f(), false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        Scope[] scopeArr = f.f1012o;
        Bundle bundle = new Bundle();
        com.google.android.gms.common.c[] cVarArr = f.p;
        com.google.android.gms.common.c[] cVarArr2 = cVarArr;
        String strD = null;
        IBinder iBinderO = null;
        Account account = null;
        String strD2 = null;
        int iP = 0;
        int iP2 = 0;
        int iP3 = 0;
        boolean zJ = false;
        int iP4 = 0;
        boolean zJ2 = false;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            switch (com.google.android.gms.common.internal.y.b.i(iN)) {
                case 1:
                    iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
                    break;
                case 2:
                    iP2 = com.google.android.gms.common.internal.y.b.p(parcel, iN);
                    break;
                case 3:
                    iP3 = com.google.android.gms.common.internal.y.b.p(parcel, iN);
                    break;
                case 4:
                    strD = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
                case 5:
                    iBinderO = com.google.android.gms.common.internal.y.b.o(parcel, iN);
                    break;
                case 6:
                    scopeArr = (Scope[]) com.google.android.gms.common.internal.y.b.f(parcel, iN, Scope.CREATOR);
                    break;
                case 7:
                    bundle = com.google.android.gms.common.internal.y.b.a(parcel, iN);
                    break;
                case 8:
                    account = (Account) com.google.android.gms.common.internal.y.b.c(parcel, iN, Account.CREATOR);
                    break;
                case 9:
                default:
                    com.google.android.gms.common.internal.y.b.t(parcel, iN);
                    break;
                case 10:
                    cVarArr = (com.google.android.gms.common.c[]) com.google.android.gms.common.internal.y.b.f(parcel, iN, com.google.android.gms.common.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (com.google.android.gms.common.c[]) com.google.android.gms.common.internal.y.b.f(parcel, iN, com.google.android.gms.common.c.CREATOR);
                    break;
                case 12:
                    zJ = com.google.android.gms.common.internal.y.b.j(parcel, iN);
                    break;
                case 13:
                    iP4 = com.google.android.gms.common.internal.y.b.p(parcel, iN);
                    break;
                case 14:
                    zJ2 = com.google.android.gms.common.internal.y.b.j(parcel, iN);
                    break;
                case 15:
                    strD2 = com.google.android.gms.common.internal.y.b.d(parcel, iN);
                    break;
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new f(iP, iP2, iP3, strD, iBinderO, scopeArr, bundle, account, cVarArr, cVarArr2, zJ, iP4, zJ2, strD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new f[i2];
    }
}
