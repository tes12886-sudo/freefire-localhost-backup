package l.a0;

import java.util.NoSuchElementException;
import l.t.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j {
    private final int a;
    private final int b;
    private boolean c;
    private int d;

    public b(char c, char c2, int i2) {
        this.a = i2;
        this.b = c2;
        boolean z = true;
        if (i2 <= 0 ? l.y.c.i.g(c, c2) < 0 : l.y.c.i.g(c, c2) > 0) {
            z = false;
        }
        this.c = z;
        this.d = z ? c : c2;
    }

    @Override // l.t.j
    public char a() {
        int i2 = this.d;
        if (i2 != this.b) {
            this.d = this.a + i2;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return (char) i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c;
    }
}
