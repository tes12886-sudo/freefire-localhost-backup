package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class s extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<s> CREATOR = new e1();
    private final int a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final int e;

    public s(int i2, boolean z, boolean z2, int i3, int i4) {
        this.a = i2;
        this.b = z;
        this.c = z2;
        this.d = i3;
        this.e = i4;
    }

    public int f() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public boolean j() {
        return this.b;
    }

    public boolean l() {
        return this.c;
    }

    public int n() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.i(parcel, 1, n());
        com.google.android.gms.common.internal.y.c.c(parcel, 2, j());
        com.google.android.gms.common.internal.y.c.c(parcel, 3, l());
        com.google.android.gms.common.internal.y.c.i(parcel, 4, f());
        com.google.android.gms.common.internal.y.c.i(parcel, 5, h());
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
