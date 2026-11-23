package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
class e extends q {
    public static final Parcelable.Creator<e> CREATOR = new a();
    private static ScheduledThreadPoolExecutor d;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i2) {
            return new e[i2];
        }
    }

    protected e(Parcel parcel) {
        super(parcel);
    }

    e(l lVar) {
        super(lVar);
    }

    public static synchronized ScheduledThreadPoolExecutor s() {
        if (d == null) {
            d = new ScheduledThreadPoolExecutor(1);
        }
        return d;
    }

    private void w(l.d dVar) {
        androidx.fragment.app.e eVarI = h().i();
        if (eVarI == null || eVarI.isFinishing()) {
            return;
        }
        d dVarR = r();
        dVarR.V1(eVarI.s(), "login_with_facebook");
        dVarR.v2(dVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.q
    public String j() {
        return "device_auth";
    }

    @Override // com.facebook.login.q
    public int q(l.d dVar) {
        w(dVar);
        return 1;
    }

    protected d r() {
        return new d();
    }

    public void t() {
        h().g(l.e.a(h().q(), "User canceled log in."));
    }

    public void u(Exception exc) {
        h().g(l.e.c(h().q(), null, exc.getMessage()));
    }

    public void v(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, com.facebook.e eVar, Date date, Date date2, Date date3) {
        h().g(l.e.e(h().q(), new com.facebook.a(str, str2, str3, collection, collection2, collection3, eVar, date, date2, date3)));
    }

    @Override // com.facebook.login.q, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
    }
}
