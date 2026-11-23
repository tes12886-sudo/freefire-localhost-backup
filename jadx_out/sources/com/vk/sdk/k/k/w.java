package com.vk.sdk.k.k;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class w extends g {
    public int a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
    }
}
