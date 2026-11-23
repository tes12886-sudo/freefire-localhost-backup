package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements j.d.a.d.a.b.h0<l0> {
    private final j.d.a.d.a.b.h0 a;
    private final j.d.a.d.a.b.h0 b;
    private final j.d.a.d.a.b.h0 c;
    private final j.d.a.d.a.b.h0 d;
    private final j.d.a.d.a.b.h0 e;
    private final j.d.a.d.a.b.h0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j.d.a.d.a.b.h0 f1334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j.d.a.d.a.b.h0 f1335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final /* synthetic */ int f1336i = 0;

    public m0(j.d.a.d.a.b.h0<a1> h0Var, j.d.a.d.a.b.h0<s2> h0Var2, j.d.a.d.a.b.h0<j0> h0Var3, j.d.a.d.a.b.h0<c2> h0Var4, j.d.a.d.a.b.h0<n1> h0Var5, j.d.a.d.a.b.h0<s1> h0Var6, j.d.a.d.a.b.h0<w1> h0Var7, j.d.a.d.a.b.h0<d1> h0Var8) {
        this.a = h0Var;
        this.b = h0Var2;
        this.c = h0Var3;
        this.d = h0Var4;
        this.e = h0Var5;
        this.f = h0Var6;
        this.f1334g = h0Var7;
        this.f1335h = h0Var8;
    }

    public m0(j.d.a.d.a.b.h0<Context> h0Var, j.d.a.d.a.b.h0<a1> h0Var2, j.d.a.d.a.b.h0<l0> h0Var3, j.d.a.d.a.b.h0<s2> h0Var4, j.d.a.d.a.b.h0<o0> h0Var5, j.d.a.d.a.b.h0<e0> h0Var6, j.d.a.d.a.b.h0<Executor> h0Var7, j.d.a.d.a.b.h0<Executor> h0Var8, byte[] bArr) {
        this.a = h0Var;
        this.f1334g = h0Var2;
        this.f1335h = h0Var3;
        this.b = h0Var4;
        this.e = h0Var5;
        this.f = h0Var6;
        this.c = h0Var7;
        this.d = h0Var8;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.play.core.assetpacks.l0, com.google.android.play.core.assetpacks.s] */
    @Override // j.d.a.d.a.b.h0
    public final /* bridge */ /* synthetic */ l0 a() {
        if (this.f1336i == 0) {
            Object objA = this.a.a();
            return new l0((a1) objA, j.d.a.d.a.b.g0.c(this.b), (j0) this.c.a(), (c2) this.d.a(), (n1) this.e.a(), (s1) this.f.a(), (w1) this.f1334g.a(), (d1) this.f1335h.a());
        }
        Context contextA = ((o2) this.a).a();
        Object objA2 = this.f1334g.a();
        Object objA3 = this.f1335h.a();
        j.d.a.d.a.b.e0 e0VarC = j.d.a.d.a.b.g0.c(this.b);
        Object objA4 = this.e.a();
        Object objA5 = this.f.a();
        return new s(contextA, (a1) objA2, (l0) objA3, e0VarC, (o0) objA4, (e0) objA5, j.d.a.d.a.b.g0.c(this.c), j.d.a.d.a.b.g0.c(this.d));
    }
}
