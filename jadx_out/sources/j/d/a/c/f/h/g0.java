package j.d.a.c.f.h;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public static Object a(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
