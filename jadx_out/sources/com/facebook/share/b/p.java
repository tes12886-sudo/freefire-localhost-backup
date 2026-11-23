package com.facebook.share.b;

/* JADX INFO: loaded from: classes.dex */
public enum p implements com.facebook.internal.h {
    SHARE_STORY_ASSET(20170417);

    private int a;

    p(int i2) {
        this.a = i2;
    }

    @Override // com.facebook.internal.h
    public String a() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }

    @Override // com.facebook.internal.h
    public int c() {
        return this.a;
    }
}
