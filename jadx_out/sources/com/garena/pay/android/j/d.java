package com.garena.pay.android.j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import i.f;
import i.g;
import i.i;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: Add missing generic type declarations: [TOut] */
    class a<TOut> implements g<Void, TOut> {
        a() {
        }

        @Override // i.g
        public TOut a(i<Void> iVar) throws TimeoutException {
            throw new TimeoutException();
        }
    }

    static {
        new Random();
    }

    public static Map<String, String> a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            map.put(str, obj == null ? "" : obj.toString());
        }
        return map;
    }

    public static String b(Activity activity, int i2) {
        return activity.getResources().getString(i2);
    }

    public static boolean c(Context context) {
        if (context instanceof Activity) {
            return !((Activity) context).isFinishing();
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return !((Activity) baseContext).isFinishing();
            }
        }
        return true;
    }

    public static boolean d(String str) {
        return str == null || str.length() == 0;
    }

    public static <TOut> i<TOut> e(long j2, TimeUnit timeUnit, f fVar) {
        return (i<TOut>) i.o(timeUnit.toMillis(j2), fVar.f()).i(new a());
    }
}
