package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.c0;

/* JADX INFO: loaded from: classes.dex */
class f extends t {
    public static final Parcelable.Creator<f> CREATOR = new a();

    static class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i2) {
            return new f[i2];
        }
    }

    f(Parcel parcel) {
        super(parcel);
    }

    f(l lVar) {
        super(lVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.q
    public String j() {
        return "fb_lite_login";
    }

    @Override // com.facebook.login.q
    public int q(l.d dVar) {
        String strK = l.k();
        Intent intentK = c0.k(h().i(), dVar.a(), dVar.k(), strK, dVar.p(), dVar.m(), dVar.d(), g(dVar.b()), dVar.c(), dVar.i(), dVar.l(), dVar.n(), dVar.w());
        a("e2e", strK);
        return y(intentK, l.p()) ? 1 : 0;
    }

    @Override // com.facebook.login.q, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
    }
}
