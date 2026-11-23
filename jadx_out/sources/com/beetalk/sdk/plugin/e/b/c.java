package com.beetalk.sdk.plugin.e.b;

import android.app.Activity;
import com.beetalk.sdk.p;
import com.beetalk.sdk.plugin.PluginResult;
import com.facebook.l;
import com.facebook.n;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.beetalk.sdk.plugin.e.b.a<com.beetalk.sdk.plugin.e.b.j.a, PluginResult> {

    class a extends PluginResult {
        final /* synthetic */ Exception a;

        a(Exception exc) {
            this.a = exc;
            this.source = c.this.d();
            this.status = -1;
            this.flag = com.garena.pay.android.b.LOGIN_FAILED.c().intValue();
            this.message = exc.getMessage();
        }
    }

    class b implements l<com.facebook.share.d.a.d> {
        final /* synthetic */ Activity a;

        b(Activity activity) {
            this.a = activity;
        }

        @Override // com.facebook.l
        public void a() {
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = c.this.d();
            pluginResult.status = -1;
            com.garena.pay.android.b bVar = com.garena.pay.android.b.USER_CANCELLED;
            pluginResult.flag = bVar.c().intValue();
            pluginResult.message = bVar.e();
            com.beetalk.sdk.plugin.c.k().n(pluginResult, this.a, c.this.d());
        }

        @Override // com.facebook.l
        public void b(n nVar) {
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = c.this.d();
            pluginResult.status = -1;
            pluginResult.flag = com.garena.pay.android.b.ERROR.c().intValue();
            pluginResult.message = nVar != null ? nVar.getMessage() : "Failed to send message";
            com.beetalk.sdk.plugin.c.k().n(pluginResult, this.a, c.this.d());
        }

        @Override // com.facebook.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(com.facebook.share.d.a.d dVar) {
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = c.this.d();
            pluginResult.status = 0;
            pluginResult.flag = com.garena.pay.android.b.SUCCESS.c().intValue();
            pluginResult.message = "Successfully sent";
            com.beetalk.sdk.plugin.c.k().n(pluginResult, this.a, c.this.d());
        }
    }

    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "facebook.game.message";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return p.d.q;
    }

    @Override // com.beetalk.sdk.plugin.e.b.a
    public void i(Exception exc, Activity activity) {
        com.beetalk.sdk.plugin.c.k().n(new a(exc), activity, d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.beetalk.sdk.plugin.e.b.a
    public void k(Activity activity) {
        S s = this.a;
        if (s == 0 || ((com.beetalk.sdk.plugin.e.b.j.a) s).a <= 0) {
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = d();
            pluginResult.status = -1;
            pluginResult.flag = com.garena.pay.android.b.ERROR_IN_PARAMS.c().intValue();
            pluginResult.message = "User id is invalid";
            com.beetalk.sdk.plugin.c.k().n(pluginResult, activity, d());
            return;
        }
        com.facebook.share.d.a aVar = new com.facebook.share.d.a(activity);
        aVar.j(this.b, new b(activity));
        com.facebook.share.c.c.C0104c c0104c = new com.facebook.share.c.c.C0104c();
        c0104c.p(((com.beetalk.sdk.plugin.e.b.j.a) this.a).b);
        c0104c.m(((com.beetalk.sdk.plugin.e.b.j.a) this.a).c);
        c0104c.l(((com.beetalk.sdk.plugin.e.b.j.a) this.a).f);
        c0104c.o(Collections.singletonList(String.valueOf(((com.beetalk.sdk.plugin.e.b.j.a) this.a).a)));
        com.facebook.share.c.c cVarJ = c0104c.j();
        if (aVar.b(cVarJ)) {
            aVar.l(cVarJ);
            return;
        }
        PluginResult pluginResult2 = new PluginResult();
        pluginResult2.source = d();
        pluginResult2.status = -1;
        pluginResult2.flag = com.garena.pay.android.b.UNSUPPORTED_API.c().intValue();
        pluginResult2.message = "Cannot show game request dialog";
        com.beetalk.sdk.plugin.c.k().n(pluginResult2, activity, d());
    }
}
