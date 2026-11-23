package com.facebook.share.c;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class m extends e<m, Object> {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Uri f772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j f773j;

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i2) {
            return new m[i2];
        }
    }

    public enum b {
        IMAGE,
        VIDEO
    }

    m(Parcel parcel) {
        super(parcel);
        this.f770g = (b) parcel.readSerializable();
        this.f771h = parcel.readString();
        this.f772i = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f773j = (j) parcel.readParcelable(j.class.getClassLoader());
    }

    @Override // com.facebook.share.c.e
    public int describeContents() {
        return 0;
    }

    public String h() {
        return this.f771h;
    }

    public j i() {
        return this.f773j;
    }

    public b j() {
        return this.f770g;
    }

    public Uri k() {
        return this.f772i;
    }

    @Override // com.facebook.share.c.e
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeSerializable(this.f770g);
        parcel.writeString(this.f771h);
        parcel.writeParcelable(this.f772i, i2);
        parcel.writeParcelable(this.f773j, i2);
    }
}
