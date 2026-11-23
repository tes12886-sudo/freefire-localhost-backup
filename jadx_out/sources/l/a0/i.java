package l.a0;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class i extends h {
    public static int b(int i2, int i3) {
        return i2 < i3 ? i3 : i2;
    }

    public static int c(int i2, int i3) {
        return i2 > i3 ? i3 : i2;
    }

    public static long d(long j2, long j3) {
        return j2 > j3 ? j3 : j2;
    }

    public static int e(int i2, int i3, int i4) {
        if (i3 <= i4) {
            if (i2 < i3) {
                return i3;
            }
            return i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static d f(int i2, int i3) {
        return d.d.a(i2, i3, -1);
    }

    public static int g(f fVar, l.z.c cVar) {
        l.y.c.i.e(fVar, "<this>");
        l.y.c.i.e(cVar, "random");
        try {
            return l.z.d.d(cVar, fVar);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static d h(d dVar, int i2) {
        l.y.c.i.e(dVar, "<this>");
        h.a(i2 > 0, Integer.valueOf(i2));
        d.a aVar = d.d;
        int iB = dVar.b();
        int iC = dVar.c();
        if (dVar.d() <= 0) {
            i2 = -i2;
        }
        return aVar.a(iB, iC, i2);
    }

    public static f i(int i2, int i3) {
        return i3 <= Integer.MIN_VALUE ? f.e.a() : new f(i2, i3 - 1);
    }
}
