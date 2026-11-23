package j.d.d.z.n;

import j.d.d.r;
import j.d.d.w;
import j.d.d.x;

/* JADX INFO: loaded from: classes.dex */
public final class e implements x {
    private final j.d.d.z.c a;

    public e(j.d.d.z.c cVar) {
        this.a = cVar;
    }

    @Override // j.d.d.x
    public <T> w<T> a(j.d.d.e eVar, j.d.d.a0.a<T> aVar) {
        j.d.d.y.b bVar = (j.d.d.y.b) aVar.getRawType().getAnnotation(j.d.d.y.b.class);
        if (bVar == null) {
            return null;
        }
        return (w<T>) b(this.a, eVar, aVar, bVar);
    }

    w<?> b(j.d.d.z.c cVar, j.d.d.e eVar, j.d.d.a0.a<?> aVar, j.d.d.y.b bVar) {
        w<?> lVar;
        Object objA = cVar.a(j.d.d.a0.a.get((Class) bVar.value())).a();
        if (objA instanceof w) {
            lVar = (w) objA;
        } else if (objA instanceof x) {
            lVar = ((x) objA).a(eVar, aVar);
        } else {
            boolean z = objA instanceof r;
            if (!z && !(objA instanceof j.d.d.j)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            lVar = new l<>(z ? (r) objA : null, objA instanceof j.d.d.j ? (j.d.d.j) objA : null, eVar, aVar, null);
        }
        return (lVar == null || !bVar.nullSafe()) ? lVar : lVar.a();
    }
}
