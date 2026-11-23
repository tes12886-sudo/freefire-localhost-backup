package j.d.e.k.b;

/* JADX INFO: loaded from: classes.dex */
final class a implements g {
    a() {
    }

    private static char b(char c, char c2) {
        if (j.f(c) && j.f(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    @Override // j.d.e.k.b.g
    public void a(h hVar) {
        if (j.a(hVar.d(), hVar.f) >= 2) {
            hVar.r(b(hVar.d().charAt(hVar.f), hVar.d().charAt(hVar.f + 1)));
            hVar.f += 2;
            return;
        }
        char c = hVar.c();
        int iN = j.n(hVar.d(), hVar.f, c());
        if (iN == c()) {
            if (!j.g(c)) {
                hVar.r((char) (c + 1));
                hVar.f++;
                return;
            } else {
                hVar.r((char) 235);
                hVar.r((char) ((c - 128) + 1));
                hVar.f++;
                return;
            }
        }
        if (iN == 1) {
            hVar.r((char) 230);
            hVar.o(1);
            return;
        }
        if (iN == 2) {
            hVar.r((char) 239);
            hVar.o(2);
            return;
        }
        if (iN == 3) {
            hVar.r((char) 238);
            hVar.o(3);
        } else if (iN == 4) {
            hVar.r((char) 240);
            hVar.o(4);
        } else {
            if (iN != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iN)));
            }
            hVar.r((char) 231);
            hVar.o(5);
        }
    }

    public int c() {
        return 0;
    }
}
