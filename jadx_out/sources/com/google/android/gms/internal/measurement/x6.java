package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class x6<T> extends v6<T> {
    private final T a;

    x6(T t) {
        this.a = t;
    }

    @Override // com.google.android.gms.internal.measurement.v6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.v6
    public final T b() {
        return this.a;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof x6) {
            return this.a.equals(((x6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
