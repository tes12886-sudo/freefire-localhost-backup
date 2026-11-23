package l.v.e.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements l.v.a<Object> {
    public static final b a = new b();

    private b() {
    }

    @Override // l.v.a
    public l.v.c a() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // l.v.a
    public void b(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
