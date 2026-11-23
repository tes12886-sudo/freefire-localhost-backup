package m.h0.k;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final n.e d;
    public static final n.e e;
    public static final n.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n.e f2241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n.e f2242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n.e f2243i;
    public final n.e a;
    public final n.e b;
    public final int c;

    static {
        n.e.a aVar = n.e.d;
        d = aVar.d(":");
        e = aVar.d(":status");
        f = aVar.d(":method");
        f2241g = aVar.d(":path");
        f2242h = aVar.d(":scheme");
        f2243i = aVar.d(":authority");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(String str, String str2) {
        l.y.c.i.e(str, "name");
        l.y.c.i.e(str2, "value");
        n.e.a aVar = n.e.d;
        this(aVar.d(str), aVar.d(str2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(n.e eVar, String str) {
        this(eVar, n.e.d.d(str));
        l.y.c.i.e(eVar, "name");
        l.y.c.i.e(str, "value");
    }

    public c(n.e eVar, n.e eVar2) {
        l.y.c.i.e(eVar, "name");
        l.y.c.i.e(eVar2, "value");
        this.a = eVar;
        this.b = eVar2;
        this.c = eVar.t() + 32 + eVar2.t();
    }

    public final n.e a() {
        return this.a;
    }

    public final n.e b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.y.c.i.a(this.a, cVar.a) && l.y.c.i.a(this.b, cVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return this.a.x() + ": " + this.b.x();
    }
}
