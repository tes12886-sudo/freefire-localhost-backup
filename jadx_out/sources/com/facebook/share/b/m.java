package com.facebook.share.b;

/* JADX INFO: loaded from: classes.dex */
public enum m implements com.facebook.internal.h {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);

    private int a;

    m(int i2) {
        this.a = i2;
    }

    @Override // com.facebook.internal.h
    public String a() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }

    @Override // com.facebook.internal.h
    public int c() {
        return this.a;
    }
}
