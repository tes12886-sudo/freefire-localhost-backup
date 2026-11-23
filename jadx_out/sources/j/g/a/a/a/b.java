package j.g.a.a.a;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b implements j.d.d.r<a>, j.d.d.j<a> {
    static final Map<String, Class<? extends a>> b;
    private final j.d.d.e a = new j.d.d.e();

    static {
        HashMap map = new HashMap();
        b = map;
        map.put("oauth1a", r.class);
        map.put("oauth2", j.g.a.a.a.y.j.f.class);
        map.put("guest", j.g.a.a.a.y.j.a.class);
    }

    static String d(Class<? extends a> cls) {
        for (Map.Entry<String, Class<? extends a>> entry : b.entrySet()) {
            if (entry.getValue().equals(cls)) {
                return entry.getKey();
            }
        }
        return "";
    }

    @Override // j.d.d.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(j.d.d.k kVar, Type type, j.d.d.i iVar) {
        j.d.d.n nVarC = kVar.c();
        String strF = nVarC.u("auth_type").f();
        return (a) this.a.g(nVarC.t("auth_token"), b.get(strF));
    }

    @Override // j.d.d.r
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public j.d.d.k b(a aVar, Type type, j.d.d.q qVar) {
        j.d.d.n nVar = new j.d.d.n();
        nVar.r("auth_type", d(aVar.getClass()));
        nVar.q("auth_token", this.a.z(aVar));
        return nVar;
    }
}
