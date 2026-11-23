package j.d.a.d.a.a;

import android.content.Context;
import j.d.a.d.a.b.h0;
import j.d.a.d.a.b.s;

/* JADX INFO: loaded from: classes.dex */
public final class c implements h0<Object> {
    private final h0 a;
    private final /* synthetic */ int b = 3;

    public c(h0<Context> h0Var, short[] sArr) {
        this.a = h0Var;
    }

    public static c b(h0<Context> h0Var) {
        return new c(h0Var, null);
    }

    @Override // j.d.a.d.a.b.h0
    public final /* bridge */ /* synthetic */ Object a() {
        int i2 = this.b;
        if (i2 == 0) {
            a aVar = (a) this.a.a();
            s.d(aVar);
            return aVar;
        }
        if (i2 == 1) {
            ((d) this.a).b();
            throw null;
        }
        if (i2 != 2) {
            return new j.d.a.d.a.e.a((Context) this.a.a());
        }
        ((d) this.a).b();
        throw null;
    }
}
