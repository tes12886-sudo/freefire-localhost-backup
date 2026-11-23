package l.t;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class l {
    public static final <T> Object[] a(T[] tArr, boolean z) {
        l.y.c.i.e(tArr, "<this>");
        if (z && l.y.c.i.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        l.y.c.i.d(objArrCopyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return objArrCopyOf;
    }

    public static <T> List<T> b(T t) {
        List<T> listSingletonList = Collections.singletonList(t);
        l.y.c.i.d(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }
}
