package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 extends j.d.a.c.f.f.b implements l {
    public x0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // j.d.a.c.f.f.b
    protected final boolean j(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            int i4 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) j.d.a.c.f.f.c.a(parcel, Bundle.CREATOR);
            j.d.a.c.f.f.c.b(parcel);
            l1(i4, strongBinder, bundle);
        } else if (i2 == 2) {
            int i5 = parcel.readInt();
            Bundle bundle2 = (Bundle) j.d.a.c.f.f.c.a(parcel, Bundle.CREATOR);
            j.d.a.c.f.f.c.b(parcel);
            p0(i5, bundle2);
        } else {
            if (i2 != 3) {
                return false;
            }
            int i6 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            l1 l1Var = (l1) j.d.a.c.f.f.c.a(parcel, l1.CREATOR);
            j.d.a.c.f.f.c.b(parcel);
            v(i6, strongBinder2, l1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
