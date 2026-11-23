package l.z;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends c {
    @Override // l.z.c
    public int b(int i2) {
        return d.e(f().nextInt(), i2);
    }

    @Override // l.z.c
    public int c() {
        return f().nextInt();
    }

    @Override // l.z.c
    public int d(int i2) {
        return f().nextInt(i2);
    }

    public abstract Random f();
}
