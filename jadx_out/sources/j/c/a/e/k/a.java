package j.c.a.e.k;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import n.e;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static void a(Context context, Integer num, e eVar) {
        String strA = j.c.a.e.d.a.a(num.intValue(), context);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.garena.android.gpns.NOTIFICATION_RECEIVE");
        intent.addCategory(strA);
        Bundle bundle = new Bundle();
        bundle.putString("DATA", new String(eVar.w()));
        intent.putExtras(bundle);
        context.sendBroadcast(intent);
    }
}
