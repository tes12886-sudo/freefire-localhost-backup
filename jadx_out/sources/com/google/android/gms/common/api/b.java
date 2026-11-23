package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class b extends Exception {

    @Deprecated
    protected final Status a;

    public b(Status status) {
        super(status.h() + ": " + (status.j() != null ? status.j() : ""));
        this.a = status;
    }

    public Status a() {
        return this.a;
    }

    public int b() {
        return this.a.h();
    }
}
