package j.d.d.z.n;

import j.d.d.p;
import j.d.d.s;
import j.d.d.w;
import j.d.d.x;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h implements x {
    private final j.d.d.z.c a;
    final boolean b;

    private final class a<K, V> extends w<Map<K, V>> {
        private final w<K> a;
        private final w<V> b;
        private final j.d.d.z.i<? extends Map<K, V>> c;

        public a(j.d.d.e eVar, Type type, w<K> wVar, Type type2, w<V> wVar2, j.d.d.z.i<? extends Map<K, V>> iVar) {
            this.a = new m(eVar, wVar, type);
            this.b = new m(eVar, wVar2, type2);
            this.c = iVar;
        }

        private String e(j.d.d.k kVar) {
            if (!kVar.n()) {
                if (kVar.j()) {
                    return "null";
                }
                throw new AssertionError();
            }
            p pVarD = kVar.d();
            if (pVarD.x()) {
                return String.valueOf(pVarD.u());
            }
            if (pVarD.v()) {
                return Boolean.toString(pVarD.q());
            }
            if (pVarD.y()) {
                return pVarD.f();
            }
            throw new AssertionError();
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<K, V> b(j.d.d.b0.a aVar) throws IOException {
            j.d.d.b0.b bVarN0 = aVar.n0();
            if (bVarN0 == j.d.d.b0.b.NULL) {
                aVar.j0();
                return null;
            }
            Map<K, V> mapA = this.c.a();
            if (bVarN0 == j.d.d.b0.b.BEGIN_ARRAY) {
                aVar.b();
                while (aVar.Z()) {
                    aVar.b();
                    K kB = this.a.b(aVar);
                    if (mapA.put(kB, this.b.b(aVar)) != null) {
                        throw new s("duplicate key: " + kB);
                    }
                    aVar.u();
                }
                aVar.u();
            } else {
                aVar.c();
                while (aVar.Z()) {
                    j.d.d.z.f.a.a(aVar);
                    K kB2 = this.a.b(aVar);
                    if (mapA.put(kB2, this.b.b(aVar)) != null) {
                        throw new s("duplicate key: " + kB2);
                    }
                }
                aVar.F();
            }
            return mapA;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.b0();
                return;
            }
            if (!h.this.b) {
                cVar.j();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.Z(String.valueOf(entry.getKey()));
                    this.b.d(cVar, entry.getValue());
                }
                cVar.F();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i2 = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                j.d.d.k kVarC = this.a.c(entry2.getKey());
                arrayList.add(kVarC);
                arrayList2.add(entry2.getValue());
                z |= kVarC.h() || kVarC.l();
            }
            if (!z) {
                cVar.j();
                int size = arrayList.size();
                while (i2 < size) {
                    cVar.Z(e((j.d.d.k) arrayList.get(i2)));
                    this.b.d(cVar, (V) arrayList2.get(i2));
                    i2++;
                }
                cVar.F();
                return;
            }
            cVar.f();
            int size2 = arrayList.size();
            while (i2 < size2) {
                cVar.f();
                j.d.d.z.l.b((j.d.d.k) arrayList.get(i2), cVar);
                this.b.d(cVar, (V) arrayList2.get(i2));
                cVar.u();
                i2++;
            }
            cVar.u();
        }
    }

    public h(j.d.d.z.c cVar, boolean z) {
        this.a = cVar;
        this.b = z;
    }

    private w<?> b(j.d.d.e eVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? n.f : eVar.m(j.d.d.a0.a.get(type));
    }

    @Override // j.d.d.x
    public <T> w<T> a(j.d.d.e eVar, j.d.d.a0.a<T> aVar) {
        Type type = aVar.getType();
        if (!Map.class.isAssignableFrom(aVar.getRawType())) {
            return null;
        }
        Type[] typeArrJ = j.d.d.z.b.j(type, j.d.d.z.b.k(type));
        return new a(eVar, typeArrJ[0], b(eVar, typeArrJ[0]), typeArrJ[1], eVar.m(j.d.d.a0.a.get(typeArrJ[1])), this.a.a(aVar));
    }
}
