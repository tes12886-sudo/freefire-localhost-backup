package com.vk.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.FF.voiceengine.FFVoiceConst;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile e f1537i;
    public String a = null;
    public int b = 0;
    public String c = null;
    public String d = null;
    public boolean e = false;
    public long f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f1538g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Boolean> f1539h = null;

    private e() {
    }

    public static e b() {
        if (f1537i == null) {
            synchronized (e.class) {
                if (f1537i == null) {
                    f1537i = k(j.a(), "VK_SDK_ACCESS_TOKEN_PLEASE_DONT_TOUCH");
                }
            }
        }
        return f1537i;
    }

    public static void e(Context context, String str) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    static e f(Context context, e eVar) {
        e eVar2 = f1537i;
        f1537i = eVar;
        if (f1537i != null) {
            f1537i.g();
        } else {
            e(context, "VK_SDK_ACCESS_TOKEN_PLEASE_DONT_TOUCH");
        }
        return eVar2;
    }

    public static e j(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        e eVar = new e();
        try {
            eVar.a = map.get("access_token");
            eVar.c = map.get("user_id");
            eVar.d = map.get("secret");
            eVar.f1538g = map.get("email");
            eVar.e = false;
            if (map.get("expires_in") != null) {
                eVar.b = Integer.parseInt(map.get("expires_in"));
            }
            String str = map.get("scope");
            if (str != null) {
                HashMap map2 = new HashMap();
                for (String str2 : str.split(",")) {
                    map2.put(str2, Boolean.TRUE);
                }
                eVar.f1539h = map2;
            }
            if (map.containsKey("https_required")) {
                eVar.e = map.get("https_required").equals("1");
            } else if (eVar.d == null) {
                eVar.e = true;
            }
            eVar.f = map.containsKey("created") ? Long.parseLong(map.get("created")) : System.currentTimeMillis();
            if (eVar.a != null) {
                return eVar;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static e k(Context context, String str) {
        return l(PreferenceManager.getDefaultSharedPreferences(context).getString(str, null));
    }

    public static e l(String str) {
        if (str == null) {
            return null;
        }
        return j(com.vk.sdk.m.c.a(str));
    }

    public e a(e eVar) {
        Map<String, String> mapM = m();
        mapM.putAll(eVar.m());
        return j(mapM);
    }

    public boolean c(String... strArr) {
        for (String str : strArr) {
            if (this.f1539h.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    public boolean d() {
        int i2 = this.b;
        return i2 > 0 && ((long) (i2 * FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF)) + this.f < System.currentTimeMillis();
    }

    public void g() {
        h(j.a(), "VK_SDK_ACCESS_TOKEN_PLEASE_DONT_TOUCH");
    }

    public void h(Context context, String str) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putString(str, i());
        editorEdit.apply();
    }

    protected String i() {
        return com.vk.sdk.m.b.b(m());
    }

    protected Map<String, String> m() {
        HashMap map = new HashMap();
        map.put("access_token", this.a);
        map.put("expires_in", "" + this.b);
        map.put("user_id", this.c);
        map.put("created", "" + this.f);
        Map<String, Boolean> map2 = this.f1539h;
        if (map2 != null) {
            map.put("scope", TextUtils.join(",", map2.keySet()));
        }
        String str = this.d;
        if (str != null) {
            map.put("secret", str);
        }
        if (this.e) {
            map.put("https_required", "1");
        }
        String str2 = this.f1538g;
        if (str2 != null) {
            map.put("email", str2);
        }
        return map;
    }
}
