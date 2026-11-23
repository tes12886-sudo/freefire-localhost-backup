package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class l extends j.d.a.c.f.f.a implements IInterface {
    l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int c1(j.d.a.c.e.a aVar, String str, boolean z) {
        Parcel parcelM = m();
        j.d.a.c.f.f.c.e(parcelM, aVar);
        parcelM.writeString(str);
        j.d.a.c.f.f.c.c(parcelM, z);
        Parcel parcelJ = j(5, parcelM);
        int i2 = parcelJ.readInt();
        parcelJ.recycle();
        return i2;
    }

    public final int d() {
        Parcel parcelJ = j(6, m());
        int i2 = parcelJ.readInt();
        parcelJ.recycle();
        return i2;
    }

    public final int o(j.d.a.c.e.a aVar, String str, boolean z) {
        Parcel parcelM = m();
        j.d.a.c.f.f.c.e(parcelM, aVar);
        parcelM.writeString(str);
        j.d.a.c.f.f.c.c(parcelM, z);
        Parcel parcelJ = j(3, parcelM);
        int i2 = parcelJ.readInt();
        parcelJ.recycle();
        return i2;
    }

    public final j.d.a.c.e.a p1(j.d.a.c.e.a aVar, String str, int i2) {
        Parcel parcelM = m();
        j.d.a.c.f.f.c.e(parcelM, aVar);
        parcelM.writeString(str);
        parcelM.writeInt(i2);
        Parcel parcelJ = j(2, parcelM);
        j.d.a.c.e.a aVarM = j.d.a.c.e.a.AbstractBinderC0233a.m(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return aVarM;
    }

    public final j.d.a.c.e.a q1(j.d.a.c.e.a aVar, String str, int i2, j.d.a.c.e.a aVar2) {
        Parcel parcelM = m();
        j.d.a.c.f.f.c.e(parcelM, aVar);
        parcelM.writeString(str);
        parcelM.writeInt(i2);
        j.d.a.c.f.f.c.e(parcelM, aVar2);
        Parcel parcelJ = j(8, parcelM);
        j.d.a.c.e.a aVarM = j.d.a.c.e.a.AbstractBinderC0233a.m(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return aVarM;
    }

    public final j.d.a.c.e.a r1(j.d.a.c.e.a aVar, String str, int i2) {
        Parcel parcelM = m();
        j.d.a.c.f.f.c.e(parcelM, aVar);
        parcelM.writeString(str);
        parcelM.writeInt(i2);
        Parcel parcelJ = j(4, parcelM);
        j.d.a.c.e.a aVarM = j.d.a.c.e.a.AbstractBinderC0233a.m(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return aVarM;
    }

    public final j.d.a.c.e.a s1(j.d.a.c.e.a aVar, String str, boolean z, long j2) {
        Parcel parcelM = m();
        j.d.a.c.f.f.c.e(parcelM, aVar);
        parcelM.writeString(str);
        j.d.a.c.f.f.c.c(parcelM, z);
        parcelM.writeLong(j2);
        Parcel parcelJ = j(7, parcelM);
        j.d.a.c.e.a aVarM = j.d.a.c.e.a.AbstractBinderC0233a.m(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return aVarM;
    }
}
