package com.beetalk.sdk.t;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.beetalk.sdk.p;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private final SharedPreferences a;
    private final Context b;

    class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Throwable {
            JSONObject jSONObjectA;
            c cVar;
            Boolean bool;
            JSONObject jSONObjectB;
            String strE = com.beetalk.sdk.x.d.e(c.this.b);
            if (!TextUtils.isEmpty(strE) && (jSONObjectA = com.beetalk.sdk.z.i.a.a(strE, com.beetalk.sdk.x.d.g(c.this.b).intValue(), com.beetalk.sdk.x.d.i(c.this.b, c.this.b.getPackageName()))) != null) {
                com.beetalk.sdk.x.a.a("AppConfig:" + jSONObjectA.toString(), new Object[0]);
                if (jSONObjectA.has("error")) {
                    com.beetalk.sdk.x.a.c("AppConfig Error:" + jSONObjectA.optString("error"), new Object[0]);
                    return null;
                }
                if (jSONObjectA.has("client_log") && p.p().equals(p.c.PRODUCTION)) {
                    c.this.d("client_log", Boolean.valueOf(jSONObjectA.getBoolean("client_log")));
                } else {
                    if (p.a) {
                        cVar = c.this;
                        bool = Boolean.TRUE;
                    } else {
                        com.beetalk.sdk.x.a.a("Debug Build Skipping config value", new Object[0]);
                        cVar = c.this;
                        bool = Boolean.FALSE;
                    }
                    cVar.d("client_log", bool);
                }
                if (jSONObjectA.has("overlay_config_url")) {
                    String strOptString = jSONObjectA.optString("overlay_config_url");
                    c.this.d("overlay_config_url", strOptString);
                    com.beetalk.sdk.x.b bVarA = com.beetalk.sdk.x.b.a(c.this.b, "overlay_button_config");
                    if (bVarA.e("overlay_button_config") == null && (jSONObjectB = com.beetalk.sdk.z.i.a.b(strOptString)) != null) {
                        com.beetalk.sdk.x.a.i("OverLay Config:" + jSONObjectB.toString(), new Object[0]);
                        bVarA.k("overlay_button_config", jSONObjectB, 3600);
                    }
                }
            }
            return null;
        }
    }

    public c(Context context) {
        com.beetalk.sdk.x.k.b(context, "Application Context");
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.a = applicationContext.getSharedPreferences("com.garena.msdk.app_config", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, Object obj) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        if (obj instanceof Boolean) {
            editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Integer) {
            editorEdit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Float) {
            editorEdit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            editorEdit.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            editorEdit.putString(str, (String) obj);
        }
        editorEdit.apply();
    }

    public void c() {
        com.beetalk.sdk.x.a.a("Initializing Download of Application Config", new Object[0]);
        i.i.e(new a());
    }
}
