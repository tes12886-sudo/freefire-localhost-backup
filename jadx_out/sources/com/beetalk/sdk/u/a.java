package com.beetalk.sdk.u;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a implements Serializable {
    private String a;
    private String b;
    private String c;
    private Integer d;
    private l e;
    private Integer f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f537g;

    public a(String str, l lVar, int i2) {
        this.a = str;
        this.e = lVar;
        this.f537g = Integer.valueOf(i2);
    }

    public static a a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar = new a(jSONObject.optString("authToken"), l.d(jSONObject.optInt("tokenProvider")), jSONObject.optInt("mainPlatform"));
            aVar.n(jSONObject.optString("refreshToken"));
            aVar.m(jSONObject.optString("openId"));
            aVar.k(jSONObject.optInt("expiryTimestamp"));
            aVar.l(jSONObject.optInt("lastInspectTime"));
            return aVar;
        } catch (Exception e) {
            com.beetalk.sdk.x.a.b(e);
            return null;
        }
    }

    public static String p(a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("authToken", aVar.a);
            jSONObject.put("tokenProvider", aVar.e.c());
            jSONObject.put("expiryTimestamp", aVar.d);
            String str = aVar.b;
            if (str == null) {
                str = "";
            }
            jSONObject.put("refreshToken", str);
            String str2 = aVar.c;
            jSONObject.put("openId", str2 != null ? str2 : "");
            jSONObject.put("lastInspectTime", aVar.f);
            jSONObject.put("mainPlatform", aVar.f537g);
        } catch (JSONException e) {
            com.beetalk.sdk.x.a.b(e);
        }
        return jSONObject.toString();
    }

    public String b() {
        return this.a;
    }

    public int c() {
        return this.d.intValue();
    }

    public int d() {
        return this.f.intValue();
    }

    public int e() {
        return this.f537g.intValue();
    }

    public String f() {
        return this.c;
    }

    public String g() {
        return this.b;
    }

    public l h() {
        return this.e;
    }

    public boolean i() {
        return (com.beetalk.sdk.x.d.o(this.a) || com.beetalk.sdk.x.d.o(this.c) || this.d == null) ? false : true;
    }

    public void j(String str) {
        this.a = str;
    }

    public void k(int i2) {
        this.d = Integer.valueOf(i2);
    }

    public void l(int i2) {
        this.f = Integer.valueOf(i2);
    }

    public void m(String str) {
        this.c = str;
    }

    public void n(String str) {
        this.b = str;
    }

    public void o(l lVar) {
        this.e = lVar;
    }
}
