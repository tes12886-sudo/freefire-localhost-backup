package com.garena.pay.android.i;

/* JADX INFO: loaded from: classes.dex */
public class c extends Exception {
    private String a;

    public c(String str) {
        super(str);
        this.a = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.a;
    }
}
