package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class z1 extends j.d.a.c.f.f.b implements a2 {
    public z1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static a2 m(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof a2 ? (a2) iInterfaceQueryLocalInterface : new y1(iBinder);
    }

    @Override // j.d.a.c.f.f.b
    protected final boolean j(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            j.d.a.c.e.a aVarC = c();
            parcel2.writeNoException();
            j.d.a.c.f.f.c.e(parcel2, aVarC);
        } else {
            if (i2 != 2) {
                return false;
            }
            int iB = b();
            parcel2.writeNoException();
            parcel2.writeInt(iB);
        }
        return true;
    }
}
