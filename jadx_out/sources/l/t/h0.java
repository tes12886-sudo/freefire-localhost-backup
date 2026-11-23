package l.t;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class h0 extends g0 {
    public static <T> Set<T> b() {
        return y.a;
    }

    public static <T> HashSet<T> c(T... tArr) {
        l.y.c.i.e(tArr, "elements");
        HashSet<T> hashSet = new HashSet<>(c0.a(tArr.length));
        h.r(tArr, hashSet);
        return hashSet;
    }

    public static <T> Set<T> d(T... tArr) {
        l.y.c.i.e(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(c0.a(tArr.length));
        h.r(tArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> e(Set<? extends T> set) {
        l.y.c.i.e(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : g0.a(set.iterator().next());
        }
        return b();
    }

    public static <T> Set<T> f(T... tArr) {
        l.y.c.i.e(tArr, "elements");
        return tArr.length > 0 ? h.v(tArr) : b();
    }
}
