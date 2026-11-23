package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements q, m {
    protected final String a;
    protected final Map<String, q> b = new HashMap();

    public j(String str) {
        this.a = str;
    }

    public abstract q a(v4 v4Var, List<q> list);

    @Override // com.google.android.gms.internal.measurement.q
    public final String b() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double c() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean d() {
        return Boolean.TRUE;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        String str = this.a;
        if (str != null) {
            return str.equals(jVar.a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final q f(String str) {
        return this.b.containsKey(str) ? this.b.get(str) : q.x;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator<q> h() {
        return k.b(this.b);
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public q j() {
        return this;
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
        return this.b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q q(String str, v4 v4Var, List<q> list) {
        return "toString".equals(str) ? new u(this.a) : k.a(this, new u(str), v4Var, list);
    }
}
