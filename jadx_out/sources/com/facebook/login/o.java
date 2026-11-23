package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class o {
    private static final ScheduledExecutorService d = Executors.newSingleThreadScheduledExecutor();
    private final com.facebook.j0.m a;
    private String b;
    private String c;

    class a implements Runnable {
        final /* synthetic */ Bundle a;

        a(Bundle bundle) {
            this.a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                o.a(o.this).g("fb_mobile_login_heartbeat", this.a);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    o(Context context, String str) {
        PackageInfo packageInfo;
        this.b = str;
        this.a = new com.facebook.j0.m(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    static /* synthetic */ com.facebook.j0.m a(o oVar) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return null;
        }
        try {
            return oVar.a;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return null;
        }
    }

    private void g(String str) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            d.schedule(new a(k(str)), 5L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    static Bundle k(String str) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return null;
        }
    }

    public String b() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            return this.b;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public void c(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            Bundle bundleK = k(str);
            if (str3 != null) {
                bundleK.putString("2_result", str3);
            }
            if (str4 != null) {
                bundleK.putString("5_error_message", str4);
            }
            if (str5 != null) {
                bundleK.putString("4_error_code", str5);
            }
            if (map != null && !map.isEmpty()) {
                bundleK.putString("6_extras", new JSONObject(map).toString());
            }
            bundleK.putString("3_method", str2);
            this.a.g(str6, bundleK);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public void d(String str, String str2, String str3) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            Bundle bundleK = k(str);
            bundleK.putString("3_method", str2);
            this.a.g(str3, bundleK);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public void e(String str, String str2, String str3) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            Bundle bundleK = k(str);
            bundleK.putString("3_method", str2);
            this.a.g(str3, bundleK);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public void f(String str, Map<String, String> map, l.e.b bVar, Map<String, String> map2, Exception exc, String str2) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            Bundle bundleK = k(str);
            if (bVar != null) {
                bundleK.putString("2_result", bVar.a());
            }
            if (exc != null && exc.getMessage() != null) {
                bundleK.putString("5_error_message", exc.getMessage());
            }
            JSONObject jSONObject = map.isEmpty() ? null : new JSONObject(map);
            if (map2 != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                bundleK.putString("6_extras", jSONObject.toString());
            }
            this.a.g(str2, bundleK);
            if (bVar == l.e.b.SUCCESS) {
                g(str);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public void h(l.d dVar, String str) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            Bundle bundleK = k(dVar.b());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", dVar.g().toString());
                jSONObject.put("request_code", l.p());
                jSONObject.put("permissions", TextUtils.join(",", dVar.k()));
                jSONObject.put("default_audience", dVar.d().toString());
                jSONObject.put("isReauthorize", dVar.p());
                String str2 = this.c;
                if (str2 != null) {
                    jSONObject.put("facebookVersion", str2);
                }
                if (dVar.h() != null) {
                    jSONObject.put("target_app", dVar.h().toString());
                }
                bundleK.putString("6_extras", jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.a.h(str, null, bundleK);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public void i(String str, String str2) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            j(str, str2, "");
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public void j(String str, String str2, String str3) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            Bundle bundleK = k("");
            bundleK.putString("2_result", l.e.b.ERROR.a());
            bundleK.putString("5_error_message", str2);
            bundleK.putString("3_method", str3);
            this.a.g(str, bundleK);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
