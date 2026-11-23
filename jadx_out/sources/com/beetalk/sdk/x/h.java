package com.beetalk.sdk.x;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class h {
    private static volatile h b;
    private HashMap<String, String> a;

    private String a(Context context) {
        if (context == null) {
            return "";
        }
        String[] strArrSplit = TimeZone.getDefault().getID().toLowerCase().split("/");
        return strArrSplit.length == 2 ? d(context).get(strArrSplit[1]) : "";
    }

    public static h b() {
        if (b == null) {
            synchronized (h.class) {
                if (b == null) {
                    b = new h();
                }
            }
        }
        return b;
    }

    private HashMap<String, String> d(Context context) {
        if (this.a == null) {
            String[] stringArray = context.getResources().getStringArray(j.c.b.a.a);
            this.a = new HashMap<>();
            for (String str : stringArray) {
                String[] strArrSplit = str.split(":");
                this.a.put(strArrSplit[0], strArrSplit[1]);
            }
        }
        return this.a;
    }

    public String c(Context context) {
        if (context == null) {
            return "";
        }
        String strG = g.g(context);
        return !TextUtils.isEmpty(strG) ? strG : a(context);
    }
}
