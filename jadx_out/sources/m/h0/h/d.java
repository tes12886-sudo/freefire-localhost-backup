package m.h0.h;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import l.s;
import m.f0;
import m.h0.k.n;
import m.r;
import m.v;
import m.z;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private final g a;
    private final m.a b;
    private final e c;
    private final r d;
    private j.b e;
    private j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private f0 f2204j;

    public d(g gVar, m.a aVar, e eVar, r rVar) {
        l.y.c.i.e(gVar, "connectionPool");
        l.y.c.i.e(aVar, "address");
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(rVar, "eventListener");
        this.a = gVar;
        this.b = aVar;
        this.c = eVar;
        this.d = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:59:0x0127  */
    /* JADX WARN: Code duplicated, block: B:60:0x013b  */
    /* JADX WARN: Code duplicated, block: B:76:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final f b(int i2, int i3, int i4, int i5, boolean z) throws IOException {
        List<f0> listA;
        f fVar;
        f fVarP;
        Socket socketA;
        if (this.c.f()) {
            throw new IOException("Canceled");
        }
        f fVarP2 = this.c.p();
        if (fVarP2 != null) {
            synchronized (fVarP2) {
                socketA = (fVarP2.q() || !g(fVarP2.A().a().l())) ? this.c.A() : null;
                s sVar = s.a;
            }
            if (this.c.p() != null) {
                if (socketA == null) {
                    return fVarP2;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            if (socketA != null) {
                m.h0.d.k(socketA);
            }
            this.d.l(this.c, fVarP2);
        }
        this.f2201g = 0;
        this.f2202h = 0;
        this.f2203i = 0;
        if (this.a.a(this.b, this.c, null, false)) {
            fVarP = this.c.p();
            l.y.c.i.c(fVarP);
        } else {
            f0 f0VarC = this.f2204j;
            try {
                if (f0VarC != null) {
                    l.y.c.i.c(f0VarC);
                    this.f2204j = null;
                } else {
                    j.b bVar = this.e;
                    if (bVar != null) {
                        l.y.c.i.c(bVar);
                        if (bVar.b()) {
                            j.b bVar2 = this.e;
                            l.y.c.i.c(bVar2);
                            f0VarC = bVar2.c();
                        }
                        fVar = new f(this.a, f0VarC);
                        this.c.C(fVar);
                        fVar.g(i2, i3, i4, i5, z, this.c, this.d);
                        this.c.C(null);
                        this.c.o().w().a(fVar.A());
                        if (!this.a.a(this.b, this.c, listA, true)) {
                            synchronized (fVar) {
                                this.a.e(fVar);
                                this.c.e(fVar);
                                s sVar2 = s.a;
                            }
                            this.d.k(this.c, fVar);
                            return fVar;
                        }
                        fVarP = this.c.p();
                        l.y.c.i.c(fVarP);
                        this.f2204j = f0VarC;
                        m.h0.d.k(fVar.E());
                    }
                    j jVar = this.f;
                    if (jVar == null) {
                        jVar = new j(this.b, this.c.o().w(), this.c, this.d);
                        this.f = jVar;
                    }
                    j.b bVarC = jVar.c();
                    this.e = bVarC;
                    listA = bVarC.a();
                    if (this.c.f()) {
                        throw new IOException("Canceled");
                    }
                    if (this.a.a(this.b, this.c, listA, false)) {
                        fVarP = this.c.p();
                        l.y.c.i.c(fVarP);
                    } else {
                        f0VarC = bVarC.c();
                        fVar = new f(this.a, f0VarC);
                        this.c.C(fVar);
                        fVar.g(i2, i3, i4, i5, z, this.c, this.d);
                        this.c.C(null);
                        this.c.o().w().a(fVar.A());
                        if (!this.a.a(this.b, this.c, listA, true)) {
                            synchronized (fVar) {
                                this.a.e(fVar);
                                this.c.e(fVar);
                                s sVar3 = s.a;
                                this.d.k(this.c, fVar);
                                return fVar;
                            }
                        }
                        fVarP = this.c.p();
                        l.y.c.i.c(fVarP);
                        this.f2204j = f0VarC;
                        m.h0.d.k(fVar.E());
                    }
                }
                fVar.g(i2, i3, i4, i5, z, this.c, this.d);
                this.c.C(null);
                this.c.o().w().a(fVar.A());
                if (!this.a.a(this.b, this.c, listA, true)) {
                    synchronized (fVar) {
                        this.a.e(fVar);
                        this.c.e(fVar);
                        s sVar4 = s.a;
                        this.d.k(this.c, fVar);
                        return fVar;
                    }
                }
                fVarP = this.c.p();
                l.y.c.i.c(fVarP);
                this.f2204j = f0VarC;
                m.h0.d.k(fVar.E());
            } catch (Throwable th) {
                this.c.C(null);
                throw th;
            }
            listA = null;
            fVar = new f(this.a, f0VarC);
            this.c.C(fVar);
        }
        this.d.k(this.c, fVarP);
        return fVarP;
    }

    private final f c(int i2, int i3, int i4, int i5, boolean z, boolean z2) throws IOException {
        while (true) {
            f fVarB = b(i2, i3, i4, i5, z);
            if (fVarB.v(z2)) {
                return fVarB;
            }
            fVarB.z();
            if (this.f2204j == null) {
                j.b bVar = this.e;
                if (bVar == null ? true : bVar.b()) {
                    continue;
                } else {
                    j jVar = this.f;
                    if (!(jVar != null ? jVar.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final f0 f() {
        f fVarP;
        if (this.f2201g > 1 || this.f2202h > 1 || this.f2203i > 0 || (fVarP = this.c.p()) == null) {
            return null;
        }
        synchronized (fVarP) {
            if (fVarP.r() != 0) {
                return null;
            }
            if (m.h0.d.h(fVarP.A().a().l(), d().l())) {
                return fVarP.A();
            }
            return null;
        }
    }

    public final m.h0.i.d a(z zVar, m.h0.i.g gVar) {
        l.y.c.i.e(zVar, "client");
        l.y.c.i.e(gVar, "chain");
        try {
            return c(gVar.g(), gVar.i(), gVar.k(), zVar.A(), zVar.H(), !l.y.c.i.a(gVar.j().g(), "GET")).x(zVar, gVar);
        } catch (IOException e) {
            h(e);
            throw new i(e);
        } catch (i e2) {
            h(e2.c());
            throw e2;
        }
    }

    public final m.a d() {
        return this.b;
    }

    public final boolean e() {
        j jVar;
        boolean z = false;
        if (this.f2201g == 0 && this.f2202h == 0 && this.f2203i == 0) {
            return false;
        }
        if (this.f2204j != null) {
            return true;
        }
        f0 f0VarF = f();
        if (f0VarF != null) {
            this.f2204j = f0VarF;
            return true;
        }
        j.b bVar = this.e;
        if (bVar != null && bVar.b()) {
            z = true;
        }
        if (z || (jVar = this.f) == null) {
            return true;
        }
        return jVar.a();
    }

    public final boolean g(v vVar) {
        l.y.c.i.e(vVar, "url");
        v vVarL = this.b.l();
        return vVar.n() == vVarL.n() && l.y.c.i.a(vVar.i(), vVarL.i());
    }

    public final void h(IOException iOException) {
        l.y.c.i.e(iOException, "e");
        this.f2204j = null;
        if ((iOException instanceof n) && ((n) iOException).a == m.h0.k.b.REFUSED_STREAM) {
            this.f2201g++;
        } else if (iOException instanceof m.h0.k.a) {
            this.f2202h++;
        } else {
            this.f2203i++;
        }
    }
}
