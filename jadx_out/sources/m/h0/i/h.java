package m.h0.i;

import m.e0;
import m.x;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e0 {
    private final String c;
    private final long d;
    private final n.d e;

    public h(String str, long j2, n.d dVar) {
        l.y.c.i.e(dVar, "source");
        this.c = str;
        this.d = j2;
        this.e = dVar;
    }

    @Override // m.e0
    public n.d F() {
        return this.e;
    }

    @Override // m.e0
    public long j() {
        return this.d;
    }

    @Override // m.e0
    public x l() {
        String str = this.c;
        if (str == null) {
            return null;
        }
        return x.d.b(str);
    }
}
