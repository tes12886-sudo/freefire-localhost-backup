package j.d.e.n.b;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);

    private final int[] a;
    private final int b;

    b(int[] iArr, int i2) {
        this.a = iArr;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public int c(c cVar) {
        char c;
        int iF = cVar.f();
        if (iF <= 9) {
            c = 0;
        } else {
            c = iF <= 26 ? (char) 1 : (char) 2;
        }
        return this.a[c];
    }
}
