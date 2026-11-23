package com.beetalk.sdk.plugin.e.i;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.beetalk.sdk.plugin.PluginResult;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.beetalk.sdk.plugin.e.i.a<com.beetalk.sdk.b0.b, PluginResult> {

    class a implements c.a {
        final /* synthetic */ Activity a;

        a(Activity activity) {
            this.a = activity;
        }

        @Override // com.beetalk.sdk.plugin.e.i.c.a
        public void a(com.vk.sdk.k.c cVar) {
            e eVar;
            Activity activity;
            com.garena.pay.android.b bVar;
            com.beetalk.sdk.x.a.a("vk share failed: %s", cVar);
            if (cVar.e != -102) {
                eVar = e.this;
                activity = this.a;
                bVar = com.garena.pay.android.b.NETWORK_EXCEPTION;
            } else {
                eVar = e.this;
                activity = this.a;
                bVar = com.garena.pay.android.b.USER_CANCELLED;
            }
            eVar.n(activity, bVar);
        }

        @Override // com.beetalk.sdk.plugin.e.i.c.a
        public void b(int i2) {
            com.beetalk.sdk.x.a.a("vk share complete", new Object[0]);
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = e.this.d();
            pluginResult.status = 0;
            pluginResult.flag = com.garena.pay.android.b.SUCCESS.c().intValue();
            pluginResult.message = "Success";
            com.beetalk.sdk.plugin.c.k().n(pluginResult, this.a, e.this.d());
        }

        @Override // com.beetalk.sdk.plugin.e.i.c.a
        public void c() {
            com.beetalk.sdk.x.a.a("vk share canceled", new Object[0]);
            e.this.n(this.a, com.garena.pay.android.b.USER_CANCELLED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Activity activity, com.garena.pay.android.b bVar) {
        PluginResult pluginResult = new PluginResult();
        pluginResult.source = d();
        pluginResult.status = -1;
        pluginResult.flag = bVar.c().intValue();
        pluginResult.message = bVar.e();
        com.beetalk.sdk.plugin.c.k().n(pluginResult, activity, d());
    }

    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "vk.share";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beetalk.sdk.plugin.e.i.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(Activity activity, com.beetalk.sdk.b0.b bVar) {
        c cVar = new c();
        cVar.d(bVar.a);
        byte[] bArr = bVar.c;
        if (bArr != null && bArr.length > 0) {
            try {
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                if (bitmapDecodeByteArray != null) {
                    cVar.a(new com.vk.sdk.k.l.b[]{new com.vk.sdk.k.l.b(bitmapDecodeByteArray, com.vk.sdk.k.l.a.e(0.8f))});
                }
            } catch (OutOfMemoryError unused) {
                com.beetalk.sdk.x.a.c("failed to decode bitmap from byte array", new Object[0]);
                n(activity, com.garena.pay.android.b.DECODE_IMAGE_FAILED);
                return;
            }
        }
        if (!TextUtils.isEmpty(bVar.b)) {
            cVar.b("", bVar.b);
        }
        cVar.c(new a(activity));
        com.beetalk.sdk.x.a.a("launching vk share dialog", new Object[0]);
        cVar.e(activity.getFragmentManager(), "VK_SHARE_DIALOG");
    }
}
