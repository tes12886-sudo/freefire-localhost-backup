package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.c0;

/* JADX INFO: loaded from: classes.dex */
class i extends t {
    public static final Parcelable.Creator<i> CREATOR = new a();

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i2) {
            return new i[i2];
        }
    }

    i(Parcel parcel) {
        super(parcel);
    }

    i(l lVar) {
        super(lVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.q
    public String j() {
        return "instagram_login";
    }

    @Override // com.facebook.login.q
    public int q(l.d dVar) {
        String strK = l.k();
        Intent intentL = c0.l(h().i(), dVar.a(), dVar.k(), strK, dVar.p(), dVar.m(), dVar.d(), g(dVar.b()), dVar.c(), dVar.i(), dVar.l(), dVar.n(), dVar.w());
        a("e2e", strK);
        return y(intentL, l.p()) ? 1 : 0;
    }

    @Override // com.facebook.login.t
    public com.facebook.e u() {
        return com.facebook.e.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // com.facebook.login.q, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
    }
}
