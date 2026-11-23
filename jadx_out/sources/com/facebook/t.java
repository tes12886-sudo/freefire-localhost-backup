package com.facebook;

/* JADX INFO: loaded from: classes.dex */
public final class t extends n {
    private final q a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q qVar, String str) {
        super(str);
        l.y.c.i.e(qVar, "requestError");
        this.a = qVar;
    }

    public final q a() {
        return this.a;
    }

    @Override // com.facebook.n, java.lang.Throwable
    public String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.a.f() + ", facebookErrorCode: " + this.a.b() + ", facebookErrorType: " + this.a.d() + ", message: " + this.a.c() + "}";
        l.y.c.i.d(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
