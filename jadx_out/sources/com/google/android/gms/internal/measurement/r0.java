package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends o0 implements t0 {
    r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final Bundle I0(Bundle bundle) {
        Parcel parcelM = m();
        q0.d(parcelM, bundle);
        Parcel parcelJ = j(1, parcelM);
        Bundle bundle2 = (Bundle) q0.c(parcelJ, Bundle.CREATOR);
        parcelJ.recycle();
        return bundle2;
    }
}
