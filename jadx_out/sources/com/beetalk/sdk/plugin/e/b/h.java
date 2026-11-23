package com.beetalk.sdk.plugin.e.b;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.beetalk.sdk.p;
import com.beetalk.sdk.plugin.PluginResult;
import com.facebook.l;
import com.facebook.n;
import com.facebook.share.c.t;
import com.facebook.share.c.u;

/* JADX INFO: loaded from: classes.dex */
public class h extends com.beetalk.sdk.plugin.e.b.a<com.beetalk.sdk.w.b, PluginResult> {

    class a implements l<com.facebook.share.a> {
        final /* synthetic */ Activity a;

        a(Activity activity) {
            this.a = activity;
        }

        @Override // com.facebook.l
        public void a() {
            com.beetalk.sdk.plugin.c.k().n(h.this.c(com.garena.pay.android.b.USER_CANCELLED.c().intValue(), "User Cancelled."), this.a, h.this.d());
        }

        @Override // com.facebook.l
        public void b(n nVar) {
            PluginResult pluginResult = new PluginResult();
            int iIntValue = com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue();
            pluginResult.status = iIntValue;
            pluginResult.flag = iIntValue;
            pluginResult.source = h.this.d();
            pluginResult.message = nVar != null ? nVar.getMessage() : "Unknown Error.";
            com.beetalk.sdk.plugin.c.k().n(pluginResult, this.a, h.this.d());
        }

        @Override // com.facebook.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(com.facebook.share.a aVar) {
            com.beetalk.sdk.plugin.c.k().n(h.this.c(com.garena.pay.android.b.SUCCESS.c().intValue(), "Success"), this.a, h.this.d());
        }
    }

    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "facebook.share";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return p.d.b;
    }

    @Override // com.beetalk.sdk.plugin.e.b.a
    public void i(Exception exc, Activity activity) {
        PluginResult pluginResult = new PluginResult();
        pluginResult.source = d();
        pluginResult.status = -1;
        pluginResult.flag = -1;
        pluginResult.message = exc.getMessage();
        com.beetalk.sdk.plugin.c.k().n(pluginResult, activity, d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.beetalk.sdk.plugin.e.b.a
    public void k(Activity activity) {
        com.beetalk.sdk.plugin.c cVarK;
        int iIntValue;
        String str;
        if (com.facebook.share.d.c.u(u.class)) {
            com.facebook.share.d.c cVar = new com.facebook.share.d.c(activity);
            cVar.j(this.b, new a(activity));
            Bitmap bitmapDecodeByteArray = null;
            try {
                S s = this.a;
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(((com.beetalk.sdk.w.b) s).e, 0, ((com.beetalk.sdk.w.b) s).e.length);
            } catch (Exception e) {
                com.beetalk.sdk.x.a.b(e);
            } catch (OutOfMemoryError unused) {
                com.beetalk.sdk.x.a.c("Failed to create bitmap: out of memory", new Object[0]);
                com.beetalk.sdk.plugin.c.k().n(c(com.garena.pay.android.b.ERROR_IN_PARAMS.c().intValue(), "Failed to create bitmap: out of memory"), activity, d());
                return;
            }
            if (bitmapDecodeByteArray != null) {
                t.b bVar = new t.b();
                bVar.o(bitmapDecodeByteArray);
                t tVarI = bVar.i();
                u.b bVar2 = new u.b();
                bVar2.o(tVarI);
                cVar.l(bVar2.q());
                return;
            }
            cVarK = com.beetalk.sdk.plugin.c.k();
            iIntValue = com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue();
            str = "Failed to create bitmap";
        } else {
            cVarK = com.beetalk.sdk.plugin.c.k();
            iIntValue = com.garena.pay.android.b.UNSUPPORTED_API.c().intValue();
            str = "Facebook App is not installed.";
        }
        cVarK.n(c(iIntValue, str), activity, d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beetalk.sdk.plugin.e.b.a, com.beetalk.sdk.plugin.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void b(Activity activity, com.beetalk.sdk.w.b bVar) {
        if (bVar == null) {
            g(activity, com.garena.pay.android.b.ERROR_IN_PARAMS.c().intValue());
        } else if (!p() || com.beetalk.sdk.x.d.p("com.facebook.katana", activity)) {
            super.b(activity, bVar);
        } else {
            com.beetalk.sdk.plugin.c.k().n(c(com.garena.pay.android.b.UNSUPPORTED_API.c().intValue(), "Facebook App is not installed."), activity, d());
        }
    }

    protected boolean p() {
        return true;
    }
}
