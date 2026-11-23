package l.t;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class c0 extends b0 {
    public static int a(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> b(l.l<? extends K, ? extends V> lVar) {
        l.y.c.i.e(lVar, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(lVar.c(), lVar.d());
        l.y.c.i.d(mapSingletonMap, "singletonMap(pair.first, pair.second)");
        return mapSingletonMap;
    }

    public static final <K, V> Map<K, V> c(Map<? extends K, ? extends V> map) {
        l.y.c.i.e(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        l.y.c.i.d(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return mapSingletonMap;
    }
}
