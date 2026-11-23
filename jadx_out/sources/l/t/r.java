package l.t;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class r extends q {
    public static <T> boolean r(Collection<? super T> collection, Iterable<? extends T> iterable) {
        l.y.c.i.e(collection, "<this>");
        l.y.c.i.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean s(Collection<? super T> collection, T[] tArr) {
        l.y.c.i.e(collection, "<this>");
        l.y.c.i.e(tArr, "elements");
        return collection.addAll(g.b(tArr));
    }
}
