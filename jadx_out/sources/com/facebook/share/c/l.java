package com.facebook.share.c;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();
    private final String a;
    private final String b;
    private final Uri c;
    private final j d;
    private final j e;

    static class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i2) {
            return new l[i2];
        }
    }

    l(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.d = (j) parcel.readParcelable(j.class.getClassLoader());
        this.e = (j) parcel.readParcelable(j.class.getClassLoader());
    }

    public j a() {
        return this.e;
    }

    public j b() {
        return this.d;
    }

    public Uri c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i2);
        parcel.writeParcelable(this.d, i2);
        parcel.writeParcelable(this.e, i2);
    }
}
