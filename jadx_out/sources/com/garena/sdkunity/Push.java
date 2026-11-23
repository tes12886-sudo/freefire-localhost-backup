package com.garena.sdkunity;

import android.app.Activity;
import com.beetalk.sdk.g;
import com.beetalk.sdk.i;
import com.beetalk.sdk.q;
import j.c.a.a;
import j.c.a.f.b;

/* JADX INFO: loaded from: classes.dex */
public class Push extends a {
    @Override // j.c.a.a
    protected String getPushAppKey() {
        return SdkUnity.pushAppKey;
    }

    public void registerPush(Activity activity) {
        b bVar = new b();
        bVar.c(Integer.valueOf(SdkUnity.appId));
        bVar.d(SdkUnity.pushAppKey);
        g gVarY = g.y();
        if (gVarY != null && gVarY.G() == q.TOKEN_AVAILABLE) {
            bVar.b(gVarY.C());
            bVar.e("gender:male");
        }
        i.g(activity, bVar.a());
    }
}
