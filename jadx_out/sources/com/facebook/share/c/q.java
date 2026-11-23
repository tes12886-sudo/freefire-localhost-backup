package com.facebook.share.c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q extends e<q, Object> {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p f776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f777h;

    static class a implements Parcelable.Creator<q> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q[] newArray(int i2) {
            return new q[i2];
        }
    }

    q(Parcel parcel) {
        super(parcel);
        this.f776g = new p.b().e(parcel).d();
        this.f777h = parcel.readString();
    }

    @Override // com.facebook.share.c.e
    public int describeContents() {
        return 0;
    }

    public p h() {
        return this.f776g;
    }

    public String i() {
        return this.f777h;
    }

    @Override // com.facebook.share.c.e
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f776g, 0);
        parcel.writeString(this.f777h);
    }
}
