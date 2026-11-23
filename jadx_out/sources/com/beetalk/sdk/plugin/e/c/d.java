package com.beetalk.sdk.plugin.e.c;

import android.app.Activity;
import android.content.Intent;
import com.beetalk.sdk.p;
import i.i;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.beetalk.sdk.plugin.e.c.a<List<String>, com.beetalk.sdk.u.e> {

    class a implements Callable<Void> {
        final /* synthetic */ List a;
        final /* synthetic */ Activity b;

        a(List list, Activity activity) {
            this.a = list;
            this.b = activity;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            JSONObject jSONObjectC = com.beetalk.sdk.z.i.d.c(this.a);
            com.garena.pay.android.b bVarI = d.this.i(jSONObjectC);
            com.beetalk.sdk.u.e eVar = new com.beetalk.sdk.u.e();
            bVarI.c().intValue();
            if (bVarI == com.garena.pay.android.b.SUCCESS) {
                com.beetalk.sdk.plugin.d.b(jSONObjectC);
            }
            com.beetalk.sdk.plugin.c.k().n(eVar, this.b, d.this.d());
            return null;
        }
    }

    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "msdk.group.friend.info";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return p.d.p;
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean f(Activity activity, int i2, Intent intent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beetalk.sdk.plugin.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(Activity activity, List<String> list) {
        i.e(new a(list, activity));
    }
}
