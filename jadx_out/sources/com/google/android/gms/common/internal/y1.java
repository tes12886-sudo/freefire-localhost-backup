package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class y1 extends j.d.a.c.f.f.a implements a2 {
    y1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.a2
    public final int b() {
        Parcel parcelJ = j(2, m());
        int i2 = parcelJ.readInt();
        parcelJ.recycle();
        return i2;
    }

    @Override // com.google.android.gms.common.internal.a2
    public final j.d.a.c.e.a c() {
        Parcel parcelJ = j(1, m());
        j.d.a.c.e.a aVarM = j.d.a.c.e.a.AbstractBinderC0233a.m(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return aVarM;
    }
}
