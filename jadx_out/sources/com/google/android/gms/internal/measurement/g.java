package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements q {
    private final boolean a;

    public g(Boolean bool) {
        this.a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String b() {
        return Boolean.toString(this.a);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double c() {
        return Double.valueOf(true != this.a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean d() {
        return Boolean.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.a == ((g) obj).a;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator<q> h() {
        return null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q j() {
        return new g(Boolean.valueOf(this.a));
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q q(String str, v4 v4Var, List<q> list) {
        if ("toString".equals(str)) {
            return new u(Boolean.toString(this.a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.a), str));
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
