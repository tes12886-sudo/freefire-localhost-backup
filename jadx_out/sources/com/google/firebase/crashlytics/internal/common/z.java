package com.google.firebase.crashlytics.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z {
    private String a = null;
    private final Map<String, String> b = new HashMap();

    class a extends HashMap<String, String> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        a(z zVar, String str, String str2) {
            this.a = str;
            this.b = str2;
            put(z.f(str), z.e(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(String str) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > 1024 ? strTrim.substring(0, 1024) : strTrim;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(String str) {
        if (str != null) {
            return e(str);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    private synchronized void i(Map<String, String> map) {
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strF = f(entry.getKey());
            String strE = entry.getValue() == null ? "" : e(entry.getValue());
            if (this.b.containsKey(strF)) {
                map2.put(strF, strE);
            } else {
                map3.put(strF, strE);
            }
        }
        this.b.putAll(map2);
        if (this.b.size() + map3.size() > 64) {
            int size = 64 - this.b.size();
            com.google.firebase.crashlytics.internal.a.f().i("Exceeded maximum number of custom attributes (64).");
            map3.keySet().retainAll(new ArrayList(map3.keySet()).subList(0, size));
        }
        this.b.putAll(map3);
    }

    public Map<String, String> c() {
        return Collections.unmodifiableMap(this.b);
    }

    public String d() {
        return this.a;
    }

    public void g(String str, String str2) {
        i(new a(this, str, str2));
    }

    public void h(Map<String, String> map) {
        i(map);
    }

    public void j(String str) {
        this.a = e(str);
    }
}
