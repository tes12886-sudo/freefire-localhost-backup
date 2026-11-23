package com.beetalk.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l extends e {
    private static String c;
    private com.google.android.gms.auth.api.signin.c b;

    private class b extends AsyncTask<String, Void, com.beetalk.sdk.b.e> {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.beetalk.sdk.b.e doInBackground(String... strArr) {
            String str = strArr[0];
            l lVar = l.this;
            return lVar.h(str, lVar.a.i());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(com.beetalk.sdk.b.e eVar) {
            l.this.l(eVar);
        }
    }

    l(com.beetalk.sdk.b bVar) {
        super(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public com.beetalk.sdk.b.e h(String str, com.beetalk.sdk.b.c cVar) {
        com.garena.pay.android.b bVar;
        JSONObject jSONObjectF = cVar.e() == p.f509i.intValue() ? com.beetalk.sdk.z.i.b.f(str, cVar.a(), cVar.b()) : com.beetalk.sdk.z.i.b.e(str, cVar.a(), cVar.b());
        com.beetalk.sdk.x.a.a("Google login exchange token, result: ", jSONObjectF);
        com.beetalk.sdk.b.e eVarC = null;
        int iIntValue = com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue();
        if (jSONObjectF != null) {
            if (jSONObjectF.has("open_id")) {
                try {
                    String string = jSONObjectF.getString("open_id");
                    String string2 = jSONObjectF.getString("access_token");
                    int i2 = jSONObjectF.getInt("expiry_time");
                    int iOptInt = jSONObjectF.optInt("platform");
                    com.beetalk.sdk.u.a aVar = new com.beetalk.sdk.u.a(string2, com.beetalk.sdk.u.l.GOOGLE, iOptInt);
                    if (iOptInt == 1) {
                        aVar.o(com.beetalk.sdk.u.l.GARENA_NATIVE_ANDROID);
                    }
                    aVar.k(i2);
                    eVarC = com.beetalk.sdk.b.e.c(cVar, aVar, string, iOptInt);
                } catch (JSONException e) {
                    com.beetalk.sdk.x.a.b(e);
                }
            } else {
                String strOptString = jSONObjectF.optString("error");
                if ("error_user_ban".equals(strOptString)) {
                    bVar = com.garena.pay.android.b.ERROR_USER_BANNED;
                } else if ("invalid_grant".equals(strOptString)) {
                    this.b.q();
                    bVar = com.garena.pay.android.b.ACCESS_TOKEN_INVALID_GRANT;
                } else {
                    bVar = com.garena.pay.android.b.ACCESS_TOKEN_EXCHANGE_FAILED;
                }
            }
            if (eVarC == null) {
                return com.beetalk.sdk.b.e.a(cVar, iIntValue);
            }
            return eVarC;
        }
        bVar = com.garena.pay.android.b.NETWORK_EXCEPTION;
        iIntValue = bVar.c().intValue();
        if (eVarC == null) {
            return com.beetalk.sdk.b.e.a(cVar, iIntValue);
        }
        return eVarC;
    }

    private static String i(Context context) {
        String str = c;
        if (str != null && str.length() > 0) {
            return c;
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.getString("com.garena.sdk.google_client_id", "");
            }
        } catch (Exception e) {
            com.beetalk.sdk.x.a.b(e);
        }
        return "";
    }

    public static com.google.android.gms.auth.api.signin.c j(Context context) {
        String strI = i(context);
        if (TextUtils.isEmpty(strI)) {
            com.beetalk.sdk.x.a.c("Google client ID is not configured.", new Object[0]);
            return null;
        }
        GoogleSignInOptions.a aVar = new GoogleSignInOptions.a(GoogleSignInOptions.f900k);
        aVar.d(strI);
        aVar.b();
        return com.google.android.gms.auth.api.signin.a.a(context, aVar.a());
    }

    private void k(com.garena.pay.android.b bVar) {
        this.a.k(com.beetalk.sdk.b.e.a(this.a.i(), bVar.c().intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(com.beetalk.sdk.b.e eVar) {
        if (eVar != null && eVar.b != null) {
            g gVarY = g.y();
            if (this.a.i().e() == p.f509i.intValue()) {
                gVarY = g.w();
            } else if (this.a.i().e() == p.f508h.intValue()) {
                gVarY = g.x();
            }
            if (gVarY != null) {
                gVarY.v().l(eVar.b);
            }
        }
        this.a.k(eVar);
    }

    private void m(String str) {
        com.beetalk.sdk.x.a.i("Starting Token Exchange for Google", new Object[0]);
        if (TextUtils.isEmpty(str)) {
            this.a.k(com.beetalk.sdk.b.e.a(this.a.i(), com.garena.pay.android.b.SESSION_NOT_INITIALIZED.c().intValue()));
        } else {
            new b().execute(str);
        }
    }

    public static void n(String str) {
        c = str;
    }

    @Override // com.beetalk.sdk.e
    boolean d(int i2, int i3, Intent intent, com.beetalk.sdk.b.c cVar) {
        com.garena.pay.android.b bVar;
        if (i2 != 29554) {
            return false;
        }
        if (i3 == -1) {
            try {
                GoogleSignInAccount result = com.google.android.gms.auth.api.signin.a.c(intent).getResult(com.google.android.gms.common.api.b.class);
                if (result == null || result.u()) {
                    com.beetalk.sdk.x.a.c("Google login failed", new Object[0]);
                    k(com.garena.pay.android.b.LOGIN_FAILED);
                } else {
                    com.beetalk.sdk.x.a.a("Google login success", new Object[0]);
                    m(result.q());
                }
                return true;
            } catch (com.google.android.gms.common.api.b e) {
                com.beetalk.sdk.x.a.m("signInResult:failed code=" + e.b(), new Object[0]);
                if (e.b() != 12501) {
                    bVar = com.garena.pay.android.b.ERROR;
                }
            }
        } else {
            bVar = com.garena.pay.android.b.USER_CANCELLED;
        }
        k(bVar);
        return true;
    }

    @Override // com.beetalk.sdk.e
    boolean e(com.beetalk.sdk.b.c cVar) {
        com.beetalk.sdk.x.a.a("start Google Auth", new Object[0]);
        if (cVar == null) {
            return false;
        }
        com.google.android.gms.auth.api.signin.c cVarJ = j(this.a.f());
        this.b = cVarJ;
        if (cVarJ == null) {
            return false;
        }
        GoogleSignInAccount googleSignInAccountB = com.google.android.gms.auth.api.signin.a.b(this.a.f());
        String strQ = null;
        if (googleSignInAccountB != null && !googleSignInAccountB.u()) {
            strQ = googleSignInAccountB.q();
            Object[] objArr = new Object[0];
            if (strQ != null) {
                com.beetalk.sdk.x.a.a("already login", objArr);
                m(strQ);
            } else {
                com.beetalk.sdk.x.a.a("got token failed", objArr);
            }
        }
        if (strQ != null) {
            return true;
        }
        com.beetalk.sdk.x.a.a("starting google sign in page", new Object[0]);
        this.a.e().startActivityForResult(this.b.p(), 29554);
        return true;
    }
}
