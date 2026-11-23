package j.d.d.z.n;

import j.d.d.w;
import j.d.d.x;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a<E> extends w<Object> {
    public static final x c = new C0243a();
    private final Class<E> a;
    private final w<E> b;

    /* JADX INFO: renamed from: j.d.d.z.n.a$a, reason: collision with other inner class name */
    class C0243a implements x {
        C0243a() {
        }

        @Override // j.d.d.x
        public <T> w<T> a(j.d.d.e eVar, j.d.d.a0.a<T> aVar) {
            Type type = aVar.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type typeG = j.d.d.z.b.g(type);
            return new a(eVar, eVar.m(j.d.d.a0.a.get(typeG)), j.d.d.z.b.k(typeG));
        }
    }

    public a(j.d.d.e eVar, w<E> wVar, Class<E> cls) {
        this.b = new m(eVar, wVar, cls);
        this.a = cls;
    }

    @Override // j.d.d.w
    public Object b(j.d.d.b0.a aVar) {
        if (aVar.n0() == j.d.d.b0.b.NULL) {
            aVar.j0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.Z()) {
            arrayList.add(this.b.b(aVar));
        }
        aVar.u();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.a, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(objNewInstance, i2, arrayList.get(i2));
        }
        return objNewInstance;
    }

    @Override // j.d.d.w
    public void d(j.d.d.b0.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.b0();
            return;
        }
        cVar.f();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.b.d(cVar, (E) Array.get(obj, i2));
        }
        cVar.u();
    }
}
