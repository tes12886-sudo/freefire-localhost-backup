package com.beetalk.sdk.plugin.e.i;

import android.app.Activity;
import android.content.Intent;
import com.beetalk.sdk.plugin.PluginResult;
import com.vk.sdk.VKServiceActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<S, T> extends com.beetalk.sdk.plugin.a<S, T> {
    private S a;
    private com.beetalk.sdk.b0.a b;

    /* JADX INFO: renamed from: com.beetalk.sdk.plugin.e.i.a$a, reason: collision with other inner class name */
    class C0045a implements com.beetalk.sdk.b0.a.d {
        final /* synthetic */ Activity a;

        C0045a(Activity activity) {
            this.a = activity;
        }

        @Override // com.beetalk.sdk.b0.a.d
        public void a(com.vk.sdk.k.c cVar) {
            String strE;
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = a.this.d();
            pluginResult.status = -1;
            if (cVar != null) {
                com.garena.pay.android.b bVar = cVar.e != -102 ? com.garena.pay.android.b.NETWORK_EXCEPTION : com.garena.pay.android.b.USER_CANCELLED;
                pluginResult.flag = bVar.c().intValue();
                strE = bVar.e();
            } else {
                pluginResult.flag = com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue();
                strE = "Unknown Error.";
            }
            pluginResult.message = strE;
            com.beetalk.sdk.plugin.c.k().n(pluginResult, this.a, a.this.d());
        }

        @Override // com.beetalk.sdk.b0.a.d
        public void b() {
            a.this.k(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(Activity activity) {
        S s = this.a;
        if (s == null) {
            g(activity, com.garena.pay.android.b.ERROR_IN_PARAMS.c().intValue());
        } else {
            j(activity, s);
        }
    }

    @Override // com.beetalk.sdk.plugin.a
    protected void b(Activity activity, S s) {
        if (s == null) {
            g(activity, com.garena.pay.android.b.ERROR_IN_PARAMS.c().intValue());
            return;
        }
        com.beetalk.sdk.x.a.a("checking vk session", new Object[0]);
        this.a = s;
        com.beetalk.sdk.b0.a aVar = new com.beetalk.sdk.b0.a(activity);
        this.b = aVar;
        aVar.f(new C0045a(activity));
        this.b.g();
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return Integer.valueOf(VKServiceActivity.c.Authorization.a());
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean f(Activity activity, int i2, Intent intent) {
        com.beetalk.sdk.b0.a aVar = this.b;
        if (aVar != null) {
            aVar.e(i2, intent);
            return false;
        }
        g(activity, com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue());
        return false;
    }

    protected abstract void j(Activity activity, S s);
}
