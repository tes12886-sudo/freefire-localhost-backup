package l;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparable<e> {
    public static final e e = f.a();
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public e(int i2, int i3, int i4) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = c(i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0020  */
    private final int c(int i2, int i3, int i4) {
        boolean z;
        if (i2 >= 0 && i2 < 256) {
            if (i3 >= 0 && i3 < 256) {
                z = i4 >= 0 && i4 < 256;
            }
        }
        if (z) {
            return (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + '.' + i3 + '.' + i4).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        l.y.c.i.e(eVar, "other");
        return this.d - eVar.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        return eVar != null && this.d == eVar.d;
    }

    public int hashCode() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
