package com.beetalk.sdk.plugin.e.b;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.beetalk.sdk.p;
import com.beetalk.sdk.plugin.PluginResult;
import com.facebook.l;
import com.facebook.n;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.beetalk.sdk.plugin.e.b.a<com.beetalk.sdk.plugin.e.b.j.a, PluginResult> {

    class a extends PluginResult {
        final /* synthetic */ Exception a;

        a(Exception exc) {
            this.a = exc;
            this.source = f.this.d();
            this.flag = -1;
            this.status = -1;
            this.message = exc.getMessage();
        }
    }

    class b implements l<com.facebook.share.a> {
        final /* synthetic */ Activity a;

        b(Activity activity) {
            this.a = activity;
        }

        @Override // com.facebook.l
        public void a() {
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = f.this.d();
            pluginResult.flag = -1;
            pluginResult.status = -1;
            pluginResult.message = "Send msg cancelled";
            com.beetalk.sdk.plugin.c.k().n(pluginResult, this.a, f.this.d());
        }

        @Override // com.facebook.l
        public void b(n nVar) {
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = f.this.d();
            pluginResult.flag = -1;
            pluginResult.status = -1;
            pluginResult.message = nVar != null ? nVar.getMessage() : "Send msg Failed";
            com.beetalk.sdk.plugin.c.k().n(pluginResult, this.a, f.this.d());
        }

        @Override // com.facebook.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(com.facebook.share.a aVar) {
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = f.this.d();
            pluginResult.flag = 0;
            pluginResult.status = 0;
            pluginResult.message = "Successfully send msg";
            com.beetalk.sdk.plugin.c.k().n(pluginResult, this.a, f.this.d());
        }
    }

    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "facebook.message";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return p.d.f;
    }

    @Override // com.beetalk.sdk.plugin.e.b.a
    public void i(Exception exc, Activity activity) {
        com.beetalk.sdk.plugin.c.k().n(new a(exc), activity, d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.beetalk.sdk.plugin.e.b.a
    public void k(Activity activity) {
        S s = this.a;
        if (s == 0 || TextUtils.isEmpty(((com.beetalk.sdk.plugin.e.b.j.a) s).d)) {
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = d();
            pluginResult.flag = -1;
            pluginResult.status = -1;
            pluginResult.message = "The content url is empty";
            com.beetalk.sdk.plugin.c.k().n(pluginResult, activity, d());
            return;
        }
        com.facebook.share.d.b bVar = new com.facebook.share.d.b(activity);
        bVar.j(this.b, new b(activity));
        com.facebook.share.c.g.b bVar2 = new com.facebook.share.c.g.b();
        bVar2.t(((com.beetalk.sdk.plugin.e.b.j.a) this.a).b);
        bVar2.s(((com.beetalk.sdk.plugin.e.b.j.a) this.a).c);
        bVar2.h(Uri.parse(((com.beetalk.sdk.plugin.e.b.j.a) this.a).d));
        com.facebook.share.c.g.b bVar3 = bVar2;
        if (!TextUtils.isEmpty(((com.beetalk.sdk.plugin.e.b.j.a) this.a).e)) {
            bVar3.u(Uri.parse(((com.beetalk.sdk.plugin.e.b.j.a) this.a).e));
        }
        if (com.facebook.share.d.b.q(com.facebook.share.c.g.class)) {
            bVar.l(bVar3.r());
        } else {
            com.beetalk.sdk.plugin.c.k().n(c(com.garena.pay.android.b.UNSUPPORTED_API.c().intValue(), "Cannot show Messenger dialog"), activity, d());
        }
    }
}
