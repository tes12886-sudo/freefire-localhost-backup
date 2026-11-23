package com.google.firebase.platforminfo;

import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
abstract class f {
    f() {
    }

    static f a(String str, String str2) {
        return new c(str, str2);
    }

    @Nonnull
    public abstract String b();

    @Nonnull
    public abstract String c();
}
