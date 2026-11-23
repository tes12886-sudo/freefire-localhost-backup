package com.beetalk.sdk.plugin.e.f;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import com.beetalk.sdk.p;
import com.beetalk.sdk.plugin.PluginResult;
import com.beetalk.sdk.x.d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.beetalk.sdk.plugin.a<b, PluginResult> {

    /* JADX INFO: renamed from: com.beetalk.sdk.plugin.e.f.a$a, reason: collision with other inner class name */
    class C0040a extends PluginResult {
        C0040a() {
            this.source = a.this.d();
            this.message = "Required params missing. Have you logged in?";
            this.status = -1;
            this.flag = -1;
        }
    }

    public static class b {
        public String a;
        public String b;
        public String c;
    }

    private class c extends AsyncTask<b, Void, PluginResult> {

        /* JADX INFO: renamed from: com.beetalk.sdk.plugin.e.f.a$c$a, reason: collision with other inner class name */
        class C0041a extends PluginResult {
            final /* synthetic */ b a;
            final /* synthetic */ int b;

            C0041a(b bVar, int i2) {
                this.a = bVar;
                this.b = i2;
                this.source = a.this.d();
                this.message = "feedback: " + bVar.c;
                this.status = i2;
                this.flag = i2;
            }
        }

        class b extends PluginResult {
            b() {
                this.source = a.this.d();
                this.message = "Request Failed. Network Error or Server Error";
                this.status = -1;
                this.flag = -1;
            }
        }

        private c() {
        }

        /* synthetic */ c(a aVar, C0040a c0040a) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PluginResult doInBackground(b... bVarArr) {
            int i2;
            b bVar = bVarArr[0];
            JSONObject jSONObjectC = com.beetalk.sdk.z.i.a.c(bVar.a, bVar.b, bVar.c);
            try {
                com.beetalk.sdk.x.a.i("Response From Server: Feedback %s", jSONObjectC);
                i2 = jSONObjectC != null ? jSONObjectC.getInt("result") : -1;
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return i2 != -1 ? new C0041a(bVar, i2) : new b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(PluginResult pluginResult) {
            a.this.k(pluginResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(PluginResult pluginResult) {
        com.beetalk.sdk.plugin.c.k().n(pluginResult, null, d());
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean a() {
        return false;
    }

    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "app.feedback";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return p.d.f517h;
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean f(Activity activity, int i2, Intent intent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beetalk.sdk.plugin.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(Activity activity, b bVar) {
        if (d.o(bVar.b) || d.o(bVar.c) || d.o(bVar.a)) {
            com.beetalk.sdk.plugin.c.k().n(new C0040a(), activity, d());
        } else {
            new c(this, null).execute(bVar);
        }
    }
}
