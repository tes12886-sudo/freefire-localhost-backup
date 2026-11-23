package com.beetalk.sdk.z;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile String f544g = "";
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public b() {
        this(null);
    }

    public b(String str) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        b(str);
    }

    private String a(String str) {
        return TextUtils.isEmpty(str) ? "" : str;
    }

    private void b(String str) {
        String str2;
        String str3;
        try {
            this.c = a("4.0.19P2");
            String str4 = Build.MODEL;
            if (TextUtils.isEmpty(str4)) {
                str2 = f544g;
            } else {
                str2 = str4 + " " + f544g;
            }
            this.a = str2;
            String str5 = Build.VERSION.RELEASE;
            if (TextUtils.isEmpty(str5)) {
                str3 = "Android";
            } else {
                str3 = "Android " + str5;
            }
            this.b = str3;
            this.d = a(com.beetalk.sdk.x.g.c());
            this.e = a(com.beetalk.sdk.x.g.a());
            this.f = a(str);
        } catch (Exception e) {
            com.beetalk.sdk.x.a.b(e);
        }
    }

    public static void c(Context context) {
        if (context == null || ((TelephonyManager) context.getSystemService("phone")).getPhoneType() != 0) {
            return;
        }
        f544g = "tablet";
    }

    public String toString() {
        return String.format("%s/%s(%s;%s;%s;%s;%s)", "GarenaMSDK", this.c, this.a, this.b, this.d, this.e, this.f);
    }
}
