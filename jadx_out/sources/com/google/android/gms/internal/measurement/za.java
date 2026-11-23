package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
class za<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int a;
    private boolean d;
    private volatile ya e;
    private List<wa> b = Collections.emptyList();
    private Map<K, V> c = Collections.emptyMap();
    private Map<K, V> f = Collections.emptyMap();

    /* JADX INFO: Access modifiers changed from: private */
    public final V k(int i2) {
        m();
        V v = (V) this.b.remove(i2).getValue();
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            List<wa> list = this.b;
            Map.Entry<K, V> next = it.next();
            list.add(new wa(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    private final int l(K k2) {
        int size = this.b.size() - 1;
        int i2 = 0;
        if (size >= 0) {
            int iCompareTo = k2.compareTo(this.b.get(size).a());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int iCompareTo2 = k2.compareTo(this.b.get(i3).a());
            if (iCompareTo2 < 0) {
                size = i3 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> n() {
        m();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    public void a() {
        if (this.d) {
            return;
        }
        this.c = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
        this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
        this.d = true;
    }

    public final boolean b() {
        return this.d;
    }

    public final int c() {
        return this.b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i2) {
        return this.b.get(i2);
    }

    public final Iterable<Map.Entry<K, V>> e() {
        return this.c.isEmpty() ? ua.a() : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new ya(this, null);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za)) {
            return super.equals(obj);
        }
        za zaVar = (za) obj;
        int size = size();
        if (size != zaVar.size()) {
            return false;
        }
        int iC = c();
        if (iC != zaVar.c()) {
            return entrySet().equals(zaVar.entrySet());
        }
        for (int i2 = 0; i2 < iC; i2++) {
            if (!d(i2).equals(zaVar.d(i2))) {
                return false;
            }
        }
        if (iC != size) {
            return this.c.equals(zaVar.c);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final V put(K k2, V v) {
        m();
        int iL = l(k2);
        if (iL >= 0) {
            return (V) this.b.get(iL).setValue(v);
        }
        m();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
        int i2 = -(iL + 1);
        if (i2 >= this.a) {
            return n().put(k2, v);
        }
        int size = this.b.size();
        int i3 = this.a;
        if (size == i3) {
            wa waVarRemove = this.b.remove(i3 - 1);
            n().put(waVarRemove.a(), waVarRemove.getValue());
        }
        this.b.add(i2, new wa(this, k2, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        return iL >= 0 ? (V) this.b.get(iL).getValue() : this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iC = c();
        int iHashCode = 0;
        for (int i2 = 0; i2 < iC; i2++) {
            iHashCode += this.b.get(i2).hashCode();
        }
        return this.c.size() > 0 ? iHashCode + this.c.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m();
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        if (iL >= 0) {
            return k(iL);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b.size() + this.c.size();
    }
}
