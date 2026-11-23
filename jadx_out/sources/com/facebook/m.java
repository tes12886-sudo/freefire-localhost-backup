package com.facebook;

/* JADX INFO: loaded from: classes.dex */
public final class m extends n {
    private final int a;
    private final String b;

    public m(String str, int i2, String str2) {
        super(str);
        this.a = i2;
        this.b = str2;
    }

    @Override // com.facebook.n, java.lang.Throwable
    public String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.a + ", message: " + getMessage() + ", url: " + this.b + "}";
        l.y.c.i.d(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
