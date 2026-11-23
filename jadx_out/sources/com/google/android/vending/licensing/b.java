package com.google.android.vending.licensing;

import android.content.Context;
import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

/* JADX INFO: loaded from: classes.dex */
public class b implements j {
    private long a;
    private long b;
    private long c;
    private long d;
    private int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k f1355g;
    private long e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Vector<String> f1356h = new Vector<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Vector<String> f1357i = new Vector<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Vector<Long> f1358j = new Vector<>();

    public b(Context context, i iVar) {
        k kVar = new k(context.getSharedPreferences("com.android.vending.licensing.APKExpansionPolicy", 0), iVar);
        this.f1355g = kVar;
        this.f = Integer.parseInt(kVar.b("lastResponse", Integer.toString(291)));
        this.a = Long.parseLong(this.f1355g.b("validityTimestamp", "0"));
        this.b = Long.parseLong(this.f1355g.b("retryUntil", "0"));
        this.c = Long.parseLong(this.f1355g.b("maxRetries", "0"));
        this.d = Long.parseLong(this.f1355g.b("retryCount", "0"));
    }

    private Map<String, String> c(String str) {
        HashMap map = new HashMap();
        try {
            for (NameValuePair nameValuePair : URLEncodedUtils.parse(new URI("?" + str), "UTF-8")) {
                String name = nameValuePair.getName();
                int i2 = 0;
                while (map.containsKey(name)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(nameValuePair.getName());
                    i2++;
                    sb.append(i2);
                    name = sb.toString();
                }
                map.put(name, nameValuePair.getValue());
            }
        } catch (URISyntaxException unused) {
            Log.w("APKExpansionPolicy", "Invalid syntax error while decoding extras data from server.");
        }
        return map;
    }

    private void l(int i2) {
        this.e = System.currentTimeMillis();
        this.f = i2;
        this.f1355g.c("lastResponse", Integer.toString(i2));
    }

    private void m(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("APKExpansionPolicy", "Licence retry count (GR) missing, grace period disabled");
            lValueOf = 0L;
            str = "0";
        }
        this.c = lValueOf.longValue();
        this.f1355g.c("maxRetries", str);
    }

    private void n(long j2) {
        this.d = j2;
        this.f1355g.c("retryCount", Long.toString(j2));
    }

    private void o(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("APKExpansionPolicy", "License retry timestamp (GT) missing, grace period disabled");
            lValueOf = 0L;
            str = "0";
        }
        this.b = lValueOf.longValue();
        this.f1355g.c("retryUntil", str);
    }

    private void p(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("APKExpansionPolicy", "License validity timestamp (VT) missing, caching for a minute");
            lValueOf = Long.valueOf(System.currentTimeMillis() + 60000);
            str = Long.toString(lValueOf.longValue());
        }
        this.a = lValueOf.longValue();
        this.f1355g.c("validityTimestamp", str);
    }

    @Override // com.google.android.vending.licensing.j
    public boolean a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = this.f;
        if (i2 == 256) {
            if (jCurrentTimeMillis <= this.a) {
                return true;
            }
        } else if (i2 == 291 && jCurrentTimeMillis < this.e + 60000) {
            return jCurrentTimeMillis <= this.b || this.d <= this.c;
        }
        return false;
    }

    @Override // com.google.android.vending.licensing.j
    public void b(int i2, l lVar) {
        n(i2 != 291 ? 0L : this.d + 1);
        if (i2 == 256) {
            Map<String, String> mapC = c(lVar.f1363g);
            this.f = i2;
            p(Long.toString(System.currentTimeMillis() + 60000));
            for (String str : mapC.keySet()) {
                if (str.equals("VT")) {
                    p(mapC.get(str));
                } else if (str.equals("GT")) {
                    o(mapC.get(str));
                } else if (str.equals("GR")) {
                    m(mapC.get(str));
                } else if (str.startsWith("FILE_URL")) {
                    k(Integer.parseInt(str.substring(8)) - 1, mapC.get(str));
                } else if (str.startsWith("FILE_NAME")) {
                    i(Integer.parseInt(str.substring(9)) - 1, mapC.get(str));
                } else if (str.startsWith("FILE_SIZE")) {
                    j(Integer.parseInt(str.substring(9)) - 1, Long.parseLong(mapC.get(str)));
                }
            }
        } else if (i2 == 561) {
            p("0");
            o("0");
            m("0");
        }
        l(i2);
        this.f1355g.a();
    }

    public String d(int i2) {
        if (i2 < this.f1357i.size()) {
            return this.f1357i.elementAt(i2);
        }
        return null;
    }

    public long e(int i2) {
        if (i2 < this.f1358j.size()) {
            return this.f1358j.elementAt(i2).longValue();
        }
        return -1L;
    }

    public String f(int i2) {
        if (i2 < this.f1356h.size()) {
            return this.f1356h.elementAt(i2);
        }
        return null;
    }

    public int g() {
        return this.f1356h.size();
    }

    public void h() {
        this.f1355g.c("lastResponse", Integer.toString(291));
        o("0");
        m("0");
        n(Long.parseLong("0"));
        p("0");
        this.f1355g.a();
    }

    public void i(int i2, String str) {
        if (i2 >= this.f1357i.size()) {
            this.f1357i.setSize(i2 + 1);
        }
        this.f1357i.set(i2, str);
    }

    public void j(int i2, long j2) {
        if (i2 >= this.f1358j.size()) {
            this.f1358j.setSize(i2 + 1);
        }
        this.f1358j.set(i2, Long.valueOf(j2));
    }

    public void k(int i2, String str) {
        if (i2 >= this.f1356h.size()) {
            this.f1356h.setSize(i2 + 1);
        }
        this.f1356h.set(i2, str);
    }
}
