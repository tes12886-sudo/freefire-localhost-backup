package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class l1 {
    private final b a;
    private final com.google.android.gms.common.c b;

    /* synthetic */ l1(b bVar, com.google.android.gms.common.c cVar, k1 k1Var) {
        this.a = bVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof l1)) {
            l1 l1Var = (l1) obj;
            if (com.google.android.gms.common.internal.o.a(this.a, l1Var.a) && com.google.android.gms.common.internal.o.a(this.b, l1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.o.b(this.a, this.b);
    }

    public final String toString() {
        com.google.android.gms.common.internal.o.a aVarC = com.google.android.gms.common.internal.o.c(this);
        aVarC.a("key", this.a);
        aVarC.a("feature", this.b);
        return aVarC.toString();
    }
}
