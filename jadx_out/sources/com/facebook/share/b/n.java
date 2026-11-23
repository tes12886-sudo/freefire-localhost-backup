package com.facebook.share.b;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class n extends com.facebook.share.c.e<n, Object> {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f747m;

    static class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i2) {
            return new n[i2];
        }
    }

    n(Parcel parcel) {
        super(parcel);
        this.f741g = parcel.readString();
        this.f742h = parcel.readString();
        this.f743i = parcel.readString();
        this.f744j = parcel.readString();
        this.f745k = parcel.readString();
        this.f746l = parcel.readString();
        this.f747m = parcel.readString();
    }

    @Override // com.facebook.share.c.e
    public int describeContents() {
        return 0;
    }

    public String h() {
        return this.f742h;
    }

    public String i() {
        return this.f744j;
    }

    public String j() {
        return this.f745k;
    }

    public String k() {
        return this.f743i;
    }

    public String l() {
        return this.f747m;
    }

    public String m() {
        return this.f746l;
    }

    public String n() {
        return this.f741g;
    }

    @Override // com.facebook.share.c.e
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f741g);
        parcel.writeString(this.f742h);
        parcel.writeString(this.f743i);
        parcel.writeString(this.f744j);
        parcel.writeString(this.f745k);
        parcel.writeString(this.f746l);
        parcel.writeString(this.f747m);
    }
}
