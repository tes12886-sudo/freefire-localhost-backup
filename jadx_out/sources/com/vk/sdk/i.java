package com.vk.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.FF.voiceengine.FFVoiceConst;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class i {
    private static String e;
    private static volatile d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ArrayList<String> f1540g;
    private static Handler a = new Handler(Looper.getMainLooper());
    private static int b = 0;
    private static i c = null;
    private static boolean d = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List<f> f1541h = new CopyOnWriteArrayList();

    class a implements Runnable {
        final /* synthetic */ e a;
        final /* synthetic */ e b;

        a(e eVar, e eVar2) {
            this.a = eVar;
            this.b = eVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = i.f1541h.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(this.a, this.b);
            }
        }
    }

    class b extends com.vk.sdk.k.f.d {
        final /* synthetic */ Context a;
        final /* synthetic */ g b;
        final /* synthetic */ Context c;

        b(Context context, g gVar, Context context2) {
            this.a = context;
            this.b = gVar;
            this.c = context2;
        }

        @Override // com.vk.sdk.k.f.d
        public void b(com.vk.sdk.k.g gVar) {
            i.z(this.a, this.b);
        }

        @Override // com.vk.sdk.k.f.d
        public void c(com.vk.sdk.k.c cVar) {
            com.vk.sdk.k.c cVar2;
            if (cVar != null && (cVar2 = cVar.c) != null && cVar2.e == 5) {
                i.r(this.c);
            }
            i.z(this.a, this.b);
        }
    }

    private static class c {
        public e a;
        public e b;
        public com.vk.sdk.k.c c;

        public c(e eVar) {
            this.a = eVar;
        }

        public c(e eVar, e eVar2) {
            this.a = eVar2;
            this.b = eVar;
        }

        public c(com.vk.sdk.k.c cVar) {
            this.c = cVar;
        }
    }

    public enum d {
        Unknown,
        LoggedOut,
        Pending,
        LoggedIn
    }

    private i(Context context) {
    }

    public static boolean A(Context context) {
        return B(context, null);
    }

    public static boolean B(Context context, g<d> gVar) {
        Context applicationContext = context.getApplicationContext();
        j.c(applicationContext);
        e eVarB = e.b();
        if (eVarB == null || eVarB.a == null || eVarB.d()) {
            z(context, gVar);
            return false;
        }
        f(d.Pending, gVar);
        x(new b(context, gVar, applicationContext));
        return true;
    }

    private static c d(Context context, Map<String, String> map) {
        ArrayList<String> arrayList;
        if (map != null && (arrayList = f1540g) != null) {
            map.put("scope", TextUtils.join(",", arrayList));
        }
        e eVarJ = e.j(map);
        if (eVarJ != null && eVarJ.a != null) {
            e eVarB = e.b();
            if (eVarB == null) {
                e.f(context, eVarJ);
                q(eVarB, eVarJ);
                return new c(eVarJ);
            }
            e eVarA = eVarB.a(eVarJ);
            e.f(context, eVarB.a(eVarJ));
            q(eVarB, eVarA);
            return new c(eVarB, eVarJ);
        }
        if (map != null && map.containsKey("success")) {
            e eVarB2 = e.b();
            if (eVarJ == null) {
                eVarJ = e.b();
            }
            return new c(eVarB2, eVarJ);
        }
        com.vk.sdk.k.c cVar = new com.vk.sdk.k.c(map);
        if (cVar.f != null || cVar.f1542g != null) {
            cVar = new com.vk.sdk.k.c(FFVoiceConst.FFVoiceErrorCode.FFVoice_ERROR_STOP_FAILED);
        }
        return new c(cVar);
    }

    public static i e(Context context, int i2, String str) {
        if (i2 == 0) {
            i2 = i(context, "VK_SDK_APP_ID_PLEASE_DONT_TOUCH");
        }
        if (TextUtils.isEmpty(str)) {
            str = j(context, "VK_SDK_APP_VERSION_PLEASE_DONT_TOUCH", "5.21");
        }
        if (i2 == 0) {
            throw new RuntimeException("your_app_id is 0");
        }
        d = true;
        i iVarL = l(context, i2, str);
        int i3 = b;
        if (i3 != 0) {
            v(context, "VK_SDK_APP_ID_PLEASE_DONT_TOUCH", i3);
        }
        String str2 = e;
        if (str2 != null) {
            w(context, "VK_SDK_APP_VERSION_PLEASE_DONT_TOUCH", str2);
        }
        return iVarL;
    }

    private static void f(d dVar, g<d> gVar) {
        f = dVar;
        if (gVar != null) {
            gVar.b(f);
        }
    }

    public static e g() {
        return e.b();
    }

    public static String h() {
        return e;
    }

    private static int i(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(str, 0);
    }

    private static String j(Context context, String str, String str2) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
    }

    static int k() {
        return b;
    }

    private static synchronized i l(Context context, int i2, String str) {
        if (b == 0) {
            c = new i(context);
            b = i2;
            if (TextUtils.isEmpty(str)) {
                str = "5.21";
            }
            e = str;
            f = d.Unknown;
            A(context);
        }
        return c;
    }

    public static boolean m() {
        return d;
    }

    public static void n(Activity activity, String... strArr) {
        ArrayList<String> arrayListT = t(strArr);
        f1540g = arrayListT;
        VKServiceActivity.h(activity, arrayListT);
    }

    @SuppressLint({"NewApi"})
    public static void o() {
        Context contextA = j.a();
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.createInstance(contextA);
            CookieManager.getInstance().removeAllCookie();
        } else {
            CookieManager.getInstance().removeAllCookies(null);
        }
        e.f(j.a(), null);
        y(contextA);
    }

    public static void p(com.vk.sdk.k.c cVar) {
        if (cVar.e == 5) {
            r(j.a());
        }
    }

    static void q(e eVar, e eVar2) {
        a.post(new a(eVar, eVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(Context context) {
        e eVarF = e.f(context, null);
        if (eVarF != null) {
            q(eVarF, null);
        }
    }

    public static boolean s(int i2, int i3, Intent intent, g<e> gVar) {
        if (i2 != VKServiceActivity.c.Authorization.a()) {
            return false;
        }
        if (i3 == -1) {
            gVar.b(e.b());
            return true;
        }
        if (i3 != 0) {
            return true;
        }
        gVar.a((com.vk.sdk.k.c) h.a(intent != null ? intent.getLongExtra("vk_extra_error_id", 0L) : 0L));
        return true;
    }

    private static ArrayList<String> t(String... strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strArr));
        if (!arrayList.contains("offline")) {
            arrayList.add("offline");
        }
        return arrayList;
    }

    static boolean u(Context context, int i2, Intent intent, g<e> gVar) {
        Map map;
        if (i2 != -1 || intent == null) {
            if (gVar != null) {
                gVar.a(new com.vk.sdk.k.c(FFVoiceConst.FFVoiceErrorCode.FFVoice_ERROR_STOP_FAILED));
            }
            y(context);
            return false;
        }
        if (intent.hasExtra("extra-token-data")) {
            map = com.vk.sdk.m.c.a(intent.getStringExtra("extra-token-data"));
        } else if (intent.getExtras() != null) {
            map = new HashMap();
            for (String str : intent.getExtras().keySet()) {
                map.put(str, String.valueOf(intent.getExtras().get(str)));
            }
        } else {
            map = null;
        }
        c cVarD = d(context, map);
        com.vk.sdk.k.c cVar = cVarD.c;
        if (cVar != null && gVar != null) {
            gVar.a(cVar);
        } else if (cVarD.a != null) {
            if (cVarD.b != null) {
                com.vk.sdk.k.f fVarV = com.vk.sdk.k.f.v(intent.getLongExtra("extra-validation-request", 0L));
                if (fVarV != null) {
                    fVarV.c();
                    fVarV.z();
                }
            } else {
                x(null);
            }
            if (gVar != null) {
                gVar.b(cVarD.a);
            }
        }
        f1540g = null;
        y(context);
        return true;
    }

    private static void v(Context context, String str, int i2) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putInt(str, i2);
        editorEdit.apply();
    }

    private static void w(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    private static void x(com.vk.sdk.k.f.d dVar) {
        com.vk.sdk.k.f fVar = new com.vk.sdk.k.f("stats.trackVisitor");
        fVar.q = 0;
        fVar.n(dVar);
    }

    private static void y(Context context) {
        z(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(Context context, g<d> gVar) {
        j.c(context);
        f(e.b() != null ? d.LoggedIn : d.LoggedOut, gVar);
    }
}
