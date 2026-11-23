package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g3 extends com.google.android.gms.internal.measurement.o0 implements i3 {
    g3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void A(ja jaVar) {
        Parcel parcelM = m();
        com.google.android.gms.internal.measurement.q0.d(parcelM, jaVar);
        o(20, parcelM);
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void J(ja jaVar) {
        Parcel parcelM = m();
        com.google.android.gms.internal.measurement.q0.d(parcelM, jaVar);
        o(6, parcelM);
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final List<y9> J0(String str, String str2, boolean z, ja jaVar) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        parcelM.writeString(str2);
        com.google.android.gms.internal.measurement.q0.b(parcelM, z);
        com.google.android.gms.internal.measurement.q0.d(parcelM, jaVar);
        Parcel parcelJ = j(14, parcelM);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(y9.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final List<b> L0(String str, String str2, String str3) {
        Parcel parcelM = m();
        parcelM.writeString(null);
        parcelM.writeString(str2);
        parcelM.writeString(str3);
        Parcel parcelJ = j(17, parcelM);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(b.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final String Q(ja jaVar) {
        Parcel parcelM = m();
        com.google.android.gms.internal.measurement.q0.d(parcelM, jaVar);
        Parcel parcelJ = j(11, parcelM);
        String string = parcelJ.readString();
        parcelJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void X0(ja jaVar) {
        Parcel parcelM = m();
        com.google.android.gms.internal.measurement.q0.d(parcelM, jaVar);
        o(18, parcelM);
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void a1(t tVar, ja jaVar) {
        Parcel parcelM = m();
        com.google.android.gms.internal.measurement.q0.d(parcelM, tVar);
        com.google.android.gms.internal.measurement.q0.d(parcelM, jaVar);
        o(1, parcelM);
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final List<y9> e1(String str, String str2, String str3, boolean z) {
        Parcel parcelM = m();
        parcelM.writeString(null);
        parcelM.writeString(str2);
        parcelM.writeString(str3);
        com.google.android.gms.internal.measurement.q0.b(parcelM, z);
        Parcel parcelJ = j(15, parcelM);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(y9.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void f1(Bundle bundle, ja jaVar) {
        Parcel parcelM = m();
        com.google.android.gms.internal.measurement.q0.d(parcelM, bundle);
        com.google.android.gms.internal.measurement.q0.d(parcelM, jaVar);
        o(19, parcelM);
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void l0(y9 y9Var, ja jaVar) {
        Parcel parcelM = m();
        com.google.android.gms.internal.measurement.q0.d(parcelM, y9Var);
        com.google.android.gms.internal.measurement.q0.d(parcelM, jaVar);
        o(2, parcelM);
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final byte[] m1(t tVar, String str) {
        Parcel parcelM = m();
        com.google.android.gms.internal.measurement.q0.d(parcelM, tVar);
        parcelM.writeString(str);
        Parcel parcelJ = j(9, parcelM);
        byte[] bArrCreateByteArray = parcelJ.createByteArray();
        parcelJ.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final List<b> q(String str, String str2, ja jaVar) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        parcelM.writeString(str2);
        com.google.android.gms.internal.measurement.q0.d(parcelM, jaVar);
        Parcel parcelJ = j(16, parcelM);
        ArrayList arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(b.CREATOR);
        parcelJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void t0(ja jaVar) {
        Parcel parcelM = m();
        com.google.android.gms.internal.measurement.q0.d(parcelM, jaVar);
        o(4, parcelM);
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void u0(b bVar, ja jaVar) {
        Parcel parcelM = m();
        com.google.android.gms.internal.measurement.q0.d(parcelM, bVar);
        com.google.android.gms.internal.measurement.q0.d(parcelM, jaVar);
        o(12, parcelM);
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void v0(long j2, String str, String str2, String str3) {
        Parcel parcelM = m();
        parcelM.writeLong(j2);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        parcelM.writeString(str3);
        o(10, parcelM);
    }
}
