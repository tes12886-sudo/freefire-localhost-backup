package com.beetalk.sdk.z.i;

import com.beetalk.sdk.g;
import com.beetalk.sdk.networking.model.ExchangeTwitterTokenResp;
import com.beetalk.sdk.p;
import com.beetalk.sdk.u.i;
import com.beetalk.sdk.z.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {

    class a implements Callable<Void> {
        final /* synthetic */ i a;
        final /* synthetic */ com.beetalk.sdk.z.e.h b;

        a(i iVar, com.beetalk.sdk.z.e.h hVar) {
            this.a = iVar;
            this.b = hVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            HashMap map = new HashMap();
            map.put("password", this.a.a);
            map.put("client_type", String.valueOf(2));
            map.put("app_id", String.valueOf(this.a.b));
            map.put("source", String.valueOf(this.a.c));
            this.b.onCompleted(h.c().k(p.H(), null, map, true, String.valueOf(this.a.d)));
            return null;
        }
    }

    /* JADX INFO: renamed from: com.beetalk.sdk.z.i.b$b, reason: collision with other inner class name */
    class CallableC0051b implements Callable<Void> {
        final /* synthetic */ long a;
        final /* synthetic */ String b;
        final /* synthetic */ com.beetalk.sdk.a0.a c;
        final /* synthetic */ String d;
        final /* synthetic */ com.beetalk.sdk.z.e.h e;

        CallableC0051b(long j2, String str, com.beetalk.sdk.a0.a aVar, String str2, com.beetalk.sdk.z.e.h hVar) {
            this.a = j2;
            this.b = str;
            this.c = aVar;
            this.d = str2;
            this.e = hVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            HashMap map = new HashMap();
            map.put("uid", String.valueOf(this.a));
            map.put("password", String.valueOf(this.b));
            map.put("response_type", this.c.c());
            map.put("client_type", String.valueOf(2));
            map.put("client_id", String.valueOf(this.d));
            map.put("client_secret", g.y().u());
            this.e.onCompleted(h.c().k(p.w(), null, map, true, ""));
            return null;
        }
    }

    class c implements i.g<com.beetalk.sdk.z.e.m, ExchangeTwitterTokenResp> {
        c() {
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ExchangeTwitterTokenResp a(i.i<com.beetalk.sdk.z.e.m> iVar) throws TimeoutException, IOException {
            if (iVar.x() || iVar.t() == null) {
                throw new IOException();
            }
            com.beetalk.sdk.z.e.m mVarT = iVar.t();
            if (mVarT.a) {
                throw new TimeoutException();
            }
            return ExchangeTwitterTokenResp.parse(mVarT.b);
        }
    }

    class d implements Callable<com.beetalk.sdk.z.e.m> {
        final /* synthetic */ HashMap a;

        d(HashMap map) {
            this.a = map;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.beetalk.sdk.z.e.m call() {
            return new com.beetalk.sdk.z.e(com.beetalk.sdk.z.e.k.POST, this.a).i(p.j());
        }
    }

    class e implements Callable<Void> {
        final /* synthetic */ String a;
        final /* synthetic */ com.beetalk.sdk.z.e.h b;

        e(String str, com.beetalk.sdk.z.e.h hVar) {
            this.a = str;
            this.b = hVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            HashMap map = new HashMap();
            map.put("access_token", this.a);
            this.b.onCompleted(h.c().g(p.d(), map));
            return null;
        }
    }

    class f implements Callable<Void> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ com.beetalk.sdk.z.e.h c;

        f(String str, String str2, com.beetalk.sdk.z.e.h hVar) {
            this.a = str;
            this.b = str2;
            this.c = hVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            HashMap map = new HashMap();
            map.put("access_token", this.a);
            map.put("secondary_access_token", this.b);
            this.c.onCompleted(h.c().j(p.c(), null, map));
            return null;
        }
    }

    public static void a(String str, String str2, com.beetalk.sdk.z.e.h hVar) {
        i.i.e(new f(str, str2, hVar));
    }

    public static JSONObject b(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put("grant_type", "authorization_code");
        map.put("facebook_access_token", str);
        map.put("redirect_uri", str2);
        map.put("source", com.beetalk.sdk.i.u().toString());
        map.put("client_id", str3);
        map.put("client_secret", str4);
        return h.c().n(p.e(), map);
    }

    public static JSONObject c(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put("grant_type", "authorization_code");
        map.put("facebook_access_token", str);
        map.put("redirect_uri", str2);
        map.put("source", com.beetalk.sdk.i.u().toString());
        map.put("client_id", str3);
        map.put("client_secret", str4);
        map.put("create_grant", "false");
        return h.c().n(p.e(), map);
    }

    public static JSONObject d(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put("grant_type", "authorization_code");
        map.put("code", str);
        map.put("redirect_uri", str2);
        map.put("source", com.beetalk.sdk.i.u().toString());
        map.put("client_id", str3);
        map.put("client_secret", str4);
        return h.c().n(p.i(), map);
    }

    public static JSONObject e(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("google_access_token", str);
        map.put("source", com.beetalk.sdk.i.u().toString());
        map.put("client_id", str2);
        map.put("client_secret", str3);
        return h.c().n(p.f(), map);
    }

    public static JSONObject f(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("google_access_token", str);
        map.put("source", com.beetalk.sdk.i.u().toString());
        map.put("client_id", str2);
        map.put("client_secret", str3);
        map.put("create_grant", "false");
        return h.c().n(p.f(), map);
    }

    public static JSONObject g(String str, String str2) {
        HashMap map = new HashMap();
        map.put("line_access_token", str);
        map.put("client_id", str2);
        return h.c().n(p.g(), map);
    }

    public static JSONObject h(String str, String str2) {
        HashMap map = new HashMap();
        map.put("line_access_token", str);
        map.put("client_id", str2);
        map.put("create_grant", "false");
        return h.c().n(p.g(), map);
    }

    public static i.i<ExchangeTwitterTokenResp> i(String str, String str2, String str3, int i2) {
        HashMap map = new HashMap();
        map.put("twitter_access_token", str);
        map.put("token_secret", str2);
        map.put("client_id", str3);
        if (i2 == p.f509i.intValue()) {
            map.put("create_grant", "false");
        }
        return i.i.e(new d(map)).j(new c(), i.i.f1901i);
    }

    public static JSONObject j(String str, String str2) {
        HashMap map = new HashMap();
        map.put("vk_access_token", str);
        map.put("client_id", str2);
        return h.c().n(p.k(), map);
    }

    public static JSONObject k(String str, String str2) {
        HashMap map = new HashMap();
        map.put("vk_access_token", str);
        map.put("client_id", str2);
        map.put("create_grant", "false");
        return h.c().n(p.k(), map);
    }

    public static void l(String str, com.beetalk.sdk.z.e.h hVar) {
        i.i.e(new e(str, hVar));
    }

    public static void m(long j2, String str, com.beetalk.sdk.a0.a aVar, String str2, com.beetalk.sdk.z.e.h hVar) {
        i.i.e(new CallableC0051b(j2, str, aVar, str2, hVar));
    }

    public static JSONObject n(String str) {
        HashMap map = new HashMap();
        map.put(j.c.a.a.EXTRA_TOKEN, str);
        return h.c().g(p.K(), map);
    }

    public static void o(String str, String str2) {
        HashMap map = new HashMap();
        map.put("access_token", str);
        map.put("refresh_token", str2);
        h.c().g(p.A(), map);
    }

    public static JSONObject p(String str) {
        HashMap map = new HashMap();
        map.put("refresh_token", str);
        map.put("grant_type", "refresh_token");
        return h.c().n(p.h(), map);
    }

    public static void q(i iVar, com.beetalk.sdk.z.e.h hVar) {
        i.i.e(new a(iVar, hVar));
    }
}
