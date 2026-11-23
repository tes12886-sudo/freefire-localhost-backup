package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<e> CREATOR = new n1();
    private final s a;
    private final boolean b;
    private final boolean c;
    private final int[] d;
    private final int e;
    private final int[] f;

    public e(s sVar, boolean z, boolean z2, int[] iArr, int i2, int[] iArr2) {
        this.a = sVar;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i2;
        this.f = iArr2;
    }

    public int f() {
        return this.e;
    }

    public int[] h() {
        return this.d;
    }

    public int[] j() {
        return this.f;
    }

    public boolean l() {
        return this.b;
    }

    public boolean n() {
        return this.c;
    }

    public final s q() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.m(parcel, 1, this.a, i2, false);
        com.google.android.gms.common.internal.y.c.c(parcel, 2, l());
        com.google.android.gms.common.internal.y.c.c(parcel, 3, n());
        com.google.android.gms.common.internal.y.c.j(parcel, 4, h(), false);
        com.google.android.gms.common.internal.y.c.i(parcel, 5, f());
        com.google.android.gms.common.internal.y.c.j(parcel, 6, j(), false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
