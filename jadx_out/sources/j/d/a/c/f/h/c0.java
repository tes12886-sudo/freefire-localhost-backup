package j.d.a.c.f.h;

/* JADX INFO: loaded from: classes.dex */
final class c0 {
    private final Object a;
    private final Object b;
    private final Object c;

    c0(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.a + "=" + this.b + " and " + this.a + "=" + this.c);
    }
}
