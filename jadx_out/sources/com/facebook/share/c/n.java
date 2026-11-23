package com.facebook.share.c;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class n extends e<n, Object> {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Uri f774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f775h;

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
        this.f774g = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f775h = (j) parcel.readParcelable(j.class.getClassLoader());
    }

    @Override // com.facebook.share.c.e
    public int describeContents() {
        return 0;
    }

    public j h() {
        return this.f775h;
    }

    public Uri i() {
        return this.f774g;
    }

    @Override // com.facebook.share.c.e
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f774g, i2);
        parcel.writeParcelable(this.f775h, i2);
    }
}
