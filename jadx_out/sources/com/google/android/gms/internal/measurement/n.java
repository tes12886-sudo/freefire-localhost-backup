package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class n implements q, m {
    final Map<String, q> a = new HashMap();

    public final List<String> a() {
        return new ArrayList(this.a.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String b() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double c() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean d() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.a.equals(((n) obj).a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final q f(String str) {
        return this.a.containsKey(str) ? this.a.get(str) : q.x;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator<q> h() {
        return k.b(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q j() {
        Map<String, q> map;
        String key;
        q qVarJ;
        n nVar = new n();
        for (Map.Entry<String, q> entry : this.a.entrySet()) {
            if (entry.getValue() instanceof m) {
                map = nVar.a;
                key = entry.getKey();
                qVarJ = entry.getValue();
            } else {
                map = nVar.a;
                key = entry.getKey();
                qVarJ = entry.getValue().j();
            }
            map.put(key, qVarJ);
        }
        return nVar;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final void l(String str, q qVar) {
        if (qVar == null) {
            this.a.remove(str);
        } else {
            this.a.put(str, qVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final boolean n(String str) {
        return this.a.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public q q(String str, v4 v4Var, List<q> list) {
        return "toString".equals(str) ? new u(toString()) : k.a(this, new u(str), v4Var, list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.a.isEmpty()) {
            for (String str : this.a.keySet()) {
                sb.append(String.format("%s: %s,", str, this.a.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
