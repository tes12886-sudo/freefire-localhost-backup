package com.beetalk.sdk.t;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends k {
    private static volatile a c;
    private static final String d = "com.garena.msdk" + com.beetalk.sdk.x.d.c(com.beetalk.sdk.g.s()) + com.beetalk.sdk.x.d.f(com.beetalk.sdk.g.s());
    private final AccountManager a = AccountManager.get(com.beetalk.sdk.g.s());
    private final j b = new j(com.beetalk.sdk.g.s(), "com.garena.msdk.persist.fallback");

    private a() {
    }

    private Account r() {
        Account[] accountsByType = this.a.getAccountsByType(d);
        if (accountsByType.length > 0) {
            return accountsByType[0];
        }
        return null;
    }

    public static a s() {
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    private Map<String, String> t() {
        HashMap map = new HashMap();
        Account accountR = r();
        if (accountR != null && d.equals(accountR.type)) {
            String strG = g();
            String strD = d();
            String userData = this.a.getUserData(accountR, strG);
            String userData2 = this.a.getUserData(accountR, strD);
            if (!TextUtils.isEmpty(userData) && !TextUtils.isEmpty(userData2)) {
                map.put(strG, userData);
                map.put(strD, userData2);
            }
        }
        return map;
    }

    private Map<String, String> u() {
        HashMap map = new HashMap();
        Map<String, String> mapI = this.b.i();
        if (mapI != null) {
            String strG = g();
            String strD = d();
            String str = mapI.get(strG);
            String str2 = mapI.get(strD);
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                map.put(strG, str);
                map.put(strD, str2);
            }
        }
        return map;
    }

    private void v(Map<String, String> map) {
        if (map == null) {
            return;
        }
        try {
            Account accountR = r();
            if (accountR != null && d.equals(accountR.type) && map.entrySet() != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    this.a.setUserData(accountR, entry.getKey(), entry.getValue());
                }
                return;
            }
            if (map.containsKey(g())) {
                String str = map.get(g());
                String strD = d();
                String str2 = map.containsKey(strD) ? map.get(strD) : null;
                Account account = new Account(str, d);
                Bundle bundle = new Bundle();
                for (Map.Entry<String, String> entry2 : map.entrySet()) {
                    this.a.setUserData(account, entry2.getKey(), entry2.getValue());
                }
                this.a.addAccountExplicitly(account, str2, bundle);
            }
        } catch (Exception e) {
            com.beetalk.sdk.x.a.b(e);
        }
    }

    private void w(Map<String, String> map, Map<String, String> map2) {
        String strG = g();
        String str = map2.get(strG);
        String str2 = map.get(strG);
        long j2 = str != null ? Long.parseLong(str) : 0L;
        if (str2 != null) {
            Long.parseLong(str2);
        }
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null && !map.containsKey(entry.getKey())) {
                map5.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            if (entry2 != null && entry2.getKey() != null && entry2.getValue() != null) {
                if (!map2.containsKey(entry2.getKey())) {
                    map4.put(entry2.getKey(), entry2.getValue());
                } else if (!entry2.getValue().equals(map2.get(entry2.getKey()))) {
                    map3.put(entry2.getKey(), map2.get(entry2.getKey()));
                }
            }
        }
        map.putAll(map5);
        if (j2 <= 0) {
            if (!map3.isEmpty() || !map4.isEmpty()) {
                v(map);
            }
            if (map5.isEmpty()) {
                return;
            }
            this.b.o(map);
            return;
        }
        if (!map3.isEmpty() || !map5.isEmpty()) {
            map.putAll(map3);
            this.b.o(map);
        }
        if (map4.isEmpty()) {
            return;
        }
        v(map);
    }

    @Override // com.beetalk.sdk.t.k
    public Map<String, String> i() {
        Map<String, String> mapU = u();
        w(mapU, t());
        return mapU;
    }

    @Override // com.beetalk.sdk.t.k
    public void j(long j2, String str) {
        try {
            Account accountR = r();
            if (accountR == null || !d.equals(accountR.type)) {
                String strG = g();
                String strD = d();
                String strValueOf = String.valueOf(j2);
                Account account = new Account(strValueOf, d);
                Bundle bundle = new Bundle();
                bundle.putString(strG, strValueOf);
                bundle.putString(strD, str);
                this.a.addAccountExplicitly(account, str, bundle);
            } else {
                this.a.setUserData(accountR, g(), String.valueOf(j2));
                this.a.setUserData(accountR, d(), str);
            }
        } catch (Exception e) {
            com.beetalk.sdk.x.a.b(e);
        }
    }

    @Override // com.beetalk.sdk.t.k
    public void m(String str) {
        this.b.m(str);
    }

    @Override // com.beetalk.sdk.t.k
    public void o(Map<String, String> map) {
        this.b.o(map);
        HashMap map2 = (HashMap) i();
        for (String str : map.keySet()) {
            map2.put(str, map.get(str));
        }
        v(map2);
    }

    public void p() {
        this.b.p();
        Account accountR = r();
        if (accountR == null || !d.equals(accountR.type)) {
            return;
        }
        this.a.removeAccount(accountR, null, null);
    }

    public String q() {
        Map<String, String> mapI = this.b.i();
        Map<String, String> mapT = t();
        if (mapT == null) {
            return super.b();
        }
        String strG = g();
        String strD = d();
        String str = mapT.get(strG);
        String str2 = mapI.get(strG);
        String str3 = mapT.get(strD);
        String str4 = mapI.get(strD);
        if ((TextUtils.isEmpty(str2) || h.h.k.c.a(str2, str)) && (TextUtils.isEmpty(str4) || h.h.k.c.a(str4, str3))) {
            p();
            return str;
        }
        this.b.m(strG);
        this.b.m(strD);
        return str2;
    }
}
