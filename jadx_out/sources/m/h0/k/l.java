package m.h0.k;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface l {
    public static final l a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        /* JADX INFO: renamed from: m.h0.k.l$a$a, reason: collision with other inner class name */
        private static final class C0267a implements l {
            @Override // m.h0.k.l
            public boolean a(int i2, List<c> list) {
                l.y.c.i.e(list, "requestHeaders");
                return true;
            }

            @Override // m.h0.k.l
            public boolean b(int i2, List<c> list, boolean z) {
                l.y.c.i.e(list, "responseHeaders");
                return true;
            }

            @Override // m.h0.k.l
            public void c(int i2, b bVar) {
                l.y.c.i.e(bVar, "errorCode");
            }

            @Override // m.h0.k.l
            public boolean d(int i2, n.d dVar, int i3, boolean z) {
                l.y.c.i.e(dVar, "source");
                dVar.skip(i3);
                return true;
            }
        }

        private a() {
        }
    }

    static {
        a aVar = a.a;
        a = new a.C0267a();
    }

    boolean a(int i2, List<c> list);

    boolean b(int i2, List<c> list, boolean z);

    void c(int i2, b bVar);

    boolean d(int i2, n.d dVar, int i3, boolean z);
}
