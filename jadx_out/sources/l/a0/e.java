package l.a0;

import java.util.NoSuchElementException;
import l.t.z;

/* JADX INFO: loaded from: classes.dex */
public final class e extends z {
    private final int a;
    private final int b;
    private boolean c;
    private int d;

    public e(int i2, int i3, int i4) {
        this.a = i4;
        this.b = i3;
        boolean z = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z = false;
        }
        this.c = z;
        this.d = z ? i2 : i3;
    }

    @Override // l.t.z
    public int a() {
        int i2 = this.d;
        if (i2 != this.b) {
            this.d = this.a + i2;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c;
    }
}
