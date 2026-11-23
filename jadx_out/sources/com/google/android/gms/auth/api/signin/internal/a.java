package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<a> CREATOR = new d();
    final int a;
    private int b;
    private Bundle c;

    a(int i2, int i3, Bundle bundle) {
        this.a = i2;
        this.b = i3;
        this.c = bundle;
    }

    public int f() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.i(parcel, 1, this.a);
        com.google.android.gms.common.internal.y.c.i(parcel, 2, f());
        com.google.android.gms.common.internal.y.c.e(parcel, 3, this.c, false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
