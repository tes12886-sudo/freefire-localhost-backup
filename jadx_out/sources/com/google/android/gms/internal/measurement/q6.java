package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q6 implements a6 {
    private static final Map<String, q6> c = new h.f.a();
    private final SharedPreferences a;
    private final SharedPreferences.OnSharedPreferenceChangeListener b;

    static q6 b(Context context, String str) {
        q6 q6Var;
        if (r5.a()) {
            throw null;
        }
        synchronized (q6.class) {
            q6Var = c.get(null);
            if (q6Var == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th;
                }
            }
        }
        return q6Var;
    }

    static synchronized void c() {
        Map<String, q6> map = c;
        Iterator<q6> it = map.values().iterator();
        if (it.hasNext()) {
            q6 next = it.next();
            SharedPreferences sharedPreferences = next.a;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = next.b;
            throw null;
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object a(String str) {
        throw null;
    }
}
