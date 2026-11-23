package j.d.e.i.b;

/* JADX INFO: loaded from: classes.dex */
final class e extends g {
    private final short c;
    private final short d;

    e(g gVar, int i2, int i3) {
        super(gVar);
        this.c = (short) i2;
        this.d = (short) i3;
    }

    @Override // j.d.e.i.b.g
    void c(j.d.e.j.a aVar, byte[] bArr) {
        aVar.e(this.c, this.d);
    }

    public String toString() {
        short s = this.c;
        short s2 = this.d;
        return "<" + Integer.toBinaryString((s & ((1 << s2) - 1)) | (1 << s2) | (1 << this.d)).substring(1) + '>';
    }
}
