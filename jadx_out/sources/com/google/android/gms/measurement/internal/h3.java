package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class h3 extends com.google.android.gms.internal.measurement.p0 implements i3 {
    public h3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.p0
    protected final boolean j(int i2, Parcel parcel, Parcel parcel2, int i3) {
        Collection collectionB0;
        switch (i2) {
            case 1:
                a1((t) com.google.android.gms.internal.measurement.q0.c(parcel, t.CREATOR), (ja) com.google.android.gms.internal.measurement.q0.c(parcel, ja.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                l0((y9) com.google.android.gms.internal.measurement.q0.c(parcel, y9.CREATOR), (ja) com.google.android.gms.internal.measurement.q0.c(parcel, ja.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                t0((ja) com.google.android.gms.internal.measurement.q0.c(parcel, ja.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                j1((t) com.google.android.gms.internal.measurement.q0.c(parcel, t.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                J((ja) com.google.android.gms.internal.measurement.q0.c(parcel, ja.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                collectionB0 = B0((ja) com.google.android.gms.internal.measurement.q0.c(parcel, ja.CREATOR), com.google.android.gms.internal.measurement.q0.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionB0);
                return true;
            case 9:
                byte[] bArrM1 = m1((t) com.google.android.gms.internal.measurement.q0.c(parcel, t.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrM1);
                return true;
            case 10:
                v0(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String strQ = Q((ja) com.google.android.gms.internal.measurement.q0.c(parcel, ja.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case 12:
                u0((b) com.google.android.gms.internal.measurement.q0.c(parcel, b.CREATOR), (ja) com.google.android.gms.internal.measurement.q0.c(parcel, ja.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                h1((b) com.google.android.gms.internal.measurement.q0.c(parcel, b.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                collectionB0 = J0(parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.q0.a(parcel), (ja) com.google.android.gms.internal.measurement.q0.c(parcel, ja.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionB0);
                return true;
            case 15:
                collectionB0 = e1(parcel.readString(), parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.q0.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionB0);
                return true;
            case 16:
                collectionB0 = q(parcel.readString(), parcel.readString(), (ja) com.google.android.gms.internal.measurement.q0.c(parcel, ja.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionB0);
                return true;
            case 17:
                collectionB0 = L0(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionB0);
                return true;
            case 18:
                X0((ja) com.google.android.gms.internal.measurement.q0.c(parcel, ja.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                f1((Bundle) com.google.android.gms.internal.measurement.q0.c(parcel, Bundle.CREATOR), (ja) com.google.android.gms.internal.measurement.q0.c(parcel, ja.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                A((ja) com.google.android.gms.internal.measurement.q0.c(parcel, ja.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
