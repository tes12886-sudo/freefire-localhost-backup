package l.a0;

/* JADX INFO: loaded from: classes.dex */
class h {
    public static final void a(boolean z, Number number) {
        l.y.c.i.e(number, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }
}
