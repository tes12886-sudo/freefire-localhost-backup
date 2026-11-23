package com.beetalk.sdk.plugin.e.b;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.beetalk.sdk.plugin.PluginResult;
import com.facebook.l;
import com.facebook.n;
import com.facebook.p;

/* JADX INFO: loaded from: classes.dex */
public class b extends h {

    class a extends PluginResult {
        final /* synthetic */ Exception a;

        a(b bVar, Exception exc) {
            this.a = exc;
            int iIntValue = com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue();
            this.status = iIntValue;
            this.flag = iIntValue;
            this.message = exc.getMessage();
            this.source = "facebook.share.fallback";
        }
    }

    /* JADX INFO: renamed from: com.beetalk.sdk.plugin.e.b.b$b, reason: collision with other inner class name */
    class C0035b implements l<com.facebook.share.a> {
        final /* synthetic */ Activity a;

        C0035b(Activity activity) {
            this.a = activity;
        }

        @Override // com.facebook.l
        public void a() {
            com.beetalk.sdk.plugin.c.k().n(b.this.c(com.garena.pay.android.b.USER_CANCELLED.c().intValue(), "User cancelled"), this.a, b.this.d());
        }

        @Override // com.facebook.l
        public void b(n nVar) {
            if (nVar instanceof p) {
                com.beetalk.sdk.plugin.c.k().n(b.this.c(com.garena.pay.android.b.USER_CANCELLED.c().intValue(), "User cancelled"), this.a, b.this.d());
            } else {
                com.beetalk.sdk.plugin.c.k().n(b.this.c(com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue(), nVar == null ? "Unknown Error" : nVar.getMessage()), this.a, b.this.d());
            }
        }

        @Override // com.facebook.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(com.facebook.share.a aVar) {
            com.beetalk.sdk.plugin.c.k().n(b.this.c(com.garena.pay.android.b.SUCCESS.c().intValue(), String.format("Successfully posted %s", aVar.a())), this.a, b.this.d());
        }
    }

    @Override // com.beetalk.sdk.plugin.e.b.h, com.beetalk.sdk.plugin.a
    public String d() {
        return "facebook.share.fallback";
    }

    @Override // com.beetalk.sdk.plugin.e.b.h, com.beetalk.sdk.plugin.a
    public Integer e() {
        return com.beetalk.sdk.p.d.c;
    }

    @Override // com.beetalk.sdk.plugin.e.b.h, com.beetalk.sdk.plugin.e.b.a
    public void i(Exception exc, Activity activity) {
        com.beetalk.sdk.plugin.c.k().n(new a(this, exc), activity, d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.beetalk.sdk.plugin.e.b.h, com.beetalk.sdk.plugin.e.b.a
    public void k(Activity activity) {
        com.beetalk.sdk.w.b bVar = (com.beetalk.sdk.w.b) this.a;
        try {
            Uri uri = !TextUtils.isEmpty(bVar.c) ? Uri.parse(bVar.c) : null;
            Uri uri2 = TextUtils.isEmpty(bVar.d) ? null : Uri.parse(bVar.d);
            com.facebook.share.d.c cVar = new com.facebook.share.d.c(activity);
            com.facebook.share.c.g.b bVar2 = new com.facebook.share.c.g.b();
            bVar2.t(bVar.a);
            bVar2.s(bVar.b);
            bVar2.h(uri);
            com.facebook.share.c.g.b bVar3 = bVar2;
            bVar3.u(uri2);
            com.facebook.share.c.g gVarR = bVar3.r();
            cVar.j(this.b, new C0035b(activity));
            cVar.l(gVarR);
        } catch (Exception unused) {
            com.beetalk.sdk.plugin.c.k().n(c(com.garena.pay.android.b.ERROR.c().intValue(), "Error Uri."), activity, d());
        }
    }

    @Override // com.beetalk.sdk.plugin.e.b.h
    protected boolean p() {
        return false;
    }
}
