package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<l1> CREATOR = new m1();
    Bundle a;
    com.google.android.gms.common.c[] b;
    int c;
    e d;

    public l1() {
    }

    l1(Bundle bundle, com.google.android.gms.common.c[] cVarArr, int i2, e eVar) {
        this.a = bundle;
        this.b = cVarArr;
        this.c = i2;
        this.d = eVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.e(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.y.c.p(parcel, 2, this.b, i2, false);
        com.google.android.gms.common.internal.y.c.i(parcel, 3, this.c);
        com.google.android.gms.common.internal.y.c.m(parcel, 4, this.d, i2, false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
