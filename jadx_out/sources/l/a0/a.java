package l.a0;

import l.t.j;

/* JADX INFO: loaded from: classes.dex */
public class a implements Iterable<Character>, l.y.c.q.a {
    private final char a;
    private final char b;
    private final int c;

    public a(char c, char c2, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i2 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = c;
        this.b = (char) l.w.c.b(c, c2, i2);
        this.c = i2;
    }

    public final char b() {
        return this.a;
    }

    public final char c() {
        return this.b;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public j iterator() {
        return new b(this.a, this.b, this.c);
    }
}
