package h.f;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e<K, V> {
    private final LinkedHashMap<K, V> a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1784h;

    public e(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = i2;
        this.a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int f(K k2, V v) {
        int iG = g(k2, v);
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException("Negative size: " + k2 + "=" + v);
    }

    protected V a(K k2) {
        return null;
    }

    protected void b(boolean z, K k2, V v, V v2) {
    }

    public final V c(K k2) {
        V vPut;
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.a.get(k2);
            if (v != null) {
                this.f1783g++;
                return v;
            }
            this.f1784h++;
            V vA = a(k2);
            if (vA == null) {
                return null;
            }
            synchronized (this) {
                this.e++;
                vPut = this.a.put(k2, vA);
                if (vPut != null) {
                    this.a.put(k2, vPut);
                } else {
                    this.b += f(k2, vA);
                }
            }
            if (vPut != null) {
                b(false, k2, vA, vPut);
                return vPut;
            }
            i(this.c);
            return vA;
        }
    }

    public final V d(K k2, V v) {
        V vPut;
        if (k2 == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.d++;
            this.b += f(k2, v);
            vPut = this.a.put(k2, v);
            if (vPut != null) {
                this.b -= f(k2, vPut);
            }
        }
        if (vPut != null) {
            b(false, k2, vPut, v);
        }
        i(this.c);
        return vPut;
    }

    public final V e(K k2) {
        V vRemove;
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            vRemove = this.a.remove(k2);
            if (vRemove != null) {
                this.b -= f(k2, vRemove);
            }
        }
        if (vRemove != null) {
            b(false, k2, vRemove, null);
        }
        return vRemove;
    }

    protected int g(K k2, V v) {
        return 1;
    }

    public final synchronized Map<K, V> h() {
        return new LinkedHashMap(this.a);
    }

    public void i(int i2) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                if (this.b < 0 || (this.a.isEmpty() && this.b != 0)) {
                    break;
                }
                if (this.b > i2 && !this.a.isEmpty()) {
                    Map.Entry<K, V> next = this.a.entrySet().iterator().next();
                    key = next.getKey();
                    value = next.getValue();
                    this.a.remove(key);
                    this.b -= f(key, value);
                    this.f++;
                }
                return;
            }
            b(true, key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f1783g;
        i3 = this.f1784h + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.f1783g), Integer.valueOf(this.f1784h), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }
}
