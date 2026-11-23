package l.v.e.a;

import l.m;
import l.n;
import l.y.c.i;

/* JADX WARN: Unexpected interfaces in signature: [java.io.Serializable] */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements l.v.a<Object>, Object {
    private final l.v.a<Object> a;

    public a(l.v.a<Object> aVar) {
        this.a = aVar;
    }

    @Override // l.v.a
    public final void b(Object obj) {
        l.v.a<Object> aVar = this;
        while (true) {
            f.a(aVar);
            a aVar2 = (a) aVar;
            l.v.a<Object> aVar3 = aVar2.a;
            i.c(aVar3);
            try {
                obj = aVar2.d(obj);
                if (obj == l.v.d.d.b()) {
                    return;
                }
                m.a aVar4 = m.a;
                m.a(obj);
            } catch (Throwable th) {
                m.a aVar5 = m.a;
                obj = n.a(th);
                m.a(obj);
            }
            aVar2.e();
            if (!(aVar3 instanceof a)) {
                aVar3.b(obj);
                return;
            }
            aVar = aVar3;
        }
    }

    public StackTraceElement c() {
        return e.d(this);
    }

    protected abstract Object d(Object obj);

    protected void e() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object objC = c();
        if (objC == null) {
            objC = getClass().getName();
        }
        sb.append(objC);
        return sb.toString();
    }
}
