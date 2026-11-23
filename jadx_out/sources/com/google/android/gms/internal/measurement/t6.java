package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class t6<T> extends v6<T> {
    static final t6<Object> a = new t6<>();

    private t6() {
    }

    @Override // com.google.android.gms.internal.measurement.v6
    public final boolean a() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.v6
    public final T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
