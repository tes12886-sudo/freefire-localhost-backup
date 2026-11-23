package j.c.a.e.f;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static HashMap<Integer, j.c.a.e.h.a> a = new HashMap<>();

    private static void a(j.c.a.e.h.a aVar) {
        a.put(Integer.valueOf(aVar.a()), aVar);
    }

    public static void b() {
        a.clear();
        a(new j.c.a.e.h.d());
        a(new j.c.a.e.h.b());
        a(new j.c.a.e.h.c());
    }

    public static void c(j.c.a.e.f.l.b bVar) {
        byte[] bArrC;
        j.c.a.e.h.a aVar = a.get(Integer.valueOf(bVar.b()));
        if (aVar == null || (bArrC = bVar.c()) == null) {
            return;
        }
        try {
            aVar.b(bArrC, 0, bArrC.length);
        } catch (Exception e) {
            j.c.a.e.l.b.b(e);
        }
    }
}
