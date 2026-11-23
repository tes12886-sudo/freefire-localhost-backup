package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<o1> CREATOR = new p1();
    public final long a;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f1098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1099h;

    public o1(long j2, long j3, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.a = j2;
        this.b = j3;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f1098g = bundle;
        this.f1099h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.k(parcel, 1, this.a);
        com.google.android.gms.common.internal.y.c.k(parcel, 2, this.b);
        com.google.android.gms.common.internal.y.c.c(parcel, 3, this.c);
        com.google.android.gms.common.internal.y.c.n(parcel, 4, this.d, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 5, this.e, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 6, this.f, false);
        com.google.android.gms.common.internal.y.c.e(parcel, 7, this.f1098g, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 8, this.f1099h, false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
