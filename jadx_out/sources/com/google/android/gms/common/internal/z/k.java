package com.google.android.gms.common.internal.z;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends j.d.a.c.f.d.b implements l {
    public k() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // j.d.a.c.f.d.b
    protected final boolean p1(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        int i4 = parcel.readInt();
        j.d.a.c.f.d.c.b(parcel);
        D0(i4);
        return true;
    }
}
