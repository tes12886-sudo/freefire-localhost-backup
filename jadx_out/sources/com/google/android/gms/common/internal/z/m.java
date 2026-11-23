package com.google.android.gms.common.internal.z;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class m extends j.d.a.c.f.d.a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void c1(l lVar) {
        Parcel parcelJ = j();
        j.d.a.c.f.d.c.e(parcelJ, lVar);
        o(1, parcelJ);
    }
}
