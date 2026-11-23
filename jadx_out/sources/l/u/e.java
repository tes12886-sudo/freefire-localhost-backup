package l.u;

import java.util.Comparator;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
final class e implements Comparator<Comparable<? super Object>> {
    public static final e a = new e();

    private e() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        i.e(comparable, "a");
        i.e(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return f.a;
    }
}
