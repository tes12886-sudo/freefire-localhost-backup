package l;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final Object a(Throwable th) {
        l.y.c.i.e(th, "exception");
        return new m.b(th);
    }

    public static final void b(Object obj) throws Throwable {
        if (obj instanceof m.b) {
            throw ((m.b) obj).a;
        }
    }
}
