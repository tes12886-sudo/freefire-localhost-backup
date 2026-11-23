package com.beetalk.sdk;

import android.os.AsyncTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class o extends e {

    private class b extends AsyncTask<String, Void, com.beetalk.sdk.b.e> {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.beetalk.sdk.b.e doInBackground(String... strArr) {
            String str = strArr[0];
            if (str == null || com.beetalk.sdk.x.j.b(str)) {
                return com.beetalk.sdk.b.e.a(o.this.a.i(), com.garena.pay.android.b.REFRESH_TOKEN_FAILED.c().intValue());
            }
            o oVar = o.this;
            return oVar.i(str, oVar.a.i());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(com.beetalk.sdk.b.e eVar) {
            o.this.h(eVar);
        }
    }

    public o(com.beetalk.sdk.b bVar) {
        super(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(com.beetalk.sdk.b.e eVar) {
        if (eVar != null) {
            this.a.k(eVar);
        } else {
            this.a.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.beetalk.sdk.b.e i(String str, com.beetalk.sdk.b.c cVar) {
        com.beetalk.sdk.b.e eVarC;
        JSONObject jSONObjectP = com.beetalk.sdk.z.i.b.p(str);
        if (jSONObjectP == null || !jSONObjectP.has("open_id")) {
            eVarC = null;
        } else {
            try {
                String string = jSONObjectP.getString("open_id");
                String string2 = jSONObjectP.getString("access_token");
                String string3 = jSONObjectP.getString("refresh_token");
                int i2 = jSONObjectP.getInt("expiry_time");
                int i3 = jSONObjectP.getInt("platform");
                com.beetalk.sdk.u.a aVar = new com.beetalk.sdk.u.a(string2, com.beetalk.sdk.u.l.GARENA_WEB_ANDROID, i3);
                aVar.n(string3);
                aVar.k(i2);
                aVar.m(string);
                eVarC = com.beetalk.sdk.b.e.c(cVar, aVar, string, i3);
            } catch (JSONException e) {
                com.beetalk.sdk.x.a.b(e);
                eVarC = null;
            }
        }
        return eVarC == null ? com.beetalk.sdk.b.e.a(cVar, com.garena.pay.android.b.ACCESS_TOKEN_EXCHANGE_FAILED.c().intValue()) : eVarC;
    }

    @Override // com.beetalk.sdk.e
    boolean e(com.beetalk.sdk.b.c cVar) {
        new b().execute(cVar.d().g());
        return true;
    }
}
