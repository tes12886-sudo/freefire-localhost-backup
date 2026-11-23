package j.d.e.k.b;

/* JADX INFO: loaded from: classes.dex */
final class n extends c {
    n() {
    }

    @Override // j.d.e.k.b.c, j.d.e.k.b.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (hVar.i()) {
            char c = hVar.c();
            hVar.f++;
            c(c, sb);
            if (sb.length() % 3 == 0) {
                c.g(hVar, sb);
                if (j.n(hVar.d(), hVar.f, e()) != e()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        f(hVar, sb);
    }

    @Override // j.d.e.k.b.c
    int c(char c, StringBuilder sb) {
        char c2;
        int i2;
        if (c == '\r') {
            c2 = 0;
        } else {
            if (c != ' ') {
                if (c == '*') {
                    sb.append((char) 1);
                } else if (c != '>') {
                    if (c >= '0' && c <= '9') {
                        i2 = (c - '0') + 4;
                    } else {
                        if (c < 'A' || c > 'Z') {
                            j.e(c);
                            throw null;
                        }
                        i2 = (c - 'A') + 14;
                    }
                    c2 = (char) i2;
                } else {
                    c2 = 2;
                }
                return 1;
            }
            c2 = 3;
        }
        sb.append(c2);
        return 1;
    }

    @Override // j.d.e.k.b.c
    public int e() {
        return 3;
    }

    @Override // j.d.e.k.b.c
    void f(h hVar, StringBuilder sb) {
        hVar.p();
        int iA = hVar.g().a() - hVar.a();
        hVar.f -= sb.length();
        if (hVar.f() > 1 || iA > 1 || hVar.f() != iA) {
            hVar.r((char) 254);
        }
        if (hVar.e() < 0) {
            hVar.o(0);
        }
    }
}
