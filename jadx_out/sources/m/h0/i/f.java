package m.h0.i;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final f a = new f();

    private f() {
    }

    public static final boolean b(String str) {
        l.y.c.i.e(str, "method");
        return (l.y.c.i.a(str, "GET") || l.y.c.i.a(str, "HEAD")) ? false : true;
    }

    public static final boolean e(String str) {
        l.y.c.i.e(str, "method");
        return l.y.c.i.a(str, "POST") || l.y.c.i.a(str, "PUT") || l.y.c.i.a(str, "PATCH") || l.y.c.i.a(str, "PROPPATCH") || l.y.c.i.a(str, "REPORT");
    }

    public final boolean a(String str) {
        l.y.c.i.e(str, "method");
        return l.y.c.i.a(str, "POST") || l.y.c.i.a(str, "PATCH") || l.y.c.i.a(str, "PUT") || l.y.c.i.a(str, "DELETE") || l.y.c.i.a(str, "MOVE");
    }

    public final boolean c(String str) {
        l.y.c.i.e(str, "method");
        return !l.y.c.i.a(str, "PROPFIND");
    }

    public final boolean d(String str) {
        l.y.c.i.e(str, "method");
        return l.y.c.i.a(str, "PROPFIND");
    }
}
