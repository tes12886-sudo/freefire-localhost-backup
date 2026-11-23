package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o implements q {
    @Override // com.google.android.gms.internal.measurement.q
    public final String b() {
        return "null";
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double c() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean d() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof o;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator<q> h() {
        return null;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q j() {
        return q.y;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q q(String str, v4 v4Var, List<q> list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }
}
