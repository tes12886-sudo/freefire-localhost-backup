package com.garena.sdkunity;

import com.beetalk.sdk.g;

/* JADX INFO: loaded from: classes.dex */
public class Utility {
    public static g.o getProvider(int i2) {
        if (i2 == 1) {
            return g.o.GARENA;
        }
        if (i2 == 8) {
            return g.o.GOOGLE;
        }
        if (i2 == 11) {
            return g.o.TWITTER;
        }
        if (i2 == 3) {
            return g.o.FACEBOOK;
        }
        if (i2 == 4) {
            return g.o.GUEST;
        }
        if (i2 != 5) {
            return null;
        }
        return g.o.VK;
    }
}
