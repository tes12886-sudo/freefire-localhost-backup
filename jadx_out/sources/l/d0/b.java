package l.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public static int a(int i2) {
        boolean z = false;
        if (2 <= i2 && i2 < 37) {
            z = true;
        }
        if (z) {
            return i2;
        }
        throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new l.a0.f(2, 36));
    }

    public static final int b(char c, int i2) {
        return Character.digit((int) c, i2);
    }

    public static final boolean c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
