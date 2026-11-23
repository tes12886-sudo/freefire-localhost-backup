package com.garena.pay.android.i;

/* JADX INFO: loaded from: classes.dex */
public class d extends RuntimeException {
    private String a;

    public d(String str) {
        super(str);
        this.a = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.a;
    }
}
