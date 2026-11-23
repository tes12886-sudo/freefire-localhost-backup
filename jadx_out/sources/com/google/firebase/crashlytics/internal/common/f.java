package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes.dex */
final class f extends m {
    private final com.google.firebase.crashlytics.internal.e.v a;
    private final String b;

    f(com.google.firebase.crashlytics.internal.e.v vVar, String str) {
        if (vVar == null) {
            throw new NullPointerException("Null report");
        }
        this.a = vVar;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.b = str;
    }

    @Override // com.google.firebase.crashlytics.internal.common.m
    public com.google.firebase.crashlytics.internal.e.v b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.m
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a.equals(mVar.b()) && this.b.equals(mVar.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + "}";
    }
}
