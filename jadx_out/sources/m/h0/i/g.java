package m.h0.i;

import java.util.List;
import m.b0;
import m.d0;
import m.w;

/* JADX INFO: loaded from: classes.dex */
public final class g implements w.a {
    private final m.h0.h.e a;
    private final List<w> b;
    private final int c;
    private final m.h0.h.c d;
    private final b0 e;
    private final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f2227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f2228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2229i;

    /* JADX WARN: Multi-variable type inference failed */
    public g(m.h0.h.e eVar, List<? extends w> list, int i2, m.h0.h.c cVar, b0 b0Var, int i3, int i4, int i5) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(list, "interceptors");
        l.y.c.i.e(b0Var, "request");
        this.a = eVar;
        this.b = list;
        this.c = i2;
        this.d = cVar;
        this.e = b0Var;
        this.f = i3;
        this.f2227g = i4;
        this.f2228h = i5;
    }

    public static /* synthetic */ g e(g gVar, int i2, m.h0.h.c cVar, b0 b0Var, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = gVar.c;
        }
        if ((i6 & 2) != 0) {
            cVar = gVar.d;
        }
        m.h0.h.c cVar2 = cVar;
        if ((i6 & 4) != 0) {
            b0Var = gVar.e;
        }
        b0 b0Var2 = b0Var;
        if ((i6 & 8) != 0) {
            i3 = gVar.f;
        }
        int i7 = i3;
        if ((i6 & 16) != 0) {
            i4 = gVar.f2227g;
        }
        int i8 = i4;
        if ((i6 & 32) != 0) {
            i5 = gVar.f2228h;
        }
        return gVar.d(i2, cVar2, b0Var2, i7, i8, i5);
    }

    @Override // m.w.a
    public d0 a(b0 b0Var) {
        l.y.c.i.e(b0Var, "request");
        if (!(this.c < this.b.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f2229i++;
        m.h0.h.c cVar = this.d;
        if (cVar != null) {
            if (!cVar.j().g(b0Var.j())) {
                throw new IllegalStateException(("network interceptor " + this.b.get(this.c - 1) + " must retain the same host and port").toString());
            }
            if (!(this.f2229i == 1)) {
                throw new IllegalStateException(("network interceptor " + this.b.get(this.c - 1) + " must call proceed() exactly once").toString());
            }
        }
        g gVarE = e(this, this.c + 1, null, b0Var, 0, 0, 0, 58, null);
        w wVar = this.b.get(this.c);
        d0 d0VarA = wVar.a(gVarE);
        if (d0VarA == null) {
            throw new NullPointerException("interceptor " + wVar + " returned null");
        }
        if (this.d != null) {
            if (!(this.c + 1 >= this.b.size() || gVarE.f2229i == 1)) {
                throw new IllegalStateException(("network interceptor " + wVar + " must call proceed() exactly once").toString());
            }
        }
        if (d0VarA.b() != null) {
            return d0VarA;
        }
        throw new IllegalStateException(("interceptor " + wVar + " returned a response with no body").toString());
    }

    @Override // m.w.a
    public m.j b() {
        m.h0.h.c cVar = this.d;
        if (cVar == null) {
            return null;
        }
        return cVar.h();
    }

    @Override // m.w.a
    public b0 c() {
        return this.e;
    }

    @Override // m.w.a
    public m.e call() {
        return this.a;
    }

    public final g d(int i2, m.h0.h.c cVar, b0 b0Var, int i3, int i4, int i5) {
        l.y.c.i.e(b0Var, "request");
        return new g(this.a, this.b, i2, cVar, b0Var, i3, i4, i5);
    }

    public final m.h0.h.e f() {
        return this.a;
    }

    public final int g() {
        return this.f;
    }

    public final m.h0.h.c h() {
        return this.d;
    }

    public final int i() {
        return this.f2227g;
    }

    public final b0 j() {
        return this.e;
    }

    public final int k() {
        return this.f2228h;
    }

    public int l() {
        return this.f2227g;
    }
}
