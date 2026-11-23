package j.g.a.a.a.y.j;

import j.g.a.a.a.u;
import m.b0;
import m.d0;
import m.w;
import m.z;

/* JADX INFO: loaded from: classes.dex */
abstract class h {
    private final u a;
    private final j.g.a.a.a.y.g b;
    private final String c;
    private final o.u d;

    class a implements w {
        a() {
        }

        @Override // m.w
        public d0 a(w.a aVar) {
            b0.a aVarH = aVar.c().h();
            aVarH.d("User-Agent", h.this.d());
            return aVar.a(aVarH.a());
        }
    }

    h(u uVar, j.g.a.a.a.y.g gVar) {
        this.a = uVar;
        this.b = gVar;
        this.c = j.g.a.a.a.y.g.b("TwitterAndroidSDK", uVar.h());
        m.i0.a aVar = new m.i0.a();
        aVar.e(m.i0.a.EnumC0272a.BODY);
        z.a aVar2 = new z.a();
        aVar2.a(new a());
        aVar2.a(aVar);
        aVar2.c(j.g.a.a.a.y.i.b.b());
        z zVarB = aVar2.b();
        o.u.b bVar = new o.u.b();
        bVar.b(a().c());
        bVar.f(zVarB);
        bVar.a(o.z.a.a.f());
        this.d = bVar.d();
    }

    protected j.g.a.a.a.y.g a() {
        return this.b;
    }

    protected o.u b() {
        return this.d;
    }

    protected u c() {
        return this.a;
    }

    protected String d() {
        return this.c;
    }
}
