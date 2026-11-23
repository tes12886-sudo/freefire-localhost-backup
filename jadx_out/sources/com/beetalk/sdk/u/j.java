package com.beetalk.sdk.u;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j implements Serializable {
    private final a a;
    private final String b;
    private final Integer c;
    private final Map<String, String> d;

    public enum a {
        SUCCESS(0),
        CANCEL(1),
        ERROR(2);

        private final Integer a;

        a(Integer num) {
            this.a = num;
        }

        public Integer c() {
            return this.a;
        }
    }

    public j(com.garena.pay.android.d dVar, a aVar, String str, Integer num, Map<String, String> map) {
        this.a = aVar;
        this.b = str;
        this.c = num;
        this.d = map;
    }

    public static j a(com.garena.pay.android.d dVar, com.garena.pay.android.b bVar, String str) {
        return new j(dVar, a.ERROR, TextUtils.join(": ", new String[]{bVar.c().toString(), str}), bVar.c(), null);
    }

    public static j b(com.garena.pay.android.d dVar, Map<String, String> map) {
        return new j(dVar, a.SUCCESS, null, null, map);
    }

    public static boolean g(a aVar) {
        return aVar != a.SUCCESS;
    }

    public Map<String, String> c() {
        return this.d;
    }

    public Integer d() {
        return this.c;
    }

    public String e() {
        return this.b;
    }

    public a f() {
        return this.a;
    }
}
