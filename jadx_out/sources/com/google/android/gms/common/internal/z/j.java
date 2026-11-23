package com.google.android.gms.common.internal.z;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.u;

/* JADX INFO: loaded from: classes.dex */
public final class j extends j.d.a.c.f.d.a implements IInterface {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void c1(u uVar) {
        Parcel parcelJ = j();
        j.d.a.c.f.d.c.d(parcelJ, uVar);
        o(1, parcelJ);
    }
}
