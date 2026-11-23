package com.beetalk.sdk.plugin.e.c;

import android.app.Activity;
import android.content.Intent;
import com.beetalk.sdk.p;
import i.i;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.beetalk.sdk.plugin.e.c.a<Void, com.beetalk.sdk.u.c> {

    class a implements Callable<Void> {
        final /* synthetic */ com.beetalk.sdk.u.c a;
        final /* synthetic */ Activity b;

        a(com.beetalk.sdk.u.c cVar, Activity activity) {
            this.a = cVar;
            this.b = activity;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            JSONObject jSONObjectA = com.beetalk.sdk.z.i.d.a();
            com.garena.pay.android.b bVarI = e.this.i(jSONObjectA);
            this.a.a = bVarI.c().intValue();
            com.garena.pay.android.b bVar = com.garena.pay.android.b.SUCCESS;
            if (bVarI == bVar) {
                this.a.a = bVar.c().intValue();
                this.a.b = com.beetalk.sdk.plugin.d.a(jSONObjectA);
            }
            com.beetalk.sdk.plugin.c.k().n(this.a, this.b, e.this.d());
            return null;
        }
    }

    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "msdk.load.inapp.friendgroups.list";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return p.d.f524o;
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean f(Activity activity, int i2, Intent intent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beetalk.sdk.plugin.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(Activity activity, Void r3) {
        i.e(new a(new com.beetalk.sdk.u.c(), activity));
    }
}
