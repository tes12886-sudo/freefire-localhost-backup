package l.t;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class n extends m {
    public static <T> int o(Iterable<? extends T> iterable, int i2) {
        l.y.c.i.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }
}
