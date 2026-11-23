package com.beetalk.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f extends e {
    private final com.facebook.j b;

    class a implements com.facebook.l<com.facebook.login.r> {
        final /* synthetic */ Activity a;

        a(Activity activity) {
            this.a = activity;
        }

        @Override // com.facebook.l
        public void a() {
            f.this.k(new com.beetalk.sdk.v.a("user_cancelled"), this.a);
        }

        @Override // com.facebook.l
        public void b(com.facebook.n nVar) {
            if (nVar == null) {
                f.this.k(new com.beetalk.sdk.v.a("Login Failed for some reason"), this.a);
            } else {
                f.this.k(nVar, this.a);
            }
            Object[] objArr = new Object[1];
            objArr[0] = nVar != null ? nVar.getLocalizedMessage() : "exception is null";
            com.beetalk.sdk.x.a.c("FB login fail CLOSED_LOGIN_FAILED, exception: ", objArr);
        }

        @Override // com.facebook.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(com.facebook.login.r rVar) {
            if (rVar.a() != null) {
                f.this.m();
            }
        }
    }

    private class b extends AsyncTask<String, Void, com.beetalk.sdk.b.e> {
        private b() {
        }

        /* synthetic */ b(f fVar, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.beetalk.sdk.b.e doInBackground(String... strArr) {
            String str = strArr[0];
            f fVar = f.this;
            return fVar.j(str, fVar.a.i());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(com.beetalk.sdk.b.e eVar) {
            f.this.l(eVar);
        }
    }

    public f(com.beetalk.sdk.b bVar) {
        super(bVar);
        com.facebook.j jVarA = com.facebook.j.a.a();
        this.b = jVarA;
        com.facebook.login.p.e().o(jVarA, new a(bVar.e().a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public com.beetalk.sdk.b.e j(String str, com.beetalk.sdk.b.c cVar) {
        JSONObject jSONObjectB;
        com.garena.pay.android.b bVar;
        if (cVar.e() == p.f509i.intValue()) {
            jSONObjectB = com.beetalk.sdk.z.i.b.c(str, p.f511k + cVar.a() + "://auth/", cVar.a(), cVar.b());
        } else {
            jSONObjectB = com.beetalk.sdk.z.i.b.b(str, p.f511k + cVar.a() + "://auth/", cVar.a(), cVar.b());
        }
        com.beetalk.sdk.x.a.a("FB login exchange token, result: ", jSONObjectB);
        int iIntValue = com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue();
        com.beetalk.sdk.b.e eVarC = null;
        if (jSONObjectB != null) {
            if (jSONObjectB.has("open_id")) {
                try {
                    String string = jSONObjectB.getString("open_id");
                    String string2 = jSONObjectB.getString("access_token");
                    int i2 = jSONObjectB.getInt("expiry_time");
                    int iOptInt = jSONObjectB.optInt("platform");
                    com.beetalk.sdk.u.a aVar = new com.beetalk.sdk.u.a(string2, com.beetalk.sdk.u.l.FACEBOOK, iOptInt);
                    if (iOptInt == 1) {
                        aVar.o(com.beetalk.sdk.u.l.GARENA_NATIVE_ANDROID);
                    }
                    aVar.k(i2);
                    eVarC = com.beetalk.sdk.b.e.c(cVar, aVar, string, iOptInt);
                } catch (JSONException e) {
                    com.beetalk.sdk.x.a.b(e);
                }
            } else {
                String strOptString = jSONObjectB.optString("error");
                if ("error_user_ban".equals(strOptString)) {
                    bVar = com.garena.pay.android.b.ERROR_USER_BANNED;
                } else if ("invalid_grant".equals(strOptString)) {
                    com.facebook.a.r(null);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void k(Exception exc, Activity activity) {
        com.garena.pay.android.b bVar;
        com.beetalk.sdk.x.a.c("FB login failed, exception: ", exc.getLocalizedMessage());
        com.beetalk.sdk.b.c cVarI = this.a.i();
        if (exc instanceof com.beetalk.sdk.v.a) {
            bVar = "user_cancelled".equalsIgnoreCase(exc.getMessage()) ? com.garena.pay.android.b.USER_CANCELLED : com.garena.pay.android.b.LOGIN_FAILED;
        } else {
            bVar = com.garena.pay.android.b.UNKNOWN_ERROR;
        }
        this.a.k(com.beetalk.sdk.b.e.a(cVarI, bVar.c().intValue()));
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

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        com.beetalk.sdk.x.a.i("Starting Token Exchange for Facebook", new Object[0]);
        com.facebook.a aVarD = com.facebook.a.d();
        if (aVarD != null) {
            new b(this, null).execute(aVarD.m());
        } else {
            this.a.k(com.beetalk.sdk.b.e.a(this.a.i(), com.garena.pay.android.b.SESSION_NOT_INITIALIZED.c().intValue()));
        }
    }

    @Override // com.beetalk.sdk.e
    boolean d(int i2, int i3, Intent intent, com.beetalk.sdk.b.c cVar) {
        com.facebook.j jVar = this.b;
        if (jVar != null) {
            jVar.a(i2, i3, intent);
            return true;
        }
        l(com.beetalk.sdk.b.e.a(cVar, com.garena.pay.android.b.SESSION_NOT_INITIALIZED.c().intValue()));
        return true;
    }

    @Override // com.beetalk.sdk.e
    boolean e(com.beetalk.sdk.b.c cVar) {
        com.beetalk.sdk.x.a.a("start FB Auth", new Object[0]);
        if (cVar == null) {
            return false;
        }
        com.facebook.a aVarD = com.facebook.a.d();
        if (aVarD != null && !aVarD.p()) {
            m();
            return true;
        }
        com.facebook.login.p.e().j(this.a.e().a(), Arrays.asList("public_profile", "user_friends", "email"));
        return true;
    }
}
