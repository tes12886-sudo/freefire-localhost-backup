package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class k extends n {
    private final com.google.android.datatransport.h.z.a a;
    private final Map<com.google.android.datatransport.d, n.b> b;

    k(com.google.android.datatransport.h.z.a aVar, Map<com.google.android.datatransport.d, n.b> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.n
    com.google.android.datatransport.h.z.a e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a.equals(nVar.e()) && this.b.equals(nVar.h());
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.n
    Map<com.google.android.datatransport.d, n.b> h() {
        return this.b;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
