package com.google.android.gms.auth.api.signin.internal;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
public class b {
    static int b = 31;
    private int a = 1;

    @CanIgnoreReturnValue
    public b a(Object obj) {
        this.a = (b * this.a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.a;
    }

    @CanIgnoreReturnValue
    public final b c(boolean z) {
        this.a = (b * this.a) + (z ? 1 : 0);
        return this;
    }
}
