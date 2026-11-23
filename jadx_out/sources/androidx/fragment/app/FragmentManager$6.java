package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
class FragmentManager$6 implements androidx.lifecycle.i {
    final /* synthetic */ String a;
    final /* synthetic */ s b;
    final /* synthetic */ androidx.lifecycle.g c;
    final /* synthetic */ n d;

    @Override // androidx.lifecycle.i
    public void d(androidx.lifecycle.k kVar, androidx.lifecycle.g.b bVar) {
        Bundle bundle;
        if (bVar == androidx.lifecycle.g.b.ON_START && (bundle = (Bundle) this.d.f402j.get(this.a)) != null) {
            this.b.a(this.a, bundle);
            this.d.r(this.a);
        }
        if (bVar == androidx.lifecycle.g.b.ON_DESTROY) {
            this.c.c(this);
            this.d.f403k.remove(this.a);
        }
    }
}
