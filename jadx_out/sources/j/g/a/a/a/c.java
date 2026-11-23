package j.g.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> implements o.f<T> {
    @Override // o.f
    public final void a(o.d<T> dVar, o.t<T> tVar) {
        if (tVar.f()) {
            d(new j<>(tVar.a(), tVar));
        } else {
            c(new o(tVar));
        }
    }

    @Override // o.f
    public final void b(o.d<T> dVar, Throwable th) {
        c(new v("Request Failure", th));
    }

    public abstract void c(v vVar);

    public abstract void d(j<T> jVar);
}
