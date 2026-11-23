package com.google.android.datatransport.h.x.j;

/* JADX INFO: loaded from: classes.dex */
final class x extends e0 {
    private final long a;
    private final com.google.android.datatransport.h.n b;
    private final com.google.android.datatransport.h.i c;

    x(long j2, com.google.android.datatransport.h.n nVar, com.google.android.datatransport.h.i iVar) {
        this.a = j2;
        if (nVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = nVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.c = iVar;
    }

    @Override // com.google.android.datatransport.h.x.j.e0
    public com.google.android.datatransport.h.i b() {
        return this.c;
    }

    @Override // com.google.android.datatransport.h.x.j.e0
    public long c() {
        return this.a;
    }

    @Override // com.google.android.datatransport.h.x.j.e0
    public com.google.android.datatransport.h.n d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.a == e0Var.c() && this.b.equals(e0Var.d()) && this.c.equals(e0Var.b());
    }

    public int hashCode() {
        long j2 = this.a;
        return this.c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
