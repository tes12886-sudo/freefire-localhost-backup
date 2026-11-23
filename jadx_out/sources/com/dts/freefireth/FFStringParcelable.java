package com.dts.freefireth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class FFStringParcelable implements Parcelable {
    public static final Parcelable.Creator<FFStringParcelable> CREATOR = new Parcelable.Creator<FFStringParcelable>() { // from class: com.dts.freefireth.FFStringParcelable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FFStringParcelable createFromParcel(Parcel parcel) {
            return new FFStringParcelable(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FFStringParcelable[] newArray(int i2) {
            return new FFStringParcelable[i2];
        }
    };
    private String _Data;

    private FFStringParcelable(Parcel parcel) {
        this._Data = parcel.readString();
    }

    public FFStringParcelable(String str) {
        this._Data = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this._Data);
    }
}
