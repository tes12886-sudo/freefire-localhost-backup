package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class b7<T> implements Serializable, y6 {

    @NullableDecl
    final T a;

    b7(@NullableDecl T t) {
        this.a = t;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof b7)) {
            return false;
        }
        T t = this.a;
        T t2 = ((b7) obj).a;
        return t == t2 || t.equals(t2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final T zza() {
        return this.a;
    }
}
