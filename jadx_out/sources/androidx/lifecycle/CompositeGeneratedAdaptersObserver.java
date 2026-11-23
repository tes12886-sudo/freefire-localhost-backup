package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements i {
    private final f[] a;

    CompositeGeneratedAdaptersObserver(f[] fVarArr) {
        this.a = fVarArr;
    }

    @Override // androidx.lifecycle.i
    public void d(k kVar, g.b bVar) {
        o oVar = new o();
        for (f fVar : this.a) {
            fVar.a(kVar, bVar, false, oVar);
        }
        for (f fVar2 : this.a) {
            fVar2.a(kVar, bVar, true, oVar);
        }
    }
}
