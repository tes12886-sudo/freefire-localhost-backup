package j.d.a.d.a.f;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class m<ResultT> implements n<ResultT> {
    private final Executor a;
    private final Object b = new Object();
    private final c<? super ResultT> c;

    public m(Executor executor, c<? super ResultT> cVar) {
        this.a = executor;
        this.c = cVar;
    }

    @Override // j.d.a.d.a.f.n
    public final void a(e<ResultT> eVar) {
        if (eVar.g()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new l(this, eVar));
            }
        }
    }
}
