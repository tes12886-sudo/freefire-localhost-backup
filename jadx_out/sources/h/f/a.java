package h.f;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends g<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    f<K, V> f1778h;

    /* JADX INFO: renamed from: h.f.a$a, reason: collision with other inner class name */
    class C0189a extends f<K, V> {
        C0189a() {
        }

        @Override // h.f.f
        protected void a() {
            a.this.clear();
        }

        @Override // h.f.f
        protected Object b(int i2, int i3) {
            return a.this.b[(i2 << 1) + i3];
        }

        @Override // h.f.f
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // h.f.f
        protected int d() {
            return a.this.c;
        }

        @Override // h.f.f
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // h.f.f
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // h.f.f
        protected void g(K k2, V v) {
            a.this.put(k2, v);
        }

        @Override // h.f.f
        protected void h(int i2) {
            a.this.j(i2);
        }

        @Override // h.f.f
        protected V i(int i2, V v) {
            return a.this.k(i2, v);
        }
    }

    public a() {
    }

    public a(int i2) {
        super(i2);
    }

    private f<K, V> m() {
        if (this.f1778h == null) {
            this.f1778h = new C0189a();
        }
        return this.f1778h;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m().m();
    }

    public boolean n(Collection<?> collection) {
        return f.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.c + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m().n();
    }
}
