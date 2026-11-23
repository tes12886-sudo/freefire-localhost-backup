package j.f.a.h;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> List<T> b(String str, List<T> list) {
        if (list == null) {
            throw new NullPointerException(str + " == null");
        }
        if (list instanceof c) {
            list = ((c) list).b;
        }
        if (list == Collections.emptyList() || (list instanceof a)) {
            return list;
        }
        a aVar = new a(list);
        if (!aVar.contains(null)) {
            return aVar;
        }
        throw new IllegalArgumentException(str + ".contains(null)");
    }

    public static IllegalStateException c(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        String str = "";
        for (int i2 = 0; i2 < length; i2 += 2) {
            if (objArr[i2] == null) {
                if (sb.length() > 0) {
                    str = "s";
                }
                sb.append("\n  ");
                sb.append(objArr[i2 + 1]);
            }
        }
        throw new IllegalStateException("Required field" + str + " not set:" + ((Object) sb));
    }

    public static <T> List<T> d() {
        return new c(Collections.emptyList());
    }
}
