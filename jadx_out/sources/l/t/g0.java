package l.t;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class g0 {
    public static final <T> Set<T> a(T t) {
        Set<T> setSingleton = Collections.singleton(t);
        l.y.c.i.d(setSingleton, "singleton(element)");
        return setSingleton;
    }
}
