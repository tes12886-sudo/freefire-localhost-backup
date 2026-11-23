package com.beetalk.sdk.plugin.e.e;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import com.beetalk.sdk.plugin.PluginResult;
import com.beetalk.sdk.x.c;
import com.garena.pay.android.b;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.beetalk.sdk.plugin.a<com.beetalk.sdk.y.a, PluginResult> {
    @Override // com.beetalk.sdk.plugin.a
    public boolean a() {
        return false;
    }

    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "line.share";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return null;
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean f(Activity activity, int i2, Intent intent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beetalk.sdk.plugin.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void b(Activity activity, com.beetalk.sdk.y.a aVar) {
        if (aVar == null) {
            g(activity, b.ERROR_IN_PARAMS.c().intValue());
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setPackage("jp.naver.line.android");
        com.beetalk.sdk.y.a.EnumC0048a enumC0048a = aVar.a;
        if (enumC0048a == com.beetalk.sdk.y.a.EnumC0048a.TEXT_LINK) {
            intent.setType("text/plain");
            String str = "";
            if (!TextUtils.isEmpty(aVar.b)) {
                str = "" + aVar.b;
            }
            if (!TextUtils.isEmpty(aVar.c)) {
                str = str + "\n" + aVar.c;
            }
            intent.putExtra("android.intent.extra.TEXT", str);
        } else if (enumC0048a == com.beetalk.sdk.y.a.EnumC0048a.IMAGE) {
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", c.a(activity, new File(aVar.d)));
        }
        try {
            activity.startActivity(intent);
            g(activity, b.SUCCESS.c().intValue());
        } catch (ActivityNotFoundException e) {
            com.beetalk.sdk.x.a.b(e);
            com.beetalk.sdk.x.a.a("line not installed", new Object[0]);
            g(activity, b.APP_NOT_INSTALLED.c().intValue());
        }
    }
}
