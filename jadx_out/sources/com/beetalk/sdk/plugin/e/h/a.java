package com.beetalk.sdk.plugin.e.h;

import android.app.Activity;
import android.content.Intent;
import com.beetalk.sdk.g;
import com.beetalk.sdk.p;
import com.beetalk.sdk.plugin.c;
import com.beetalk.sdk.u.h;
import com.beetalk.sdk.x.d;
import com.beetalk.sdk.z.i.e;
import com.garena.pay.android.b;
import i.i;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.beetalk.sdk.plugin.a<Void, h> {

    /* JADX INFO: renamed from: com.beetalk.sdk.plugin.e.h.a$a, reason: collision with other inner class name */
    class CallableC0044a implements Callable<Void> {
        final /* synthetic */ Activity a;

        CallableC0044a(Activity activity) {
            this.a = activity;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Integer numC;
            JSONObject jSONObjectA = e.a();
            h hVar = new h();
            b.UNKNOWN_ERROR.c().intValue();
            g.y().D().intValue();
            com.beetalk.sdk.x.a.i("UserInfoPlugin: Received response from server %s", jSONObjectA);
            b bVarB = d.b(jSONObjectA);
            if (bVarB == null) {
                try {
                    b.SUCCESS.c().intValue();
                    jSONObjectA.optInt("platform");
                    hVar.a = new com.beetalk.sdk.u.g();
                    jSONObjectA.optString("icon");
                    hVar.a.c = jSONObjectA.optInt("gender");
                    hVar.a.b = jSONObjectA.optString("nickname");
                    hVar.a.a = jSONObjectA.optString("open_id");
                } catch (Exception e) {
                    com.beetalk.sdk.x.a.b(e);
                    numC = b.NETWORK_EXCEPTION.c();
                    numC.intValue();
                }
                c.k().n(hVar, this.a, a.this.d());
                return null;
            }
            numC = bVarB.c();
            numC.intValue();
            c.k().n(hVar, this.a, a.this.d());
            return null;
        }
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean a() {
        return false;
    }

    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "msdk.user.info.get";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return p.d.a;
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean f(Activity activity, int i2, Intent intent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beetalk.sdk.plugin.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void b(Activity activity, Void r2) {
        i.e(new CallableC0044a(activity));
    }
}
