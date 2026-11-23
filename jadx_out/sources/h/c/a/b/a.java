package h.c.a.b;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends b<K, V> {
    private HashMap<K, b.c<K, V>> e = new HashMap<>();

    public boolean contains(K k2) {
        return this.e.containsKey(k2);
    }

    @Override // h.c.a.b.b
    protected b.c<K, V> d(K k2) {
        return this.e.get(k2);
    }

    @Override // h.c.a.b.b
    public V l(K k2, V v) {
        b.c<K, V> cVarD = d(k2);
        if (cVarD != null) {
            return cVarD.b;
        }
        this.e.put(k2, j(k2, v));
        return null;
    }

    @Override // h.c.a.b.b
    public V n(K k2) {
        V v = (V) super.n(k2);
        this.e.remove(k2);
        return v;
    }

    public Map.Entry<K, V> q(K k2) {
        if (contains(k2)) {
            return this.e.get(k2).d;
        }
        return null;
    }
}
