package com.beetalk.sdk.plugin.e.b;

import android.app.Activity;
import android.os.Bundle;
import com.beetalk.sdk.p;
import com.beetalk.sdk.plugin.PluginResult;
import com.facebook.u;
import com.facebook.x;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i extends com.beetalk.sdk.plugin.e.b.a<Void, PluginResult> {

    class a implements u.d {
        final /* synthetic */ Activity a;

        a(Activity activity) {
            this.a = activity;
        }

        @Override // com.facebook.u.d
        public void a(JSONObject jSONObject, x xVar) {
            if (jSONObject == null) {
                i.this.o(this.a, xVar.toString());
            } else {
                i.this.p(this.a, jSONObject);
            }
        }
    }

    class b extends PluginResult {
        final /* synthetic */ JSONObject a;

        b(JSONObject jSONObject) {
            this.a = jSONObject;
            this.status = 0;
            this.flag = 0;
            this.message = jSONObject.toString();
            this.source = i.this.d();
        }
    }

    class c extends PluginResult {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
            this.status = -1;
            this.flag = -1;
            this.message = str;
            this.source = i.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(Activity activity, String str) {
        com.beetalk.sdk.plugin.c.k().n(new c(str), activity, d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Activity activity, JSONObject jSONObject) {
        com.beetalk.sdk.plugin.c.k().n(new b(jSONObject), activity, d());
    }

    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "facebook.request.me";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return p.d.f516g;
    }

    @Override // com.beetalk.sdk.plugin.e.b.a
    public void i(Exception exc, Activity activity) {
        o(activity, exc.getMessage());
    }

    @Override // com.beetalk.sdk.plugin.e.b.a
    public void k(Activity activity) {
        u uVarA = u.A(com.facebook.a.d(), new a(activity));
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,email,birthday,first_name,last_name");
        uVarA.G(bundle);
        uVarA.j();
    }
}
