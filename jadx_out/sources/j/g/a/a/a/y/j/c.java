package j.g.a.a.a.y.j;

import j.g.a.a.a.m;
import j.g.a.a.a.p;
import j.g.a.a.a.r;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final SecureRandom f2151g = new SecureRandom();
    private final p a;
    private final r b;
    private final String c;
    private final String d;
    private final String e;
    private final Map<String, String> f;

    c(p pVar, r rVar, String str, String str2, String str3, Map<String, String> map) {
        this.a = pVar;
        this.b = rVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = map;
    }

    private void a(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(' ');
            sb.append(j.g.a.a.a.y.i.c.c(str));
            sb.append("=\"");
            sb.append(j.g.a.a.a.y.i.c.c(str2));
            sb.append("\",");
        }
    }

    private String f(TreeMap<String, String> treeMap) {
        StringBuilder sb = new StringBuilder();
        int size = treeMap.size();
        int i2 = 0;
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            sb.append(j.g.a.a.a.y.i.c.c(j.g.a.a.a.y.i.c.c(entry.getKey())));
            sb.append("%3D");
            sb.append(j.g.a.a.a.y.i.c.c(j.g.a.a.a.y.i.c.c(entry.getValue())));
            i2++;
            if (i2 < size) {
                sb.append("%26");
            }
        }
        return sb.toString();
    }

    private String g() {
        return String.valueOf(System.nanoTime()) + String.valueOf(Math.abs(f2151g.nextLong()));
    }

    private String h() {
        r rVar = this.b;
        return j.g.a.a.a.y.i.c.e(this.a.b()) + '&' + j.g.a.a.a.y.i.c.e(rVar != null ? rVar.b : null);
    }

    private String i() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }

    String b(String str) {
        try {
            String strH = h();
            byte[] bytes = str.getBytes("UTF8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(strH.getBytes("UTF8"), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            byte[] bArrDoFinal = mac.doFinal(bytes);
            return n.e.m(bArrDoFinal, 0, bArrDoFinal.length).a();
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException e) {
            m.g().c("Twitter", "Failed to calculate signature", e);
            return "";
        }
    }

    String c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("OAuth");
        a(sb, "oauth_callback", this.c);
        a(sb, "oauth_consumer_key", this.a.a());
        a(sb, "oauth_nonce", str);
        a(sb, "oauth_signature", str3);
        a(sb, "oauth_signature_method", "HMAC-SHA1");
        a(sb, "oauth_timestamp", str2);
        r rVar = this.b;
        a(sb, "oauth_token", rVar != null ? rVar.a : null);
        a(sb, "oauth_version", "1.0");
        return sb.substring(0, sb.length() - 1);
    }

    String d(String str, String str2) {
        String str3;
        URI uriCreate = URI.create(this.e);
        TreeMap<String, String> treeMapB = j.g.a.a.a.y.i.c.b(uriCreate, true);
        Map<String, String> map = this.f;
        if (map != null) {
            treeMapB.putAll(map);
        }
        String str4 = this.c;
        if (str4 != null) {
            treeMapB.put("oauth_callback", str4);
        }
        treeMapB.put("oauth_consumer_key", this.a.a());
        treeMapB.put("oauth_nonce", str);
        treeMapB.put("oauth_signature_method", "HMAC-SHA1");
        treeMapB.put("oauth_timestamp", str2);
        r rVar = this.b;
        if (rVar != null && (str3 = rVar.a) != null) {
            treeMapB.put("oauth_token", str3);
        }
        treeMapB.put("oauth_version", "1.0");
        return this.d.toUpperCase(Locale.ENGLISH) + '&' + j.g.a.a.a.y.i.c.c(uriCreate.getScheme() + "://" + uriCreate.getHost() + uriCreate.getPath()) + '&' + f(treeMapB);
    }

    public String e() {
        String strG = g();
        String strI = i();
        return c(strG, strI, b(d(strG, strI)));
    }
}
