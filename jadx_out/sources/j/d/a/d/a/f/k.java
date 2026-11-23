package j.d.a.d.a.f;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class k<ResultT> implements n<ResultT> {
    private final Executor a;
    private final Object b = new Object();
    private final b c;

    public k(Executor executor, b bVar) {
        this.a = executor;
        this.c = bVar;
    }

    @Override // j.d.a.d.a.f.n
    public final void a(e<ResultT> eVar) {
        if (eVar.g()) {
            return;
        }
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new j(this, eVar));
        }
    }
}
