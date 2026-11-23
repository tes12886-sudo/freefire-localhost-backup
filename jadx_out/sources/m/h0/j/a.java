package m.h0.j;

import l.y.c.i;
import m.u;
import n.d;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final d a;
    private long b;

    public a(d dVar) {
        i.e(dVar, "source");
        this.a = dVar;
        this.b = 262144L;
    }

    public final u a() {
        u.a aVar = new u.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.e();
            }
            aVar.c(strB);
        }
    }

    public final String b() {
        String strK = this.a.K(this.b);
        this.b -= (long) strK.length();
        return strK;
    }
}
