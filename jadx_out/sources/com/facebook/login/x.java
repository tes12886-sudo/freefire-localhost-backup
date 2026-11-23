package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.internal.h0;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
abstract class x extends q {
    private String d;

    x(Parcel parcel) {
        super(parcel);
    }

    x(l lVar) {
        super(lVar);
    }

    private String w() {
        return h().i().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    private void y(String str) {
        h().i().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    protected Bundle r(Bundle bundle, l.d dVar) {
        String strA;
        String str;
        String strJ;
        bundle.putString("redirect_uri", t());
        if (dVar.o()) {
            strA = dVar.a();
            str = "app_id";
        } else {
            strA = dVar.a();
            str = "client_id";
        }
        bundle.putString(str, strA);
        h();
        bundle.putString("e2e", l.k());
        String str2 = "response_type";
        if (dVar.o()) {
            strJ = "token,signed_request,graph_domain,granted_scopes";
        } else if (dVar.k().contains("openid")) {
            bundle.putString("response_type", "id_token,token,signed_request,graph_domain");
            strJ = dVar.j();
            str2 = "nonce";
        } else {
            strJ = "token,signed_request,graph_domain";
        }
        bundle.putString(str2, strJ);
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", dVar.c());
        bundle.putString("login_behavior", dVar.g().name());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", com.facebook.r.u()));
        if (u() != null) {
            bundle.putString("sso", u());
        }
        bundle.putString("cct_prefetching", com.facebook.r.f736o ? "1" : "0");
        if (dVar.n()) {
            bundle.putString("fx_app", dVar.h().toString());
        }
        if (dVar.w()) {
            bundle.putString("skip_dedupe", "true");
        }
        if (dVar.i() != null) {
            bundle.putString("messenger_page_id", dVar.i());
            bundle.putString("reset_messenger_state", dVar.l() ? "1" : "0");
        }
        return bundle;
    }

    protected Bundle s(l.d dVar) {
        Bundle bundle = new Bundle();
        if (!h0.Z(dVar.k())) {
            String strJoin = TextUtils.join(",", dVar.k());
            bundle.putString("scope", strJoin);
            a("scope", strJoin);
        }
        bundle.putString("default_audience", dVar.d().a());
        bundle.putString("state", g(dVar.b()));
        com.facebook.a aVarD = com.facebook.a.d();
        String strM = aVarD != null ? aVarD.m() : null;
        if (strM == null || !strM.equals(w())) {
            h0.h(h().i());
            a("access_token", "0");
        } else {
            bundle.putString("access_token", strM);
            a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        bundle.putString("ies", com.facebook.r.j() ? "1" : "0");
        return bundle;
    }

    protected String t() {
        return "fb" + com.facebook.r.g() + "://authorize/";
    }

    protected String u() {
        return null;
    }

    abstract com.facebook.e v();

    protected void x(l.d dVar, Bundle bundle, com.facebook.n nVar) {
        String str;
        l.e eVarD;
        l lVarH = h();
        this.d = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.d = bundle.getString("e2e");
            }
            try {
                com.facebook.a aVarD = q.d(dVar.k(), bundle, v(), dVar.a());
                eVarD = l.e.b(lVarH.q(), aVarD, q.f(bundle, dVar.j()));
                CookieSyncManager.createInstance(lVarH.i()).sync();
                if (aVarD != null) {
                    y(aVarD.m());
                }
            } catch (com.facebook.n e) {
                eVarD = l.e.c(lVarH.q(), null, e.getMessage());
            }
        } else if (nVar instanceof com.facebook.p) {
            eVarD = l.e.a(lVarH.q(), "User canceled log in.");
        } else {
            this.d = null;
            String message = nVar.getMessage();
            if (nVar instanceof com.facebook.t) {
                com.facebook.q qVarA = ((com.facebook.t) nVar).a();
                str = String.format(Locale.ROOT, "%d", Integer.valueOf(qVarA.b()));
                message = qVarA.toString();
            } else {
                str = null;
            }
            eVarD = l.e.d(lVarH.q(), null, message, str);
        }
        if (!h0.Y(this.d)) {
            k(this.d);
        }
        lVarH.g(eVarD);
    }
}
