package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    private static final AtomicBoolean a;
    private static final ConcurrentLinkedQueue<a> b;
    private static final Map<String, JSONObject> c;
    private static Long d;
    private static com.facebook.internal.l0.b e;
    public static final s f = new s();

    public interface a {
        void a();
    }

    static final class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;

        b(String str, Context context, String str2) {
            this.a = str;
            this.b = context;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                s sVar = s.f;
                JSONObject jSONObjectE = sVar.e(this.a);
                if (jSONObjectE.length() != 0) {
                    s.k(this.a, jSONObjectE);
                    this.b.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(this.c, jSONObjectE.toString()).apply();
                    s.d = Long.valueOf(System.currentTimeMillis());
                }
                sVar.l();
                s.b(sVar).set(false);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static final class c implements Runnable {
        final /* synthetic */ a a;

        c(a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                this.a.a();
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static {
        l.y.c.m.a(s.class).a();
        a = new AtomicBoolean(false);
        b = new ConcurrentLinkedQueue<>();
        c = new ConcurrentHashMap();
    }

    private s() {
    }

    public static final /* synthetic */ AtomicBoolean b(s sVar) {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject e(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", com.facebook.r.u());
        bundle.putString("fields", "gatekeepers");
        com.facebook.u.c cVar = com.facebook.u.t;
        l.y.c.o oVar = l.y.c.o.a;
        String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{str, "mobile_sdk_gk"}, 2));
        l.y.c.i.d(str2, "java.lang.String.format(format, *args)");
        com.facebook.u uVarV = cVar.v(null, str2, null);
        uVarV.H(true);
        uVarV.G(bundle);
        JSONObject jSONObjectD = uVarV.i().d();
        return jSONObjectD != null ? jSONObjectD : new JSONObject();
    }

    public static final boolean f(String str, String str2, boolean z) {
        Boolean bool;
        l.y.c.i.e(str, "name");
        Map<String, Boolean> mapG = f.g(str2);
        return (mapG.containsKey(str) && (bool = mapG.get(str)) != null) ? bool.booleanValue() : z;
    }

    private final boolean h(Long l2) {
        return l2 != null && System.currentTimeMillis() - l2.longValue() < 3600000;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0042 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0018, B:10:0x0020, B:13:0x0025, B:17:0x0044, B:19:0x0055, B:24:0x0064, B:25:0x0067, B:27:0x006d, B:31:0x0077, B:22:0x005d), top: B:39:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0064 A[Catch: all -> 0x0083, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0018, B:10:0x0020, B:13:0x0025, B:17:0x0044, B:19:0x0055, B:24:0x0064, B:25:0x0067, B:27:0x006d, B:31:0x0077, B:22:0x005d), top: B:39:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006d A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0018, B:10:0x0020, B:13:0x0025, B:17:0x0044, B:19:0x0055, B:24:0x0064, B:25:0x0067, B:27:0x006d, B:31:0x0077, B:22:0x005d), top: B:39:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0075 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0018, B:10:0x0020, B:13:0x0025, B:17:0x0044, B:19:0x0055, B:24:0x0064, B:25:0x0067, B:27:0x006d, B:31:0x0077, B:22:0x005d), top: B:39:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:40:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x0042, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x0075, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0081, please report this as an issue */
    public static final synchronized void j(a aVar) {
        String strG;
        s sVar;
        Context contextF;
        String str;
        JSONObject jSONObject;
        String string;
        Executor executorN;
        if (aVar == null) {
            strG = com.facebook.r.g();
            sVar = f;
            if (!sVar.h(d)) {
            }
            contextF = com.facebook.r.f();
            l.y.c.o oVar = l.y.c.o.a;
            str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strG}, 1));
            l.y.c.i.d(str, "java.lang.String.format(format, *args)");
            if (contextF == null) {
                return;
            }
            jSONObject = null;
            string = contextF.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
            if (!h0.Y(string)) {
                jSONObject = new JSONObject(string);
                if (jSONObject != null) {
                    k(strG, jSONObject);
                }
            }
            executorN = com.facebook.r.n();
            if (executorN != null) {
                if (a.compareAndSet(false, true)) {
                    executorN.execute(new b(strG, contextF, str));
                    return;
                }
                return;
            }
            return;
        }
        b.add(aVar);
        strG = com.facebook.r.g();
        sVar = f;
        if (!sVar.h(d) && c.containsKey(strG)) {
            sVar.l();
            return;
        }
        contextF = com.facebook.r.f();
        l.y.c.o oVar2 = l.y.c.o.a;
        str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strG}, 1));
        l.y.c.i.d(str, "java.lang.String.format(format, *args)");
        if (contextF == null) {
            return;
        }
        jSONObject = null;
        string = contextF.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
        if (!h0.Y(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e2) {
                h0.e0("FacebookSDK", e2);
            }
            if (jSONObject != null) {
                k(strG, jSONObject);
            }
        }
        executorN = com.facebook.r.n();
        if (executorN != null) {
            if (a.compareAndSet(false, true)) {
                return;
            }
            executorN.execute(new b(strG, contextF, str));
            return;
        }
        return;
        throw th;
    }

    public static final synchronized JSONObject k(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray jSONArrayOptJSONArray;
        l.y.c.i.e(str, "applicationId");
        jSONObject2 = c.get(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) == null || (jSONObject3 = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
            jSONObject3 = new JSONObject();
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
        if (jSONArrayOptJSONArray2 == null) {
            jSONArrayOptJSONArray2 = new JSONArray();
        }
        int length = jSONArrayOptJSONArray2.length();
        for (int i2 = 0; i2 < length; i2++) {
            try {
                JSONObject jSONObject4 = jSONArrayOptJSONArray2.getJSONObject(i2);
                jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
            } catch (JSONException e2) {
                h0.e0("FacebookSDK", e2);
            }
        }
        c.put(str, jSONObject2);
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = b;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            a aVarPoll = concurrentLinkedQueue.poll();
            if (aVarPoll != null) {
                handler.post(new c(aVarPoll));
            }
        }
    }

    public static final JSONObject m(String str, boolean z) {
        l.y.c.i.e(str, "applicationId");
        if (!z) {
            Map<String, JSONObject> map = c;
            if (map.containsKey(str)) {
                JSONObject jSONObject = map.get(str);
                return jSONObject != null ? jSONObject : new JSONObject();
            }
        }
        JSONObject jSONObjectE = f.e(str);
        Context contextF = com.facebook.r.f();
        l.y.c.o oVar = l.y.c.o.a;
        String str2 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str}, 1));
        l.y.c.i.d(str2, "java.lang.String.format(format, *args)");
        contextF.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, jSONObjectE.toString()).apply();
        return k(str, jSONObjectE);
    }

    public final Map<String, Boolean> g(String str) {
        i();
        if (str != null) {
            Map<String, JSONObject> map = c;
            if (map.containsKey(str)) {
                com.facebook.internal.l0.b bVar = e;
                List<com.facebook.internal.l0.a> listA = bVar != null ? bVar.a(str) : null;
                if (listA != null) {
                    HashMap map2 = new HashMap();
                    for (com.facebook.internal.l0.a aVar : listA) {
                        map2.put(aVar.a(), Boolean.valueOf(aVar.b()));
                    }
                    return map2;
                }
                HashMap map3 = new HashMap();
                JSONObject jSONObject = map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    l.y.c.i.d(next, "key");
                    map3.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                com.facebook.internal.l0.b bVar2 = e;
                if (bVar2 == null) {
                    bVar2 = new com.facebook.internal.l0.b();
                }
                ArrayList arrayList = new ArrayList(map3.size());
                for (Map.Entry entry : map3.entrySet()) {
                    arrayList.add(new com.facebook.internal.l0.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                bVar2.b(str, arrayList);
                e = bVar2;
                return map3;
            }
        }
        return new HashMap();
    }

    public final void i() {
        j(null);
    }
}
