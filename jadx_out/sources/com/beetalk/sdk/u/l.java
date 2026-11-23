package com.beetalk.sdk.u;

/* JADX INFO: loaded from: classes.dex */
public enum l {
    GARENA_NATIVE_ANDROID(3),
    GARENA_WEB_ANDROID(4),
    GARENA_OTHERS(5),
    FACEBOOK(6),
    OTHERS(7),
    GUEST(8),
    VK(9),
    LINE(10),
    GOOGLE(11),
    TWITTER(13);

    private int a;

    l(int i2) {
        this.a = i2;
    }

    public static l d(int i2) {
        for (l lVar : values()) {
            if (lVar.c() == i2) {
                return lVar;
            }
        }
        return OTHERS;
    }

    public int c() {
        return this.a;
    }
}
