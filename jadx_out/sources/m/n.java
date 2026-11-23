package m;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface n {
    public static final n a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        /* JADX INFO: renamed from: m.n$a$a, reason: collision with other inner class name */
        private static final class C0275a implements n {
            @Override // m.n
            public List<m> a(v vVar) {
                l.y.c.i.e(vVar, "url");
                return l.t.m.g();
            }

            @Override // m.n
            public void b(v vVar, List<m> list) {
                l.y.c.i.e(vVar, "url");
                l.y.c.i.e(list, "cookies");
            }
        }

        private a() {
        }
    }

    static {
        a aVar = a.a;
        a = new a.C0275a();
    }

    List<m> a(v vVar);

    void b(v vVar, List<m> list);
}
