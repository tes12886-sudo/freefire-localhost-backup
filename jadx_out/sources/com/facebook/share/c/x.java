package com.facebook.share.c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class x extends e<x, Object> implements Object {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t f786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f787j;

    static class a implements Parcelable.Creator<x> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public x createFromParcel(Parcel parcel) {
            return new x(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x[] newArray(int i2) {
            return new x[i2];
        }
    }

    x(Parcel parcel) {
        super(parcel);
        this.f784g = parcel.readString();
        this.f785h = parcel.readString();
        t.b bVarL = new t.b().l(parcel);
        this.f786i = (bVarL.k() == null && bVarL.j() == null) ? null : bVarL.i();
        this.f787j = new w.b().g(parcel).f();
    }

    @Override // com.facebook.share.c.e
    public int describeContents() {
        return 0;
    }

    public String h() {
        return this.f784g;
    }

    public String i() {
        return this.f785h;
    }

    public t j() {
        return this.f786i;
    }

    public w k() {
        return this.f787j;
    }

    @Override // com.facebook.share.c.e
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f784g);
        parcel.writeString(this.f785h);
        parcel.writeParcelable(this.f786i, 0);
        parcel.writeParcelable(this.f787j, 0);
    }
}
