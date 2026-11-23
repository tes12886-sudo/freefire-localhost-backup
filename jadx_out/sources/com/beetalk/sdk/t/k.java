package com.beetalk.sdk.t;

import com.beetalk.sdk.p;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    private String e() {
        if (p.p() == p.c.TEST) {
            return "com.garena.msdk.guest_token_sandbox";
        }
        p.p();
        p.c cVar = p.c.PRODUCTION;
        return "com.garena.msdk.guest_token";
    }

    public void a() {
        m("com.garena.msdk.token");
        m("com.garena.msdk.sessiontoken");
        m("com.garena.msdk.guest_token");
        m("com.garena.msdk.guest_token_sandbox");
    }

    public String b() {
        String strF = f();
        m(g());
        m(d());
        return strF;
    }

    public String c() {
        return i().get(d());
    }

    public String d() {
        if (p.p() == p.c.TEST) {
            return "com.garena.msdk.guest_password_sandbox";
        }
        p.p();
        p.c cVar = p.c.PRODUCTION;
        return "com.garena.msdk.guest_password";
    }

    public String f() {
        return i().get(g());
    }

    public String g() {
        if (p.p() == p.c.TEST) {
            return "com.garena.msdk.guest_uid_sandbox";
        }
        p.p();
        p.c cVar = p.c.PRODUCTION;
        return "com.garena.msdk.guest_uid";
    }

    public com.beetalk.sdk.u.a h() {
        String str = i().get("com.garena.msdk.token");
        if (str == null) {
            return null;
        }
        return com.beetalk.sdk.u.a.a(str);
    }

    public abstract Map<String, String> i();

    public void j(long j2, String str) {
        HashMap map = new HashMap();
        map.put(g(), String.valueOf(j2));
        map.put(d(), str);
        o(map);
    }

    public void k(com.beetalk.sdk.u.a aVar) {
        HashMap map = new HashMap();
        map.put(e(), com.beetalk.sdk.u.a.p(aVar));
        o(map);
    }

    public void l(com.beetalk.sdk.u.a aVar) {
        if (aVar == null) {
            m("com.garena.msdk.token");
            return;
        }
        HashMap map = new HashMap();
        map.put("com.garena.msdk.token", com.beetalk.sdk.u.a.p(aVar));
        o(map);
    }

    public abstract void m(String str);

    public void n() {
        m(e());
    }

    public abstract void o(Map<String, String> map);
}
