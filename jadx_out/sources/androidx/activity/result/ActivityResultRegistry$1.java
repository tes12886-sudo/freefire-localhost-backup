package androidx.activity.result;

import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;

/* JADX INFO: loaded from: classes.dex */
class ActivityResultRegistry$1 implements i {
    final /* synthetic */ String a;
    final /* synthetic */ b b;
    final /* synthetic */ androidx.activity.result.g.a c;
    final /* synthetic */ d d;

    @Override // androidx.lifecycle.i
    public void d(k kVar, g.b bVar) {
        if (!g.b.ON_START.equals(bVar)) {
            if (g.b.ON_STOP.equals(bVar)) {
                this.d.f.remove(this.a);
                return;
            } else {
                if (g.b.ON_DESTROY.equals(bVar)) {
                    this.d.k(this.a);
                    return;
                }
                return;
            }
        }
        this.d.f.put(this.a, new d.b<>(this.b, this.c));
        if (this.d.f14g.containsKey(this.a)) {
            Object obj = this.d.f14g.get(this.a);
            this.d.f14g.remove(this.a);
            this.b.a(obj);
        }
        a aVar = (a) this.d.f15h.getParcelable(this.a);
        if (aVar != null) {
            this.d.f15h.remove(this.a);
            this.b.a(this.c.c(aVar.b(), aVar.a()));
        }
    }
}
