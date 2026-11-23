package com.beetalk.sdk.plugin.e.c;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import com.beetalk.sdk.g;
import com.beetalk.sdk.p;
import com.beetalk.sdk.plugin.PluginResult;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.beetalk.sdk.plugin.a<c, PluginResult> {

    /* JADX INFO: renamed from: com.beetalk.sdk.plugin.e.c.b$b, reason: collision with other inner class name */
    private class AsyncTaskC0038b extends AsyncTask<c, Void, PluginResult> {

        /* JADX INFO: renamed from: com.beetalk.sdk.plugin.e.c.b$b$a */
        class a extends PluginResult {
            final /* synthetic */ int a;

            a(int i2) {
                this.a = i2;
                this.source = b.this.d();
                this.message = "Successfully sent";
                this.status = 0;
                this.flag = i2;
            }
        }

        /* JADX INFO: renamed from: com.beetalk.sdk.plugin.e.c.b$b$b, reason: collision with other inner class name */
        class C0039b extends PluginResult {
            final /* synthetic */ int a;

            C0039b(int i2) {
                this.a = i2;
                this.source = b.this.d();
                this.message = "Error encountered";
                this.status = -1;
                this.flag = i2;
            }
        }

        private AsyncTaskC0038b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PluginResult doInBackground(c... cVarArr) {
            int i2 = b.this.i(cVarArr[0]);
            return i2 == com.garena.pay.android.b.SUCCESS.c().intValue() ? new a(i2) : new C0039b(i2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(PluginResult pluginResult) {
            b.this.m(pluginResult);
        }
    }

    public static class c {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f527g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<String> f528h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i(c cVar) {
        com.garena.pay.android.b bVar;
        JSONObject jSONObjectD = com.beetalk.sdk.z.i.d.d(cVar);
        if (jSONObjectD == null) {
            bVar = com.garena.pay.android.b.NETWORK_CONNECTION_EXCEPTION;
        } else if (jSONObjectD.has("result")) {
            try {
                com.beetalk.sdk.x.a.i("buddy request %s", jSONObjectD.getString("result"));
            } catch (JSONException e) {
                com.beetalk.sdk.x.a.b(e);
            }
            bVar = com.garena.pay.android.b.SUCCESS;
        } else {
            if (jSONObjectD.has("error")) {
                try {
                    if ("error_token_session".equals(jSONObjectD.getString("error"))) {
                        g.b0();
                        return com.garena.pay.android.b.ERROR_TOKEN_SESSION.c().intValue();
                    }
                } catch (JSONException e2) {
                    com.beetalk.sdk.x.a.b(e2);
                }
            }
            bVar = com.garena.pay.android.b.UNKNOWN_ERROR;
        }
        return bVar.c().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(PluginResult pluginResult) {
        com.beetalk.sdk.plugin.c.k().n(pluginResult, null, d());
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean a() {
        return false;
    }

    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "app.request.friend";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return p.d.r;
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean f(Activity activity, int i2, Intent intent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beetalk.sdk.plugin.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void b(Activity activity, c cVar) {
        new AsyncTaskC0038b().execute(cVar);
    }
}
