package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements i {
    private final Object a;
    private final a.C0024a b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.b = a.c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.i
    public void d(k kVar, g.b bVar) {
        this.b.a(kVar, bVar, this.a);
    }
}
