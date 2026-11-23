package o.z.a;

import j.d.d.e;
import j.d.d.l;
import j.d.d.w;
import m.e0;
import o.h;

/* JADX INFO: loaded from: classes.dex */
final class c<T> implements h<e0, T> {
    private final e a;
    private final w<T> b;

    c(e eVar, w<T> wVar) {
        this.a = eVar;
        this.b = wVar;
    }

    @Override // o.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(e0 e0Var) {
        j.d.d.b0.a aVarQ = this.a.q(e0Var.c());
        try {
            T tB = this.b.b(aVarQ);
            if (aVarQ.n0() != j.d.d.b0.b.END_DOCUMENT) {
                throw new l("JSON document was not fully consumed.");
            }
            e0Var.close();
            return tB;
        } catch (Throwable th) {
            e0Var.close();
            throw th;
        }
    }
}
