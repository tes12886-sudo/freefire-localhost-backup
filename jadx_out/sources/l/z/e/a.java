package l.z.e;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l.z.a {
    @Override // l.z.c
    public int e(int i2, int i3) {
        return ThreadLocalRandom.current().nextInt(i2, i3);
    }

    @Override // l.z.a
    public Random f() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        i.d(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }
}
