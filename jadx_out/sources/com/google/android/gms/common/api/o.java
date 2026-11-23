package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public final class o extends UnsupportedOperationException {
    private final com.google.android.gms.common.c a;

    public o(com.google.android.gms.common.c cVar) {
        this.a = cVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.a)));
    }
}
