package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.d0;
import com.facebook.internal.h0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class h extends q {
    public static final Parcelable.Creator<h> CREATOR = new c();
    private g d;

    class a implements d0.b {
        final /* synthetic */ l.d a;

        a(l.d dVar) {
            this.a = dVar;
        }

        @Override // com.facebook.internal.d0.b
        public void a(Bundle bundle) {
            h.this.s(this.a, bundle);
        }
    }

    class b implements h0.a {
        final /* synthetic */ Bundle a;
        final /* synthetic */ l.d b;
        final /* synthetic */ l c;

        b(Bundle bundle, l.d dVar, l lVar) {
            this.a = bundle;
            this.b = dVar;
            this.c = lVar;
        }

        @Override // com.facebook.internal.h0.a
        public void a(com.facebook.n nVar) {
            l lVar = this.c;
            lVar.f(l.e.c(lVar.q(), "Caught exception", nVar.getMessage()));
        }

        @Override // com.facebook.internal.h0.a
        public void b(JSONObject jSONObject) {
            try {
                this.a.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                h.this.t(this.b, this.a);
            } catch (JSONException e) {
                l lVar = this.c;
                lVar.f(l.e.c(lVar.q(), "Caught exception", e.getMessage()));
            }
        }
    }

    static class c implements Parcelable.Creator {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i2) {
            return new h[i2];
        }
    }

    h(Parcel parcel) {
        super(parcel);
    }

    h(l lVar) {
        super(lVar);
    }

    @Override // com.facebook.login.q
    public void b() {
        g gVar = this.d;
        if (gVar != null) {
            gVar.b();
            this.d.f(null);
            this.d = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.q
    public String j() {
        return "get_token";
    }

    @Override // com.facebook.login.q
    public int q(l.d dVar) {
        g gVar = new g(h().i(), dVar);
        this.d = gVar;
        if (!gVar.g()) {
            return 0;
        }
        h().t();
        this.d.f(new a(dVar));
        return 1;
    }

    void r(l.d dVar, Bundle bundle) {
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        l lVarH = h();
        if (string != null && !string.isEmpty()) {
            t(dVar, bundle);
        } else {
            lVarH.t();
            h0.D(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new b(bundle, dVar, lVarH));
        }
    }

    void s(l.d dVar, Bundle bundle) {
        g gVar = this.d;
        if (gVar != null) {
            gVar.f(null);
        }
        this.d = null;
        l lVarH = h();
        lVarH.u();
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> setK = dVar.k();
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (setK.contains("openid") && (string == null || string.isEmpty())) {
                lVarH.C();
                return;
            }
            if (stringArrayList != null && (setK == null || stringArrayList.containsAll(setK))) {
                r(dVar, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : setK) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                a("new_permissions", TextUtils.join(",", hashSet));
            }
            dVar.s(hashSet);
        }
        lVarH.C();
    }

    void t(l.d dVar, Bundle bundle) {
        l.e eVarC;
        l lVarH = h();
        try {
            eVarC = l.e.b(dVar, q.c(bundle, com.facebook.e.FACEBOOK_APPLICATION_SERVICE, dVar.a()), q.e(bundle, dVar.j()));
        } catch (com.facebook.n e) {
            eVarC = l.e.c(lVarH.q(), null, e.getMessage());
        }
        lVarH.g(eVarC);
    }

    @Override // com.facebook.login.q, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
    }
}
