package o.z.a;

import j.d.d.e;
import j.d.d.w;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import m.c0;
import m.x;
import o.h;

/* JADX INFO: loaded from: classes.dex */
final class b<T> implements h<T, c0> {
    private static final x c = x.e("application/json; charset=UTF-8");
    private static final Charset d = Charset.forName("UTF-8");
    private final e a;
    private final w<T> b;

    b(e eVar, w<T> wVar) {
        this.a = eVar;
        this.b = wVar;
    }

    @Override // o.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c0 a(T t) throws IOException {
        n.b bVar = new n.b();
        j.d.d.b0.c cVarR = this.a.r(new OutputStreamWriter(bVar.h0(), d));
        this.b.d(cVarR, t);
        cVarR.close();
        return c0.d(c, bVar.j0());
    }
}
