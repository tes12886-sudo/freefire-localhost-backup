package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<f0> CREATOR = new g0();
    private final String a;
    private final boolean b;
    private final boolean c;
    private final Context d;
    private final boolean e;

    f0(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = (Context) j.d.a.c.e.b.o(j.d.a.c.e.a.AbstractBinderC0233a.m(iBinder));
        this.e = z3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.IBinder, j.d.a.c.e.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.n(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.y.c.c(parcel, 2, this.b);
        com.google.android.gms.common.internal.y.c.c(parcel, 3, this.c);
        com.google.android.gms.common.internal.y.c.h(parcel, 4, j.d.a.c.e.b.c1(this.d), false);
        com.google.android.gms.common.internal.y.c.c(parcel, 5, this.e);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
