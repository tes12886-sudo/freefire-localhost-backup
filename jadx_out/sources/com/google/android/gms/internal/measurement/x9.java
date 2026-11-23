package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class x9<K, V> extends LinkedHashMap<K, V> {
    private static final x9 b;
    private boolean a;

    static {
        x9 x9Var = new x9();
        b = x9Var;
        x9Var.a = false;
    }

    private x9() {
        this.a = true;
    }

    private x9(Map<K, V> map) {
        super(map);
        this.a = true;
    }

    public static <K, V> x9<K, V> a() {
        return b;
    }

    private static int i(Object obj) {
        if (obj instanceof byte[]) {
            return g9.g((byte[]) obj);
        }
        if (obj instanceof b9) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void k() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        k();
        super.clear();
    }

    public final void d(x9<K, V> x9Var) {
        k();
        if (x9Var.isEmpty()) {
            return;
        }
        putAll(x9Var);
    }

    public final x9<K, V> e() {
        return isEmpty() ? new x9<>() : new x9<>(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final void g() {
        this.a = false;
    }

    public final boolean h() {
        return this.a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i2 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i2 += i(entry.getValue()) ^ i(entry.getKey());
        }
        return i2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        k();
        g9.a(k2);
        g9.a(v);
        return (V) super.put(k2, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        k();
        for (K k2 : map.keySet()) {
            g9.a(k2);
            g9.a(map.get(k2));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        k();
        return (V) super.remove(obj);
    }
}
