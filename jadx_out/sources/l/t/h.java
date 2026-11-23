package l.t;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class h extends g {
    public static <T> boolean j(T[] tArr, T t) {
        l.y.c.i.e(tArr, "<this>");
        return o(tArr, t) >= 0;
    }

    public static final <T> List<T> k(T[] tArr) {
        l.y.c.i.e(tArr, "<this>");
        ArrayList arrayList = new ArrayList();
        l(tArr, arrayList);
        return arrayList;
    }

    public static final <C extends Collection<? super T>, T> C l(T[] tArr, C c) {
        l.y.c.i.e(tArr, "<this>");
        l.y.c.i.e(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    public static int m(int[] iArr) {
        l.y.c.i.e(iArr, "<this>");
        return iArr.length - 1;
    }

    public static <T> int n(T[] tArr) {
        l.y.c.i.e(tArr, "<this>");
        return tArr.length - 1;
    }

    public static final <T> int o(T[] tArr, T t) {
        l.y.c.i.e(tArr, "<this>");
        int i2 = 0;
        if (t == null) {
            int length = tArr.length;
            while (i2 < length) {
                if (tArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i2 < length2) {
            if (l.y.c.i.a(t, tArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static char p(char[] cArr) {
        l.y.c.i.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T q(T[] tArr) {
        l.y.c.i.e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T, C extends Collection<? super T>> C r(T[] tArr, C c) {
        l.y.c.i.e(tArr, "<this>");
        l.y.c.i.e(c, "destination");
        for (T t : tArr) {
            c.add(t);
        }
        return c;
    }

    public static <T> HashSet<T> s(T[] tArr) {
        l.y.c.i.e(tArr, "<this>");
        HashSet<T> hashSet = new HashSet<>(c0.a(tArr.length));
        r(tArr, hashSet);
        return hashSet;
    }

    public static <T> List<T> t(T[] tArr) {
        l.y.c.i.e(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? u(tArr) : l.b(tArr[0]);
        }
        return m.g();
    }

    public static <T> List<T> u(T[] tArr) {
        l.y.c.i.e(tArr, "<this>");
        return new ArrayList(m.d(tArr));
    }

    public static final <T> Set<T> v(T[] tArr) {
        l.y.c.i.e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return h0.b();
        }
        if (length == 1) {
            return g0.a(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(c0.a(tArr.length));
        r(tArr, linkedHashSet);
        return linkedHashSet;
    }
}
