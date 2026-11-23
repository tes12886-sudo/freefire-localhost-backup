package j.f.a;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    private final n.c a;

    public g(n.c cVar) {
        this.a = cVar;
    }

    private static int a(int i2, a aVar) {
        return (i2 << 3) | aVar.a;
    }

    static int b(int i2) {
        return d(a(i2, a.VARINT));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    static int c(String str) {
        int i2;
        int length = str.length();
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 128) {
                i4++;
            } else if (cCharAt < 2048) {
                i4 += 2;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                i4 += 3;
            } else if (cCharAt > 56319 || (i2 = i3 + 1) >= length || str.charAt(i2) < 56320 || str.charAt(i2) > 57343) {
                i4++;
            } else {
                i4 += 4;
                i3 = i2;
            }
            i3++;
        }
        return i4;
    }

    static int d(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    static int e(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public void f(n.e eVar) {
        this.a.G(eVar);
    }

    public void g(int i2) {
        this.a.y(i2);
    }

    public void h(long j2) {
        this.a.t(j2);
    }

    public void i(String str) {
        this.a.R(str);
    }

    public void j(int i2, a aVar) {
        k(a(i2, aVar));
    }

    public void k(int i2) {
        while ((i2 & (-128)) != 0) {
            this.a.A((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.A(i2);
    }

    public void l(long j2) {
        while (true) {
            long j3 = (-128) & j2;
            n.c cVar = this.a;
            if (j3 == 0) {
                cVar.A((int) j2);
                return;
            } else {
                cVar.A((((int) j2) & 127) | 128);
                j2 >>>= 7;
            }
        }
    }
}
