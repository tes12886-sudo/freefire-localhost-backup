package com.beetalk.sdk.plugin.e.b;

import android.app.Activity;
import com.beetalk.sdk.p;
import com.beetalk.sdk.plugin.PluginResult;
import com.facebook.l;
import com.facebook.n;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.beetalk.sdk.plugin.e.b.a<c, PluginResult> {

    class a extends PluginResult {
        final /* synthetic */ Exception a;

        a(Exception exc) {
            this.a = exc;
            this.source = e.this.d();
            this.flag = -1;
            this.status = -1;
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
            pluginResult.source = e.this.d();
            pluginResult.flag = -1;
            pluginResult.status = -1;
            pluginResult.message = "Share cancelled";
            com.beetalk.sdk.plugin.c.k().n(pluginResult, this.a, e.this.d());
        }

        @Override // com.facebook.l
        public void b(n nVar) {
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = e.this.d();
            pluginResult.flag = -1;
            pluginResult.status = -1;
            pluginResult.message = nVar != null ? nVar.getMessage() : "Share Failed";
            com.beetalk.sdk.plugin.c.k().n(pluginResult, this.a, e.this.d());
        }

        @Override // com.facebook.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(com.facebook.share.d.a.d dVar) {
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = e.this.d();
            pluginResult.flag = 0;
            pluginResult.status = 0;
            pluginResult.message = "Successfully shared";
            com.beetalk.sdk.plugin.c.k().n(pluginResult, this.a, e.this.d());
        }
    }

    public static class c {
        public String a;
        public String b;
    }

    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "facebook.invite";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return p.d.e;
    }

    @Override // com.beetalk.sdk.plugin.e.b.a
    public void i(Exception exc, Activity activity) {
        com.beetalk.sdk.plugin.c.k().n(new a(exc), activity, d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.beetalk.sdk.plugin.e.b.a
    public void k(Activity activity) {
        com.facebook.share.d.a aVar = new com.facebook.share.d.a(activity);
        aVar.j(this.b, new b(activity));
        com.facebook.share.c.c.C0104c c0104c = new com.facebook.share.c.c.C0104c();
        c0104c.p(((c) this.a).a);
        c0104c.m(((c) this.a).b);
        aVar.l(c0104c.j());
    }
}
