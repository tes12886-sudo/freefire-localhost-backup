package l.t;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class d0 extends c0 {
    public static <K, V> Map<K, V> d() {
        return x.a;
    }

    public static <K, V> HashMap<K, V> e(l.l<? extends K, ? extends V>... lVarArr) {
        l.y.c.i.e(lVarArr, "pairs");
        HashMap<K, V> map = new HashMap<>(c0.a(lVarArr.length));
        i(map, lVarArr);
        return map;
    }

    public static <K, V> Map<K, V> f(l.l<? extends K, ? extends V>... lVarArr) {
        l.y.c.i.e(lVarArr, "pairs");
        if (lVarArr.length <= 0) {
            return d();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0.a(lVarArr.length));
        m(lVarArr, linkedHashMap);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> g(Map<K, ? extends V> map) {
        l.y.c.i.e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : c0.c(map);
        }
        return d();
    }

    public static final <K, V> void h(Map<? super K, ? super V> map, Iterable<? extends l.l<? extends K, ? extends V>> iterable) {
        l.y.c.i.e(map, "<this>");
        l.y.c.i.e(iterable, "pairs");
        for (l.l<? extends K, ? extends V> lVar : iterable) {
            map.put(lVar.a(), lVar.b());
        }
    }

    public static final <K, V> void i(Map<? super K, ? super V> map, l.l<? extends K, ? extends V>[] lVarArr) {
        l.y.c.i.e(map, "<this>");
        l.y.c.i.e(lVarArr, "pairs");
        for (l.l<? extends K, ? extends V> lVar : lVarArr) {
            map.put(lVar.a(), lVar.b());
        }
    }

    public static <K, V> Map<K, V> j(Iterable<? extends l.l<? extends K, ? extends V>> iterable) {
        l.y.c.i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            k(iterable, linkedHashMap);
            return g(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size == 1) {
            return c0.b(iterable instanceof List ? (l.l<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c0.a(collection.size()));
        k(iterable, linkedHashMap2);
        return linkedHashMap2;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M k(Iterable<? extends l.l<? extends K, ? extends V>> iterable, M m2) {
        l.y.c.i.e(iterable, "<this>");
        l.y.c.i.e(m2, "destination");
        h(m2, iterable);
        return m2;
    }

    public static <K, V> Map<K, V> l(Map<? extends K, ? extends V> map) {
        l.y.c.i.e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? n(map) : c0.c(map);
        }
        return d();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M m(l.l<? extends K, ? extends V>[] lVarArr, M m2) {
        l.y.c.i.e(lVarArr, "<this>");
        l.y.c.i.e(m2, "destination");
        i(m2, lVarArr);
        return m2;
    }

    public static <K, V> Map<K, V> n(Map<? extends K, ? extends V> map) {
        l.y.c.i.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
