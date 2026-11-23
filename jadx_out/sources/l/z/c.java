package l.z;

import java.io.Serializable;
import l.y.c.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final a a = new a(null);
    private static final c b = l.w.b.a.b();

    public static final class a extends c implements Serializable {

        /* JADX INFO: renamed from: l.z.c$a$a, reason: collision with other inner class name */
        private static final class C0259a implements Serializable {
            public static final C0259a a = new C0259a();

            private C0259a() {
            }

            private final Object readResolve() {
                return c.a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        private final Object writeReplace() {
            return C0259a.a;
        }

        @Override // l.z.c
        public int b(int i2) {
            return c.b.b(i2);
        }

        @Override // l.z.c
        public int c() {
            return c.b.c();
        }

        @Override // l.z.c
        public int d(int i2) {
            return c.b.d(i2);
        }

        @Override // l.z.c
        public int e(int i2, int i3) {
            return c.b.e(i2, i3);
        }
    }

    public abstract int b(int i2);

    public abstract int c();

    public abstract int d(int i2);

    public int e(int i2, int i3) {
        int iC;
        int i4;
        int iB;
        int iC2;
        boolean z;
        d.b(i2, i3);
        int i5 = i3 - i2;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                iB = b(d.c(i5));
            } else {
                do {
                    iC = c() >>> 1;
                    i4 = iC % i5;
                } while ((iC - i4) + (i5 - 1) < 0);
                iB = i4;
            }
            return i2 + iB;
        }
        do {
            iC2 = c();
            z = false;
            if (i2 <= iC2 && iC2 < i3) {
                z = true;
            }
        } while (!z);
        return iC2;
    }
}
