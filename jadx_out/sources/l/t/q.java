package l.t;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class q extends p {
    public static <T extends Comparable<? super T>> void p(List<T> list) {
        l.y.c.i.e(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> void q(List<T> list, Comparator<? super T> comparator) {
        l.y.c.i.e(list, "<this>");
        l.y.c.i.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
