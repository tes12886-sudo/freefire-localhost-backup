package com.beetalk.sdk.w;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.login.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static ArrayList<Runnable> a;

    static {
        new Handler(Looper.getMainLooper());
        a = new ArrayList<>();
    }

    public static void a(Context context) {
        p.e().k();
        ArrayList<Runnable> arrayList = a;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}
