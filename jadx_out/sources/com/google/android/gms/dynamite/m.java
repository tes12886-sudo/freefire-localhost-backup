package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class m extends j.d.a.c.f.f.a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final j.d.a.c.e.a c1(j.d.a.c.e.a aVar, String str, int i2, j.d.a.c.e.a aVar2) {
        Parcel parcelM = m();
        j.d.a.c.f.f.c.e(parcelM, aVar);
        parcelM.writeString(str);
        parcelM.writeInt(i2);
        j.d.a.c.f.f.c.e(parcelM, aVar2);
        Parcel parcelJ = j(3, parcelM);
        j.d.a.c.e.a aVarM = j.d.a.c.e.a.AbstractBinderC0233a.m(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return aVarM;
    }

    public final j.d.a.c.e.a o(j.d.a.c.e.a aVar, String str, int i2, j.d.a.c.e.a aVar2) {
        Parcel parcelM = m();
        j.d.a.c.f.f.c.e(parcelM, aVar);
        parcelM.writeString(str);
        parcelM.writeInt(i2);
        j.d.a.c.f.f.c.e(parcelM, aVar2);
        Parcel parcelJ = j(2, parcelM);
        j.d.a.c.e.a aVarM = j.d.a.c.e.a.AbstractBinderC0233a.m(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return aVarM;
    }
}
