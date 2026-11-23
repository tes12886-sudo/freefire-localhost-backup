package com.beetalk.sdk.plugin.e.d;

import android.app.Activity;
import android.content.Intent;
import com.beetalk.sdk.g;
import com.beetalk.sdk.i;
import com.beetalk.sdk.j;
import com.beetalk.sdk.p;
import com.beetalk.sdk.plugin.PluginResult;
import com.beetalk.sdk.x.d;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.beetalk.sdk.plugin.a<j, PluginResult> {
    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "gas.share.text";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return p.d.f520k;
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean f(Activity activity, int i2, Intent intent) {
        h(activity, (i2 == -1 ? com.garena.pay.android.b.SUCCESS : com.garena.pay.android.b.UNKNOWN_ERROR).c().intValue(), "");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beetalk.sdk.plugin.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void b(Activity activity, j jVar) {
        com.garena.pay.android.b bVar;
        if (jVar == null) {
            bVar = com.garena.pay.android.b.ERROR_IN_PARAMS;
        } else {
            if (i.e(activity, 1)) {
                if (!d.r(activity)) {
                    g(activity, com.garena.pay.android.b.UNSUPPORTED_API.c().intValue());
                    return;
                }
                Intent intent = new Intent();
                intent.setClassName(d.p("com.garena.gas", activity) ? "com.garena.gas" : "com.garena.gaslite", "com.garena.gameauth.GPProxyCommonActivity");
                intent.setAction("com.garena.gas.intent.GAME_SHARE");
                intent.putExtra("com.garena.msdk.share.MediaTagName", jVar.c());
                intent.putExtra("com.garena.msdk.share.Title", jVar.g());
                intent.putExtra("com.garena.msdk.share.Url", "");
                intent.putExtra("com.garena.msdk.share.OpenId", g.y().C());
                intent.putExtra("com.garena.msdk.share.Description", jVar.a());
                intent.putExtra("com.garena.msdk.share.ItemType", 0);
                intent.putExtra("com.garena.msdk.share.ShareTo", jVar.d());
                intent.putExtra("com.garena.msdk.share.ImgData", jVar.f());
                intent.putExtra("com.garena.msdk.share.ImgDataLength", jVar.e());
                intent.putExtra("com.garena.msdk.share.GameId", jVar.b());
                intent.putExtra("com.garena.msdk.share.AutoAuth", false);
                intent.putExtra("com.garena.msdk.share.SDKVer", i.b());
                intent.putExtra("com.garena.msdk.share.SDKEnv", p.p().toString());
                activity.startActivityForResult(intent, e().intValue());
                return;
            }
            bVar = com.garena.pay.android.b.APP_NOT_INSTALLED;
        }
        g(activity, bVar.c().intValue());
    }
}
