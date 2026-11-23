package com.google.android.play.core.assetpacks;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class l0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final j.d.a.d.a.b.f f1327j = new j.d.a.d.a.b.f("ExtractorLooper");
    private final a1 a;
    private final j0 b;
    private final c2 c;
    private final n1 d;
    private final s1 e;
    private final w1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j.d.a.d.a.b.e0<s2> f1328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d1 f1329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f1330i = new AtomicBoolean(false);

    l0(a1 a1Var, j.d.a.d.a.b.e0<s2> e0Var, j0 j0Var, c2 c2Var, n1 n1Var, s1 s1Var, w1 w1Var, d1 d1Var) {
        this.a = a1Var;
        this.f1328g = e0Var;
        this.b = j0Var;
        this.c = c2Var;
        this.d = n1Var;
        this.e = s1Var;
        this.f = w1Var;
        this.f1329h = d1Var;
    }

    private final void b(int i2, Exception exc) {
        try {
            this.a.o(i2);
            this.a.g(i2);
        } catch (k0 unused) {
            f1327j.b("Error during error handling: %s", exc.getMessage());
        }
    }

    final void a() {
        j.d.a.d.a.b.f fVar = f1327j;
        fVar.a("Run extractor loop", new Object[0]);
        if (!this.f1330i.compareAndSet(false, true)) {
            fVar.e("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            c1 c1VarA = null;
            try {
                c1VarA = this.f1329h.a();
            } catch (k0 e) {
                f1327j.b("Error while getting next extraction task: %s", e.getMessage());
                if (e.a >= 0) {
                    this.f1328g.a().d(e.a);
                    b(e.a, e);
                }
            }
            if (c1VarA == null) {
                this.f1330i.set(false);
                return;
            }
            try {
                if (c1VarA instanceof i0) {
                    this.b.a((i0) c1VarA);
                } else if (c1VarA instanceof b2) {
                    this.c.a((b2) c1VarA);
                } else if (c1VarA instanceof m1) {
                    this.d.a((m1) c1VarA);
                } else if (c1VarA instanceof p1) {
                    this.e.a((p1) c1VarA);
                } else if (c1VarA instanceof v1) {
                    this.f.a((v1) c1VarA);
                } else {
                    f1327j.b("Unknown task type: %s", c1VarA.getClass().getName());
                }
            } catch (Exception e2) {
                f1327j.b("Error during extraction task: %s", e2.getMessage());
                this.f1328g.a().d(c1VarA.a);
                b(c1VarA.a, e2);
            }
        }
    }
}
