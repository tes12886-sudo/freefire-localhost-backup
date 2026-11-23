package l.z;

import l.a0.f;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final String a(Object obj, Object obj2) {
        i.e(obj, "from");
        i.e(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void b(int i2, int i3) {
        if (!(i3 > i2)) {
            throw new IllegalArgumentException(a(Integer.valueOf(i2), Integer.valueOf(i3)).toString());
        }
    }

    public static final int c(int i2) {
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    public static final int d(c cVar, f fVar) {
        i.e(cVar, "<this>");
        i.e(fVar, "range");
        if (!fVar.isEmpty()) {
            if (fVar.c() < Integer.MAX_VALUE) {
                return cVar.e(fVar.b(), fVar.c() + 1);
            }
            return fVar.b() > Integer.MIN_VALUE ? cVar.e(fVar.b() - 1, fVar.c()) + 1 : cVar.c();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + fVar);
    }

    public static final int e(int i2, int i3) {
        return (i2 >>> (32 - i3)) & ((-i3) >> 31);
    }
}
