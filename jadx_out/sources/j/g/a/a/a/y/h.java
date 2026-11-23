package j.g.a.a.a.y;

import j.g.a.a.a.n;
import j.g.a.a.a.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class h implements e<x> {
    private final a a;

    protected static class a {
        protected a() {
        }

        public j.g.a.a.a.a0.a a(x xVar) {
            return new n(xVar).d();
        }
    }

    public h() {
        this(new a());
    }

    h(a aVar) {
        this.a = aVar;
    }

    @Override // j.g.a.a.a.y.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(x xVar) {
        j.g.a.a.a.a0.a aVarA = this.a.a(xVar);
        try {
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = Boolean.FALSE;
            aVarA.a(bool, bool2, bool2).b();
        } catch (IOException | RuntimeException unused) {
        }
    }
}
