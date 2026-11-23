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
public class g extends com.beetalk.sdk.plugin.e.b.a<byte[], PluginResult> {

    class a extends PluginResult {
        final /* synthetic */ Exception a;

        a(Exception exc) {
            this.a = exc;
            this.source = g.this.d();
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
            pluginResult.source = g.this.d();
            pluginResult.flag = -1;
            pluginResult.status = -1;
            pluginResult.message = "Send msg cancelled";
            com.beetalk.sdk.plugin.c.k().n(pluginResult, this.a, g.this.d());
        }

        @Override // com.facebook.l
        public void b(n nVar) {
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = g.this.d();
            pluginResult.flag = -1;
            pluginResult.status = -1;
            pluginResult.message = nVar != null ? nVar.getMessage() : "Send msg Failed";
            com.beetalk.sdk.plugin.c.k().n(pluginResult, this.a, g.this.d());
        }

        @Override // com.facebook.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(com.facebook.share.a aVar) {
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = g.this.d();
            pluginResult.flag = 0;
            pluginResult.status = 0;
            pluginResult.message = "Successfully send msg";
            com.beetalk.sdk.plugin.c.k().n(pluginResult, this.a, g.this.d());
        }
    }

    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "facebook.messenger.send.image";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return p.d.s;
    }

    @Override // com.beetalk.sdk.plugin.e.b.a
    public void i(Exception exc, Activity activity) {
        com.beetalk.sdk.plugin.c.k().n(new a(exc), activity, d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.beetalk.sdk.plugin.e.b.a
    public void k(Activity activity) {
        com.beetalk.sdk.plugin.c cVarK;
        int iIntValue;
        String str;
        if (this.a == 0) {
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = d();
            pluginResult.flag = -1;
            pluginResult.status = -1;
            pluginResult.message = "The content url is empty";
            com.beetalk.sdk.plugin.c.k().n(pluginResult, activity, d());
            return;
        }
        if (com.facebook.share.d.b.q(u.class)) {
            Bitmap bitmapDecodeByteArray = null;
            try {
                S s = this.a;
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray((byte[]) s, 0, ((byte[]) s).length);
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
                com.facebook.share.d.b bVar3 = new com.facebook.share.d.b(activity);
                bVar3.j(this.b, new b(activity));
                bVar3.l(bVar2.q());
                return;
            }
            cVarK = com.beetalk.sdk.plugin.c.k();
            iIntValue = com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue();
            str = "Failed to create bitmap";
        } else {
            cVarK = com.beetalk.sdk.plugin.c.k();
            iIntValue = com.garena.pay.android.b.UNSUPPORTED_API.c().intValue();
            str = "Cannot show Messenger dialog";
        }
        cVarK.n(c(iIntValue, str), activity, d());
    }
}
