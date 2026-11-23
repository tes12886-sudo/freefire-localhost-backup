package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends j.d.a.c.f.f.a implements b1 {
    z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.b1
    public final boolean T(com.google.android.gms.common.j0 j0Var, j.d.a.c.e.a aVar) {
        Parcel parcelM = m();
        j.d.a.c.f.f.c.d(parcelM, j0Var);
        j.d.a.c.f.f.c.e(parcelM, aVar);
        Parcel parcelJ = j(5, parcelM);
        boolean zF = j.d.a.c.f.f.c.f(parcelJ);
        parcelJ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.common.internal.b1
    public final com.google.android.gms.common.h0 U0(com.google.android.gms.common.f0 f0Var) {
        Parcel parcelM = m();
        j.d.a.c.f.f.c.d(parcelM, f0Var);
        Parcel parcelJ = j(6, parcelM);
        com.google.android.gms.common.h0 h0Var = (com.google.android.gms.common.h0) j.d.a.c.f.f.c.a(parcelJ, com.google.android.gms.common.h0.CREATOR);
        parcelJ.recycle();
        return h0Var;
    }

    @Override // com.google.android.gms.common.internal.b1
    public final boolean a() {
        Parcel parcelJ = j(7, m());
        boolean zF = j.d.a.c.f.f.c.f(parcelJ);
        parcelJ.recycle();
        return zF;
    }

    @Override // com.google.android.gms.common.internal.b1
    public final com.google.android.gms.common.h0 s(com.google.android.gms.common.f0 f0Var) {
        Parcel parcelM = m();
        j.d.a.c.f.f.c.d(parcelM, f0Var);
        Parcel parcelJ = j(8, parcelM);
        com.google.android.gms.common.h0 h0Var = (com.google.android.gms.common.h0) j.d.a.c.f.f.c.a(parcelJ, com.google.android.gms.common.h0.CREATOR);
        parcelJ.recycle();
        return h0Var;
    }
}
