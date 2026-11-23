package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class t1 implements j.d.a.d.a.b.h0<s1> {
    private final j.d.a.d.a.b.h0 a;
    private final j.d.a.d.a.b.h0 b;
    private final j.d.a.d.a.b.h0 c;
    private final j.d.a.d.a.b.h0 d;
    private final j.d.a.d.a.b.h0 e;
    private final j.d.a.d.a.b.h0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f1347g = 0;

    public t1(j.d.a.d.a.b.h0<v> h0Var, j.d.a.d.a.b.h0<s2> h0Var2, j.d.a.d.a.b.h0<a1> h0Var3, j.d.a.d.a.b.h0<Executor> h0Var4, j.d.a.d.a.b.h0<o0> h0Var5, j.d.a.d.a.b.h0<com.google.android.play.core.common.c> h0Var6) {
        this.a = h0Var;
        this.b = h0Var2;
        this.c = h0Var3;
        this.d = h0Var4;
        this.e = h0Var5;
        this.f = h0Var6;
    }

    public t1(j.d.a.d.a.b.h0<String> h0Var, j.d.a.d.a.b.h0<s> h0Var2, j.d.a.d.a.b.h0<o0> h0Var3, j.d.a.d.a.b.h0<Context> h0Var4, j.d.a.d.a.b.h0<u1> h0Var5, j.d.a.d.a.b.h0<Executor> h0Var6, byte[] bArr) {
        this.f = h0Var;
        this.b = h0Var2;
        this.e = h0Var3;
        this.d = h0Var4;
        this.c = h0Var5;
        this.a = h0Var6;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.play.core.assetpacks.i1, com.google.android.play.core.assetpacks.s1] */
    @Override // j.d.a.d.a.b.h0
    public final /* bridge */ /* synthetic */ s1 a() {
        if (this.f1347g == 0) {
            Object objA = this.a.a();
            j.d.a.d.a.b.e0 e0VarC = j.d.a.d.a.b.g0.c(this.b);
            Object objA2 = this.c.a();
            return new s1((v) objA, e0VarC, (a1) objA2, j.d.a.d.a.b.g0.c(this.d), (o0) this.e.a(), (com.google.android.play.core.common.c) this.f.a());
        }
        String str = (String) this.f.a();
        Object objA3 = this.b.a();
        Object objA4 = this.e.a();
        Context contextA = ((o2) this.d).a();
        Object objA5 = this.c.a();
        return new i1(str != null ? new File(contextA.getExternalFilesDir(null), str) : contextA.getExternalFilesDir(null), (s) objA3, (o0) objA4, contextA, (u1) objA5, j.d.a.d.a.b.g0.c(this.a));
    }
}
