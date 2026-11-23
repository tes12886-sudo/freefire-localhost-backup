package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<u0> CREATOR = new v0();
    final int a;
    final IBinder b;
    private final ConnectionResult c;
    private final boolean d;
    private final boolean e;

    u0(int i2, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.a = i2;
        this.b = iBinder;
        this.c = connectionResult;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.c.equals(u0Var.c) && o.a(h(), u0Var.h());
    }

    public final ConnectionResult f() {
        return this.c;
    }

    public final j h() {
        IBinder iBinder = this.b;
        if (iBinder == null) {
            return null;
        }
        return j.a.m(iBinder);
    }

    public final boolean j() {
        return this.d;
    }

    public final boolean l() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.i(parcel, 1, this.a);
        com.google.android.gms.common.internal.y.c.h(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.y.c.m(parcel, 3, this.c, i2, false);
        com.google.android.gms.common.internal.y.c.c(parcel, 4, this.d);
        com.google.android.gms.common.internal.y.c.c(parcel, 5, this.e);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
