package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends o0 implements l1 {
    j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.l1
    public final void Z(String str, String str2, Bundle bundle, long j2) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        parcelM.writeString(str2);
        q0.d(parcelM, bundle);
        parcelM.writeLong(j2);
        o(1, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.l1
    public final int d() {
        Parcel parcelJ = j(2, m());
        int i2 = parcelJ.readInt();
        parcelJ.recycle();
        return i2;
    }
}
