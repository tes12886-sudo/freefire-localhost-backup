package m;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    public static final b a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        /* JADX INFO: renamed from: m.b$a$a, reason: collision with other inner class name */
        private static final class C0260a implements b {
            @Override // m.b
            public b0 a(f0 f0Var, d0 d0Var) {
                l.y.c.i.e(d0Var, "response");
                return null;
            }
        }

        private a() {
        }
    }

    static {
        a aVar = a.a;
        a = new a.C0260a();
        new m.h0.e.a(null, 1, null);
    }

    b0 a(f0 f0Var, d0 d0Var);
}
