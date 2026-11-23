package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterable<q>, q, m {
    final SortedMap<Integer, q> a;
    final Map<String, q> b;

    public f() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }

    public f(List<q> list) {
        this();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                w(i2, list.get(i2));
            }
        }
    }

    public final void A(int i2) {
        int iIntValue = this.a.lastKey().intValue();
        if (i2 > iIntValue || i2 < 0) {
            return;
        }
        this.a.remove(Integer.valueOf(i2));
        if (i2 == iIntValue) {
            SortedMap<Integer, q> sortedMap = this.a;
            int i3 = i2 - 1;
            Integer numValueOf = Integer.valueOf(i3);
            if (sortedMap.containsKey(numValueOf) || i3 < 0) {
                return;
            }
            this.a.put(numValueOf, q.x);
            return;
        }
        while (true) {
            i2++;
            if (i2 > this.a.lastKey().intValue()) {
                return;
            }
            SortedMap<Integer, q> sortedMap2 = this.a;
            Integer numValueOf2 = Integer.valueOf(i2);
            q qVar = sortedMap2.get(numValueOf2);
            if (qVar != null) {
                this.a.put(Integer.valueOf(i2 - 1), qVar);
                this.a.remove(numValueOf2);
            }
        }
    }

    public final String B(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            for (int i2 = 0; i2 < t(); i2++) {
                q qVarV = v(i2);
                sb.append(str);
                if (!(qVarV instanceof v) && !(qVarV instanceof o)) {
                    sb.append(qVarV.b());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String b() {
        return B(",");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double c() {
        if (this.a.size() == 1) {
            return v(0).c();
        }
        return this.a.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean d() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (t() != fVar.t()) {
            return false;
        }
        if (this.a.isEmpty()) {
            return fVar.a.isEmpty();
        }
        for (int iIntValue = this.a.firstKey().intValue(); iIntValue <= this.a.lastKey().intValue(); iIntValue++) {
            if (!v(iIntValue).equals(fVar.v(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final q f(String str) {
        q qVar;
        if ("length".equals(str)) {
            return new i(Double.valueOf(t()));
        }
        return (!n(str) || (qVar = this.b.get(str)) == null) ? q.x : qVar;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator<q> h() {
        return new d(this, this.a.keySet().iterator(), this.b.keySet().iterator());
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator<q> iterator() {
        return new e(this);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q j() {
        SortedMap<Integer, q> sortedMap;
        Integer key;
        q qVarJ;
        f fVar = new f();
        for (Map.Entry<Integer, q> entry : this.a.entrySet()) {
            if (entry.getValue() instanceof m) {
                sortedMap = fVar.a;
                key = entry.getKey();
                qVarJ = entry.getValue();
            } else {
                sortedMap = fVar.a;
                key = entry.getKey();
                qVarJ = entry.getValue().j();
            }
            sortedMap.put(key, qVarJ);
        }
        return fVar;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final void l(String str, q qVar) {
        if (qVar == null) {
            this.b.remove(str);
        } else {
            this.b.put(str, qVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final boolean n(String str) {
        return "length".equals(str) || this.b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q q(String str, v4 v4Var, List<q> list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? d0.a(str, this, v4Var, list) : k.a(this, new u(str), v4Var, list);
    }

    public final List<q> r() {
        ArrayList arrayList = new ArrayList(t());
        for (int i2 = 0; i2 < t(); i2++) {
            arrayList.add(v(i2));
        }
        return arrayList;
    }

    public final Iterator<Integer> s() {
        return this.a.keySet().iterator();
    }

    public final int t() {
        if (this.a.isEmpty()) {
            return 0;
        }
        return this.a.lastKey().intValue() + 1;
    }

    public final String toString() {
        return B(",");
    }

    public final int u() {
        return this.a.size();
    }

    public final q v(int i2) {
        q qVar;
        if (i2 < t()) {
            return (!x(i2) || (qVar = this.a.get(Integer.valueOf(i2))) == null) ? q.x : qVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @RequiresNonNull({"elements"})
    public final void w(int i2, q qVar) {
        if (i2 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Out of bounds index: ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (qVar == null) {
            this.a.remove(Integer.valueOf(i2));
        } else {
            this.a.put(Integer.valueOf(i2), qVar);
        }
    }

    public final boolean x(int i2) {
        if (i2 >= 0 && i2 <= this.a.lastKey().intValue()) {
            return this.a.containsKey(Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void y() {
        this.a.clear();
    }

    public final void z(int i2, q qVar) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid value index: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 >= t()) {
            w(i2, qVar);
            return;
        }
        for (int iIntValue = this.a.lastKey().intValue(); iIntValue >= i2; iIntValue--) {
            SortedMap<Integer, q> sortedMap = this.a;
            Integer numValueOf = Integer.valueOf(iIntValue);
            q qVar2 = sortedMap.get(numValueOf);
            if (qVar2 != null) {
                w(iIntValue + 1, qVar2);
                this.a.remove(numValueOf);
            }
        }
        w(i2, qVar);
    }
}
