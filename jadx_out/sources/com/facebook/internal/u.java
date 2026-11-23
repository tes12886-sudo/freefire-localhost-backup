package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    private static final String a;
    private static final List<String> b;
    private static final Map<String, t> c;
    private static final AtomicReference<a> d;
    private static final ConcurrentLinkedQueue<b> e;
    private static boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static JSONArray f638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u f639h = new u();

    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    public interface b {
        void a();

        void b(t tVar);
    }

    static final class c implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        c(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject jSONObject;
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.a.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                t tVarL = null;
                String string = sharedPreferences.getString(this.b, null);
                if (!h0.Y(string)) {
                    if (string == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException e) {
                        h0.e0("FacebookSDK", e);
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        tVarL = u.f639h.l(this.c, jSONObject);
                    }
                }
                u uVar = u.f639h;
                JSONObject jSONObjectI = uVar.i(this.c);
                if (jSONObjectI != null) {
                    uVar.l(this.c, jSONObjectI);
                    sharedPreferences.edit().putString(this.b, jSONObjectI.toString()).apply();
                }
                if (tVarL != null) {
                    String strI = tVarL.i();
                    if (!u.d(uVar) && strI != null && strI.length() > 0) {
                        u.f = true;
                        Log.w(u.e(uVar), strI);
                    }
                }
                s.m(this.c, true);
                com.facebook.j0.v.d.d();
                u.c(uVar).set(u.b(uVar).containsKey(this.c) ? a.SUCCESS : a.ERROR);
                uVar.n();
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static final class d implements Runnable {
        final /* synthetic */ b a;

        d(b bVar) {
            this.a = bVar;
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

    static final class e implements Runnable {
        final /* synthetic */ b a;
        final /* synthetic */ t b;

        e(b bVar, t tVar) {
            this.a = bVar;
            this.b = tVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                this.a.b(this.b);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static {
        String simpleName = u.class.getSimpleName();
        l.y.c.i.d(simpleName, "FetchedAppSettingsManager::class.java.simpleName");
        a = simpleName;
        b = l.t.m.i("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");
        c = new ConcurrentHashMap();
        d = new AtomicReference<>(a.NOT_LOADED);
        e = new ConcurrentLinkedQueue<>();
    }

    private u() {
    }

    public static final /* synthetic */ Map b(u uVar) {
        return c;
    }

    public static final /* synthetic */ AtomicReference c(u uVar) {
        return d;
    }

    public static final /* synthetic */ boolean d(u uVar) {
        return f;
    }

    public static final /* synthetic */ String e(u uVar) {
        return a;
    }

    public static final void h(b bVar) {
        l.y.c.i.e(bVar, "callback");
        e.add(bVar);
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject i(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        com.facebook.u uVarV = com.facebook.u.t.v(null, str, null);
        uVarV.D(true);
        uVarV.H(true);
        uVarV.G(bundle);
        JSONObject jSONObjectD = uVarV.i().d();
        return jSONObjectD != null ? jSONObjectD : new JSONObject();
    }

    public static final t j(String str) {
        if (str != null) {
            return c.get(str);
        }
        return null;
    }

    public static final void k() {
        Context contextF = com.facebook.r.f();
        String strG = com.facebook.r.g();
        if (h0.Y(strG)) {
            d.set(a.ERROR);
            f639h.n();
            return;
        }
        if (c.containsKey(strG)) {
            d.set(a.SUCCESS);
            f639h.n();
            return;
        }
        AtomicReference<a> atomicReference = d;
        a aVar = a.NOT_LOADED;
        a aVar2 = a.LOADING;
        if (!(atomicReference.compareAndSet(aVar, aVar2) || atomicReference.compareAndSet(a.ERROR, aVar2))) {
            f639h.n();
            return;
        }
        l.y.c.o oVar = l.y.c.o.a;
        String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strG}, 1));
        l.y.c.i.d(str, "java.lang.String.format(format, *args)");
        com.facebook.r.n().execute(new c(contextF, str, strG));
    }

    private final Map<String, Map<String, t.b>> m(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        HashMap map = new HashMap();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                t.b.a aVar = t.b.d;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                l.y.c.i.d(jSONObjectOptJSONObject, "dialogConfigData.optJSONObject(i)");
                t.b bVarA = aVar.a(jSONObjectOptJSONObject);
                if (bVarA != null) {
                    String strA = bVarA.a();
                    Map map2 = (Map) map.get(strA);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(strA, map2);
                    }
                    map2.put(bVarA.b(), bVarA);
                }
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void n() {
        a aVar = d.get();
        if (a.NOT_LOADED != aVar && a.LOADING != aVar) {
            t tVar = c.get(com.facebook.r.g());
            Handler handler = new Handler(Looper.getMainLooper());
            if (a.ERROR == aVar) {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue = e;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    } else {
                        handler.post(new d(concurrentLinkedQueue.poll()));
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue2 = e;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    } else {
                        handler.post(new e(concurrentLinkedQueue2.poll(), tVar));
                    }
                }
            }
        }
    }

    public static final t o(String str, boolean z) {
        l.y.c.i.e(str, "applicationId");
        if (!z) {
            Map<String, t> map = c;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        u uVar = f639h;
        JSONObject jSONObjectI = uVar.i(str);
        if (jSONObjectI == null) {
            return null;
        }
        t tVarL = uVar.l(str, jSONObjectI);
        if (l.y.c.i.a(str, com.facebook.r.g())) {
            d.set(a.SUCCESS);
            uVar.n();
        }
        return tVarL;
    }

    public final t l(String str, JSONObject jSONObject) {
        l.y.c.i.e(str, "applicationId");
        l.y.c.i.e(jSONObject, "settingsJSON");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("android_sdk_error_categories");
        l.a aVar = l.f617h;
        l lVarA = aVar.a(jSONArrayOptJSONArray);
        if (lVarA == null) {
            lVarA = aVar.b();
        }
        l lVar = lVarA;
        int iOptInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z = (iOptInt & 8) != 0;
        boolean z2 = (iOptInt & 16) != 0;
        boolean z3 = (iOptInt & 32) != 0;
        boolean z4 = (iOptInt & 256) != 0;
        boolean z5 = (iOptInt & 16384) != 0;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("auto_event_mapping_android");
        f638g = jSONArrayOptJSONArray2;
        if (jSONArrayOptJSONArray2 != null && y.b()) {
            com.facebook.j0.r.g.e.c(jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.toString() : null);
        }
        boolean zOptBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString = jSONObject.optString("gdpv4_nux_content", "");
        l.y.c.i.d(strOptString, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        boolean zOptBoolean2 = jSONObject.optBoolean("gdpv4_nux_enabled", false);
        int iOptInt2 = jSONObject.optInt("app_events_session_timeout", com.facebook.j0.v.e.a());
        EnumSet<g0> enumSetA = g0.f.a(jSONObject.optLong("seamless_login"));
        Map<String, Map<String, t.b>> mapM = m(jSONObject.optJSONObject("android_dialog_configs"));
        String strOptString2 = jSONObject.optString("smart_login_bookmark_icon_url");
        l.y.c.i.d(strOptString2, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String strOptString3 = jSONObject.optString("smart_login_menu_icon_url");
        l.y.c.i.d(strOptString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String strOptString4 = jSONObject.optString("sdk_update_message");
        l.y.c.i.d(strOptString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        t tVar = new t(zOptBoolean, strOptString, zOptBoolean2, iOptInt2, enumSetA, mapM, z, lVar, strOptString2, strOptString3, z2, z3, jSONArrayOptJSONArray2, strOptString4, z4, z5, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"));
        c.put(str, tVar);
        return tVar;
    }
}
