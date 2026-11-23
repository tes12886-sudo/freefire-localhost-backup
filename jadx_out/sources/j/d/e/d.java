package j.d.e;

/* JADX INFO: loaded from: classes.dex */
public final class d extends f {
    private static final d c;

    static {
        d dVar = new d();
        c = dVar;
        dVar.setStackTrace(f.b);
    }

    private d() {
    }

    public static d a() {
        return f.a ? new d() : c;
    }
}
