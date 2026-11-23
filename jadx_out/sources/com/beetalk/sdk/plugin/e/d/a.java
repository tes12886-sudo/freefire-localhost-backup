package com.beetalk.sdk.plugin.e.d;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.beetalk.sdk.g;
import com.beetalk.sdk.h;
import com.beetalk.sdk.i;
import com.beetalk.sdk.p;
import com.beetalk.sdk.x.d;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.beetalk.sdk.plugin.e.a {
    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "gas.share.photo";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return p.d.f521l;
    }

    @Override // com.beetalk.sdk.plugin.e.a
    protected String k() {
        return "com.garena.gas.intent.GAME_SHARE";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beetalk.sdk.plugin.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void b(Activity activity, h hVar) {
        if (hVar == null) {
            g(activity, com.garena.pay.android.b.ERROR_IN_PARAMS.c().intValue());
            return;
        }
        if (!i.e(activity, 1)) {
            g(activity, com.garena.pay.android.b.APP_NOT_INSTALLED.c().intValue());
            return;
        }
        if (!d.r(activity)) {
            g(activity, com.garena.pay.android.b.UNSUPPORTED_API.c().intValue());
            return;
        }
        if (d.q(activity)) {
            String strA = hVar.a();
            if (!TextUtils.isEmpty(strA)) {
                File file = new File(strA);
                if (!file.exists()) {
                    com.beetalk.sdk.x.a.i("File doesn't exist:" + strA, new Object[0]);
                    h(activity, com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue(), "File doesn't exist");
                    return;
                }
                Uri uriA = null;
                try {
                    uriA = com.beetalk.sdk.x.c.a(activity, file);
                } catch (Exception e) {
                    com.beetalk.sdk.x.a.b(e);
                }
                if (uriA == null) {
                    g(activity, com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue());
                    return;
                }
                Intent intent = new Intent();
                intent.setClassName(d.p("com.garena.gas", activity) ? "com.garena.gas" : "com.garena.gaslite", "com.garena.gameauth.GPProxyCommonActivity");
                intent.setAction("com.garena.gas.intent.GAME_SHARE");
                intent.setData(uriA);
                intent.addFlags(1);
                intent.putExtra("com.garena.msdk.share.MediaTagName", hVar.d());
                intent.putExtra("com.garena.msdk.share.ItemType", 1);
                intent.putExtra("com.garena.msdk.share.OpenId", g.y().C());
                intent.putExtra("com.garena.msdk.share.ShareTo", hVar.f());
                intent.putExtra("com.garena.msdk.share.MessageExt", hVar.e());
                intent.putExtra("com.garena.msdk.share.ImgDataLength", (int) file.length());
                intent.putExtra("com.garena.msdk.share.GameId", hVar.b());
                intent.putExtra("com.garena.msdk.share.AutoAuth", false);
                intent.putExtra("com.garena.msdk.share.SDKVer", i.b());
                intent.putExtra("com.garena.msdk.share.SDKEnv", p.p().toString());
                activity.startActivityForResult(intent, e().intValue());
                return;
            }
        }
        super.i(activity, hVar);
    }
}
