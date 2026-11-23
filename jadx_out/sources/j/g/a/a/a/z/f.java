package j.g.a.a.a.z;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static <T> List<T> a(List<T> list) {
        return list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }
}
