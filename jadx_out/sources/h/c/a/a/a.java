package h.c.a.a;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {
    private static volatile a c;
    private c a;
    private c b;

    private a() {
        b bVar = new b();
        this.b = bVar;
        this.a = bVar;
    }

    public static a c() {
        if (c != null) {
            return c;
        }
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
        }
        return c;
    }

    @Override // h.c.a.a.c
    public boolean a() {
        return this.a.a();
    }

    @Override // h.c.a.a.c
    public void b(Runnable runnable) {
        this.a.b(runnable);
    }
}
