package com.facebook.share.b;

/* JADX INFO: loaded from: classes.dex */
public enum a implements com.facebook.internal.h {
    SHARE_CAMERA_EFFECT(20170417);

    private final int a;

    a(int i2) {
        this.a = i2;
    }

    @Override // com.facebook.internal.h
    public String a() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }

    @Override // com.facebook.internal.h
    public int c() {
        return this.a;
    }
}
