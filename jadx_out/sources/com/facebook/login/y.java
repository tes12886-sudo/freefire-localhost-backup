package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.h0;
import com.facebook.internal.j0;

/* JADX INFO: loaded from: classes.dex */
class y extends x {
    public static final Parcelable.Creator<y> CREATOR = new b();
    private j0 e;
    private String f;

    class a implements j0.e {
        final /* synthetic */ l.d a;

        a(l.d dVar) {
            this.a = dVar;
        }

        @Override // com.facebook.internal.j0.e
        public void a(Bundle bundle, com.facebook.n nVar) {
            y.this.z(this.a, bundle, nVar);
        }
    }

    static class b implements Parcelable.Creator<y> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y createFromParcel(Parcel parcel) {
            return new y(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y[] newArray(int i2) {
            return new y[i2];
        }
    }

    static class c extends j0.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f715h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f716i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f717j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private k f718k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private s f719l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f720m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f721n;

        public c(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
            this.f717j = "fbconnect://success";
            this.f718k = k.NATIVE_WITH_FALLBACK;
            this.f719l = s.FACEBOOK;
            this.f720m = false;
            this.f721n = false;
        }

        @Override // com.facebook.internal.j0.a
        public j0 a() {
            Bundle bundleF = f();
            bundleF.putString("redirect_uri", this.f717j);
            bundleF.putString("client_id", c());
            bundleF.putString("e2e", this.f715h);
            bundleF.putString("response_type", this.f719l == s.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
            bundleF.putString("return_scopes", "true");
            bundleF.putString("auth_type", this.f716i);
            bundleF.putString("login_behavior", this.f718k.name());
            if (this.f720m) {
                bundleF.putString("fx_app", this.f719l.toString());
            }
            if (this.f721n) {
                bundleF.putString("skip_dedupe", "true");
            }
            return j0.q(d(), "oauth", bundleF, g(), this.f719l, e());
        }

        public c i(String str) {
            this.f716i = str;
            return this;
        }

        public c j(String str) {
            this.f715h = str;
            return this;
        }

        public c k(boolean z) {
            this.f720m = z;
            return this;
        }

        public c l(boolean z) {
            this.f717j = z ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        public c m(k kVar) {
            this.f718k = kVar;
            return this;
        }

        public c n(s sVar) {
            this.f719l = sVar;
            return this;
        }

        public c o(boolean z) {
            this.f721n = z;
            return this;
        }
    }

    y(Parcel parcel) {
        super(parcel);
        this.f = parcel.readString();
    }

    y(l lVar) {
        super(lVar);
    }

    @Override // com.facebook.login.q
    public void b() {
        j0 j0Var = this.e;
        if (j0Var != null) {
            j0Var.cancel();
            this.e = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.q
    public String j() {
        return "web_view";
    }

    @Override // com.facebook.login.q
    public boolean l() {
        return true;
    }

    @Override // com.facebook.login.q
    public int q(l.d dVar) {
        Bundle bundleS = s(dVar);
        a aVar = new a(dVar);
        String strK = l.k();
        this.f = strK;
        a("e2e", strK);
        androidx.fragment.app.e eVarI = h().i();
        boolean zS = h0.S(eVarI);
        c cVar = new c(eVarI, dVar.a(), bundleS);
        cVar.j(this.f);
        cVar.l(zS);
        cVar.i(dVar.c());
        cVar.m(dVar.g());
        cVar.n(dVar.h());
        cVar.k(dVar.n());
        cVar.o(dVar.w());
        cVar.h(aVar);
        this.e = cVar.a();
        com.facebook.internal.k kVar = new com.facebook.internal.k();
        kVar.F1(true);
        kVar.b2(this.e);
        kVar.V1(eVarI.s(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.x
    com.facebook.e v() {
        return com.facebook.e.WEB_VIEW;
    }

    @Override // com.facebook.login.q, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f);
    }

    void z(l.d dVar, Bundle bundle, com.facebook.n nVar) {
        super.x(dVar, bundle, nVar);
    }
}
