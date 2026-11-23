package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class l0 implements Parcelable.Creator<RemoteMessage> {
    static void c(RemoteMessage remoteMessage, Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.e(parcel, 2, remoteMessage.a, false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            if (com.google.android.gms.common.internal.y.b.i(iN) != 2) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                bundleA = com.google.android.gms.common.internal.y.b.a(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new RemoteMessage(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteMessage[] newArray(int i2) {
        return new RemoteMessage[i2];
    }
}
