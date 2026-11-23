package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v implements q {
    @Override // com.google.android.gms.internal.measurement.q
    public final String b() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double c() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean d() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof v;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator<q> h() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q j() {
        return q.x;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q q(String str, v4 v4Var, List<q> list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
