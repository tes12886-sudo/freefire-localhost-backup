package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends o0 implements i1 {
    g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final void W(Bundle bundle) {
        Parcel parcelM = m();
        q0.d(parcelM, bundle);
        o(1, parcelM);
    }
}
