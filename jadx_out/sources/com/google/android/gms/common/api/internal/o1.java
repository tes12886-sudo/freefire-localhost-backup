package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApi;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends z {

    @NotOnlyInitialized
    private final GoogleApi c;

    public o1(GoogleApi googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.c = googleApi;
    }

    @Override // com.google.android.gms.common.api.e
    public final <A extends com.google.android.gms.common.api.a.b, T extends d<? extends com.google.android.gms.common.api.j, A>> T i(T t) {
        this.c.f(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.e
    public final Context k() {
        return this.c.h();
    }

    @Override // com.google.android.gms.common.api.e
    public final Looper l() {
        return this.c.j();
    }

    @Override // com.google.android.gms.common.api.e
    public final void q(j2 j2Var) {
    }
}
