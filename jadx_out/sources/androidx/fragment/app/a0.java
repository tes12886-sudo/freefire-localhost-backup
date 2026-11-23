package androidx.fragment.app;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: loaded from: classes.dex */
class a0 implements androidx.savedstate.c, androidx.lifecycle.y {
    private final androidx.lifecycle.x a;
    private androidx.lifecycle.l b = null;
    private androidx.savedstate.b c = null;

    a0(Fragment fragment, androidx.lifecycle.x xVar) {
        this.a = xVar;
    }

    @Override // androidx.lifecycle.k
    public androidx.lifecycle.g a() {
        e();
        return this.b;
    }

    void b(androidx.lifecycle.g.b bVar) {
        this.b.h(bVar);
    }

    @Override // androidx.savedstate.c
    public SavedStateRegistry d() {
        e();
        return this.c.b();
    }

    void e() {
        if (this.b == null) {
            this.b = new androidx.lifecycle.l(this);
            this.c = androidx.savedstate.b.a(this);
        }
    }

    boolean f() {
        return this.b != null;
    }

    void g(Bundle bundle) {
        this.c.c(bundle);
    }

    void h(Bundle bundle) {
        this.c.d(bundle);
    }

    void i(androidx.lifecycle.g.c cVar) {
        this.b.o(cVar);
    }

    @Override // androidx.lifecycle.y
    public androidx.lifecycle.x j() {
        e();
        return this.a;
    }
}
