package l.t;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class m extends l {
    public static <T> ArrayList<T> c(T... tArr) {
        l.y.c.i.e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new c(tArr, true));
    }

    public static final <T> Collection<T> d(T[] tArr) {
        l.y.c.i.e(tArr, "<this>");
        return new c(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int e(List<? extends T> list, T t, int i2, int i3) {
        l.y.c.i.e(list, "<this>");
        m(list.size(), i2, i3);
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iA = l.u.b.a(list.get(i5), t);
            if (iA < 0) {
                i2 = i5 + 1;
            } else {
                if (iA <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static /* synthetic */ int f(List list, Comparable comparable, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = list.size();
        }
        return e(list, comparable, i2, i3);
    }

    public static <T> List<T> g() {
        return w.a;
    }

    public static <T> int h(List<? extends T> list) {
        l.y.c.i.e(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> i(T... tArr) {
        l.y.c.i.e(tArr, "elements");
        return tArr.length > 0 ? g.b(tArr) : g();
    }

    public static <T> List<T> j(T... tArr) {
        l.y.c.i.e(tArr, "elements");
        return h.k(tArr);
    }

    public static <T> List<T> k(T... tArr) {
        l.y.c.i.e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new c(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> l(List<? extends T> list) {
        l.y.c.i.e(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : l.b(list.get(0));
        }
        return g();
    }

    private static final void m(int i2, int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException("fromIndex (" + i3 + ") is greater than toIndex (" + i4 + ").");
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i3 + ") is less than zero.");
        }
        if (i4 <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + i2 + ").");
    }

    public static void n() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
