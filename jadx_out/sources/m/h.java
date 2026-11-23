package m;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private final String a;
    private final Map<String, String> b;

    public h(String str, Map<String, String> map) {
        String lowerCase;
        l.y.c.i.e(str, "scheme");
        l.y.c.i.e(map, "authParams");
        this.a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                lowerCase = null;
            } else {
                Locale locale = Locale.US;
                l.y.c.i.d(locale, "US");
                lowerCase = key.toLowerCase(locale);
                l.y.c.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l.y.c.i.d(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.b = mapUnmodifiableMap;
    }

    public final Charset a() {
        String str = this.b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                l.y.c.i.d(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        l.y.c.i.d(charset, "ISO_8859_1");
        return charset;
    }

    public final String b() {
        return this.b.get("realm");
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (l.y.c.i.a(hVar.a, this.a) && l.y.c.i.a(hVar.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return this.a + " authParams=" + this.b;
    }
}
