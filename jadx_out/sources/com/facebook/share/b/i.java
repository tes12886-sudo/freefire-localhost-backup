package com.facebook.share.b;

/* JADX INFO: loaded from: classes.dex */
public enum i implements com.facebook.internal.h {
    OG_ACTION_DIALOG(20130618);

    private int a;

    i(int i2) {
        this.a = i2;
    }

    @Override // com.facebook.internal.h
    public String a() {
        return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    }

    @Override // com.facebook.internal.h
    public int c() {
        return this.a;
    }
}
