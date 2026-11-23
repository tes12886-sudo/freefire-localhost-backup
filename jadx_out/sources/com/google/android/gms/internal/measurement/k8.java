package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class k8 {
    private final Object a;
    private final int b;

    k8(Object obj, int i2) {
        this.a = obj;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k8)) {
            return false;
        }
        k8 k8Var = (k8) obj;
        return this.a == k8Var.a && this.b == k8Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
