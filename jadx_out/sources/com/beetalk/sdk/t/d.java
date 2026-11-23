package com.beetalk.sdk.t;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.billingclient.api.Purchase;
import com.beetalk.sdk.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class d {
    private static volatile d d;
    private SharedPreferences a;
    private long b;
    private Set<String> c;

    private d(Context context) {
        this.a = context.getSharedPreferences("com.garena.android.msdk.PayCachePreference", 0);
    }

    public static void a(Context context, Purchase purchase) {
        if (purchase == null) {
            return;
        }
        ArrayList<String> arrayListH = purchase.h();
        if ("9999".equals(arrayListH.get(0)) || "android.test.purchased".equals(arrayListH.get(0))) {
            return;
        }
        if (b(context)) {
            i(context);
        }
        String strE = purchase.e();
        Set<String> setC = c(context);
        if (setC.contains(strE)) {
            return;
        }
        setC.add(strE);
        g(context, setC);
    }

    private static boolean b(Context context) {
        if (!f(context)) {
            return false;
        }
        d(context).b = 0L;
        d(context).c = null;
        SharedPreferences.Editor editorEdit = d(context).a.edit();
        editorEdit.clear();
        editorEdit.apply();
        return true;
    }

    private static Set<String> c(Context context) {
        if (d(context).c != null && !d(context).c.isEmpty()) {
            return d(context).c;
        }
        JSONArray jSONArray = null;
        try {
            jSONArray = new JSONArray(d(context).a.getString("COMMIT_CACHE", "[]"));
        } catch (JSONException e) {
            com.beetalk.sdk.x.a.b(e);
        }
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                hashSet.add(jSONArray.optString(i2));
            }
        }
        d(context).c = hashSet;
        return hashSet;
    }

    public static d d(Context context) {
        if (d == null) {
            synchronized (d.class) {
                if (d == null) {
                    d = new d(context);
                }
            }
        }
        return d;
    }

    public static boolean e(Context context, Purchase purchase) {
        if (purchase == null || b(context)) {
            return false;
        }
        return c(context).contains(purchase.e());
    }

    private static boolean f(Context context) {
        return System.currentTimeMillis() - h(context) > p.o();
    }

    private static void g(Context context, Set<String> set) {
        SharedPreferences.Editor editorEdit = d(context).a.edit();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        editorEdit.putString("COMMIT_CACHE", jSONArray.toString());
        editorEdit.apply();
        d(context).c = set;
    }

    private static long h(Context context) {
        long j2 = d(context).b;
        if (j2 > 0) {
            return j2;
        }
        d(context).b = d(context).a.getLong("TIME_CREATED", 0L);
        return d(context).b;
    }

    private static void i(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = d(context).a.edit();
        editorEdit.putLong("TIME_CREATED", jCurrentTimeMillis);
        editorEdit.apply();
        d(context).b = jCurrentTimeMillis;
    }
}
