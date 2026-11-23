package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private String a;
    private final long b;
    private final Map<String, Object> c;

    public b(String str, long j2, Map<String, Object> map) {
        this.a = str;
        this.b = j2;
        HashMap map2 = new HashMap();
        this.c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public final long a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final void c(String str) {
        this.a = str;
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, obj);
        }
    }

    public final Object e(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.b == bVar.b && this.a.equals(bVar.a)) {
            return this.c.equals(bVar.c);
        }
        return false;
    }

    public final Map<String, Object> f() {
        return this.c;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        return new b(this.a, this.b, new HashMap(this.c));
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        long j2 = this.b;
        return (((iHashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        long j2 = this.b;
        String strValueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + String.valueOf(strValueOf).length());
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j2);
        sb.append(", params=");
        sb.append(strValueOf);
        sb.append('}');
        return sb.toString();
    }
}
