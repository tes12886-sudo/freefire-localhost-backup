package j.d.e.i.b;

/* JADX INFO: loaded from: classes.dex */
final class b extends g {
    private final short c;
    private final short d;

    b(g gVar, int i2, int i3) {
        super(gVar);
        this.c = (short) i2;
        this.d = (short) i3;
    }

    @Override // j.d.e.i.b.g
    public void c(j.d.e.j.a aVar, byte[] bArr) {
        int i2;
        int i3 = 0;
        while (true) {
            short s = this.d;
            if (i3 >= s) {
                return;
            }
            if (i3 == 0 || (i3 == 31 && s <= 62)) {
                int i4 = 5;
                aVar.e(31, 5);
                short s2 = this.d;
                if (s2 > 62) {
                    i2 = s2 - 31;
                    i4 = 16;
                } else if (i3 == 0) {
                    aVar.e(Math.min((int) s2, 31), 5);
                } else {
                    i2 = s2 - 31;
                }
                aVar.e(i2, i4);
            }
            aVar.e(bArr[this.c + i3], 8);
            i3++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.c);
        sb.append("::");
        sb.append((this.c + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
