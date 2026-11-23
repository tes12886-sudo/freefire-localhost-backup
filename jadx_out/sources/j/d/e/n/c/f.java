package j.d.e.n.c;

import j.d.a.e.a.a.i.g;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private j.d.e.n.b.b a;
    private j.d.e.n.b.a b;
    private j.d.e.n.b.c c;
    private int d = -1;
    private b e;

    public static boolean b(int i2) {
        return i2 >= 0 && i2 < 8;
    }

    public b a() {
        return this.e;
    }

    public void c(j.d.e.n.b.a aVar) {
        this.b = aVar;
    }

    public void d(int i2) {
        this.d = i2;
    }

    public void e(b bVar) {
        this.e = bVar;
    }

    public void f(j.d.e.n.b.b bVar) {
        this.a = bVar;
    }

    public void g(j.d.e.n.b.c cVar) {
        this.c = cVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(g.STATUS_SUCCESS);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
