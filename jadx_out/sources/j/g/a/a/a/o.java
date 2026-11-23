package j.g.a.a.a;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class o extends v {
    public o(o.t tVar) {
        this(tVar, c(tVar), d(tVar), tVar.b());
    }

    o(o.t tVar, j.g.a.a.a.z.a aVar, w wVar, int i2) {
        super(a(i2));
    }

    static String a(int i2) {
        return "HTTP request failed, Status: " + i2;
    }

    static j.g.a.a.a.z.a b(String str) {
        j.d.d.f fVar = new j.d.d.f();
        fVar.d(new j.g.a.a.a.z.g());
        fVar.d(new j.g.a.a.a.z.h());
        try {
            j.g.a.a.a.z.b bVar = (j.g.a.a.a.z.b) fVar.b().k(str, j.g.a.a.a.z.b.class);
            if (bVar.a.isEmpty()) {
                return null;
            }
            return bVar.a.get(0);
        } catch (j.d.d.s e) {
            m.g().c("Twitter", "Invalid json: " + str, e);
            return null;
        }
    }

    public static j.g.a.a.a.z.a c(o.t tVar) {
        try {
            String strO0 = tVar.d().F().n().clone().o0();
            if (TextUtils.isEmpty(strO0)) {
                return null;
            }
            return b(strO0);
        } catch (Exception e) {
            m.g().c("Twitter", "Unexpected response", e);
            return null;
        }
    }

    public static w d(o.t tVar) {
        return new w(tVar.e());
    }
}
