package j.d.a.d.a.f;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class i<ResultT> implements n<ResultT> {
    private final Executor a;
    private final Object b = new Object();
    private final a<ResultT> c;

    public i(Executor executor, a<ResultT> aVar) {
        this.a = executor;
        this.c = aVar;
    }

    @Override // j.d.a.d.a.f.n
    public final void a(e<ResultT> eVar) {
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new h(this, eVar));
        }
    }
}
