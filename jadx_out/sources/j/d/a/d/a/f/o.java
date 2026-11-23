package j.d.a.d.a.f;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
final class o<ResultT> {
    private final Object a = new Object();
    private Queue<n<ResultT>> b;
    private boolean c;

    o() {
    }

    public final void a(n<ResultT> nVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(nVar);
        }
    }

    public final void b(e<ResultT> eVar) {
        n<ResultT> nVarPoll;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        nVarPoll = this.b.poll();
                        if (nVarPoll == null) {
                            this.c = false;
                            return;
                        }
                    }
                    nVarPoll.a(eVar);
                }
            }
        }
    }
}
