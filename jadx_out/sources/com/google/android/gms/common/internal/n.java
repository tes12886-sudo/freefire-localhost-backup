package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class n extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<n> CREATOR = new n0();
    private final int a;
    private final int b;
    private final int c;
    private final long d;
    private final long e;
    private final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f1027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f1029i;

    public n(int i2, int i3, int i4, long j2, long j3, String str, String str2, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = j2;
        this.e = j3;
        this.f = str;
        this.f1027g = str2;
        this.f1028h = i5;
        this.f1029i = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.i(parcel, 1, this.a);
        com.google.android.gms.common.internal.y.c.i(parcel, 2, this.b);
        com.google.android.gms.common.internal.y.c.i(parcel, 3, this.c);
        com.google.android.gms.common.internal.y.c.k(parcel, 4, this.d);
        com.google.android.gms.common.internal.y.c.k(parcel, 5, this.e);
        com.google.android.gms.common.internal.y.c.n(parcel, 6, this.f, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 7, this.f1027g, false);
        com.google.android.gms.common.internal.y.c.i(parcel, 8, this.f1028h);
        com.google.android.gms.common.internal.y.c.i(parcel, 9, this.f1029i);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
