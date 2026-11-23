package com.facebook.share.c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class k extends e<k, Object> {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l f769i;

    static class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i2) {
            return new k[i2];
        }
    }

    public enum b {
        HORIZONTAL,
        SQUARE
    }

    k(Parcel parcel) {
        super(parcel);
        this.f767g = parcel.readByte() != 0;
        this.f768h = (b) parcel.readSerializable();
        this.f769i = (l) parcel.readParcelable(l.class.getClassLoader());
    }

    @Override // com.facebook.share.c.e
    public int describeContents() {
        return 0;
    }

    public l h() {
        return this.f769i;
    }

    public b i() {
        return this.f768h;
    }

    public boolean j() {
        return this.f767g;
    }

    @Override // com.facebook.share.c.e
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.f767g ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.f768h);
        parcel.writeParcelable(this.f769i, i2);
    }
}
