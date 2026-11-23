package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r implements q {
    private final String a;
    private final ArrayList<q> b;

    public r(String str, List<q> list) {
        this.a = str;
        ArrayList<q> arrayList = new ArrayList<>();
        this.b = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String b() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double c() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean d() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final ArrayList<q> e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        String str = this.a;
        if (str == null ? rVar.a == null : str.equals(rVar.a)) {
            return this.b.equals(rVar.b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator<q> h() {
        return null;
    }

    public final int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q j() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q q(String str, v4 v4Var, List<q> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
