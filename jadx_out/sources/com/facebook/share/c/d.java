package com.facebook.share.c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class d extends e<d, Object> {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.facebook.share.c.a f755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f756i;

    static class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i2) {
            return new d[i2];
        }
    }

    d(Parcel parcel) {
        super(parcel);
        this.f754g = parcel.readString();
        com.facebook.share.c.a.b bVar = new com.facebook.share.c.a.b();
        bVar.c(parcel);
        this.f755h = bVar.b();
        b.C0103b c0103b = new b.C0103b();
        c0103b.c(parcel);
        this.f756i = c0103b.b();
    }

    public com.facebook.share.c.a h() {
        return this.f755h;
    }

    public String i() {
        return this.f754g;
    }

    public b j() {
        return this.f756i;
    }

    @Override // com.facebook.share.c.e
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f754g);
        parcel.writeParcelable(this.f755h, 0);
        parcel.writeParcelable(this.f756i, 0);
    }
}
