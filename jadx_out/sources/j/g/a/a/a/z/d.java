package j.g.a.a.a.z;

import j.d.d.j;
import j.d.d.k;
import j.d.d.n;
import j.d.d.q;
import j.d.d.r;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d implements r<c>, j<c> {
    @Override // j.d.d.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c a(k kVar, Type type, j.d.d.i iVar) {
        if (!kVar.l()) {
            return new c();
        }
        Set<Map.Entry<String, k>> setS = kVar.c().s();
        HashMap map = new HashMap(32);
        for (Map.Entry<String, k> entry : setS) {
            map.put(entry.getKey(), d(entry.getValue().c(), iVar));
        }
        return new c(map);
    }

    Object d(n nVar, j.d.d.i iVar) {
        k kVarT;
        Type type;
        k kVarT2 = nVar.t("type");
        if (kVarT2 == null || !kVarT2.n()) {
            return null;
        }
        String strF = kVarT2.f();
        strF.hashCode();
        switch (strF) {
            case "STRING":
                kVarT = nVar.t("string_value");
                type = String.class;
                break;
            case "USER":
                kVarT = nVar.t("user_value");
                type = i.class;
                break;
            case "IMAGE":
                kVarT = nVar.t("image_value");
                type = e.class;
                break;
            case "BOOLEAN":
                kVarT = nVar.t("boolean_value");
                type = Boolean.class;
                break;
            default:
                return null;
        }
        return iVar.a(kVarT, type);
    }

    @Override // j.d.d.r
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public k b(c cVar, Type type, q qVar) {
        return null;
    }
}
