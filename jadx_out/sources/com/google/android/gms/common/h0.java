package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();
    private final boolean a;

    @Nullable
    private final String b;
    private final int c;
    private final int d;

    h0(boolean z, String str, int i2, int i3) {
        this.a = z;
        this.b = str;
        this.c = p0.a(i2) - 1;
        this.d = u.a(i3) - 1;
    }

    @Nullable
    public final String f() {
        return this.b;
    }

    public final boolean h() {
        return this.a;
    }

    public final int j() {
        return u.a(this.d);
    }

    public final int l() {
        return p0.a(this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.c(parcel, 1, this.a);
        com.google.android.gms.common.internal.y.c.n(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.y.c.i(parcel, 3, this.c);
        com.google.android.gms.common.internal.y.c.i(parcel, 4, this.d);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
