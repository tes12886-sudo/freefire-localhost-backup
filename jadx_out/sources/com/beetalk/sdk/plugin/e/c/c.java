package com.beetalk.sdk.plugin.e.c;

import android.app.Activity;
import android.content.Intent;
import com.beetalk.sdk.p;
import i.i;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.beetalk.sdk.plugin.e.c.a<Void, com.beetalk.sdk.u.c> {

    class a implements Callable<Void> {
        final /* synthetic */ Activity a;

        a(Activity activity) {
            this.a = activity;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            JSONObject jSONObjectB = com.beetalk.sdk.z.i.d.b();
            com.garena.pay.android.b bVarI = c.this.i(jSONObjectB);
            com.beetalk.sdk.u.c cVar = new com.beetalk.sdk.u.c();
            bVarI.c().intValue();
            com.garena.pay.android.b bVar = com.garena.pay.android.b.SUCCESS;
            if (bVarI == bVar) {
                bVar.c().intValue();
                com.beetalk.sdk.plugin.d.a(jSONObjectB);
            }
            com.beetalk.sdk.plugin.c.k().n(cVar, this.a, c.this.d());
            return null;
        }
    }

    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "msdk.load.friendgroups.list";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return p.d.f523n;
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean f(Activity activity, int i2, Intent intent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beetalk.sdk.plugin.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(Activity activity, Void r2) {
        i.e(new a(activity));
    }
}
