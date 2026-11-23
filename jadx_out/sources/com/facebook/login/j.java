package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.c0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class j extends t {
    public static final Parcelable.Creator<j> CREATOR = new a();

    static class a implements Parcelable.Creator<j> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i2) {
            return new j[i2];
        }
    }

    j(Parcel parcel) {
        super(parcel);
    }

    j(l lVar) {
        super(lVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.q
    public String j() {
        return "katana_proxy_auth";
    }

    @Override // com.facebook.login.q
    public boolean p() {
        return true;
    }

    @Override // com.facebook.login.q
    public int q(l.d dVar) {
        boolean z = com.facebook.r.p && com.facebook.internal.g.a() != null && dVar.g().a();
        String strK = l.k();
        List<Intent> listQ = c0.q(h().i(), dVar.a(), dVar.k(), strK, dVar.p(), dVar.m(), dVar.d(), g(dVar.b()), dVar.c(), z, dVar.i(), dVar.l(), dVar.n(), dVar.w(), dVar.j());
        a("e2e", strK);
        if (listQ == null) {
            return 0;
        }
        for (int i2 = 0; i2 < listQ.size(); i2++) {
            if (y(listQ.get(i2), l.p())) {
                return i2 + 1;
            }
        }
        return 0;
    }

    @Override // com.facebook.login.q, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
    }
}
