package com.beetalk.sdk;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class m extends e {

    class a implements com.beetalk.sdk.z.e.h {
        final /* synthetic */ com.beetalk.sdk.u.i a;

        a(com.beetalk.sdk.u.i iVar) {
            this.a = iVar;
        }

        @Override // com.beetalk.sdk.z.e.h
        public void onCompleted(JSONObject jSONObject) {
            if (m.this.k(jSONObject)) {
                m.this.a.k(null);
                return;
            }
            try {
                long j2 = jSONObject.getLong("uid");
                com.beetalk.sdk.t.a.s().j(j2, this.a.a);
                try {
                    com.beetalk.sdk.t.g.s().j(j2, this.a.a);
                } catch (Exception e) {
                    com.beetalk.sdk.x.a.b(e);
                }
                m.this.j(j2, this.a.a);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    class b implements com.beetalk.sdk.z.e.h {

        class a implements Runnable {
            a(b bVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.beetalk.sdk.t.g.s().p();
                com.beetalk.sdk.t.a.s().q();
            }
        }

        b() {
        }

        @Override // com.beetalk.sdk.z.e.h
        public void onCompleted(JSONObject jSONObject) {
            com.beetalk.sdk.b.e eVarI = m.this.i(jSONObject);
            if (eVarI.c == com.garena.pay.android.b.ERROR_GUEST_LOGIN.c().intValue()) {
                com.garena.pay.android.j.c.a().b(new a(this));
            }
            m.this.a.k(eVarI);
        }
    }

    public m(com.beetalk.sdk.b bVar) {
        super(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    public com.beetalk.sdk.b.e i(JSONObject jSONObject) {
        Integer numC;
        int iIntValue = com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue();
        com.beetalk.sdk.b.e eVarC = null;
        try {
            if (jSONObject != null) {
                if (jSONObject.has("open_id")) {
                    String string = jSONObject.getString("open_id");
                    String string2 = jSONObject.getString("access_token");
                    String string3 = jSONObject.getString("refresh_token");
                    int i2 = jSONObject.getInt("expiry_time");
                    com.beetalk.sdk.u.a aVar = new com.beetalk.sdk.u.a(string2, com.beetalk.sdk.u.l.GUEST, 4);
                    aVar.n(string3);
                    aVar.k(i2);
                    eVarC = com.beetalk.sdk.b.e.c(this.a.i(), aVar, string, 4);
                } else if (jSONObject.has("error")) {
                    String string4 = jSONObject.getString("error");
                    if ("invalid_grant".equals(string4)) {
                        numC = com.garena.pay.android.b.ACCESS_TOKEN_INVALID_GRANT.c();
                    } else {
                        numC = "error_user_ban".equals(string4) ? com.garena.pay.android.b.ERROR_USER_BANNED.c() : com.garena.pay.android.b.ERROR_GUEST_LOGIN.c();
                    }
                } else {
                    numC = com.garena.pay.android.b.ACCESS_TOKEN_EXCHANGE_FAILED.c();
                }
                if (eVarC == null) {
                    return com.beetalk.sdk.b.e.a(this.a.i(), iIntValue);
                }
                return eVarC;
            }
            numC = com.garena.pay.android.b.NETWORK_EXCEPTION.c();
            iIntValue = numC.intValue();
        } catch (JSONException e) {
            com.beetalk.sdk.x.a.b(e);
        }
        if (eVarC == null) {
            return com.beetalk.sdk.b.e.a(this.a.i(), iIntValue);
        }
        return eVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(long j2, String str) {
        com.beetalk.sdk.z.i.b.m(j2, str, com.beetalk.sdk.a0.a.TOKEN, this.a.i().a(), new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.has("error");
    }

    @Override // com.beetalk.sdk.e
    boolean e(com.beetalk.sdk.b.c cVar) {
        String strF = com.beetalk.sdk.t.a.s().f();
        String strC = com.beetalk.sdk.t.a.s().c();
        if (!TextUtils.isEmpty(strF) && !TextUtils.isEmpty(strC)) {
            j(Long.parseLong(strF), strC);
            return true;
        }
        String strF2 = com.beetalk.sdk.t.g.s().f();
        if (TextUtils.isEmpty(strF2)) {
            com.beetalk.sdk.u.i iVar = new com.beetalk.sdk.u.i();
            iVar.a = com.beetalk.sdk.x.i.c();
            iVar.b = cVar.a();
            iVar.d = cVar.b();
            iVar.c = g.y().H().intValue();
            com.beetalk.sdk.z.i.b.q(iVar, new a(iVar));
            return true;
        }
        long j2 = Long.parseLong(strF2);
        String strC2 = com.beetalk.sdk.t.g.s().c();
        com.beetalk.sdk.t.a.s().j(j2, strC2);
        try {
            com.beetalk.sdk.t.g.s().j(j2, strC2);
        } catch (Exception e) {
            com.beetalk.sdk.x.a.b(e);
        }
        j(j2, strC2);
        return true;
    }
}
